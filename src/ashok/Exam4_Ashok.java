//WAP to find previous number is sqauare of next number
package ashok;

public class Exam4_Ashok {

	void squareRoot(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			int temp = a[i] * a[i];
			for (int k = 0; k < a.length - 1; k++) {
				if (a[k + 1] == temp) {
					System.out.println(a[i] + " Sqaure is  " + temp + "  True");
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exam4_Ashok object = new Exam4_Ashok();
		int[] arr = { 2, 4, 16, 256, 400 };
		object.squareRoot(arr);
	}

}
