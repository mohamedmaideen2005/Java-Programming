package ControlStatements;

public class PrimeNo {

	public static void main(String[] args) {
	    int num=13;
	    int count=0;
	    for(int i=2;i<=num/2;i++) {
	    	if(num%i==0) {
	    		count++;
	    		System.out.println(i);
	    	}
	    }
	if (count==0) {
		System.out.println(num+" is a Prime No");
	}
	else {
		System.out.println("not a prime num");
	}
  }
}
