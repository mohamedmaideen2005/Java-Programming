package CollectionConcept;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListProblems {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> al=new ArrayList<>();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	int size=al.size();
	if(al.isEmpty()) {	
		for(int i=0;i<4;i++) {
			int in=sc.nextInt();
			al.add(in);
		}	
	}
	else if(size%2==0) {
		for(int i=0;i<size;i++) {
			System.out.println("Enter the element:");
		    int in=sc.nextInt();
		    al.add(in);
		}
		System.out.println(al);
	}
	else {
		System.out.println(al);
	}
  }
}
