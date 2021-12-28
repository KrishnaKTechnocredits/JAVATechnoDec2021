package nasir;

class A13_IndexOf {
	void allDuplicate(String input) {
		System.out.println("All Duplicate Characters displaying of technocredits");
		boolean flag = true;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				flag = false;
				break;
			}
			if (flag == true)
				System.out.println(ch);
		}
		System.out.println(".......................");
	}

	void allUnique(String input) {
		System.out.println("All Unique Characters displaying of technocredits");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch))
				System.out.println(ch);
		}
		System.out.println(".......................");
	}

	void firstUnique(String input) {
		System.out.println("First Unique Characters displaying of technocredits");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.println(ch);
				break;
			}
		}
		System.out.println(".......................");
	}

	void firstDuplicate(String input) {
		System.out.println("First Duplicate Characters displaying of technocredits");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) != input.lastIndexOf(ch)) {
				System.out.println(ch);
				break;
			}
		}
	}

	public static void main(String[] args) {
		A13_IndexOf indexof = new A13_IndexOf();
		indexof.allDuplicate("technocredits");
		indexof.allUnique("technocredits");
		indexof.firstUnique("technocredits");
		indexof.firstDuplicate("technocredits");
	}
}