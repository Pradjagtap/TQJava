package StringBufferBuilder;

public class StringBuilderMethod{

	public static void main(String[] args) {
		// no concat method
		
		StringBuilder sb=new StringBuilder();
		sb.append("Programs");
		sb.reverse();
		
		System.out.println(sb);
		
		String s="Java is fun";
		StringBuilder sb1=new StringBuilder(s);
		sb1.reverse();
		System.out.println(sb1);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.replace(2, 5, "java");//2,3,4-index
		System.out.println(sb);
		
		sb.insert(1,"Code");
		System.out.println(sb);

	}

}
