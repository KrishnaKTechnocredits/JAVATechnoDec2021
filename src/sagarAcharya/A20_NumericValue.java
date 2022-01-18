package sagarAcharya;

class A20_NumericValue{
	
	public static void main(String[] args){
		A20_NumericValue a20 = new A20_NumericValue();
		a20.printSumOfNumChar("tech1noc9red3its");
	}
	
	void printSumOfNumChar(String input){
		int sum = 0;
		for(int index = 0;index<input.length();index++){
			char ch = input.charAt(index);
			if(Character.isDigit(ch)){
				int num = Character.getNumericValue(ch);
				sum += num;
			}
		}
		System.out.println("Sum of Numeric value from given string is : "+sum);
	}
}

/* Assignment - 20 : 6th Jan'2022

Write a method to print sum of all digits in a given String.
Input : tech1noc9red3its
Output : 13

Hint : 1+9+3
 */