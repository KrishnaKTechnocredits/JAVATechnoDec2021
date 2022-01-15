package pradeep;

public class Exam2Prog2 {
	String duplicate = "";

	String findDuplicate(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			for (int index1 = index + 1; index1 < arr.length; index1++) {
				if (arr[index] == arr[index1]) {
					duplicate += arr[index];
				}
			}
		}
		return duplicate;
	}

	void printSingleOccurance(int[] arr) {
		duplicate = findDuplicate(arr);
		String single = "{";

		for (int index = 0; index < arr.length; index++) {
			String str = "" + arr[index];
			if (!duplicate.contains(str)) {
				single += arr[index] + ",";
			}
		}

		// deleted last character using string builder
		StringBuilder sc = new StringBuilder(single);
		sc.deleteCharAt(single.length() - 1);
		single = sc.toString();
		System.out.println(single + "}");
	}

	public static void main(String[] args) {
		int[] arr = { 5, 8, 1, 2, 4, 3, 2, 1 };

		Exam2Prog2 exam2Prog2 = new Exam2Prog2();
		exam2Prog2.printSingleOccurance(arr);
	}

}
