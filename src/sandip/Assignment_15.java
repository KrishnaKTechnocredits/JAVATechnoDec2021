package sandip;

public class Assignment_15 {
	int index3;
	String s3;

	int maxNumber(int[] num) {
		int x = num[0];
		for (int index = 1; index < num.length; index++) {
			if (x < num[index]) {
				x = num[index];
			}
		}
		return x;
	}

	int minNumber(int[] num) {
		int y = num[0];
		for (int index = 1; index < num.length; index++) {
			if (y > num[index]) {
				y = num[index];
			}
		}
		return y;
	}

	int positiveNumber(int[] num) {
		int count = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] > 0) {
				count++;
			}
		}
		return count;
	}

	int sumOfPositiveNumber(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] > 0) {
				sum = sum + num[index];
			}
		}
		return sum;
	}

	int sumOfEvenPositiveNumber(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 0 && num[index] > 0) {
				sum = sum + num[index];
			}
		}
		return sum;
	}

	String maxLength(String[] s1) {
		int s2 = s1[0].length();
		for (int index = 1; index < s1.length; index++) {
			if (s2 < s1[index].length()) {
				s2 = s1[index].length();
				index3 = index;
			}
			s3 = s1[index3];
		}
		return s3;
	}

	public static void main(String[] args) {
		Assignment_15 n1 = new Assignment_15();
		int[] n2 = { 100, 10, 20, 30, 200, 150 };
		int[] n3 = { -10, 2, 5, 10, 50, 100, -51, -30 };
		String[] s = { "sandip", "techno", "technocreditss", "helloWorlds" };
		System.out.println("Max number is :" + n1.maxNumber(n2));
		System.out.println("Min number is :" + n1.minNumber(n2));
		System.out.println("Number of positive numbers are :" + n1.positiveNumber(n3));
		System.out.println("Sum of positive numbers is :" + n1.sumOfPositiveNumber(n3));
		System.out.println("Sum of even positive numbers :" + n1.sumOfEvenPositiveNumber(n3));
		System.out.println("Longest string is :" + n1.maxLength(s));
	}
}
