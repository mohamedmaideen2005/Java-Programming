package WhileLoop;

public class StrongNo {

	public static void main(String[] args) {
		for(int num=100;num<=1000000;num++) {
		int sum=0;
		int temp=num;
		while(temp!=0) {
			int last=temp%10;
			int fact=1;
			for(int i=1;i<=last;i++) {
				fact=fact*i;
			
			}
			sum=sum+fact;
			temp/=10;
			
		}
		if(num==sum){
			System.out.println(num);
			
		}
		
		}
	}

}
