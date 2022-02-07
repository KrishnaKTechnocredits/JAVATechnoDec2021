package pranoti;

public class A23_P1SecondMaxNum {

	void findSecondMax(int[] arr) {
		int maxnum = 0;
		int secondmax = 0;
		if (arr[0] > arr[1]) {
			maxnum = arr[0];
			secondmax = arr[1];
		} else {
			maxnum = arr[1];
			secondmax = arr[0];
		}
		for (int index = 2; index < arr.length; index++) {
			if (maxnum < arr[index]) {
				secondmax = maxnum;
				maxnum = arr[index];
			} else if (maxnum > arr[index] && secondmax < arr[index])
				secondmax = arr[index];
		}
		System.out.println("Second maxnumber in array : " + secondmax);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 11, 3, 99, 66, 54, 22, 44 };
		A23_P1SecondMaxNum a23_P1SecondMaxNum = new A23_P1SecondMaxNum();
		a23_P1SecondMaxNum.findSecondMax(arr);
	}
}
