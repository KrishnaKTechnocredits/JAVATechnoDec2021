package pallavi;

import java.util.Scanner;

public class CharFunctions1 {
	
	void findCharNumbers(String name) {
		int upperCaseCnt = 0;
		int lowerCaseCnt = 0;
		int digitCnt = 0;

		for (int index = 0; index < name.length(); index++) {
			if (Character.isLetter(name.charAt(index))) {
				if (Character.isUpperCase(name.charAt(index)))
					upperCaseCnt++;
				else
					lowerCaseCnt++;
			} else
				digitCnt++;
		}
		System.out.println("Total Letters ->" + (upperCaseCnt + lowerCaseCnt));
		System.out.println("Total UpperCase Charaters ->" + upperCaseCnt);
		System.out.println("Total LowerCase Charaters ->" + lowerCaseCnt);
		System.out.println("Total Digits -:" + digitCnt);
	}

	public static void main(String[] arr) {
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Please enter input string");
		String name = scanner1.next();
		new CharFunctions1().findCharNumbers(name);
		scanner1.close();
	}

}
