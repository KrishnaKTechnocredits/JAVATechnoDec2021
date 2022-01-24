package jayashri;

public class A25_FindMissingNum {

	void findmissingnum() {
		int[] arr = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
		int num = arr.length + 1;
		int expsum = (num * (num + 1) / 2);

		for (int i = 0; i <= arr.length - 1; i++) {
			expsum = expsum - arr[i];
		}
		System.out.println("Missing number is :" +expsum);
	}
	public static void main(String[] args) {
		A25_FindMissingNum find = new A25_FindMissingNum();
		find.findmissingnum();
	}
}
