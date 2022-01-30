package technocredits.stringbufferbuilder;

public class Example1 {

	public static void main(String[] args) {
		String str = new String("Techncredits");
	    str.concat("Hi");
		str.toUpperCase();
		
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer("tech");
		sb.append("no");
		sb.reverse();
		
		//System.out.println(sb == sb2);
		System.out.println(sb);
	}
}
