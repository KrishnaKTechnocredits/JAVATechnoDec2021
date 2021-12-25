/*Test - 1 : 25th Dec'2021

Program 1 : find the first non repeating character from given string. 
   input : technocredits
   output : h
 */

package shwetaDharmadhikari.test1;

public class Test1_NonRepeatingCharacter {

	void findFirstNonRepeatingChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index))) {
				System.out.println("Fisrt Non Repeating Character is :" + input.charAt(index));
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1_NonRepeatingCharacter test1_NonRepeatingCharacter = new Test1_NonRepeatingCharacter();
		test1_NonRepeatingCharacter.findFirstNonRepeatingChar("technocredits");
	}

}
