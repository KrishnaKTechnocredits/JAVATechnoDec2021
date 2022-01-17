/*
IMPORTANT-
Program-4. WAP to reverse each word on the same index
Input    : "Hi techno hello"
Output : "iH onhcet olleh"
*/
package shivangi.Assignment24_StringFunc;

public class A24_P4 {
	
	String reverseString(String input) {
		String temp = "";
		for(int index=input.length()-1; index>=0; index--) {
			temp = temp + input.charAt(index);
		}
		//System.out.println(temp);
		return temp;
	}
	
	String reverseWordInStrAtSameIndex(String input) {
		String temp = "";
		String[] arr = input.split(" ");
		for(int index=0; index<=arr.length-1; index++) {
			temp = temp + " " + reverseString(arr[index]);
		}
		return temp = temp.trim();
	}
	
	public static void main(String[] args) {
		A24_P4 p4 = new A24_P4();
		String output = p4.reverseWordInStrAtSameIndex( "Hi techno hello");
		 System.out.println(output);
	} 
}
