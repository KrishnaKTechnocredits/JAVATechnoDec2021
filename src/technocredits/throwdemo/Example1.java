package technocredits.throwdemo;

public class Example1 {

	void startBrowser(String browsername) {
		if(browsername.equals("chrome")) {
			
		}else if(browsername.equals("ie")) {
			
		}else if(browsername.equals("ff")) {
			
		}else {
			throw new ArithmeticException();
		}
	}
	
	void m3() throws InterruptedException {
		throw new InterruptedException();
	}
	
	void m1(int num) {
		int x = 10;
		
		if(num == 15) {
			throw new ArithmeticException();
		}else {
			int y = x/(15-num);
		}
	}
	
	
	void start(String url) {
		if(url.startsWith("http")) {
			System.out.println("All okay");
		}else {
			throw new NullPointerException();
		}
		System.out.println("3");
	}
	
	public static void main(String[] args) {
		try {
			new Example1().start("www.google.com");
		}catch(NullPointerException ne) {
			System.out.println("1");
		}
		System.out.println("2");
	}
}
