package kavleen;

public class Assignment19 {

	
	static void digitLetters(String name ) {
		int digitCount = 0 ;
		int lowerCount = 0 ;
		int upperCount = 0 ;
		
		for(int index=0 ; index<name.length();index++) {
			if(Character.isDigit(name.charAt(index)))
				digitCount++;
			else if (Character.isLetter(name.charAt(index)))
				if(Character.isUpperCase(name.charAt(index)))
					upperCount++;
				else 
					lowerCount++;
		}
		System.out.println("Total Digits in " + name + " is " + digitCount);
		System.out.println("Total letters in " + name + " are " + (upperCount + lowerCount));
		System.out.println("Total uppercase characters in " + name + " is " + upperCount);
		System.out.println("Total lowercase characters in " + name + " is " + lowerCount);
	}
	public static void main (String [] args) {
		digitLetters("TE1ch2noC2red9iTs");
	}
}
