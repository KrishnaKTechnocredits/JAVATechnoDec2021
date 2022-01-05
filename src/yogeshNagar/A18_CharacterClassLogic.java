package yogeshNagar;

public class A18_CharacterClassLogic {
	
	void getCharctorVariation(String name) {
		System.out.println("Total Char count in word is " + name.length());
		int charCount=0;
		int digCount=0;
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		for(int index=0;index<name.length();index++) {
			
			if(Character.isLetter(name.charAt(index))) {
				charCount++;
			}
			else if(Character.isDigit(name.charAt(index)))
				digCount++;
			
			if(Character.isUpperCase(name.charAt(index)))
				upperCaseCount++;				
			
			else if(Character.isLowerCase(name.charAt(index)))
				lowerCaseCount++;
		}
		System.out.println("Letter Count is "+ charCount);
		System.out.println("Upper Case Letter Count is "+ upperCaseCount);
		System.out.println("Lower Case Letter Count is "+ lowerCaseCount);
		System.out.println("Digit Count is "+ digCount);
	}
	
	public static void main(String[] args) {
		A18_CharacterClassLogic charLog = new A18_CharacterClassLogic();
		charLog.getCharctorVariation("TE1ch2noC2red9iTs");
	}

}
