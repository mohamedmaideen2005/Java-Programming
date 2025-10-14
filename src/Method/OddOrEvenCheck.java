package Method;

public class OddOrEvenCheck {
boolean Check(int n) {
  for(int i=0;i<n;i++) {
	  if(n%2==0) {
		  //System.out.println("even no");
		  return true;
	  }
  }
  //System.out.println("odd no");
  return false;
}
public static void main(String[] args) {
	OddOrEvenCheck sc1=new OddOrEvenCheck();
	System.out.println("Check Whether Odd or Even;");
	System.out.println();
	System.out.println(sc1.Check(9)?"Even":"Odd");
	System.out.println(sc1.Check(8)?"Even":"Odd");
	
}
}