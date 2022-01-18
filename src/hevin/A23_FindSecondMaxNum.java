package hevin;

public class A23_FindSecondMaxNum {
	int minNum = 0;

	void getMinNum(int[] input) {
		for (int index = 0; index < input.length; index++) {
			if (minNum > input[index])
				minNum = input[index];
		}
		minNum--;
	}

	int getMaxNum(int[] input) {
		int max = minNum;
		int tempIndex = 0;
		for (int index = 0; index < input.length; index++) {
			if (max < input[index]) {
				max = input[index];
				tempIndex = index;
			}
		}
		input[tempIndex] = minNum;
		return max;
	}

	void getNthMaxNum(int[] input, int n) {
		int nMax = 0;
		getMinNum(input);
		for (int index = 1; index <= n; index++) {
			nMax = getMaxNum(input);
		}
		System.out.println(nMax);
	}

	public static void main(String[] args) {
		A23_FindSecondMaxNum nMaxNum = new A23_FindSecondMaxNum();
		int[] input = { 1, 11, 3, 99, 6, 54, 22, 44 };
		System.out.print("Second Max number in the given array is: ");
		nMaxNum.getNthMaxNum(input, 2);
	}
}
