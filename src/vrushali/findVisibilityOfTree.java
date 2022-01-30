package vrushali;

public class findVisibilityOfTree {
	
	void findVisibilityOfTree(int[] heightOfTrees) {
		
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
		findVisibilityOfTree findVisibilityOfTree = new findVisibilityOfTree();
		int[] heightOfTrees = { 3, 4, 4, 6, 5, 7, 9, 10, 8 };
		findVisibilityOfTree.findVisibilityOfTree(heightOfTrees);
	}
}
