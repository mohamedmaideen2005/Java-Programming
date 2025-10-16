package CollectionConcept;
import java.util.Scanner;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
public class PriorityQueues {
public static void main(String[] args) {
	PriorityQueue<Character>q=new PriorityQueue<>((a,b)->b-a);
	//PriorityQueue<Character>q=new PriorityQueue<>(Comparator.comparingInt(Character x)->x).reversed());
	//Queue<Character> q=new PriorityQueue<>();
	q.add('x');
	q.offer('1');
	q.add('c');
	q.add('6');
	q.add('h');
	//q.addAll(q);
    System.out.println(q);
    System.out.println(q.poll());
    System.out.println(q.poll());
	System.out.println(q);
	System.out.println(q.poll());
	System.out.println(q.poll());
}
}
