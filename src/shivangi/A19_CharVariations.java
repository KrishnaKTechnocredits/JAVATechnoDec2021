package shivangi;

public class A19_CharVariations {
	
	void charVariations() {
		String name = "TE1ch2noC2red9iTs";
		int letterCount = 0;
		int digCount = 0;
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		for(int index=0; index<name.length(); index++) {
			if(Character.isLetter(name.charAt(index))) {
				letterCount++;
			}else if(Character.isDigit(name.charAt(index))){
				digCount++;
			}
			
			if(Character.isUpperCase(name.charAt(index))) {
				upperCaseCount++;
			}else if(Character.isLowerCase(name.charAt(index))){
				lowerCaseCount++;
			}
		}
		System.out.println("Total Char count in "+name+" is " + name.length());
		System.out.println("Total letter count in string is : " + letterCount);
		System.out.println("Digit count in string is : " + digCount);
		System.out.println("Upper case count in string is : " + upperCaseCount);
		System.out.println("Lower case count in string is : " + lowerCaseCount);
	}
	
	public static void main(String[] args) {
		A19_CharVariations a19_CharVariations = new A19_CharVariations();
		a19_CharVariations.charVariations();
	}
}
