package Q1;

public class SigleLinkList {

	private Node head;

	public SigleLinkList() {
		head=null;
	}
	
	public boolean endInsert(Book b) {
		Node nn=new Node(b);
		if(head==null) {
			head=nn;
			
		}
		Node last=head;
		
		while(last.getNext()!=null) {
			last=last.getNext();
		}
		last.setNext(last);
		return true;
	}
	
	public void display() {
		Node display1=head;
		while(display1.getB()!=null) {
			if(display1!=null) {
				
				System.out.println(display1.getB());
				break;
				
			}
			
			display1=display1.getNext();
		}
	
		
	}
	
	public boolean insertFirst(Book b) {
		Node nn=new Node(b);
		if(head==null) {
			head=nn;
		}
		head.setNext(nn);
		head=nn;
		return true;
	}
	
	public void count() {
		Node last=head;
		int count=0;
		do {
			
			count++;
			last=last.getNext();
		System.out.println(count);
		}while(last.getNext()!=null);
		
	}
	
	public boolean searchByname(String bname) {
		Node last=head;
		Book b=new Book();
		if(last.getNext().getB().equals(bname)) {
			System.out.println(b.toString());
		}
		
		return true;
	}
	public boolean insertAtPos(int pos,Book b) {
		Node nn=new Node(b);
		
		if(head==null) {
			head=nn;
		}
		Node last=head;
		
		for(int i=0;i<pos-1;i++) {
			last=last.getNext();
		}
		nn.setNext(last.getNext());
		last.setNext(nn);
		
		return true;
	}
	
	public boolean deletAtPos(int pos) {
		Node last=head;
	           for(int i=0; i<pos;i++) {
	        	   last=last.getNext();
	           }
	           last.setNext(null);
		
		return true;
	}
}
