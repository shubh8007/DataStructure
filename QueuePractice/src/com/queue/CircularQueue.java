package com.queue;




public class CircularQueue {
	private int [] arr;
	private  int front, rear;
	private int size;
	
	
	public CircularQueue(int size) {
		
		this.size=size;
		arr=new int[size];
		front=rear=-1;
	}
	public boolean isEmpty() {
		return ((front==-1 && rear==-1)|| front>rear);
	}
	
	public boolean isFull() {
		return rear==size-1;
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
