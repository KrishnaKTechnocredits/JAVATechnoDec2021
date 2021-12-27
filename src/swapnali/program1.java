package swapnali;
public class program1 {
	int findChar(String name, char c) {
		int count = 0;
		char chr = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}	
	void findString(String name) {
		for (int i = 0; i < name.length(); i++) {
			int count = findChar(name, name.charAt(i));
			if (count <= 1) {
				System.out.println("The first non-repeated character from given string is: "+name.charAt(i) );
				break;
			}

		}
	}
	public static void main(String args[]) {
		
		program1 t1 = new program1();
		t1.findString("technocredits");
		
	}
}

