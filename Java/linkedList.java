import java.util.*;
public class linkedList{
	public Node head;
	public linkedList(){
		this.head= null;
	}
	
	public void traverse() {
		Node currNode = this.head;
		while(currNode!=null) {
			System.out.println(currNode.data);
			currNode= currNode.nextNode;
		}
	}
	
	
	public void addFront(String nodeData, linkedList list){
		Node newNode = new Node(nodeData);
		newNode.nextNode = list.head;
		list.head = newNode;
	}
	
	
	public void addEnd(String nodeData, linkedList list) {
		Node newNode = new Node(nodeData);
		Node currNode = list.head;
		while(true) {
			if(currNode.nextNode == null) {
				break;
			}
			currNode=currNode.nextNode;
		}
		currNode.nextNode = newNode;
	}

}