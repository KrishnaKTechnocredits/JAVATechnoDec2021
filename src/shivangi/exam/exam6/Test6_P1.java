/*
Test6- Program1.  Write a method to return the first non repeating Capital character.
Input : tEChNoCrEdits
Output : N
*/
package shivangi.exam.exam6;

public class Test6_P1 {
	
	void findNonRepeatingCapitalChar(String input) {
		System.out.println("Given input is : " + input);
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch)) {
				if(input.indexOf(ch) == input.lastIndexOf(ch)) {
					System.out.println("1st non repeating capital letter is : " + ch);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Test6_P1 p1 = new Test6_P1();
		p1.findNonRepeatingCapitalChar("tEChNoCrEdits");
	}
}
