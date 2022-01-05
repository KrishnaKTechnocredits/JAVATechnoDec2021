package nehaPandey.OverlaodingExamples;

public class A18_Overloading_Example {
	int Uppercount;
	int Lowercount;
	int Digitcount;

	void character(String name) {

		for (int x = 0; x < name.length(); x++) {
			char ch = name.charAt(x);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {
					Uppercount++;
				} else {
					Lowercount++;
				}
			} else if (Character.isDigit(ch)) {
				Digitcount++;
			}
		}

		System.out.println("Total Letters ->");
		System.out.println(Uppercount + Lowercount);
		System.out.println("Total UpperCase characters -> " + Uppercount);
		System.out.println("Total LowerCase characters -> " + Lowercount);
		System.out.println("Total Digits -> " + Digitcount);

	}

	public static void main(String[] args) {
		A18_Overloading_Example ol = new A18_Overloading_Example();
		ol.character("TE1ch2noC2red9iTs");

	}

}
