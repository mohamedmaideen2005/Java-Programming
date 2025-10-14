package TwoDimesional;

public class RightDaigonal {
public static void main(String[] args) {
	int arr[][]= {{1,2,3},{4,7,5},{6,7,8}};
	System.out.println("The Right Daigonal:");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			if(i+j==arr.length-1) {	
				System.out.print(arr[i][j]);
			}
			else {
				System.out.print("   ");
			}
		}
		System.out.println();
		
}
}}
