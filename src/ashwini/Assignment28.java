package ashwini;

import java.util.Arrays;

public class Assignment28 {

	void numberOfVisibleTrees(int[] arr) {
		int treeHeight;
		int tillMaxTreeHeight = 0;
		int visibleTreeCount = 0;

		for (int index = 0; index < arr.length; index++) {
			treeHeight = arr[index];
			if (treeHeight > tillMaxTreeHeight) {
				tillMaxTreeHeight = treeHeight;
				visibleTreeCount++;
			}
		}
		System.out.println("\nExpected output : " + visibleTreeCount + " trees are visible");
	}

	public static void main(String[] args) {
		Assignment28 treeVisibility = new Assignment28();
		int[] treeHeight = { 20, 15, 30, 40, 60, 45, 70, 60, 55, 75, 80 };
		System.out.println("Tree heights are as below in the form of array : \n" + Arrays.toString(treeHeight));
		treeVisibility.numberOfVisibleTrees(treeHeight);
	}
}
