package ControlStatements;

public class SpyNo {
	public static void main(String[] args) {
		int num=6;
		int sum=0;
			for(int i=1;i<num/3;i++) {
				if(num%i==0) {
					sum=i*num;
		}
    	}
			System.out.println(sum);

     }
}