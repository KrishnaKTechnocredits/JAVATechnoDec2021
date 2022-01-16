package yogeshNagar;

public class Exam2_ArrayLogics {
	void getPairOfNumber(int number) {
		int[] arr = { 5, 1, 2, 7, 6, 3, 4, 9 };
		for (int index = 0; index < arr.length; index++) {
			for (int inIndex = 0; inIndex < index; inIndex++) {
				if (arr[inIndex] + arr[index] == number) {
					System.out.println(arr[inIndex] + " " + arr[index]);
				}
			}
		}
	}

	void getSingleOccurence(int[] num) {
		for (int index = 0; index < num.length; index++) {
			int count = 0;
			for (int inIndex = 0; inIndex < num.length; inIndex++) {
				if (num[index] == num[inIndex])
					count++;
			}
			if (count == 1) {
				System.out.println(num[index] + " ");
			}
		}
	}

	public static void main(String[] args) {
		Exam2_ArrayLogics arrLogic = new Exam2_ArrayLogics();
		System.out.println("---Programe1--------");
		arrLogic.getPairOfNumber(6);
		System.out.println("---Programe2--------");
		int[] num = { 5, 8, 1, 2, 4, 3, 2, 1 };
		arrLogic.getSingleOccurence(num);
	}
}