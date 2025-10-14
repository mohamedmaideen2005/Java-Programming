package NestedLooping;
import java.util.Scanner;
public class PrimeInRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter start:");
		int start=sc.nextInt();
		System.out.print("enter end:");
		int end=sc.nextInt();
		System.out.println("the numbers between in the given range:");
		for(int num=start;num<end;num++) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}if(count==2) {
		System.out.println(num);
				
	}
	}	
	}

}
