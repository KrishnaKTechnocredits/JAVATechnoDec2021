package gauravk.ProgramTests;
/*
 *  Programming Test - 6
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
//Total time taken: 11 min.
public class SumOfNumInString {
	
	int sumOfNumInString(String str){
		String[] str1 = str.split(" ");
		int total = 0;
		for(String s : str1) {
			int x = Integer.parseInt(s);
			total += x;
		}
		return total;
	}
	
	public static void main(String[] args) {
		String input = "10 10 20 30";
		System.out.println("Sum of numbers in string :\n"+input+"\nSum is: "+new SumOfNumInString().sumOfNumInString(input));
	}
}
