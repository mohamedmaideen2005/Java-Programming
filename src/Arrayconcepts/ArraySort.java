package Arrayconcepts;

import java.util.Arrays;

public class ArraySort {
public static void main(String[] args) {
	int arr[]=new int[5];
	System.out.println(Arrays.toString(arr));
	Arrays.fill(arr,0);
	System.out.println(Arrays.toString(arr));
	int dest[]=Arrays.copyOf(arr,3);
		System.out.println(Arrays.toString(dest));

		int num[]= {1,2,3,4,5};
    //int dest[]=new int[10];
    //System.arraycopy(num,2, dest, 5, num.length-2);
    //System.out.println(Arrays.toString(dest));
}

}
