package vaishnavi;

public class A19_StringExample {

	int uppercaseLettersCount,lowercaseLettersCount,totalDigitsCount;
	
	void printLettersCount(String name) {
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if(Character.isLetter(ch)) {
				if(Character.isUpperCase(ch)){
					uppercaseLettersCount++;
				}
				else lowercaseLettersCount ++;
				
			}else
					totalDigitsCount++;
			}
			System.out.println("Total letters count is --> " +(uppercaseLettersCount+lowercaseLettersCount));
			System.out.println("Total UpperCase character count is --> " +uppercaseLettersCount);
			System.out.println("Total LowerCase character count is --> " +lowercaseLettersCount);
			System.out.println("Total Digits count is --> " +totalDigitsCount);
	}
	public static void main(String[] args) {
		A19_StringExample a19_StringExample = new A19_StringExample();
		a19_StringExample.printLettersCount("TE1ch2noC2red9iTs");
	}

}
