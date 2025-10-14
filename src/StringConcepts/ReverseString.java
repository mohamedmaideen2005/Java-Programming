package StringConcepts;

public class ReverseString {
public static void main(String[] args) {
	String st1="Mohan";
	String rev="";
	for(int i=0;i<st1.length();i++) {
		char ch=st1.charAt(i);
		rev=ch+rev;
		
	}
	System.out.println(rev);
}
}
