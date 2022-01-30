package anvit;

public class Anvit_Test4_2 {

	String wordLengthPrimeNumber(String word) {
		String[] arrWord = word.split(" ");
		String sentence = "";
		for (int i = 0; i < arrWord.length; i++) {
			if (isPrime(arrWord[i].length())) {
				sentence += " "+arrWord[i];
				sentence = sentence.trim();
			}
		}
		return sentence;

	}

	boolean isPrime(int num) {
		boolean flag = true;
		if(num==1) {
			flag = false;
			return flag;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Anvit_Test4_2 anvit_Test4_2 = new Anvit_Test4_2();
		String inputWord = "I love my India";
		String value = anvit_Test4_2.wordLengthPrimeNumber(inputWord);
		System.out.println(value);
		System.out.println();
		String inputWord1 = "I would like to have a cup of tea";
		String value1 = anvit_Test4_2.wordLengthPrimeNumber(inputWord1);
		System.out.println(value1);
	}
}
