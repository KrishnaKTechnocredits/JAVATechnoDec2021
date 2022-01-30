package nehaPandey;

//Program - 2 : WAP to return a string having each word length is prime number from the given sentence.

//Prime numbres are : 2, 3, 5, 7, 11, 13, 17, 19 ...

//  Examples:

//		Input 1 : I love my India

//		Output 1 : my India

//		Input 2 : I would like to have a cup of tea

//		Output 2 : would to cup of tea

public class Exam_3_P2 {

	boolean IsPrimeNumber(int num) {
		boolean flag = true;

		if (num == 1)
			return false;

		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}

		return flag;
	}

	void eachWordLengthIsPrimeNumber(String input) {
		String[] str = input.split(" ");
		for (int index = 0; index < str.length; index++) {
			int stringLength = str[index].length();
			if (IsPrimeNumber(stringLength)) {
				System.out.print(str[index] + " ");
			}
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		Exam_3_P2 exam3p2 = new Exam_3_P2();
		System.out.println("Program2:Output");
		System.out.println();
		String input1 = "I love my India";
		String input2 = "I would like to have a cup of tea";
		exam3p2.eachWordLengthIsPrimeNumber(input1);
		exam3p2.eachWordLengthIsPrimeNumber(input2);

	}

}
