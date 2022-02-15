package rohini;

/*Programming Test - 6

Expected time to complete all 3 program is 1 hr 15 mins (max)*/

public class Rohini_Test6 {

	/*
	 * 1.  Write a method to return the first non repeating Capital character.
Input : tEChNoCrEdits
Output : N
	 */
	public void findNonRepeatingChar(String s) {
		for(int index=0;index<s.length();index++) {
			char ch=s.charAt(index);
			if(Character.isUpperCase(ch)) {
				if(s.indexOf(ch)==s.lastIndexOf(ch) ) {
					System.out.println("First Non Repeating Char is : "+ch);
					break;
				}

			}
		}

	}

	/*
2. Find maximum word length from a given statement.
input = "good morning technocredits hi hello";
output : technocredits
	 */

	public void findMaxLength(String str) {
		String[] s1=str.split(" ");

		String maxlenstr=s1[0];
		int maxLength=s1[0].length();

		for(int index=0;index<s1.length;index++) {

			if(s1[index].length()>maxLength) {
				maxLength=s1[index].length();
				maxlenstr=s1[index];

			}


		}System.out.println("Maximum String length of : "+maxlenstr);

	}

	/*
	 3. sum of all numbers in a given statement.
input = "10 10 20 30";
output : 70
	 */

	public void findSumOfNum(String number) {
		String[] numArr=number.split(" ");
		int sum=0;
		for(int index=0;index<numArr.length;index++) {
			sum=sum+Integer.parseInt(numArr[index]);
		}System.out.println("Sum of digits: "+sum);
	}



	public static void main(String[] args) {
		Rohini_Test6 prg6 = new Rohini_Test6();
		prg6.findNonRepeatingChar("tEChNoCrEdits");
		prg6.findMaxLength("good morning technocredits hi hello");
		prg6.findSumOfNum("10 10 20 30");
	}

}
