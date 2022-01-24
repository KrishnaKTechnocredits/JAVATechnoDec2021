package yogeshNagar;

public class Exam3_GetMaxNum {

	void getMaxNumberFromInteger(int num) {
		int max = 0;
		while (num / 10 > 0) {
			if (max < num % 10)
				max = num % 10;
			num = num / 10;
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		Exam3_GetMaxNum getMaxNum = new Exam3_GetMaxNum();
		getMaxNum.getMaxNumberFromInteger(6832774);
	}
}
