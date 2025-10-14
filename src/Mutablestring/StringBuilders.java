package Mutablestring;

public class StringBuilders {
	public static void main(String[] args) {
		String st1="kamila";
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append(st1);
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append(" is my friend");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb);
		//reverse string
		sb.reverse();
		System.out.println(sb);
		// delete
		sb.delete(7,10);
		System.out.println(sb);
		// replace
		sb.replace(7,10,"was ");
		System.out.println(sb);
		//insert
		sb.insert(13,"best");
		System.out.println(sb);
	}			
}


