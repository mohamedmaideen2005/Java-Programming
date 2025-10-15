package CollectionConcept;
import java.util.Stack;
import java.util.Scanner;
public class StackConcept {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Stack<Integer>st=new Stack<>();
	st.push(25);
	st.push(36);
	st.push(3);
	st.push(23);
	st.push(31);
	System.out.println(st);
	System.out.println("After pop:"+st.pop());
	System.out.println("Peek element:"+st.peek());
	st.push(51);
	System.out.println(st);
	System.out.println(st.size());
	System.out.println(st.empty());
	st.clear();
	System.out.println(st);
	System.out.println("capacity:"+st.capacity());
}
}
