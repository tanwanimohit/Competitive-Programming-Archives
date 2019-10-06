import  java.util.*;
class driver{
	public static void main(String[] args) {
		linkedList list = new linkedList();
		Node head= new Node("I am the head");
		list.head=head;
		Node n1=new Node("I am the second Node");
		Node n2=new Node("I am the third Node");
		n1.nextNode=n2;
		list.head.nextNode=n1;
		list.traverse();
		System.out.println("---------------");
		list.addFront("I am the new node at the top", list);
		list.traverse();
		
		System.out.println("---------------");
		list.addEnd("I am the new Tail", list);
		list.traverse();
	}
}