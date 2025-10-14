package StringConcepts;

public class StringMethods {
public static void main(String[] args) {
	String s1="Maideen";
	String s2="maideen";
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.length());
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.compareToIgnoreCase(s2));
	System.out.println(s2.toUpperCase());
	System.out.println(s1.toLowerCase());	
	System.out.println(s1);
	System.out.println(s2);
    System.out.println(s1.charAt(1));
}
}
