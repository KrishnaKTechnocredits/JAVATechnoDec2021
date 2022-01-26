package technocredits.exceptiondemo;

public class Example8 {
	String input = "techno";

	void m1(String name) {
		int len = name.length();
		try {
			m2(len);
			System.out.println(len);
		}catch(Exception e) {
			System.out.println("in m1");
		}
		System.out.println("hello");
	}

	void m2(int len) {
		System.out.println("in m2");
		try {
			char ch = input.charAt(len);
			System.out.println(ch);
		} catch (StringIndexOutOfBoundsException se) {
			System.out.println(input.charAt(input.length()));
		}
		System.out.println("credits");
	}
	
	public static void main(String[] args) {
		new Example8().m1("credits");
	}
}
