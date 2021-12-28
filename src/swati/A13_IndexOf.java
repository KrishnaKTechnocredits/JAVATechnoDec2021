package swati;

public class A13_IndexOf {

	/*
	 * int dupChar(String name) { int index = 0; for (int i = 0; i < name.length();
	 * i++) { int count = 0;
	 * 
	 * for (int j = 0; j < name.length(); j++) { if (name.indexOf(name.charAt(i)) ==
	 * name.indexOf(name.charAt(j))) { count++; }
	 * 
	 * } if (count >= 2) { System.out.println(name.charAt(i) + " at index " +
	 * name.indexOf(name.charAt(i))); index = count;
	 * 
	 * }
	 * 
	 * } return index;
	 * 
	 * }
	 */

	int findChar(String name, char c) {
		int count = 0;
		for (int i = 0; i < name.length(); i++) {

			if (name.indexOf(name.charAt(i)) == name.indexOf(c)) {
				//System.out.println(name.charAt(i) + " is " +name.indexOf(c));
				count++;
			}
		}
		return count;
	}

	void dupChar(String name) {
		int count = 0;
		int index = 0;
		for (int i = 0; i < name.length(); i++) {
			count = findChar(name, name.charAt(i));
			// System.out.println(count);
			index = i;
			if (count >= 2) {
				System.out.println(name.charAt(index) + " is repeating");
			}

		}
System.out.println("-------------------------------------");
	}
	void uniqueChar(String name) {
		int count = 0;
		int index = 0;
		for (int i = 0; i < name.length(); i++) {
			count = findChar(name, name.charAt(i));
			// System.out.println(count);
			index = i;
			if (count <= 1) {
				System.out.println(name.charAt(index) + " is not repeating");
			}

		}
System.out.println("--------------------------------------");
	}
	
	void firstDupChar(String name) {
		int count = 0;
		int index = 0;
		for (int i = 0; i < name.length(); i++) {
			count = findChar(name, name.charAt(i));
			// System.out.println(count);
			index = i;
			if (count >= 2) {
				System.out.println(name.charAt(index) + " is repeating");
				break;
			}

		}
System.out.println("-------------------------------------");
	}
	
	void firstUniqueChar(String name) {
		int count = 0;
		int index = 0;
		for (int i = 0; i < name.length(); i++) {
			count = findChar(name, name.charAt(i));
			// System.out.println(count);
			index = i;
			if (count <= 1) {
				System.out.println(name.charAt(index) + " is not repeating");
				break;
			}

		}
System.out.println("--------------------------------------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A13_IndexOf a13 = new A13_IndexOf();
		a13.dupChar("applee");
		a13.uniqueChar("applee");
		a13.firstDupChar("applee");
		a13.firstUniqueChar("aapplee");
		// a13.findChar("applee", 'p');
	}

}
