package kalyani;

public class A28_VisibleTrees {

	void getCountOfVisibleTrees(int[] treeHeight) {
		int count = 1;
		int maxHeight = treeHeight[0];
		for (int index = 0; index < treeHeight.length; index++) {
			if (treeHeight[index] > maxHeight) {
				maxHeight = treeHeight[index];
				count++;
			}
		}
		System.out.println("The count of visible trees are : " + count);
	}

	public static void main(String[] args) {
		A28_VisibleTrees assign28 = new A28_VisibleTrees();
		int[] trees = { 20, 15, 30, 40, 60, 45, 70, 60, 55, 75, 80 };
		assign28.getCountOfVisibleTrees(trees);
	}
}