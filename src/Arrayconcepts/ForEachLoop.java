package Arrayconcepts;
import java.util.Arrays;
import java.util.Scanner;
public class ForEachLoop {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]= {25,99,15,28,89};
	System.out.println(Arrays.toString(arr));
	int temp=arr[0];
	arr[0]=arr[2];
	arr[2]=temp;
	System.out.println(Arrays.toString(arr));//another way to store in array form
	for(int i=0;i<arr.length;i++) {
		System.out.println(i+" : "+arr[i]);
	}
	System.out.println("for each loop");
	for(int n:arr) {
		System.out.println(n);
	}
}
}
