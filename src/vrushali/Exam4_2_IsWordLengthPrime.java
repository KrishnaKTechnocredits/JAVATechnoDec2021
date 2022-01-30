/*Program - 2 : WAP to return a string having each word length is prime number from the given sentence.
Prime numbres are : 2, 3, 5, 7, 11, 13, 17, 19 ...

Examples:
Input 1 : I love my India
Output 1 : my India
Input 2 : I would like to have a cup of tea
Output 2 : would to cup of tea*/
package vrushali;

public class Exam4_2_IsWordLengthPrime {

	boolean isPrimeNum(int num) {
		boolean flag = true;

		if (num == 1) 
			return false;

		for(int index = 2; index <= num/2; index++) {
			if(num % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	void findWordLength(String name) {
		String[] str = name.split(" ");
		for(int index = 0; index < str.length; index++) {
			int wordLength = str[index].length();
			if(isPrimeNum(wordLength)) {
				System.out.print(str[index]+ " ");
			}
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		Exam4_2_IsWordLengthPrime isWordLengthPrime = new Exam4_2_IsWordLengthPrime();
		String str1 = "I love my India";
		String str2 = "I would like to have a cup of tea";
		isWordLengthPrime.findWordLength(str1);
		System.out.println("-------------------------");
		isWordLengthPrime.findWordLength(str2);


	}

}
