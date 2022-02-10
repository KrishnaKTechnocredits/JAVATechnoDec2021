package sagarShrikhande.test6;

public class Test6_P1 {

	char firstNonRepeatingCapLetter(String str) {

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch) && (str.indexOf(ch) == str.lastIndexOf(ch))) {
				return ch;
			}
		}
		return (Character) null;
	}

	public static void main(String[] args) {
		Test6_P1 tp1 = new Test6_P1();
		String str = "tEChNoCrEdits";
		System.out.println("First Non-Repeating Capital Letter in String is: " + tp1.firstNonRepeatingCapLetter(str));
	}
}

/*
 * Programming Test - 6 1. Write a method to return the first non repeating
 * Capital character. Input : tEChNoCrEdits Output : N
 * 
 * 
 * 
 * Expected time to complete all 3 program is 1 hr 15 mins (max)
 */