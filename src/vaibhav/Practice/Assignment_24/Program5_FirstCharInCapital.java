/* Assignment 24 : 16th Jan 2022

5. WAP to convert first character of word with capital letter
Input    : "anvit harsh dipali"
Output : "Anvit Harsh Dipali"

*/

package vaibhav.Practice.Assignment_24;

public class Program5_FirstCharInCapital {
	
	void getExpectedString(String str) {
		String[] inputArr = str.split(" ");
		String expectedString = "";
		
		for(int index = 0 ;index<inputArr.length;index++) {
			char capitalChar = Character.toUpperCase(inputArr[index].charAt(0));
			String temp = capitalChar + inputArr[index].substring(1); 
			expectedString = expectedString + " " + temp;
		}
		System.out.println("Expected output string	: " + expectedString.trim());
	}
	
	
	public static void main(String[] args) {
		Program5_FirstCharInCapital program5_FirstCharInCapital = new Program5_FirstCharInCapital();
		String inputString = "anvit harsh dipali";
		System.out.println("Input String 		: " + inputString);
		program5_FirstCharInCapital.getExpectedString(inputString);
	}

}
