/* Program - 2 : WAP to return a string having each word length is prime number from the given sentence.

Prime numbres are : 2, 3, 5, 7, 11, 13, 17, 19 ...

Examples:

Input 1 : I love my India

Output 1 : my India

Input 2 : I would like to have a cup of tea

Output 2 : would to cup of tea
 */
package shwetaDharmadhikari.test4;

public class CheckStringWordIsPrime {

	boolean isPrime(int wordLength) {
		boolean flag = true;
		if (wordLength <= 1)
			flag = false;
		for (int index = 2; index <= wordLength / 2; index++) {
			if (wordLength % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag)
			return true;
		else
			return false;
	}

	String checkStringCharacters(String input) {
		String[] str = input.split(" ");
		String tempString = "";
		boolean temp = true;
		for (int index = 0; index < str.length; index++) {
			//System.out.println(str[index].length());
			temp = isPrime(str[index].length());
			//System.out.println(temp);
			if (temp == true) {
				tempString += " " + str[index];
			}
		}
		return tempString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckStringWordIsPrime checkStringWordIsPrime = new CheckStringWordIsPrime();
		String input1 = "I love my India";
		String input2="I would like to have a cup of tea";
		System.out.println("Output :" + checkStringWordIsPrime.checkStringCharacters(input1));
		System.out.println("Output :" + checkStringWordIsPrime.checkStringCharacters(input2));
	}

}
