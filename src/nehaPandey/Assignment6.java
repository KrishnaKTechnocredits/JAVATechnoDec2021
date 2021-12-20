package nehaPandey;

public class Assignment6 {

	void display(String name) {
		int x;

		for (x = 0; x < name.length(); x++) {
			char y = name.charAt(x);
			System.out.println("Characters are: " + y);

		}
		System.out.println();

	}

	void displayreverse(String name) {
		int x;

		for (x = name.length() - 1; x >= 0; x--) {
			char y = name.charAt(x);
			System.out.println("Reverse characters are: " + y);

		}
		System.out.println();

	}

	void findOccurence(String name) {
		int i;
		int count = 0;
		for (i = 0; i <= name.length() - 1; i++) {
			char y = name.charAt(i);
			if (y == 'c') {
				count++;

			}

		}
		System.out.println("Total occurrence of given character: " + count);

	}

	public static void main(String[] args) {
		Assignment6 a = new Assignment6();
		a.display("Technocredits");
		a.displayreverse("Technocredits");
		a.findOccurence("Technocredits");
	}

}
