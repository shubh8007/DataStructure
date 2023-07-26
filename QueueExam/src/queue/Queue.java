package queue;

public class Queue {
private int rear,front;
private int size;
private int[] arr;


public Queue(int size) {
	this.size=size;
	arr=new int[size];
	rear=front=-1;
	
}
public boolean isEmpty() {
	return (front==-1 && rear==-1 ||front>rear);
}

public boolean isFull() {
	return (front ==size-1);
}

public void insert(int data) {
	if(isFull()) {
		System.out.println("Queue is full");
	}
	
	arr[rear+1]=data;
	
}
public int delete() {
	if(isEmpty()) {
		return -1;
	}
	
	return arr[front++];
}

}
