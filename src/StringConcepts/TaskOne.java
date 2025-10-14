package StringConcepts;

public class TaskOne {
public static void main(String[] args) {
    String st1="kAmIlA iS mY fRiEnD aNd ShE sCoRe 100 iN jAvA";
	String res="";
	for(int i=0;i<st1.length();i++) {
		char ch=st1.charAt(i);
		if(ch>=97&&ch<='z') {
			ch=(char)(ch-32);
		} 
		else if(ch>='A'&&ch<='Z') {
			ch=(char)(ch+32);
		}
		res=res+ch;
	}
	System.out.println(res);
}
}
