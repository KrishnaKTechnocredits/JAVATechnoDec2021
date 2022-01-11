package amruta.Assignment_20;
/* 	Assignment - 20 : 5th Jan'2022
Print total Sum of Digits  from String.
Input : TE1ch2noC2red9iTs
output :       Total Digits Sum -> 14 	*/


class SumOfDigit{
	
	void printSumOfDigitFromString(String str){
		int sum = 0;
			for(int index = 0; index < str.length(); index++){
				char ch = str.charAt(index);
				
				if(Character.isDigit(ch)){
					int num = Character.getNumericValue(ch);
					sum = sum + num;
				}				
			}
			System.out.println("\n Sum of digits from given string is : " +sum);
	}
	
	public static void main(String[] args){
		
		new SumOfDigit().printSumOfDigitFromString("TE1ch2noC2red9iTs");
	}
}