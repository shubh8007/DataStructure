package stack;

public class StackMain {

	public static void main(String[] args) {
		Stack st=new Stack(5);
		
		System.out.println();
		st.push(60);
		st.push(30);
		st.pop();
		st.peek();
		System.out.println(st.peek());
	}

}
