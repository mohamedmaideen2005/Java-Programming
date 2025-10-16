package CollectionConcept;
import java.util.HashMap;
import java.util.Map;
public class HashMapConcept {
public static void main(String[] args) {
	Map<Integer,String>m=new HashMap<>();
	m.put(0, "List");
	m.put(1, "Tree");
	m.put(2, "Set");
	m.put(3, "Tree");
	System.out.println(m);
	System.out.println(m.size());
	System.out.println(m.containsKey(1));
	System.out.println(m.containsValue("Set"));
	System.out.println();
	
}
}
