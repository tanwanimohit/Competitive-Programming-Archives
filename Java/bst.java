import java.io.*;
import java.util.*;




public class bst {
	public class bstNode{
		private Integer data;
		private bstNode left;
		private bstNode right;
		
		
		public bstNode(Integer data) {
			this.data=data;
		}
		
		public Integer getData() {
			return this.data;
		}
		
		public void setLeft(bstNode left) {
			this.left=left;
		}
		public bstNode getLeft() {
			return this.left;
		}
		
		public void setRight(bstNode right) {
			this.right=right;
		}
		public bstNode getRight() {
			return this.right;
		}
		
		
		public void setData(Integer data) {
			this.data=data;
		}
		
	}
	
	private bstNode root;
	
	public void insert(Integer data) {
		if(this.root==null) {
			this.root= new bstNode(data);
			return;
		}
		
		insertNode(this.root,data);
		
	}
	
	public bstNode insertNode(bstNode root,Integer data) {
		bstNode tempNode=null;
		
		if(data<=root.data) {
			if(root.left==null) {
				root.setLeft(new bstNode(data));
				return root.getLeft();
			}
			else {
				tempNode = root.getLeft();
			}
			
		}else {
			if(root.right==null) {
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
			pre(p.getLeft());
			pre(p.getRight());
		}
	}
	
	
	
	public static void main(String[] args) {
		bst bst = new bst();
		bst.insert(50);
		bst.insert(30);
		bst.insert(70);
		bst.insert(20);
		bst.insert(40);
		bst.preOrder();
	}

}
