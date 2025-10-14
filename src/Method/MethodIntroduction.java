package Method;
import java.util.Scanner;
public class MethodIntroduction {
	void add() {                                 //method
		Scanner sc=new Scanner(System.in);      //       declaration
		int a=sc.nextInt();                    //                   or
		int b=sc.nextInt();                   //                      definition
		int res=a+b;                         //                                 part
		System.out.println(res);            //                                      execution
		
	}
	public static void main(String[] args) {  
		MethodIntroduction ob1=new MethodIntroduction();
		System.out.println("Method Calling 1");
		ob1.add();//method calling part
		System.out.println("method return1");	
		System.out.println("Method Calling 2");
		ob1.add();//method calling part
		System.out.println("method return2");
		
}
}
