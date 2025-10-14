package StringConcepts;

public class StringBasics {

	public static void main(String[] args) {
	 String st1="Maideen";
	 String st2=new String("Maideen");
	 String st3="Maideen";
	 String st4=new String("Maideen");
	 char ch[]={'M','a','i','d','e','e','n'};
	 String st6=new String(ch);
	 String st5=new String(new char[]{'m','a','i','d','e','e','n'});
System.out.println(st1==st2);
System.out.println(st1==st3);
System.out.println(st2==st4);
System.out.println(st5==st6);
System.out.println(ch);
System.out.println(st1.equals(st2));
	}

}
