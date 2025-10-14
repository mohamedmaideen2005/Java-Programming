package Basics;
public class StaticVariable {
      int num=1;
      static int num1=1;
      void disp() {
    	  num1++;
    	  num++;
    	  System.out.println(num);
      }
      public static void main(String args[]) {
    	  StaticVariable s1=new StaticVariable();
    	  StaticVariable s2=new StaticVariable();
    	  StaticVariable s3=new StaticVariable();
    	  s1.disp();
    	  s2.disp();
    	  s3.disp();
      }
}
