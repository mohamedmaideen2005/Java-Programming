package Arrayconcepts;
public class SecondLargestNum {
	public static void main(String[] args) {
		int arr[]= {10,11,9,8,12,13,14};
		int max=0;
		int smax=0;
        if(arr[0]>arr[1]) {
        	max=arr[0];
            smax=arr[1];
        }
        else {
        	max=arr[1];
        	smax=arr[0];
        }
        for(int i=2;i<arr.length;i++) {
        	if(arr[i]>max) {
        		smax=max;
        		max=arr[i];
        		
        	}
        	else if(arr[i]>smax&&arr[i]!=max) {
        		smax=arr[i];
        	}
        }
        	System.out.println(max);
        	System.out.println(smax);
        
}

}