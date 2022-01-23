/*
IMP -
Program - 6. WAP to reverse each word and convert first letter of each word into capital
Input    : "Vrushali Sagar Shital"
Output : "IlahsurV Ragas LatihS"
*/
package shivangi.Assignment24_StringFunc;

public class A24_P6 {
	
	String reverseString(String input) {
		String temp = "";
		for(int index=input.length()-1; index>=0; index--) {
			char ch = input.charAt(index);
			if(index == input.length()-1) {
				ch = Character.toUpperCase(ch);
			}
			temp = temp + ch;
		}
		//System.out.println(temp);
		return temp;
	}
	
	String returnRevByConverting1stLetterCapital(String input) {
		String temp = "";
		String[] arr = input.split(" ");
		for(int index=0; index<=arr.length-1; index++) {
			temp = temp + " " + reverseString(arr[index]);
		}
		return temp.trim();
	}
	
	public static void main(String[] args) {
		A24_P6 p6 = new A24_P6();
		String finalOutput = p6.returnRevByConverting1stLetterCapital("Vrushali Sagar Shital");
		System.out.println(finalOutput);
	}
}
