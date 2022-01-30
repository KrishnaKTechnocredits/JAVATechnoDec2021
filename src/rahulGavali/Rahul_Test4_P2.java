package rahulGavali;

public class Rahul_Test4_P2 {

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

	String getWordsPrimeLength(String input) {
		int tempLength = 0;
		String output = "";
		String arr[] = input.split(" ");
		for (int i = 0; i < arr.length; i++) {
			tempLength = arr[i].length();
			if (isPrimeNumber(tempLength)) {
				output = output + arr[i] + " ";
			}
		}
		return output;	
	}

	public static void main(String[] args) {
		Rahul_Test4_P2 test4_Program_2 = new Rahul_Test4_P2();
		System.out.println("Output is a string having each word length as prime number from the input sentence");
		System.out.println("----------------------------------------------------------------------------------------");
		String input1 = "I love my India";
		System.out.println("Input : " + input1);
		System.out.println("Output : " + test4_Program_2.getWordsPrimeLength(input1));
		System.out.println("----------------------------------------------------------------------------------------");
		String input2 = "I would like to have a cup of tea";
		System.out.println("Input : " + input2);
		System.out.println("Output : " + test4_Program_2.getWordsPrimeLength(input2));
	}
}