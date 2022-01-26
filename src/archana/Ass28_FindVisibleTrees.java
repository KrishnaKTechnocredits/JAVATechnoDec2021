package archana;

public class Ass28_FindVisibleTrees {

	static void getVisibleTrees(int[] trees) {
		int maxTree = trees[0];
		int count = 1;
		for (int i = 1; i < trees.length; i++) {
			if (maxTree < trees[i]) {
				maxTree = trees[i];
				count++;
			}
		}
		System.out.println("Visible trees : " + count);
	}

	public static void main(String[] args) {
		int[] arrTree = { 20, 15, 30, 40, 60, 45, 70, 60, 55, 75, 80 };// 7
		getVisibleTrees(arrTree);
	}
}
