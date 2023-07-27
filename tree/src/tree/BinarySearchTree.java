package tree;

import java.util.Stack;

public class BinarySearchTree {
	private Node root;
	public BinarySearchTree() {
		root=null;
		
	}
public boolean insert(int data) {
	
	Node nn=new Node(data);
	
	if(nn==null) {
		return false;	
	}
	
	if(root==null) {
		root=nn;
		return true;
	}
	Node temp=root;
	
	while(true) {
		if(data<temp.getData()) {
			if(temp.getLeft()==null) {
				temp.setLeft(nn);
				return true;
			}
			System.out.println(temp.getData());
		}
		else {
			if(data>temp.getData()) {
				if(temp.getRight()==null) {
					temp.setRight(nn);
					return true;
				}
				System.out.println(temp.getData());
			}
		}
	}
	 
	
	
}


public void preorder() {
	Node temp=root;
	Stack<Node> stack=new Stack<Node>();
	
	while(temp!=null || stack.empty()) {
		while(temp!=null) {
			System.out.println(temp.getData()+" ");
			stack.push(temp);
			temp=temp.getLeft();
		}
		temp=stack.pop().getRight();
	}
}

public void inorder() {
	Node temp=root;
	Stack<Node> stack=new Stack<Node>();
	while(temp!=null || stack.empty()) {
		while(temp!=null) {
			stack.push(temp);
			temp=temp.getLeft();
		}
		stack.pop();
		temp=temp.getRight();
	}
}
public int getMax() {
	if(root==null) {
		return -1;
		
	}
	Node temp=root;
	while(temp.getRight()!=null) {
		temp=temp.getRight();
		
	}
	return temp.getData();
}
}
