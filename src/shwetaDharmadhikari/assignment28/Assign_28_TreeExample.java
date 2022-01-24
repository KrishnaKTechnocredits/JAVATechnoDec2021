/*Assignment 28 : 23rd Jan'2022

Consider the case where a person is standing on plane ground and viewing in a particular direction. In the same direction of his viewpoint different trees are located in a row with different heights (obviously in straight line). Heights of trees are mentioned in the form of array as below.
WAP to find out how many trees are visible to a person considering the viewing direction is parallel to ground.

int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80}

output : 7 trees are visible
 */
package shwetaDharmadhikari.assignment28;

public class Assign_28_TreeExample {

	int getTreeCount(int[] input) {
		int counter = 1;
		int maxHeight = input[0];
		for (int index = 0; index < input.length; index++) {
			if (input[index] > maxHeight) {
				maxHeight = input[index];
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assign_28_TreeExample assign_28_TreeExample = new Assign_28_TreeExample();
		int[] inputArray = { 20, 15, 30, 40, 60, 45, 70, 60, 55, 75, 80 };
		System.out.println("The count of visible trees : " + assign_28_TreeExample.getTreeCount(inputArray));
	}

}
