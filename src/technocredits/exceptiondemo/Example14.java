package technocredits.exceptiondemo;

public class Example14 {
	
	void m1(String str) {
		try {
			System.out.println(str);
			str = str.substring(10);
			System.out.println(str.charAt(6));
		}catch(StringIndexOutOfBoundsException sbe) {
			System.out.println("Hi");
			System.out.println(str.charAt(str.length()));
		}finally {
			System.out.println(5);
		}
		System.out.println(4);
	}
	
	public static void main(String[] args) {
		new Example14().m1("technocredits");
	}
}
