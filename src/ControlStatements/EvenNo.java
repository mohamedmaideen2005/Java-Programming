package ControlStatements;
public class EvenNo {
	public static void main(String[] args) {
			for(int i=0;i<=10;i++) {
				if(i%2==0) {
				System.out.println(i);
			}
		}
			System.out.println("   ");
			System.out.println("Time complexity:");
			int st=2;
			if(st%2!=0) {
				st++;
			}
			for(;st<=10;st+=5) {
				System.out.println(st);
			}
	}
}
