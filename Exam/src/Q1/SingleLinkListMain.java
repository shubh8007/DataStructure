package Q1;

import java.util.Scanner;

public class SingleLinkListMain {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
		SigleLinkList sl=new SigleLinkList();
		boolean exit=false;
		
		
while(!exit) {
	System.out.println("Enter your choice");
	System.out.println("0:exit,1:end insert,2:display,3.insertFirst,4.count,5.searchByName,6.insertAtPosition,7.delete at pos");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:
		System.out.println("Insert at end position");
		sl.endInsert(new Book(1, "krshinakath", "Yashwantaro Chavan", 100));
		System.out.println("Book added Sucessfully");
		break;
	case 2:
		System.out.println("Display Books");
		sl.display();
		break;
	case 3:
		System.out.println("insert at first");
		sl.insertFirst(new Book(2, "mahabharat", "maharshi vyas", 200));
		System.out.println("inser at first sucesfully");
		break;
	case 4:
		System.out.println("count");
		sl.count();
		
		break;
	case 5:
		System.out.println("Search by name");
		sl.searchByname(sc.next());
		System.out.println("Book searched");
		break;
	case 6:
		System.out.println("Insert At pos");
		sl.insertAtPos(1,new Book(3, "abc", "pqr", 200) );
		System.out.println("insert At pos added sucesfully");
		break;
	case 7:
		System.out.println("delete at pos");
		sl.deletAtPos(2);
		System.out.println("Book deleted Sucessfully");
		break;
	case 0:
		exit =true;
		break;
	}
	
}
	}

}
