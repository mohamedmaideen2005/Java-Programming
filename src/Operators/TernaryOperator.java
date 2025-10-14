package Operators;
public class TernaryOperator {
public static void main(String[] args) {
	int mark=101;
	String res=(mark>49)?"pass":"fail";
	String op=(mark>0&&mark<=100)?((mark>49)?"pass":"fail"):"Invalid";
	System.out.println(op);
	
}
}
