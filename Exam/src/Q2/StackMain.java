package Q2;

public class StackMain {

	public static void main(String[] args) {
	Stack s=new Stack(4);
	
System.out.println(	s.push(new Student(1, "shubham", 2000)));
System.out.println(	s.push(new Student(2, "sanket", 3000)));
System.out.println(	s.push(new Student(3, "mohit", 4000)));
s.pop();
System.out.println(	s.push(new Student(4, "prajyot", 5000)));


s.display();
	}

}
