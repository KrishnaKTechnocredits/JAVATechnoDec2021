package archana;

public class Assi19_Character {
	char ch;
	int count;
	int uppercount;
	int lowercount;

	void totalLettersinstring(String str) {
		count = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				count++;
			}
		}
		System.out.println("Total Letters in string : " + count);
	}

	void upperCasecount(String str) {
		count = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				count++;
			}
		}
		System.out.println("Uppercase letters in string : " + count);
	}

	void lowerCasecount(String str) {
		count = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (Character.isLowerCase(ch)) {
				count++;
			}
		}
		System.out.println("lowercase letters in string : " + count);
	}

	void totalDigits(String str) {
		count = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println("Total Digits in string : " + count);
	}

	static public void main(String[] args) {
		Assi19_Character ass19 = new Assi19_Character();
		String str = "TE1ch2noC2red9iTs";
		ass19.totalLettersinstring(str);
		ass19.totalDigits(str);
		ass19.upperCasecount(str);
		ass19.lowerCasecount(str);
	}
}
