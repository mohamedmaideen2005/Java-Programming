package CollectionConcept;
import java.util.TreeSet;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
	public class TreeSetConcept {
		public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Set<String>q=new TreeSet<>();
	q.add("Aafi");
	q.add("Aafi");
	q.add("Kamila");
	q.add("Karthi");
	q.add("Mohan");
	q.add("Salman");
	q.add("Varsha");
	q.add("Mohan");
	System.out.println(q);
	System.out.println(q.size());
	q.removeAll(q);
	System.out.println(q);
	System.out.println(q.contains("Kamila"));
	System.out.println(q.isEmpty());



}
}