package sagarShrikhande;

public class Exam_2_Array {

	void findPairInArray(int[] a, int sum) {
		System.out.println("Pairs having sum equal to input sum: ");
		for (int index = 0; index < a.length - 1; index++) {
			for (int innerIndex = index + 1; innerIndex < a.length; innerIndex++) {
				if (a[index] + a[innerIndex] == sum)
					System.out.println("{" + a[index] + " " + a[innerIndex] + "}");
			}
		}
	}

	void findElementsWithSingleOccurrence(int[] a) {
		System.out.println("Unique numbers in array: ");
		System.out.println(" ");
		System.out.print("{ ");
		boolean setFlag = false;
		for (int index = 0; index < a.length; index++) {
			int cnt = 0;
			cnt = arrayOccuurrence(a, a[index]);
			if (cnt == 1 )
				System.out.print(a[index] + " ");

		}
		System.out.print("}");
	}

	int arrayOccuurrence(int[] a, int n) {
		int count = 0;
		for (int index = 0; index < a.length; index++) {
			if (a[index] == n)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Exam_2_Array exm = new Exam_2_Array();
		int[] arr = { 5, 1, 2, 6, 6, 3, 4, 9 };
		exm.findPairInArray(arr, 6);
		int[] sArr = { 5, 8, 1, 2, 4, 3, 2, 1 };
		exm.findElementsWithSingleOccurrence(sArr);
	}
}

/*
 * *1. How to find all pairs in an array of integers whose sum is equal to the
 * given number* i/p : {5,1,2,7,6,3,4,9} , sum : 6 o/p : {5,1}, {2,4}
 * 
 * 
 * 
 * 2. WAP to print a single occurrence element from the array in Java?* i/p :
 * {5,8,1,2,4,3,2,1} o/p : {5,8,4,3}
 */
