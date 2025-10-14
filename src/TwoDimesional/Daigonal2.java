package TwoDimesional;

import java.util.Arrays;

public class Daigonal2 {
	public static void main(String[] args) {
				    //row     0         1          2
            		//col   0 1 2 3   0 1 2 3   0  1  2  3
		boolean flag=true;        
		int arr [] []= {{1,0,0},{0,1,0},{0,0,1}};
OUTER:
	for(int row=0;row<arr.length;row++) {
		for(int col=0;col<arr[row].length;col++) {
			if((row==col&&arr[row][col]!=1)||(row!=col)&&(arr[row][col]!=0)) {
				flag=false;
				break OUTER;
			}
		}
	}
if(flag) {
	System.out.println("daigonal");
}
else {
	System.out.println("not a daigonal");
}
	
	}
	
}
