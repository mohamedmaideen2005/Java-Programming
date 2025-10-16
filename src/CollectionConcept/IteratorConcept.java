package CollectionConcept;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorConcept {
public static void main(String[] args) {
	ArrayList<Integer>i=new ArrayList<>();
	i.add(1);
	i.add(14);
	i.add(41);
	i.add(23);
	i.add(51);
	i.add(2);
	System.out.println(i);
	Iterator<Integer> it=i.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
