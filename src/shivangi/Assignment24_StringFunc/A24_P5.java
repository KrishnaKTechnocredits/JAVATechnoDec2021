/*
IMP - 
Program-5. WAP to convert first character of word with capital letter
Input    : "anvit harsh dipali"
Output : "Anvit Harsh Dipali"
*/
package shivangi.Assignment24_StringFunc;

public class A24_P5 {
	
	String Make1stLetterCapitalOfWord(String input) {
		String temp = "";
		char ch = input.charAt(0);
		if(Character.isLetter(ch)) {
			ch = Character.toUpperCase(ch);
		}
		temp = ch + input.substring(1);
		//System.out.println(temp);
		return temp;
	}
	
	String printWordWith1stCapitalLetter(String input) {
		String output = "";
		String[] arr = input.split(" ");
		for(int index=0; index<=arr.length-1; index++) {
			output = output + " " + Make1stLetterCapitalOfWord(arr[index]);
		}
		return output.trim();
	}
	
	public static void main(String[] args) {
		A24_P5 p5 = new A24_P5();
		String finalOutput = p5.printWordWith1stCapitalLetter("anvit harsh dipali");
		System.out.println(finalOutput);
	}
}
