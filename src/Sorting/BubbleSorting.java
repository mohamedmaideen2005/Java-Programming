package Sorting;

import java.util.Arrays;

public class BubbleSorting {
public static void main(String[] args) {
	int arr[]= {9,2,5,8,1};
	System.out.println(Arrays.toString(arr));
	boolean swap=true;
	while(swap) {
		swap=false;
	
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]>arr[i+1]) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			swap=true;
		}
	}
	System.out.println(Arrays.toString(arr));
}
	
}
}