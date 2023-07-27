package Q1;

public class Node {
private Book b;
private Node next;

public Node(Book b) {
	this.b=b;
	next=null;
}

public Book getB() {
	return b;
}

public void setB(Book b) {
	this.b = b;
}

public Node getNext() {
	return next;
}

public void setNext(Node next) {
	this.next = next;
}

}
