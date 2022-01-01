package ranjeet;

public class TestProgram1 {
	
		void stringOperation(String str) {
			//System.out.println("1");
			for(int i = 0; i<str.length(); i++) {
				System.out.println(str.charAt(i));
			}
		}
		
		public static void main(String[] args) {
			TestProgram1 t = new TestProgram1();
			t.stringOperation("Technocredits");
		}
}
