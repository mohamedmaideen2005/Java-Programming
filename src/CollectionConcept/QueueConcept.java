package CollectionConcept;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
public class QueueConcept {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue<String>q=new LinkedList<>();
		q.add("Aafi");
		q.add("Abi");
		q.add("Kamila");
		q.add("Karthi");
		q.add("Mohan");
		q.add("Salman");
		q.add("Varsha");
		q.add("Gowri Shankar");
		System.out.println(q);
		System.err.println("Poll element:"+q.poll());
		System.out.println("Peek element:"+q.peek());
		System.err.println("Size :"+q.size());
		System.out.println("Empty Check :"+q.isEmpty());
        q.clear();
		System.err.println(q);
	}
}
