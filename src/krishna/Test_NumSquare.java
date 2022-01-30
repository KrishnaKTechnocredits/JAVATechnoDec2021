package krishna;

public class Test_NumSquare {
	public static int squ(int[] inputArray) {
		boolean flag = false;
		int maxValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			for (int j = i - 1; j < i; j++) {
				if (inputArray[i] % (inputArray[j] * inputArray[j]) == 0) {
					flag = true;
					System.out.println(flag);
				} else {
					System.out.println(inputArray[i] + "  Is invalid");
				}
			}
		}
		return maxValue;
	}

	public static void main(String args[]) {
		int number[] = new int[] {2,4,16,256};
		int com = squ(number);
	}
}

// {2,4,16,256}
