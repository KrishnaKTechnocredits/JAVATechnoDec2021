package technocredits.exceptiondemo;

public class Example15 {
	
	void m1(String str) {
		try {
			System.out.println(str);
			str = str.substring(9); // "dits"
			System.out.println(str.charAt(6));
		}catch(StringIndexOutOfBoundsException sbe) {
			System.out.println("Hi");
			try {
				System.out.println(str.charAt(str.length()));
			}catch(Exception e) {
				System.out.println("In Exception");
			}
			System.out.println(10);
		}finally {
			int x = 10/(str.length()-4);
			System.out.println(x);
			System.out.println(5);
		}
		System.out.println(4);
	}
	
	public static void main(String[] args) {
		new Example15().m1("technocredits");
	}
}
