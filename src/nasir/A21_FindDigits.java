package nasir;

public class A21_FindDigits {
	
	void findDigitSepratly(String input) {	
		System.out.println("Following numbers are present in given String ");
		for(int index=0;index<input.length();index++) {
			int temp=0;
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				int number =Character.getNumericValue(ch);
				temp=temp+number;
				System.out.print(temp+" ");
			}
		}		
	}
	
	public static void main(String[] args) {
		A21_FindDigits findDigits = new A21_FindDigits();
		findDigits.findDigitSepratly("TE1ch2noC2red9iTs");
		
	}
}
