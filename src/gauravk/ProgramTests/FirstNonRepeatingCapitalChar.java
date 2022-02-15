package gauravk.ProgramTests;
/*
 * Programming Test - 6
1.  Write a method to return the first non repeating Capital character.
Input : tEChNoCrEdits
Output : N

2. Find maximum word length from a given statement.
input = "good morning technocredits hi hello";
output : technocredits

3. sum of all numbers in a given statement.
input = "10 10 20 30";
output : 70

Expected time to complete all 3 program is 1 hr 15 mins (max)
 */
//Time taken: 8 min.
public class FirstNonRepeatingCapitalChar {
	
	void firstNonRepeatCapChar(String str) {
		char ch = ' ';
		for(int i=0; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i)) && Character.isUpperCase(str.charAt(i))) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		FirstNonRepeatingCapitalChar fnrc = new FirstNonRepeatingCapitalChar();
		fnrc.firstNonRepeatCapChar("tEChNoCrEdits");
	}
}
