import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.IntStream;
/*
 *  Simple sieve of primes from 1 to n
 *  You can compare parallel and sequence sieves
 *  @author Dmytro Bondar
 */
public class Sieve {
    private final int limit;
    private long start;
    private long end;

    public Sieve(Integer length) {
        this.limit = length;

    }

    public long calculateParallel() {
        start = System.nanoTime();
        List<Integer> result = IntStream.rangeClosed(2, limit)
                .boxed()
                .parallel()
                .collect(CopyOnWriteArrayList::new,
                        (list, number) -> {
                            for (Integer prime : list) {
                                if (number % prime == 0) {
                                    return;
                                }
                            }
                            list.add(number);
                        },
                        List::addAll);
        end = System.nanoTime();
        System.out.println("Parallel results:");
        result.forEach(System.out::println);
        return end - start;
    }


    public long calculateSequence() {
        start = System.nanoTime();
        List<Integer> result = IntStream.rangeClosed(2, limit)
                .boxed()
                .collect(ArrayList::new,
                        (list, number) -> {
                            for (Integer prime : list) {
                                if (number % prime == 0) {
                                    return;
                                }
                            }
                            list.add(number);
                        },
                        List::addAll);
        end = System.nanoTime();
        System.out.println("Sequence results:");
        result.forEach(System.out::println);
        return end - start;
    }

    public static void main(String[] args) {
        Sieve sieve = new Sieve(1000);
        System.out.println("Sequence " +sieve.calculateSequence());
        System.out.println("Parallel "+sieve.calculateParallel());
    }

}
