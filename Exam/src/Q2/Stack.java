package Q2;

public class Stack {
private int size;
private int top;
private Student[] arr;


public Stack(int size) {
	this.size=size;
	top=-1;
	arr=new Student[size];
	
}

public boolean isEmpty() {
	return (top==-1);
}
	
	public boolean isFull() {
		return (top==size-1);
	}
	
	public boolean push(Student s) {
		if(isFull()) {
			return false;
		}
		
		arr[++top]=s;
		
		return true;
	}
	
	public boolean pop() {
		if(isEmpty()) {
			return false;
			
		}
		System.out.println(arr[top]);
               --top;
		
		return false;
	}
	
	public void peek(Student s) {
		if(isEmpty()) {
			System.out.println("No Student Present...");
		}
		
		arr[top]=s;
	}
	
	public void display() {
	int i=0;
	while(i<=top) {
	System.out.println(pop());	
	}
	}
}
