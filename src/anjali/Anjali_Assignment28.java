/*Assignment 28 : 23rd Jan'2022

Consider the case where a person is standing on plane ground and viewing in a particular direction. In the same direction of his viewpoint different trees are located in a row with different heights (obviously in straight line). Heights of trees are mentioned in the form of array as below.
WAP to find out how many trees are visible to a person considering the viewing direction is parallel to ground.

int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80}

output : 7 trees are visible 
 */
package anjali;

public class Anjali_Assignment28 {
	
	int  countVisibleTree(int arr[]){
		int cnt=0;
		int maxhight=0;
		for(int index=0;index<arr.length;index++)
		{
			if(arr[index]>maxhight)
			{
				maxhight=arr[index];
				cnt++;
			}
		}
		return cnt;
		
	}

	public static void main(String[] args) {
		Anjali_Assignment28  anjali_Assignment28 = new Anjali_Assignment28 ();
		int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80};
		int output=anjali_Assignment28.countVisibleTree( treeHeight);
		System.out.println(output+" tress are seen to us");

	}

}
