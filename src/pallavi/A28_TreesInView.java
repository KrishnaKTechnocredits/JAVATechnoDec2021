/*Assignment 28 : 23rd Jan'2022

Consider the case where a person is standing on plane ground and viewing in a particular direction. In the same direction of his viewpoint different trees are located in a row with different heights (obviously in straight line). Heights of trees are mentioned in the form of array as below.
WAP to find out how many trees are visible to a person considering the viewing direction is parallel to ground.

int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80}

output : 7 trees are visible 

*/

package pallavi;

import java.util.Arrays;

public class A28_TreesInView {
	
	int getTreesInView(int[] treeHeight) {
		int maxHeight=0;
		int count=0;
		
		for(int i:treeHeight) {
			if(i >maxHeight) {
				maxHeight=i;
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] treeHeight = {20, 15, 30, 40, 45, 45 ,70, 60, 55, 75, 90};
		System.out.println("Hight of Trees= "+Arrays.toString(treeHeight));
		System.out.println("Number of trees visible= "+new A28_TreesInView().getTreesInView(treeHeight));
	}

}
