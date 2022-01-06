package shivangi;

public class A20_CharSum {
		
		void findDigitSumFromString() {
			String name = "TE1ch2noC2red9iTs";
			int sum = 0;
			for(int index=0; index<name.length(); index++) {
				if(Character.isDigit(name.charAt(index))){
					int count = Character.getNumericValue(name.charAt(index));
					sum = sum + count;
				}
			}
			System.out.println("Sum of digits in given string is : " + sum);
		}
		
		public static void main(String[] args) {
			A20_CharSum A20_CharSum = new A20_CharSum();
			A20_CharSum.findDigitSumFromString();
		}
}