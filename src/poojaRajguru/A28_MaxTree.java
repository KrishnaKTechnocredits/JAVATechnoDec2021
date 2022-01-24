package poojaRajguru;

public class A28_MaxTree {
	int maxTree(int[] arr) {
		int cnt = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		A28_MaxTree mt = new A28_MaxTree();
		int[] arr = { 20, 15, 30, 40, 60, 45, 70, 60, 55, 75, 80 };
		int tree = mt.maxTree(arr);
		System.out.println("The " + tree + " trees are visible ");
	}
}
