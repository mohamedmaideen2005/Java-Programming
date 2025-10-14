package Basics;
public class Variable{
	String name;
	static String clg;
	void disp() {
		System.out.println(name+" "+clg);
	}
	public static void main(String[] args) {
		Variable s1=new Variable();
		Variable s2=new Variable();
		s1.name="Kabilan";
		clg="Vcet";
		s2.name="Harish";
		s1.disp();
		s2.disp();
	}
}