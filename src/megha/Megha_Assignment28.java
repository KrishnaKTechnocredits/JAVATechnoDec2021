package megha;

public class TreesVisibility {

	void findTheVisibility(int[] heightOfTrees) {
		int visibleTreeCnt = 1;
		int maxHeightOfTree = heightOfTrees[0];
		for (int index = 1; index < heightOfTrees.length; index++) {
			if (maxHeightOfTree < heightOfTrees[index]) {
				maxHeightOfTree = heightOfTrees[index];
				visibleTreeCnt++;
			}
		}
		System.out.println("The no. of trees visible are : " + visibleTreeCnt);
	}

	public static void main(String[] args) {
		TreesVisibility treesVisibility = new TreesVisibility();
		int[] heightOfTrees = { 3, 4, 4, 6, 5, 7, 9, 10, 8 };
		treesVisibility.findTheVisibility(heightOfTrees);
	}

}
