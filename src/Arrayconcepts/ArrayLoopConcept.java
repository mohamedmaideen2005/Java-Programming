package Arrayconcepts;

public class ArrayLoopConcept {
	public static void main(String[] args) {
		String arr[]= {"Kavin","Dharnish","Karthi","Salman","Mohan"};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println("\nBy Loop:");
        for(int i=0;i<arr.length;i++) {
        	System.out.println(arr[i]);
        }
	}
}
