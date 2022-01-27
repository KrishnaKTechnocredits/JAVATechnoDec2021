/*
Program - 2 : WAP to return a string having each word length is prime number from the given sentence.

Prime numbres are : 2, 3, 5, 7, 11, 13, 17, 19 ...

Examples:

Input 1 : I love my India

Output 1 : my India

Input 2 : I would like to have a cup of tea

Output 2 : would to cup of tea
*/

package shivangi.exam.exam4;

public class Shivangi_Exam4_2 {
	
	boolean isPrime(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (num == 1) {
			return false;
		} else if (flag == true) {
			return true;
		}
		return false;
	}

	String isStringHavingLengthPrime(String input) { // I love my India
		String output = "";
		String[] WordArr = input.split(" ");
		for(int index=0;index<=WordArr.length-1;index++)
		{ 
			if(WordArr[index].length()>1)
			{
				if(isPrime(WordArr[index].length()))
					output = output + " " + WordArr[index];
			}

		}
		return output.trim();
	}

	public static void main(String[] args) {
		Shivangi_Exam4_2 shivangi_Exam4_2 = new Shivangi_Exam4_2();
		String input1 = "I my India";
		String input2 = "I would like to have a cup of tea";
		System.out.println("Input String : " + input1);
		System.out.println("Word having length equal to Prime : " + shivangi_Exam4_2.isStringHavingLengthPrime(input1));
		
		System.out.println();
		System.out.println("Input String : " + input2);
		System.out.println("Word having length equal to Prime : " + shivangi_Exam4_2.isStringHavingLengthPrime(input2));
	}
}
