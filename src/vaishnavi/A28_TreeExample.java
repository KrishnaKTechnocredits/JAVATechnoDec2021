package vaishnavi;

public class A28_TreeExample {

	void countOfVisibleTrees(int[] treeHeight) {
		int treeCount =0;
		int maxTreeHeight=0;
		
		for(int index =0; index <treeHeight.length;index++) {
			if(maxTreeHeight < treeHeight[index]) {
				maxTreeHeight = treeHeight[index];
				treeCount++;
			}
		}
		System.out.println("Visible tree count is " + treeCount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A28_TreeExample a28_TreeExample = new A28_TreeExample();
		int[] treeHeight = {20, 15, 30, 40, 60,45,70,60,55,75,80};
		a28_TreeExample.countOfVisibleTrees(treeHeight);
	}

}
