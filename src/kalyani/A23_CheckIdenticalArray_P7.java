package kalyani;

public class A23_CheckIdenticalArray_P7 {

	static int a[] = null;

	void arrayEquals(int[] arr1, int[] arr2) {
		boolean flag = false;
		if (arr1.length == arr2.length) {
			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] != arr2[index])
					flag = true;
				}
			
			if (flag == false)
				System.out.println("Given Arrays are same");
			else
				System.out.println("Given Arrays are not same");

		} else
			System.out.println("Given Arrays are not same");

	}

	public static void main(String[] args) {
		A23_CheckIdenticalArray_P7 arrayEqual = new A23_CheckIdenticalArray_P7();
		int[] arr1 = { 10, 44, -33 };
		int[] arr2 = { 10, 44, -33 };

		int[] arr3 = { 10, 44, -33 };
		int[] arr4 = { 10, 44, -33, 55 };
		
		arrayEqual.arrayEquals(arr1, arr2);
		arrayEqual.arrayEquals(arr3, arr4);

	}

}