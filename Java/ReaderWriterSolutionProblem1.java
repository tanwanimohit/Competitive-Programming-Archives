
import java.util.concurrent.Semaphore;

public class ReaderWriterSolutionProblem1 {
	public static final int NUM_OF_READERS = 3;
	public static final int NUM_OF_WRITERS = 2;

	public static void main(String args[]) {
		RWLock database = new Database();

		Thread[] readerArray = new Thread[NUM_OF_READERS];
		Thread[] writerArray = new Thread[NUM_OF_WRITERS];

		for (int i = 0; i < NUM_OF_READERS; i++) {
			readerArray[i] = new Thread(new Reader(i, database));
			readerArray[i].start();
		}

		for (int i = 0; i < NUM_OF_WRITERS; i++) {
			writerArray[i] = new Thread(new Writer(i, database));
			writerArray[i].start();
		}
	}
}

class Reader implements Runnable {

	private RWLock database;
	private int readerNum;

	public Reader(int readerNum, RWLock database) {
		this.readerNum = readerNum;
		this.database = database;
	}

	public void run() {
		while (true) {
			SleepUtilities.nap();

			System.out.println("reader " + readerNum + " wants to read.");
			database.acquireReadLock(readerNum);
			SleepUtilities.nap();
			database.releaseReadLock(readerNum);
		}
	};
}

class Writer implements Runnable {
	private RWLock database;
	private int writerNum;

	public Writer(int w, RWLock d) {
		writerNum = w;
		database = d;
	}

	public void run() {
		while (true) {
			SleepUtilities.nap();

			System.out.println("writer " + writerNum + " wants to write.");
			database.acquireWriteLock(writerNum);

			SleepUtilities.nap();

			database.releaseWriteLock(writerNum);
		}
	}

}

interface RWLock {
	public abstract void acquireReadLock(int readerNum);

	public abstract void acquireWriteLock(int writerNum);

	public abstract void releaseReadLock(int readerNum);

	public abstract void releaseWriteLock(int writerNum);
}

class Database implements RWLock {
	private int readerCount; // the number of active readers

	private Semaphore mutex; // controls access to readerCount

	private Semaphore db; // controls access to the database

	public Database() {
		readerCount = 0;
		mutex = new Semaphore(1);
		db = new Semaphore(1);
	}

	public void acquireReadLock(int readerNum) {
		try {
			mutex.acquire();
			++readerCount;

			if (readerCount == 1)
				db.acquire();

			System.out.println("Reader " + readerNum + " is reading. Reader count = " + readerCount);

			mutex.release();
		} catch (InterruptedException e) {
		}
	}

	public void releaseReadLock(int readerNum) {
		try {
			mutex.acquire();
			--readerCount;
			if (readerCount == 0)
				db.release();
			System.out.println("Reader " + readerNum + " is done reading. Reader count = " + readerCount);

			mutex.release();
		} catch (InterruptedException e) {
		}
	}

	public void acquireWriteLock(int writerNum) {
		try {
			db.acquire();
			System.out.println("Writer " + writerNum + " is writing.");
		} catch (InterruptedException e) {
		}
	}

	public void releaseWriteLock(int writerNum) {
		System.out.println("Writer " + writerNum + " is done writing.");
		db.release();
	}
}

class SleepUtilities {

	public static void nap() {
		nap(NAP_TIME);
	}

	public static void nap(int duration) {
		int sleeptime = (int) (NAP_TIME * Math.random());
		try {
			Thread.sleep(sleeptime * 3000);
		} catch (InterruptedException e) {
		}
	}

	private static final int NAP_TIME = 5;
}