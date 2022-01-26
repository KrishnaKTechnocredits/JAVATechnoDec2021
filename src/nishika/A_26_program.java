package nishika;

public class A_26_program {
	
void splitString(String url) {
		
		String[] split = url.split("id=");
		System.out.println(split[1]);
	}
	
	public static void main(String[] args) {
		 A_26_program  a_26_program = new  A_26_program();
		 a_26_program.splitString("https://automationbykrishna.com/name=techno/id=123");
	}
}
