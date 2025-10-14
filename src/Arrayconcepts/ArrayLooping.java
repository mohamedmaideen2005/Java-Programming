package Arrayconcepts;
import java.util.Scanner;
public class ArrayLooping {
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int []num=new int[6];
     for(int i=0;i<num.length;i++) {
    	 num[i]=sc.nextInt();
     }
     int sum=0;
     float avg=0f;
     for(int k=0;k<num.length;k++) {
    	 sum=sum+num[k];
       }
     avg=sum/num.length;
     System.out.println(sum);
     System.out.println(avg);
     
}
	}