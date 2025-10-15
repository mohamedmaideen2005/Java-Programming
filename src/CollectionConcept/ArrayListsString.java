package CollectionConcept;
import java.util.ArrayList;
import java.util.Collections;//build in package for all collection concepts
import java.util.Scanner;
import java.util.List; 
public class ArrayListsString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<>();
		//al.add("Abi");
		//System.out.println(al);
		//al.add("Kamila");
		//System.out.println(al);
		System.out.println("Enter how many Input You need:");
		int inn=sc.nextInt();//for how many input need from user
		sc.nextLine(); 
		for(int i=0;i<inn;i++) {
			System.out.println("Enter the String:");
			String st=sc.nextLine();
			al.add(st);
		}
		System.out.println(al);
		ArrayList<Integer>aal=new ArrayList<>();
		//aal.add(3);
		//aal.add(2);
		//aal.add(5);
		//System.out.println(aal);
		System.out.println("Enter how many Input You need:");
		int ii=sc.nextInt();//for how many input need from user
		for(int i=0;i<ii;i++) {
			System.out.println("Enter the Int:");
			int in=sc.nextInt();
			aal.add(in);
		}
		System.out.println(aal);
	   // aal.set(2, 1);//set we will use for add specific place or replace
		System.out.println("Sorted List:");
		Collections.sort(aal);
		System.out.println(aal);
		System.out.println("With out Square bracket:");
		for(String a:al) {
		System.out.print(a+" ");
		}
		System.out.println();
		System.out.println(al.contains("aa"));//contain is used to check input contain or not
		System.out.println("To Check list have element or Not: "+al.isEmpty());
		al.clear();
		System.out.println(al);
		}
}
