package saurav;

/*Consider the case where a person is standing on plane ground and viewing in a particular direction.
 *  In the same direction of his viewpoint direction trees are located in a row with different heights(obviously in straight line).
 *  Height of trees are mentioned in the form of array as below.
 *  WAP to find how many trees are visible to a person considering the viewing direction is parallel to ground
 *  int[] treeHeight = {20,15,30,40,60,45,70,60,55,75,80};
 *  output : 7 trees are visible
 */

public class A28_NumOfTreesVisible {
	
			int NumOfTreeVisible(int[] treeHeight) {
				int count = 0;
				int maxTreeHeight = treeHeight[0];
				for(int index=0; index<treeHeight.length; index++) {
					if(maxTreeHeight <= treeHeight[index]) {
						maxTreeHeight = treeHeight[index];
											count++;
//System.out.println(maxTreeHeight);
					}
				}
				System.out.println("Number of trees visible : "+count);

		return count;
	}
			
			public static void main(String[] a) {
				A28_NumOfTreesVisible assignment28 = new A28_NumOfTreesVisible(); 
		int[]	treeHeight = {20,15,30,40,60,45,70,60,55,75,80};
				assignment28.NumOfTreeVisible(treeHeight);
			}
}
