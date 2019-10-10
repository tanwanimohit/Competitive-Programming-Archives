import java.io.*;
import java.util.*;


public class binarySearchTreeImpl {
	
public class bstNode {
	private bstNode left;
	private bstNode right;
	private Integer data;
	
	public bstNode(Integer data) {
		this.data=data;
	}
	
	public bstNode getLeft() {
		return left;
	}
	
	public void setLeft(bstNode left) {
		this.left=left;
	}
	public bstNode getRight() {
		return right;
	}
	
	public void setRight(bstNode right) {
		this.right=right;
	}
	
	public Integer getData() {
		return this.data;
	}
	
	public void setData(Integer data) {
		this.data=data;
	}
	
	
	

}


private bstNode root;


public void insert(Integer data) {
	if(root==null) {
		this.root = new bstNode(data);
		return;
	}
	
	insertNode(this.root,data);
}

public bstNode insertNode(bstNode root,Integer data) {
	
	
	bstNode tempNode = null;
	
	if(data<=root.getData()) {
		if(root.getLeft()==null) {
			root.setLeft(new bstNode(data));
			return root.getLeft();
		}
		else {
			tempNode = root.getLeft();
		}
	}else{
		if(root.getRight()==null) {
			root.setRight(new bstNode(data));
			return root.getRight();
		}
		else {
			tempNode = root.getRight();
		}
	}
	
	
	return insertNode(tempNode,data);
}



public void preOrder() {
	pre(this.root);
}
public void pre(bstNode p) {
	if(p!=null) {
		System.out.println(p.getData());
		pre(p.left);
		pre(p.right);
		
	}
}

public void delete(Integer data) {
	deleteNode(this.root,data);
}

public bstNode deleteNode(bstNode root, Integer data) {
	if(root == null) return root;
	
	if(data<root.getData()) {
		root.setLeft(deleteNode(root.getLeft(),data));
	}
	else if(data>root.getData()) {
		root.setRight(deleteNode(root.getRight(),data));
	}
	else {
		if(root.getLeft()==null && root.getRight()==null) {
			return null;
		}
		else if(root.getLeft()==null) {
			return root.getRight();		}
		else if(root.getRight()==null) {
			return root.getLeft();
		}
		else {
			Integer minValue = minValue(root.getRight());
			root.setData(minValue);
			root.setRight(deleteNode(root.getRight(),minValue));
		}
	}
	
	
	return root;
}

public Integer minValue(bstNode node) {
	if(node.getLeft()!=null) {
		minValue(node.getLeft());
	}
	return node.getData();
}

public static void main(String[] args) {
	
	binarySearchTreeImpl bst = new binarySearchTreeImpl();
	bst.insert(50);
	bst.insert(30);
	bst.insert(70);
	bst.insert(20);
	bst.insert(40);
	bst.preOrder();
	System.out.println("deleting something");
	bst.delete(30);
	bst.preOrder();
	
	
	
}




}
