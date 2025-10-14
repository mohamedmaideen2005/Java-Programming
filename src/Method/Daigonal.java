package Method;

public class Daigonal {
boolean daigonalChecker(int arr[][]) {
	for(int row=0;row<arr.length;row++) {
		for(int col=0;col<arr[row].length;col++) {
			if((row==col&&arr[row][col]!=1)||(row!=col)&&(arr[row][col]!=0)) {
			 return false;		
			}
         	}	
	}
	return true;
}
	public static void main(String []args) { 
		Daigonal ob1=new Daigonal();
		int arr[][]= {{1,0,0},{0,1,0},{0,0,1}};
		System.out.println(ob1.daigonalChecker(arr)?"Daigonal":"Not a Daigonal");
	

}
}