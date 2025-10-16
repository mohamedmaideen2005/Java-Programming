package CollectionConcept;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
//Main method in MapConcept->get,put,containsKey,containsValue,isEmpty,keySet
//keySet allow key value
//entry set all pair of key retrieve
public class MapConcept {
	public static void main(String[] args) {
	    HashMap<Character,Integer>q=new HashMap<>();//unorder
		q.put('v',1 );
		q.put('e',1 );
		q.put('l',2 );
		q.put('a',2 );
		q.put('r',1 );
		for(char ch:q.keySet()) {
			System.out.println(ch+" : "+q.get(ch));			
			 }
    }
  }
