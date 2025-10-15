package CollectionConcept;
import java.util.ArrayList;
public class ArrayListPrgrm  {
     public static void main(String[] args) {
    	 //auto boxing
		int num=10225;
		Integer n=Integer.valueOf(num);
 		Integer nu=num;
 		
 		
	/*	String st=String.valueOf(num);
		System.out.println(Integer.MAX_VALUE);
		char ch='1';
		System.out.println(Character.isAlphabetic(ch));

		String stt=String.valueOf(num);
		StringBuffer sb=new StringBuffer();
		sb.append(stt);
		System.out.println(sb.reverse());
		Integer nuu=Integer.valueOf(num);
		float f=20.25f;
		Float fl=Float.valueOf(f);	
		*/
		//st=sb.toString();
		//int res=Integer.parseInt(st);//to convert string to integer
 		
 		//unboxing
 		Integer no=2564;
 		int op=no.intValue();
 		int o=no;
 		
 		//Non premitive to Non premitive
 		// Integer to String
 		Integer no1=5648;
 		String st1=String.valueOf(no1);
 		
 		//String to Integer
 		String st="54698";
 		Integer res=Integer.parseInt(st);
 		
 		
	}
}
