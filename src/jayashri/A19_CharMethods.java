package jayashri;

public class A19_CharMethods {
	void totalChar(String name) {
		int uppercnt = 0;
		int lowercnt = 0;
		int totaldigit = 0;
		int totalletters = 0;

		for (int index = 0; index < name.length(); index++) {
			if (Character.isLetter(name.charAt(index))) {
				if (Character.isUpperCase(name.charAt(index))) {
					uppercnt++;
				} else {
					lowercnt++;
				}
			} else {
				totaldigit++;
			}
		}
		System.out.println("Total UpperCase characters " + uppercnt);
		System.out.println("Total LowerCase characters " + lowercnt);
		System.out.println("Total Digits " + totaldigit);
		totalletters = uppercnt + lowercnt;
		System.out.println("Total characters " + totalletters);
	}

	public static void main(String[] args) {
		A19_CharMethods a19_charmethods = new A19_CharMethods();
		a19_charmethods.totalChar("TE1ch2noC2red9iTs");
	}

}
