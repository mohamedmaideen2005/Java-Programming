package ControlStatements;

public class Factors {

	public static void main(String[] args) {
    int num=10;
    int count=0;
    for(int i=1;i<=num;i++) {
    	if(num%i==0) {
    		count++;
    		System.out.println(i);
    	}
    }
    System.out.println("factor count:"+count);
	}
}
