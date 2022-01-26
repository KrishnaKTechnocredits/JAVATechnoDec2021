package sagarShrikhande.arrayAndStrings;

public class Test3_MaxDigit {

	int getMaxDigitInNum(int num) {
		int maxDigit = 0;
		while (num / 10 > 0) {
			if (num % 10 > maxDigit)
				maxDigit = num % 10;
			num = num / 10;
		}
		return maxDigit;
	}

	public static void main(String[] args) {
		Test3_MaxDigit test3_MaxDigit = new Test3_MaxDigit();
		int num = 6832774;
		System.out.println(test3_MaxDigit.getMaxDigitInNum(num));
	}
}

/*
 * Write a program to find max digit from given number. Input will be as number
 * format only, DO NOT CHANGE NUMBER INTO STRING
 * 
 * Input : 6832774 Output :8
 */