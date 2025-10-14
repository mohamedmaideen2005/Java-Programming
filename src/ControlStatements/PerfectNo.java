package ControlStatements;
import java.util.Scanner;
public class PerfectNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Perfect_no=sc.nextInt();
		int sum=0;
		for(int i=1;i<Perfect_no;i++) {
			if(Perfect_no%i==0) {
				sum=sum+i;
			}
		}
		if(sum==Perfect_no) {
		System.out.println("the given "+ Perfect_no +"is perfect num");
				
	}else {
		System.out.println("is not perfect num");
	}
 }

}
