package Basics;
public class Variables {
	int insVar=25;   //instance variable scope for entire class
	void meth() {
		int locVar=50;   //local variable scope upto this segment
		System.out.println(locVar);
		System.out.println(insVar);
	}
	void disp() {
		//System.out.println(locVar);  cant access since it is local variable of above method
		System.out.println(insVar);
	}
	public static void main(String[] args) {
		Variables obj1; //obj declaration
		obj1=new Variables();  //memory allocation
		System.out.println(obj1);
		Variables obj2=new Variables();
		System.out.println(obj2);
		obj1.disp();
		obj1.meth();
	}
}
                                                                                                                                           