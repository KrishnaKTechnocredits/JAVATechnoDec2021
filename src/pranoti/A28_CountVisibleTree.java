package pranoti;

public class A28_CountVisibleTree {

	void findVisibleTreeCount(int[] arr) {
		int maxTreeHeight = arr[0];
		int count = 1;
		for (int index = 0; index < arr.length; index++) {
			if (maxTreeHeight < arr[index]) {
				maxTreeHeight = arr[index];
				count++;
			}
		}
		System.out.println("Visible trees are : " + count);
	}

	public static void main(String[] args) {
		int[] treeHeight = { 20, 15, 30, 40, 60, 45, 70, 60, 55, 75, 80 };
		A28_CountVisibleTree countVisibleTree = new A28_CountVisibleTree();
		countVisibleTree.findVisibleTreeCount(treeHeight);
	}
}
