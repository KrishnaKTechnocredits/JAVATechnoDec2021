package sandip.Assignment_23;

public class Second_max {

	void secondMax(int[] a) {
		int max = 0;
		int smax = 0;
		if (a[0] > a[1]) {
			max = a[0];
			smax = a[1];
		} else {
			max = a[1];
			smax = a[0];
		}
		for (int index = 2; index < a.length; index++) {
			if (max < a[index]) {
				smax = max;
				max = a[index];
			} else if (max > a[index] && smax < a[index]) {
				smax = a[index];
			}
		}
		System.out.println("Second max number :" + smax);
		System.out.println("Maximum number :" + max);

	}

	public static void main(String[] args) {
		Second_max s1 = new Second_max();
		int[] arr = { 1,11,3,99,66,54,22,44 };
		s1.secondMax(arr);
	}
}
