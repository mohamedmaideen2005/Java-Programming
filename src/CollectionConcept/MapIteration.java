package CollectionConcept;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapIteration {
public static void main(String[] args) {
	LinkedHashMap<Character,Integer>q=new LinkedHashMap<>();//ordered
	q.put('v',1 );
	q.put('e',1 );
	q.put('l',2 );
	q.put('a',2 );
	q.put('r',1 );
		for(char ch:q.keySet()) {
			System.out.println(ch+" : "+q.get(ch));//it burdern for compiler
		}
		for(int i:q.values()) {
			System.out.println(i);
		}
		//map iteration
		for(Map.Entry<Character,Integer>it:q.entrySet()) {
			System.out.println(it.getKey()+"  : "+it.getValue());
		}//it reduces time complexity entry set Map Concept 

}
}
