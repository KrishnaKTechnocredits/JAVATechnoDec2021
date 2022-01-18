package hevin;

public class A23_IdenticalArray {

	static int a[] = null;

	void arrayEquals(int[] input1, int[] input2) {
		boolean flag = false;
		if (input1.length == input2.length) {
			for (int index = 0; index < input1.length; index++) {
				if (input1[index] != input2[index])
					flag = true;

			}
			if (flag == false)
				System.out.println("Both Arrays are identical");
			else
				System.out.println("Both Arrays are not identical");

		} else
			System.out.println("Both Arrays are not identical");

	}

	public static void main(String[] args) {
		A23_IdenticalArray arrayEqual = new A23_IdenticalArray();
		int[] input1 = { 10, 44, -33 };
		int[] input2 = { 10, 44, -33 };

		int[] input3 = { 10, 44, -33 };
		int[] input4 = { 10, 44, -33, 55 };
		arrayEqual.arrayEquals(input1, input2);
		arrayEqual.arrayEquals(input3, input4);

	}

}
