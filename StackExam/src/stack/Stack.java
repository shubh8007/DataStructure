package stack;

public class Stack {
private int maxSize;
private int[] arr;
private int top;

public Stack(int maxSize) {
	this.maxSize=maxSize;
	top=-1;
	arr=new int[maxSize];
}

public boolean isEmpty() {
	return (top==-1);
	
}
public  boolean isFull() {
	return (top==maxSize-1);
}

public  void push(int value) {
	if(isFull()) {
		System.out.println("stack is full...");
	}
	top++;
	arr[top]=value;
}
public int pop() {
	if(isEmpty()) {
		return -1;
	}
	int poppedValue=arr[top];
	top--;
	return poppedValue;
	
}
public int peek() {
	if(isEmpty()) {
		System.out.println("Stack is Empty..");
		return -1;
		
	}
	return arr[top];
}
}
