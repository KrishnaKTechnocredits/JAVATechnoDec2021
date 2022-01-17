/*
Program-3. WAP to return array of words containing only digits.
Input    : "Te1c2h C94re3"
Output : "12" "943"
*/

package shivangi.Assignment24_StringFunc;

public class A24_P3 {
	
	String filterWordByDigit(String input) {
		String temp = "";
		for(int index=0; index<=input.length()-1; index++) {
			if(Character.isDigit(input.charAt(index))){
				temp = temp + input.charAt(index);
			}
		}
		return temp;
	}
	
	
	String[] printDigitFromString(String input) {
		String temp = "";
		String[] arr = input.split(" ");
		String[] output = new String[arr.length];
		for(int index=0; index<=output.length-1; index++) {
			output[index] = temp + " " + filterWordByDigit(arr[index]);
		}
		return output;
	}
	
	public static void main(String[] args) {
		A24_P3 p3 = new A24_P3();
		String[] finalOutput = p3.printDigitFromString("Te1c2h C94re3");
		for(int index=0; index<=finalOutput.length-1; index++) {
			System.out.print(finalOutput[index]);
		}
	}
	
}
