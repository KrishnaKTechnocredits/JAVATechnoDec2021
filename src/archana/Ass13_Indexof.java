package archana;

public class Ass13_Indexof {

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
		Ass13_Indexof ass13 = new Ass13_Indexof();
		ass13.duplicateChar("archanajadhav");
		System.out.println("--------------------");
		ass13.NotDuplicateChar("archanajadhav");
		System.out.println("--------------------");
		ass13.FirstUniqueChar("archanajadhav");
		System.out.println("--------------------");
		ass13.FirstDupChar("archanajadhav");
	}

}
