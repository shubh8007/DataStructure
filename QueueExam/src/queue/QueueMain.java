package queue;

public class QueueMain {
public static void main(String[] args) {
	
	Queue q=new Queue(5);
	
	q.insert(10);
	q.insert(60);
	q.insert(90);
	q.insert(70);
	q.insert(2);
	q.delete();

	CircuLarQueue cq=new CircuLarQueue(2);
	System.out.println(cq.insert(20));
	System.out.println(cq.insert(50));

	cq.delete();
	System.out.println(cq);
}
}
