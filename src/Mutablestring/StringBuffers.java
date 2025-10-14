package Mutablestring;

public class StringBuffers {
		public static void main(String[] args) {
			String st1="kamila";
			StringBuffer sb=new StringBuffer();
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
			
		}			
}
