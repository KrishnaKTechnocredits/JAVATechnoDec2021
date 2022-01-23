package sagarAcharya;

class A21_NumericToString{
	
	public static void main(String[] args){
		A21_NumericToString a21 = new A21_NumericToString();
		a21.printNumericFromString("tech1noc9red3it6s");
	}
	
	void printNumericFromString(String input){
		String temp = "";
		for(int index = 0;index<input.length();index++){
			char ch = input.charAt(index);
			if(Character.isDigit(ch)){
				temp += ch;
			}
		}
		System.out.println("Output is : " + temp);
	}
}

/* Assignment - 21 : 8th Jan'2022

Print all Digits as a String from a given String.
Input : tech1noc9red3it6s
OP- 1936 */