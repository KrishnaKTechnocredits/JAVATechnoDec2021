/*Assignment 28 : 23rd Jan'2022

Consider the case where a person is standing on plane ground and viewing in a particular direction. In the same direction of his viewpoint different trees are located in a row with different heights (obviously in straight line). Heights of trees are mentioned in the form of array as below.
WAP to find out how many trees are visible to a person considering the viewing direction is parallel to ground.

int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80}

output : 7 trees are visible 
*/

package deepak;

public class A28_TreesVisibility {

	int visibleTrees(int[] treeHeight) {
		int count = 0;
		int maxHeight = 0;
		for (int index = 0; index < treeHeight.length; index++) {
			if (maxHeight < treeHeight[index]) {
				count++;
				maxHeight = treeHeight[index];
			}
		}
		return count;
	}

	public static void main(String[] args) {
		A28_TreesVisibility treeVisibility = new A28_TreesVisibility();
		int[] treeHeight = { 20, 15, 30, 40, 60, 45, 70, 60, 55, 75, 80 };

		System.out.println(treeVisibility.visibleTrees(treeHeight) + " trees are visible");
	}

}
