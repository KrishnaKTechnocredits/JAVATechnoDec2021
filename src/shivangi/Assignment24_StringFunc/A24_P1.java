/*
Program-1. WAP to find out total words in a given string & print each word with its length
Input    : Hi Hello
Output : Total 2 words
              Hi --> 2
              Hello --> 5
*/

package shivangi.Assignment24_StringFunc;

public class A24_P1 {
	
	void  printStringWithLength(String[] arr) {
		System.out.println("Total " + arr.length + " words");
		for(int index=0; index<=arr.length-1; index++) {
			System.out.println(arr[index] + "-->" + arr[index].length());
		}
	}
	
	public static void main(String[] args) {
		String[] arr = {"Hi", "Hello"};
		A24_P1 p1 = new A24_P1();
		p1.printStringWithLength(arr);
		
	}
}
