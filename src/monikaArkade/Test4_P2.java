/*
 WAP to return a string having each word length is prime number from the given sentence.
Prime numbres are : 2, 3, 5, 7, 11, 13, 17, 19 ...

Examples:
Input 1 : I love my India
Output 1 : my India

Input 2 : I would like to have a cup of tea
Output 2 : would to cup of tea
 */
package monikaArkade;

public class Test4_P2 {
	
	boolean isPrimeNumber(int input) {
		boolean flag = true;
		if (!(input == 1)) {
			for (int i=2; i <= input/2; i++) {
				if ((input % i == 0)) {
					return flag = false;
				}
			}
		} else {
			flag = false;
		}
		return flag;
	}
	
	String stringToWord(String input) {
		int templength=0;
		String output="";
		String[] arr = input.split(" ");
		try {
		for(int index=0;index<arr.length;index++) {
			templength = arr[index].length();
			if(isPrimeNumber(templength))
				output = output+ arr[index]+" ";
		}
		}catch(ArrayIndexOutOfBoundsException a) {
		}
		return output;
	}

	public static void main(String[] args) {
		Test4_P2 t1 = new Test4_P2();
		String input1 = "I love my India";
		t1.stringToWord(input1);
		
		System.out.println(t1.stringToWord(input1));
		String input2 = "I would like to have a cup of tea";
		System.out.println(t1.stringToWord(input2));
	}
}
