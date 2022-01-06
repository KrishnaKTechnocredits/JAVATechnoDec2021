package nishika;

public class A20_char_numeric_sum {

void findNumericChar(String name) {
		
		int sum = 0;
		for (int index=0;  index<name.length(); index++) {
			char ch = name.charAt(index);
			if(Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum+num;
			}
		}
		System.out.println("Digit sum --->" + sum);
	}
	
	public static void main(String[] args) {
		 A20_char_numeric_sum  a20_char_numeric_sum  = new  A20_char_numeric_sum();
		 a20_char_numeric_sum.findNumericChar("TE1ch2noC2red9iTs");
	}
}
