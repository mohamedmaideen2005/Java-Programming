package CollectionConcept;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetConcept {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<String>q=new /*Linked*/HashSet<>();
		q.add("Aafi");
		q.add("Aafi");
		q.add("Kamila");
		q.add("Karthi");
		q.add("Mohan");
		q.add("Salman");
		q.add("Varsha");
		q.add("Mohan");
		q.add("GowriShankar");
		System.out.println(q);
		System.out.println(q.size());
		q.removeAll(q);
		System.out.println(q);
		System.out.println(q.contains("Kamila"));
		System.out.println(q.isEmpty());
		
	HashSet<Character> ab=new HashSet<>();
	ab.add('x');
	ab.add('2');
	ab.add('c');
	ab.add('9');
	ab.add('g');
	System.out.println(ab);//unorder
	
	LinkedHashSet<Character> abc=new LinkedHashSet<>();
	abc.add('x');
	abc.add('2');
	abc.add('c');
	abc.add('9');
	abc.add('g');
	System.out.println(abc);//order

	
	TreeSet<Character> b=new TreeSet<>();
	b.add('x');
	b.add('2');
	b.add('c');
	b.add('9');
	b.add('g');
	System.out.println(b);//ascii order
	for(char ch:b) {
		System.out.println(ch);
	}
	}
}
	

