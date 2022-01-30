package technocredits;

public class Example1 {

	public static void main(String[] args) {
		
		Integer x1 = 10;
		Integer x2 = 10;
		
		String s1 = "Hi";
		String s2 = new String("Hi");
		
		int x3 = 10;
		int x4 = 10;
		
		System.out.println(x1.equals(x2));
		System.out.println(x1.intValue() == x2.intValue());
		System.out.println(x1 == x2);
	}
}
