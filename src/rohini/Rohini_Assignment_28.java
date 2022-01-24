package rohini;

/*Assignment 28 : 23rd Jan'2022

Consider the case where a person is standing on plane ground and viewing in a particular direction. In the same direction of his viewpoint different trees are located in a row with different heights (obviously in straight line). Heights of trees are mentioned in the form of array as below.
WAP to find out how many trees are visible to a person considering the viewing direction is parallel to ground.

int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80}

output : 7 trees are visible 
*/


public class Rohini_Assignment_28 {
	
	public void FindVisibleTree() {
		int maxValue=0,count=0;
		int arr[] = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80};
		for(int i=0;i<arr.length;i++) {
			
			if(maxValue<arr[i]) {
				count++;
				maxValue=arr[i];
				System.out.println(maxValue);
			}
			
			
		}
		System.out.println("Total Visible Tree :" +count);
		
		
	}

	public static void main(String[] args) {
		Rohini_Assignment_28 obj1 = new Rohini_Assignment_28();
		System.out.println("Below are the visible tress:");
		obj1.FindVisibleTree();
	}

}
