package kalyani;

public class A7_1_EvenPosChar {
	
	void evenPosChar(String name) {
		
		int index;
		for (index = 0 ; index<name.length(); index++) {
			if(index%2==1)
				System.out.println(name.charAt(index));
			
		}
	}
	
	public static void main(String args[]) {
		A7_1_EvenPosChar evenposchar = new A7_1_EvenPosChar();
		evenposchar.evenPosChar("technocredits");
	}
}
