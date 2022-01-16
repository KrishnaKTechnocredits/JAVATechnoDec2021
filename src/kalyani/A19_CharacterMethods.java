package kalyani;

public class A19_CharacterMethods {

	void totalCharacters(String name) {
		
		int totalDigit = 0;
		int totalLetters = 0;
		int upperCount = 0;
		int lowerCount = 0;
		
		for (int index = 0; index < name.length(); index++) {
			if (Character.isLetter(name.charAt(index))) {
				if (Character.isUpperCase(name.charAt(index))) {
					upperCount++;
				} 
				else {
					lowerCount++;
				}
			} 
			else {
				totalDigit++;
			}
		}
		
		totalLetters = upperCount + lowerCount;
		System.out.println("Count of UpperCase characters is : " + upperCount);
		System.out.println("Count of LowerCase characters is : " + lowerCount);
		System.out.println("Total Digits in String is : " + totalDigit);
		System.out.println("Total characters : " + totalLetters);
	}

	public static void main(String[] args) {
		
		A19_CharacterMethods assign19 = new A19_CharacterMethods();
		assign19.totalCharacters("TE1ch2noC2red9iTs");
		
	}
}
