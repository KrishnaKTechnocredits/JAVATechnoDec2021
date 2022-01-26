/* Assignment 28  - 23rd Jan

  Consider the case where a person is standing on plane ground and viewing in a particular direction.
  In the same direction of his viewpoint direction trees are located in a row with different heights(obviously in straight line).
  Height of trees are mentioned in the form of array as below.
  WAP to find how many trees are visible to a person considering the viewing direction is parallel to ground
  int[] treeHeight = {20,15,30,40,60,45,70,60,55,75,80};
  output : 7 trees are visible
   */

package amruta.Assignment_28;

public class CountofTrees {
	
	void visibleTreecount(int[] treearr) {
		int count = 0;
		int height = 0;
		for(int index = 0; index < treearr.length; index++) {
			if(treearr[index] > height) {
				height = treearr[index];
				count++;
			}
		}
		System.out.println("\nVisible tree count is "+count);
	}
	
	public static void main(String[] args) {
		int[] treeHeights = {20,15,30,40,60,45,70,60,55,75,80};
		CountofTrees count = new CountofTrees();
		count.visibleTreecount(treeHeights);
	}
}
