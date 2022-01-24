package sagarShrikhande.arrayAndStrings;

public class A28_VisibleTree {

	int countOfVisibleTrees(int[] arr) {
		int count = 1;
		int tMax = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (tMax < arr[index]) {
				tMax = arr[index];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] treeHeight = { 20, 15, 30, 40, 60, 45, 70, 60, 55, 75, 80 };
		A28_VisibleTree a28_VisibleTree = new A28_VisibleTree();
		System.out.println(a28_VisibleTree.countOfVisibleTrees(treeHeight) + " trees are visible");
	}
}

/*
 * Assignment 28 : 23rd Jan'2022
 * 
 * Consider the case where a person is standing on plane ground and viewing in a
 * particular direction. In the same direction of his viewpoint different trees
 * are located in a row with different heights (obviously in straight line).
 * Heights of trees are mentioned in the form of array as below. WAP to find out
 * how many trees are visible to a person considering the viewing direction is
 * parallel to ground.
 * 
 * int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80}
 * 
 * output : 7 trees are visible
 */