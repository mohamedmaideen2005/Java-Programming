package TwoDimesional;

public class Declaration {
public static void main(String[] args) {
	int arr [][]= {{1,2,3},{4,5,6},{7,8,9}};
	System.out.println("row size:"+arr.length);//row size
	System.out.println("col size:"+arr[0].length);//col size
    for(int i=0;i<arr.length;i++) {
    	for(int j=0;j<arr.length;j++) {
    		System.out.print(arr[i][j]+"  ");
    	}
    	System.out.println( );
    }
}
}
