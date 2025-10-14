package WhileLoop;
public class Reverse {
	public static void main(String[] args) {
	int num = 121;
	int t=num;
	int b=0;
	while(num!=0) {
		int last=num%10;
		 b=b*10+last;
		 num=num/10;	
	}
	System.out.println(b);
		if(t==b) {
		System.out.println("It is palindrome");
	 }
	else {
		System.out.println("not palindrome");
	}
}
}
