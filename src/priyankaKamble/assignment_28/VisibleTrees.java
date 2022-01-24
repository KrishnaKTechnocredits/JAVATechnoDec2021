package priyankaKamble.assignment_28;

import java.util.Arrays;

/*Assignment 28 : 23rd Jan'2022

Consider the case where a person is standing on plane ground and viewing in a particular direction. 
In the same direction of his viewpoint different trees are located in a row with different heights (obviously in straight line).
Heights of trees are mentioned in the form of array as below.

WAP to find out how many trees are visible to a person considering the viewing direction is parallel to ground.

int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80}

output : 7 trees are visible 
*/
public class VisibleTrees {

	void findVisibletree(int[] treeHeight) {
		int maxHightTree=0, treeCount =0 ; int[] storeTree = new int[treeHeight.length];
		 String  visibaleTree = "";
		for (int index = 0; index < treeHeight.length; index++) {
			if(treeHeight[index]>maxHightTree ) {
				maxHightTree = treeHeight[index];
				storeTree[index] = maxHightTree;
				visibaleTree += maxHightTree + " ";
				treeCount++;
			}
		}
		System.out.println(Arrays.toString(storeTree));
		System.out.println("Visble Tress are (String format)= > "+visibaleTree);
		System.out.println("Number of Trees Visibale are => "+treeCount);
	}
	public static void main(String[] args) {
		VisibleTrees visibleTrees  = new VisibleTrees();
		int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80};
		System.out.println("Total Trees are => " + Arrays.toString(treeHeight));
		System.out.print("Visible Tress are => ");
		visibleTrees.findVisibletree(treeHeight);
	}
}
