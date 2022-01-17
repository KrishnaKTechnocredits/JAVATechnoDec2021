/*
Program-2. WAP to find our total vowels in each word from the given string
Input    : aashvi technocredits
Output : aashvi --> 3
         technocredits --> 4
*/

package shivangi.Assignment24_StringFunc;

public class A24_P2 {
	
	int filterVowel(String input) {
		int count = 0;
		for(int index=0; index<=input.length()-1; index++) {
			char ch = input.charAt(index);
			if(ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	} 
	
	void printVowelOfString(String input) {
		String[] arr = input.split(" ");
		//System.out.println(arr[0]);
		for(int index=0; index<=arr.length-1; index++) {
			int count = filterVowel(arr[index]);
			System.out.println(arr[index] + " --> " + count);
		}
	}
	
	public static void main(String[] args) {
		A24_P2 p2 = new A24_P2();
		p2.printVowelOfString("aashvi technocredits");
	}
}
