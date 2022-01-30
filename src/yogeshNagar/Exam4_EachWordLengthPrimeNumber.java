package yogeshNagar;

import java.util.Arrays;

import javax.xml.transform.Source;

public class Exam4_EachWordLengthPrimeNumber {

	void getWordLength(String str) {
		String[] splittedStr = str.split(" ");
		String outPutStr = "";
		for (int index = 0; index < splittedStr.length; index++) {
			if (isPrimeNumber(splittedStr[index].length()) == true) {
				outPutStr = outPutStr + " " + splittedStr[index];
			}
		}
		System.out.println(outPutStr);
	}

	boolean isPrimeNumber(int num) {
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

	public static void main(String[] args) {
		Exam4_EachWordLengthPrimeNumber wordLen = new Exam4_EachWordLengthPrimeNumber();
		wordLen.getWordLength("I would like to have a cup of tea");
	}
}
