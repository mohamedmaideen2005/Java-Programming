package ConditioalStatements;
import java.util.Scanner;
public class PracticeSet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the input:");
		int st=sc.nextInt();
		if((st%3==0)&&(st%5==0)) {
			System.out.println("fizzbuzz");
			
		}
		else if(st%3==0) {
			System.out.println("fizz");
		}
		else if(st%5==0) {
			System.out.println("buzz");
		}
		else {
			System.out.println("invalid");
		}

	}

}
