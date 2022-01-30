package technocredits.exceptiondemo;

public class Example9 {

	static void m1() {
		try {
			Example8 example8 = null;
			example8.m1("techno");
		}catch(NullPointerException ne) {
			ne.printStackTrace();
		}	
	}
	
	public static void main(String[] args) {
		m1();
	}
}
