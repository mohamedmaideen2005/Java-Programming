package TwoDimesional;

import java.util.Arrays;

public class Diagonal {
public static void main(String[] args) {
	int num[][]= {{1,2,3},{4,5,6},{7,8,9}};
	System.out.println("The Daigonal:");
	for(int i=0;i<num.length;i++) {
		for(int j=0;j<num.length;j++) {
			if(num[i]==num[j]) {
				System.out.print(num[i][j]);
			}
			else {
				System.out.print("   ");
			}
		}
		System.out.println();
		
	}
}
}
