import java.io.*;
import java.util.*;




public class findingLinkedListMiddle {
	public static PrintWriter out;
	static class FastReader{
		BufferedReader br;
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
	
	static class Node{
		public int nodeData;
		public Node nextItem;
		
		public Node(int data) {
			this.nodeData=data;
			this.nextItem=null;
		}
		
	}
	
	static class linkedlist{
		public Node head;
		public linkedlist() {
			this.head=null;
		}
		public void traverse() {
			Node currNode = this.head;
			while(currNode!=null) {
				out.print(currNode.nodeData+" ");
				currNode= currNode.nextItem;
			}
			out.println();
		}
	}
	
	
	static void getMiddle(Node header) {
		int count=1;
		Node tempnode= header;
		while(tempnode.nextItem!=null) {
			tempnode=tempnode.nextItem;
			count++;
		}
		
		Node currNode = header;

			for(int i=0; i<count/2;i++) {
				tempnode=currNode.nextItem;
				currNode= tempnode;
			}

		
		out.println(currNode.nodeData);
	}
	
	
	static Node reverseLL(Node header) {
		Node prev = null;
		Node curr = header;
		Node next = null;
		while(curr!=null) {
			next = curr.nextItem;
			curr.nextItem= prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	
	static Node rotatell(Node header, int k) {
		int count=0;
		while(count<k) {
			
			Node tempHead=header;
			header = tempHead.nextItem;
			tempHead.nextItem=null;
			Node prevNode=null;
			Node currNode =header;
			
			while(currNode!=null) {
				prevNode=currNode;
				currNode=currNode.nextItem;
			}
			
			prevNode.nextItem=tempHead;
			count++;
		}
		
		return header;
		
	}
	
	static Node rotateGroup(Node header,int k) {
		Node prev = null;
		Node curr = header;
		Node next = null;
		int count=0;
		while(count<k && curr!=null) {
			next = curr.nextItem;
			curr.nextItem= prev;
			prev = curr;
			curr = next;
			count++;
		}
		if(curr!=null) {
			header.nextItem=rotateGroup(curr,k);
		}
		
	    return prev; 
	}
	
	
	
	static int nthNodeFromEnd(Node header, int k) {
		
		Node front = header;
		Node item = header;
		
		int i=0;
		while(i<k-1) {
			front=front.nextItem;
			i++;
		}
		
		while(front.nextItem!=null) {
			front=front.nextItem;
			item = item.nextItem;
		}
		
		return item.nodeData;
	}

	
	static void deleteNodeWithReference(Node header) {
		header=header.nextItem;
		
	}
	
	public static void main(String[] args) {
		out = new PrintWriter(System.out);
		FastReader in = new FastReader();
		
		int testCases = Integer.parseInt(in.nextLine());
		int t=0;
		
		
		
		while(t<testCases) {
			int n = Integer.parseInt(in.nextLine());
//			int[] data0 = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//			int n = data0[0];
//			int k = data0[1];
//			int k=2;
			
			int[] data1 = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			linkedlist l1 = new linkedlist();
			Node head1 = new Node(data1[0]);
			
			l1.head =head1;
			Node currNode = head1;
			
			for(int i=1;i<n;i++) {
				currNode.nextItem=new Node(data1[i]);
				currNode=currNode.nextItem;
			}	
			int k = Integer.parseInt(in.nextLine());
//			l1.head=reverseLL(l1.head);			
//			l1.head=rotatell(l1.head,k);
//			l1.head=rotateGroup(l1.head, k);
//			if(k>n) {
//				out.println(-1);
//			}else {
//				out.println(nthNodeFromEnd(l1.head, k));
//			}
			
			
			l1.traverse();
			t++;
		}
		out.flush();
		
		}
}
