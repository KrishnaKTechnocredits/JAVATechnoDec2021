package shital;

public class A28 {

	void findTheVisibility(int[] heightOfTrees) {
		int visibleTreeCount = 1;
		int maxHeightOfTree = heightOfTrees[0];
		for (int index = 1; index < heightOfTrees.length; index++) {
			if (maxHeightOfTree < heightOfTrees[index]) {
				maxHeightOfTree = heightOfTrees[index];
				visibleTreeCount++;
			}
		}
		System.out.println("The no. of trees visible are : " + visibleTreeCount);
	}

	public static void main(String[] args) {
		A28 treesVisibility = new A28();
		int[] heightOfTrees = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80};
		treesVisibility.findTheVisibility(heightOfTrees);
	}
}