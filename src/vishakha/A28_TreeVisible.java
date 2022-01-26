package vishakha;

import java.util.Arrays;

public class A28_TreeVisible {
	void numberOfVisibleTrees(int[] arr) {
		int treeHeight;
		int tillMaxTreeHeight = 0;
		int visibleTreeCount = 0;
		
		for (int index=0; index<arr.length;index++) {
			treeHeight = arr[index];
			if(treeHeight > tillMaxTreeHeight) {
				tillMaxTreeHeight = treeHeight;
				visibleTreeCount++;
				
		}
	}
	
	System.out.println("\nExpected output : " + visibleTreeCount + "trees are visible");
	
	}

	public static void main(String[] args) {
		A28_TreeVisible a28_TreeVisible = new A28_TreeVisible();
		int[] treeHeight = {20,15,30,40,60,45,70,60,55,75,80};
		
		System.out.println("Tree heights are as below in the form of array: \n " + Arrays.toString(treeHeight));
		a28_TreeVisible.numberOfVisibleTrees(treeHeight);
		}
	}
	

