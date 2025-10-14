package WhileLoop;
public class ArmstrongNo {
	public static void main(String[] args) {
		int num=371;
		int a=num;
		int sum=0;
		while(num!=0) {
			int last =num%10;
			sum=sum+(last*last*last);
			num=num/10;
		}
		System.out.println(sum);
		if(a==sum) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstomg no");
		}
	}
}



