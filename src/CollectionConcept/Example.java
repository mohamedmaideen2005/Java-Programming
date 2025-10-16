package CollectionConcept;
import java.util.LinkedHashMap; 
import java.util.Map; 
public class Example {
	static LinkedHashMap<Character,Integer> freqChar(String st){
     LinkedHashMap<Character,Integer>mp=new LinkedHashMap<>();
     for(char ch:st.toCharArray()) {
    	 if(mp.containsKey(ch)) {
    		 mp.put(ch,mp.get(ch)+1);
    	 }
    	 else {
    		 mp.put(ch, 1); 			 
    		 }
    	 }
     return mp;
     }
    	 static char maxchar(String st) {
    		 LinkedHashMap<Character,Integer>op=freqChar(st);
    		 int max=0;
    		 /*char ch='\0';
    		 for(Map.Entry<Character,Integer>it:op.entrySet()) {
    			 if(it.getValue()>max) {
    				 max=it.getValue();
    				 ch=it.getKey();   			
    				  }*/
    		 char c='\0';
    		 for(char ch:op.keySet()) {
    			 int cVal=op.get(ch);
    			 if(cVal>max) {
    				 max=cVal;
    				 c=ch;
    			 }
    		 }
    				 return c;
     }
    	 public static void main(String[] args) {
			String st="velalar";
			char op=maxchar(st);
			System.out.println(op);
		}
}
