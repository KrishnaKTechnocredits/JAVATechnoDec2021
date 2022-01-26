package deepak;

public class Test3_MaxNum {
	
	int getMaxDigit(int num) {
		int maxNum = 0;
		int rem = 0;
		while (num > 0) {
			rem = num % 10;
			if (maxNum < rem) {
				maxNum = rem;
			}
			num = num / 10;
		}
		return maxNum;
	}

	public static void main(String[] args) {
		Test3_MaxNum maxNum = new Test3_MaxNum();
		System.out.print("Max Digit in the given number is: ");
		System.out.println(maxNum.getMaxDigit(6832774));
	}

}
