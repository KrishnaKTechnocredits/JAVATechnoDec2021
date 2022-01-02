package megha;

public class Megha_Assignment15_Prog3 {

		int countOfPositiveNumberFromGivenArray(int[] arr) {
			int count = 0;
			for (int index = 0; index < arr.length; index++) {
				if (arr[index] >= 0)
					count++;
			}

			return count;
		}

		public static void main(String[] args) {
			Megha_Assignment15_Prog3 megha_Assignment15 = new Megha_Assignment15_Prog3();
			int[] arr = { 12, -11, 99, 11,  23, -44};
			int count = megha_Assignment15.countOfPositiveNumberFromGivenArray(arr);
			System.out.println("Count of positive number in the given array is : " + count);
		}
	

}
