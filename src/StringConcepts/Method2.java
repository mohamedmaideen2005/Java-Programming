package StringConcepts;

public class Method2 {
public static void main(String[] args) {
	String st1="  salman is handsome";
	System.out.println(st1);
	System.out.println(st1.trim());
	String st2="salamn is goodboy";
	System.out.println(st2.indexOf('a'));
	System.out.println(st2.indexOf("s"));
	System.out.println(st2.indexOf("good"));
	System.out.println(st2.lastIndexOf("d"));
	System.out.println(st2.indexOf("a",3,10));
	String st3="salamn is superstar";
	System.out.println(st3.contains("star"));
	System.out.println(st3.contains("boys"));
	System.out.println(st3.substring(9));
	System.out.println(st3.substring(9,13));
	System.out.println(st3.endsWith("r"));
	System.out.println(st3=st3.repeat(2));
	System.out.println(st3);
	String st4="salman is bad boy";
	System.out.println(st4.replace("bad","good"));
	System.out.println(st4.replaceFirst("is","is one"));
	System.out.println(st4.replaceAll("a","@"));
	System.out.println(st4.replaceAll("[aeiou]","*"));
	System.out.println(st4.replaceAll("[aeiou]",""));
}
}
