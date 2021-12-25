package shwetaBhosale;

class Test1_FirstNonRepeatingChar {

	void firstNonRepChar(String name) {
		for (int index = 0; index < name.length(); index++) {
			if (name.indexOf(name.charAt(index)) == name.lastIndexOf(name.charAt(index))) {
				System.out.println("First non repeating character is:" + name.charAt(index));
				break;

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1_FirstNonRepeatingChar test1_FirstNonRepeatingChar = new Test1_FirstNonRepeatingChar();
		test1_FirstNonRepeatingChar.firstNonRepChar("technocredits");
	}

}