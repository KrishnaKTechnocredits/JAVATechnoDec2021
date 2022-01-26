package vishakha.exam3;

public class Exam3_prog1 {
	void maxDigit(int num) {
		int maxNum = 0;
		int temp;
		while (num > 0) {
			temp = num % 10;
			num = num/10;
			if(temp > maxNum)
				maxNum = temp;
		}
	System.out.println("Maximum digit from given number is :" + maxNum);
	}
	public static void main(String[] args) {
		Exam3_prog1 exam3_prog1 = new Exam3_prog1();
		exam3_prog1.maxDigit(6832774);
	}

}
