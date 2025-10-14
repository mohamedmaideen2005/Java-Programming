package Arrayconcepts;

public class SortedOrNot {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,45,50};
		for(int i=0;i<arr.length-1;i++) { 
		 if(arr[i]>arr[i+1]){	 
			 System.out.println("unsorted");	
		     return;
		}
		}
		System.out.println("sorted");
		
	}
}