package archana;

public class Assi19_Character {

	void characteranddigitscounts(String str) {
		int upperCasecount = 0;
		int lowerCasecount = 0;
		int digitCount = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isLetter(ch) == true) {
				if (Character.isUpperCase(ch))
					upperCasecount++;
				else
					lowerCasecount++;
			} else if (Character.isDigit(ch))
				digitCount++;
		}
		System.out.println("Total letter count is: " + (upperCasecount + lowerCasecount));
		System.out.println("Uppercase letter count is: " + upperCasecount);
		System.out.println("Lowercase letter count is: " + lowerCasecount);
		System.out.println("Digit count is: " + digitCount);
	}

	public static void main(String[] ar) {
		Assi19_Character ass19 = new Assi19_Character();
		String str = "TE1ch2noC2red9iTs";
		ass19.characteranddigitscounts(str);
	}
}

// char ch;
// int count;
// int uppercount;
// int lowercount;
//
// void totalLettersinstring(String str) {
// count = 0;
// for (int i = 0; i < str.length(); i++) {
// ch = str.charAt(i);
// if (Character.isLetter(ch)) {
// count++;
// }
// }
// System.out.println("Total Letters in string : " + count);
// }
//
// void upperCasecount(String str) {
// count = 0;
// for (int i = 0; i < str.length(); i++) {
// ch = str.charAt(i);
// if (Character.isUpperCase(ch)) {
// count++;
// }
// }
// System.out.println("Uppercase letters in string : " + count);
// }
//
// void lowerCasecount(String str) {
// count = 0;
// for (int i = 0; i < str.length(); i++) {
// ch = str.charAt(i);
// if (Character.isLowerCase(ch)) {
// count++;
// }
// }
// System.out.println("lowercase letters in string : " + count);
// }
//
// void totalDigits(String str) {
// count = 0;
// for (int i = 0; i < str.length(); i++) {
// ch = str.charAt(i);
// if (Character.isDigit(ch)) {
// count++;
// }
// }
// System.out.println("Total Digits in string : " + count);
// }
//
// static public void main(String[] args) {
// Assi19_Character ass19 = new Assi19_Character();
// String str = "TE1ch2noC2red9iTs";
// ass19.totalLettersinstring(str);
// ass19.totalDigits(str);
// ass19.upperCasecount(str);
// ass19.lowerCasecount(str);
// }
