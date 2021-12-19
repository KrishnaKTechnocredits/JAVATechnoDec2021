
package swati;
class assign6 {

	void display(String name) {
		System.out.println("Display Stirng ");
		for (int i = 0; i < name.length(); i++) {

			System.out.println(name.charAt(i));
		}
		System.out.println("----------");
	}

	void reverse(String name) {
		System.out.println("Reverse String is ");
		for (int i = name.length() - 1; i >= 0; i--) {

			System.out.println(name.charAt(i));
		}
		System.out.println("----------");
	}

	void countChar(String name, char search) {
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == search) {
				count++;

			}
		}
		System.out.println("Count of Repeated Characters " + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assign6 printString = new assign6();
		printString.display("Credits");
		printString.reverse("Techno");
		printString.countChar("Mississipi", 's');
	}

}