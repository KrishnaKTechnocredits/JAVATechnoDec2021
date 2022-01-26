package monikaArkade;

public class A28_TreeArray {
	int maxtree = 0;
	int count = 0;

	int visibleTree(int[] arr) {

		for (int index = 0; index < arr.length; index++) {
			if (maxtree < arr[index]) {
				maxtree = arr[index];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		A28_TreeArray tree = new A28_TreeArray();
		int[] input = { 20, 15, 30, 40, 60, 45, 70, 60, 55, 75, 80 };
		int ans = tree.visibleTree(input);
		System.out.println(ans);
	}
}
