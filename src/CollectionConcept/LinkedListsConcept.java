package CollectionConcept;
import java.util.LinkedList;
public class LinkedListsConcept {
public static void main(String[] args) {
	LinkedList<Integer>ll=new LinkedList<>();
	ll.add(2);
	ll.add(12);
	ll.add(34);
	ll.add(52);
	ll.add(67);
	ll.addLast(90);
	ll.addFirst(2);
	System.out.println(ll);
	ll.add(2,3);
	System.out.println(ll);
	ll.remove(2);
	System.out.println("After Remove(2):"+ll);
	ll.removeLast();
	System.out.println("After Remove():"+ll);
	ll.remove(2);
	System.out.println("After Remove(2):"+ll);
	ll.removeFirstOccurrence(2);
	System.out.println("After Remove(2):"+ll);
	System.out.println("size:"+ll.size());
	System.out.println("Empty:"+ll.isEmpty());
	System.out.println("Index of():"+ll.indexOf(52));
	ll.clear();
	System.out.println("clear:"+ll);
}
}
