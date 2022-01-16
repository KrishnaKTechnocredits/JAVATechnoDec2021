package vrushali;

public class A19_LetterCount {

	void getCharacters(String name) {

		int upperCaseCount = 0;
		int lowercaseCount = 0;
		int digitCount = 0;

		for(int index = 0; index<name.length(); index++) {

			if(Character.isLetter(name.charAt(index))) {
				if(Character.isUpperCase(name.charAt(index))) 
					upperCaseCount++;

				else 
					lowercaseCount++;	

			}else if(Character.isDigit(name.charAt(index)))
				digitCount++;
		}

		System.out.println("Total Letters -> " + (upperCaseCount+lowercaseCount));		
		System.out.println("Total UpperCase characters -> " + upperCaseCount);
		System.out.println("Total LowerCase characters -> " + lowercaseCount);
		System.out.println("Total Digits -> " + digitCount);		
	}

	public static void main(String[] args) {
		A19_LetterCount letterCount = new A19_LetterCount();
		letterCount.getCharacters("TE1ch2noC2red9iTs");
	}
}
