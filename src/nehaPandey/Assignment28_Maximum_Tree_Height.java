package nehaPandey;
//Consider the case where a person is standing on plane ground and viewing in a particular direction. In the same direction of his viewpoint different trees are located in a row with different heights (obviously in straight line). Heights of trees are mentioned in the form of array as below.

//WAP to find out how many trees are visible to a person considering the viewing direction is parallel to ground.

//int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80}

//output : 7 trees are visible

public class Assignment28_Maximum_Tree_Height {
	void findHowManyTreesVisibleToPerson(int[] treeHeight) {
		int max = 0;
		int count = 0;
		for (int index = 0; index < treeHeight.length; index++) {
			if (max < treeHeight[index]) {
				max = treeHeight[index];
				count++;
			}

		}
		System.out.println(count + " trees are visible");

	}

	public static void main(String[] args) {
		Assignment28_Maximum_Tree_Height a28 = new Assignment28_Maximum_Tree_Height();
		int[] treeHeight = { 20, 15, 30, 40, 60, 45, 70, 60, 55, 75, 80 };
		a28.findHowManyTreesVisibleToPerson(treeHeight);

	}

}
