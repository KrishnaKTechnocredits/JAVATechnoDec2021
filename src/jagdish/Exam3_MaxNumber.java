package jagdish;

public class Exam3_MaxNumber {

	void findMaxNo(int number) {
		int maxno = 0;
		while (number > 0) {
			int output = number % 10;
			if (output > maxno)
				maxno = output;
			number = number / 10;
		}

		System.out.println("The Max no is: " + maxno);
	}

	public static void main(String[] args) {
		Exam3_MaxNumber maxno = new Exam3_MaxNumber();
		maxno.findMaxNo(6327874);
	}
}