package sagarAcharya;

public class A28_TreeVisibility {

	public static void main(String[] args) {
		A28_TreeVisibility a28 = new A28_TreeVisibility();
		int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80};
		a28.treeCount(treeHeight);
	}
	
	void treeCount(int[] trees) {
		int highestTree = 0;
		int count=0;
		
		for(int i = 0;i<trees.length;i++) {
			if(highestTree < trees[i]){
				highestTree = trees[i];
				count++;
			}
		}
		System.out.println("Number of trees visible to that person are : "+count);
	}
}

/*Assignment 28 : 23rd Jan'2022

Consider the case where a person is standing on plane ground and viewing in a particular direction. In the same direction of his viewpoint different trees are located in a row with different heights (obviously in straight line). Heights of trees are mentioned in the form of array as below.
WAP to find out how many trees are visible to a person considering the viewing direction is parallel to ground.

int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80}

output : 7 trees are visible
*/