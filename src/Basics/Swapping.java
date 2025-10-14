package Basics;

public class Swapping {
	public static void main(String[] args) {
	int a=10;
	int b=20;
	System.out.println("a:"+a+"  b:"+b);
	int temp=a;
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("a:"+a+"  b:"+b);
    System.out.println("Another type:");
    System.out.println("a:"+a+"  b:"+b);
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.println("a:"+a+"  b:"+b);
     }
	}
