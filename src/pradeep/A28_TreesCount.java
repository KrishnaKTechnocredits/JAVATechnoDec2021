package pradeep;

public class A28_TreesCount {

	void countVisibleTrees(int[] treeHeight) {
		int num1 = treeHeight[0];
		int count = 1;

		for (int index = 1; index < treeHeight.length; index++) {
			int num2 = treeHeight[index];
			if (!(num1 > num2)) {
				count++;
				num1 = num2;
			}
		}
		System.out.println("No of visible tree is :" + count);
	}

	public static void main(String[] args) {
		A28_TreesCount a28_TreesCount = new A28_TreesCount();
		int[] treeHeight = { 20, 15, 30, 40, 60, 45, 70, 60, 55, 75, 80 };

		a28_TreesCount.countVisibleTrees(treeHeight);
	}
}
