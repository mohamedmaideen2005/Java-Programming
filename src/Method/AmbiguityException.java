package Method;

public class AmbiguityException {
   //void sum(int num1,int num2) {
   //  System.out.println(num1+num2);
   //}
   void sum(int num1,float num2) {
	   System.out.println(num1+num2);
   }
   //void sum(int num1,int num2,int num3) {
   //  System.out.println(num1+num2+num3);
   //}
   public static void main(String[] args) {
	AmbiguityException s1=new AmbiguityException();
	s1.sum(2, 3);
	s1.sum(2, 3.0f); //if direct match is not there if there in method,implicit match occurs
	//s1.sum(1,2,4);// more than one means there ambiguity exception occurs
}
}

