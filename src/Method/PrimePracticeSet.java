package Method;

public class PrimePracticeSet {
 void prime(int n) {
	 int c=0;
	for(int i=2;i<n;i++) {
		if(n%i==0) {
			c++;
		}
	}
		if(c==0) {
	    System.out.println("prime");
	    return;
			//return true;
		}
		else {
			System.out.println("Not a Prime");
			//return false;
		}
	}

public static void main(String[]args) {
	PrimePracticeSet ob1= new PrimePracticeSet();
	// int n=6;
	//System.out.println(ob1.prime(n));
	ob1.prime(11);
}
}