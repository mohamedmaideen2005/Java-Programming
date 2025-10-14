package TwoDimesional;

public class ColumnSum {
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr[0].length;i++) {
			int a=0;
			for(int j=0;j<arr.length;j++) {
				a+=arr[j][i];
			}
			System.out.println("col "+(i+1)+" "+a);
		}
	}
	}

