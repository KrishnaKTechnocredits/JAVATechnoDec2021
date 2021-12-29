package swati.Test1;

public class Test1_FindChar {

	static int bal;
	static void print() {
		int val=bal;
	}

	int findChar(String name, char c) {
		int count = 0;
		char chr = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == c) {
				count++;
				//System.out.println(count);

			}

		}

		return count;

	}

	void findString(String name) {
		for (int i = 0; i < name.length(); i++) {
			// System.out.println("find char at "+ name.charAt(i));
			int count = findChar(name, name.charAt(i));
			if (count <= 1) {
				System.out.println(name.charAt(i) + " first non repeated charcter");
				break;
			}

		}
	}
	


	public static void main(String args[]) {
		
		Test1_FindChar t1 = new Test1_FindChar();
		t1.findString("mississipi");
		
	}
}
