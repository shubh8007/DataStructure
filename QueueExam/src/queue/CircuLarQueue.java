package queue;

public class CircuLarQueue {
private int size;
private int rear,front;
private int[] arr;

public CircuLarQueue(int size) {
	this.size=size;
	rear=front=-1;
	arr=new int[size];
	
}

public boolean isEmpty() {
	return (front==rear);
}

public boolean isFull() {
	return (front==-1 && rear==size-1 || (rear+1)%size==front);
}

public boolean insert(int data) {
	if(isFull()) {
		return false;
	}
	
	rear=(rear+1)%size;
	arr[rear]=data;
	return true;
	
	
}
public int delete() {
	if(isEmpty()) {
		return -1;
	}
	
	front=(front+1)%size;
	return arr[front];
}
}
