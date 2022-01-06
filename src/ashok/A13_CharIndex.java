package ashok;

public class A13_CharIndex {

	char ch;

	void duplicateChar(String name) {
		for (int i = 0; i < name.length(); i++) {
			ch = name.charAt(i);
			if (name.indexOf(ch) == name.lastIndexOf(ch)) {

			} else {
				System.out.println("Duplicate Character :" + ch);
			}
		}

	}

	void NotDuplicateChar(String name) {
		for (int i = 0; i < name.length(); i++) {
			ch = name.charAt(i);
			if (name.indexOf(ch) == name.lastIndexOf(ch)) {

				System.out.println("Single Character :" + ch);

			} else {
			}
		}
	}

	void FirstUniqueChar(String name) {
		for (int i = 0; i < name.length(); i++) {
			ch = name.charAt(i);
			if (name.indexOf(ch) == name.lastIndexOf(ch)) {
				System.out.println("First single Character :" + ch);
				return;
			} else {

			}
		}

	}

	void FirstDupChar(String name) {
		for (int i = 0; i < name.length(); i++) {
			ch = name.charAt(i);
			if (name.indexOf(ch) == name.lastIndexOf(ch)) {

			} else {
				System.out.println("First single Character :" + ch);
				return;
			}
		}

	}

	static public void main(String[] args) {
		A13_CharIndex a13_CharIndex = new A13_CharIndex();
		a13_CharIndex.duplicateChar("technocredits");
		System.out.println("--------------------");
		a13_CharIndex.NotDuplicateChar("technocredits");
		System.out.println("--------------------");
		a13_CharIndex.FirstUniqueChar("technocredits");
		System.out.println("--------------------");
		a13_CharIndex.FirstDupChar("technocredits");
	}

}
