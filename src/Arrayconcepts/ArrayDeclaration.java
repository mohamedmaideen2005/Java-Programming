package Arrayconcepts;
public class ArrayDeclaration {
	public static void main(String[] args) {
		String arr[]= {"kavin","Dharnish","Karthi","Salman","Mohan"};
		int num[]= {1,2,3};
		System.out.println(arr[3]);
		arr[1]="Abi";
		System.out.println(num[2]);
		num[1]= 10;
		System.out.println(arr[1]);
		System.out.println(num[1]);
		System.out.println(arr.length);
		System.out.println(arr[arr.length-1]);
		
		}

	}

