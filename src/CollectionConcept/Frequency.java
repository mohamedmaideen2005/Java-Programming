package CollectionConcept;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
public class Frequency {
public static void main(String[] args) {
    String st="mohamedsalmankhan";
	LinkedHashMap<Character,Integer>m=new LinkedHashMap<>();
	for(char ch:st.toCharArray()) {
		if(m.containsKey(ch)) {
			m.put(ch,m.get(ch)+1);
		}
		else {
			m.put(ch,1);
		}
	}
	System.out.println(m);
	
}
}
