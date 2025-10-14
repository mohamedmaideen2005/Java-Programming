package Arrayconcepts;

public class ArrayMaxMin {
public static void main(String[] args) {
	int[]num= {-1,15,-7,-9};
	int max=num[0];
	int min=num[0];
	for(int i=1;i<num.length;i++) {
		int n=num[i];
		if(n>max) {
			max=n;
		}
	}
	System.out.println(max);
for(int i=1;i<num.length;i++) {
	int n=num[i];
	if(n<min) {
		min=n;
	}}
	System.out.println(min);
}}
