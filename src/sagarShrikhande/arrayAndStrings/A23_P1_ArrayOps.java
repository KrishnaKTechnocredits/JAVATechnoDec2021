package sagarShrikhande.arrayAndStrings;

public class A23_P1_ArrayOps {

	int getSecondMaxInArray(int[] a, int n) {
		if (a.length >= n) {
			int nthMax = 0;
			for (int index = 0; index < a.length; index++) {
				int count = 0;
				for (int innerIndex = 0; innerIndex < a.length; innerIndex++) {
					if (a[index] > a[innerIndex])
						count++;
				}
				if (count == a.length - n)
					nthMax = a[index];
			}
			return nthMax;
		} else
			System.out.println("Array has lesser element than " + n + " please try to provide valid input");
		return 0;
	}

	public static void main(String[] args) {
		A23_P1_ArrayOps a23_P1_ArrayOps = new A23_P1_ArrayOps();
		int[] arr = { 1, 11, 3, 99, 66, 54, 22, 44 };
		System.out.println("Requested max number is: "+a23_P1_ArrayOps.getSecondMaxInArray(arr, 2));
	}
}

/*
 * Program 1 : Find second max from given array. input :
 * {1,11,3,99,66,54,22,44}; output : 66
 */