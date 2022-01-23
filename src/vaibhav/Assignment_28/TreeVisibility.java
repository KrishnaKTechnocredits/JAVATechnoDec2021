/* Assignment 28 : 23rd Jan'2022

Consider the case where a person is standing on plane ground and viewing in a particular direction. In the same direction of his viewpoint different trees are located in a row with different heights (obviously in straight line). Heights of trees are mentioned in the form of array as below.
WAP to find out how many trees are visible to a person considering the viewing direction is parallel to ground.

int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80}

output : 7 trees are visible 

*/

package vaibhav.Assignment_28;

import java.util.Arrays;

public class TreeVisibility {

	void numberOfVisibleTrees(int[] arr) {
		int treeHeight;
		int tillMaxTreeHeight = 0;
		int visibleTreeCount=0;
		
		for (int index=0;index<arr.length;index++) {
			treeHeight = arr[index];
			if (treeHeight > tillMaxTreeHeight) {
				tillMaxTreeHeight = treeHeight;
				visibleTreeCount++;
			}		
		}
		System.out.println("\nExpected output : " + visibleTreeCount + " trees are visible");
	}

	public static void main(String[] args) {
		TreeVisibility treeVisibility = new TreeVisibility();
		int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80};
		System.out.println("Tree heights are as below in the form of array : \n" + Arrays.toString(treeHeight));
		treeVisibility.numberOfVisibleTrees(treeHeight);
	}
}
