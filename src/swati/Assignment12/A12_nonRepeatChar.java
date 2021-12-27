package swati.Assignment12;

public class A12_nonRepeatChar {

	int findNonRepeat(String name, char c) {
		int count = 0;
		int i = 0;
		while (i < name.length()) {
			if (name.charAt(i) == c) {

				count++;
			}
			i++;
		}
		return count;
	}

	void findChar(String name) {
		int i = 0;

		while (i < name.length()) {

			int countChar = findNonRepeat(name, name.charAt(i));
			if (countChar <= 1) {
				System.out.println("Non repeated character is " + name.charAt(i));
				break;
			}
			i++;

		}
		System.out.println("------------------");
	}
	void findFirstRepeat(String name) {
		int i = 0;

		while (i < name.length()) {

			int countChar = findNonRepeat(name, name.charAt(i));
			if (countChar >= 2) {
				System.out.println("1st repeated character is " + name.charAt(i));
				break;
			}
			i++;

		}
		System.out.println("------------------");
	}
	
	void reverseString(String name) {
		
		int i=name.length()-1;
		while(i>=0) {
			System.out.println("Reverse String is "+name.charAt(i));
			i--;
		}
	}

	public static void main(String[] args) {

		A12_nonRepeatChar a12 = new A12_nonRepeatChar();
		a12.findChar("pple");
		a12.findFirstRepeat("shivangi");
		a12.reverseString("Swati");
	}

}
