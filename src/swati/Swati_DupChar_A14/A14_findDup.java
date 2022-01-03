package swati.Swati_DupChar_A14;

public class A14_findDup {

	void findDup(String name) {
		int rep = 0;
		int nonRep = 0;

		for (int i = 0; i < name.length(); i++) {

			char c = name.charAt(i);

			if (i == name.indexOf(c)) {

				if (name.indexOf(c) != name.lastIndexOf(c)) {
					System.out.println(name.charAt(i) + " repeted character ");
					rep++;

				} else {
					System.out.println(name.charAt(i) + " are not repeated character");
					nonRep++;
				}
			}
		}
		if (nonRep > rep) {
			System.out.println("Selenium");
		} else {
			System.out.println("Java");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A14_findDup a14 = new A14_findDup();
		a14.findDup("technocredits");
	}

}
