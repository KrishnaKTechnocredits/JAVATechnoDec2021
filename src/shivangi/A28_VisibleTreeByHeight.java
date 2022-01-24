/*Assignment 28 : 23rd Jan'2022

Consider the case where a person is standing on plane ground and viewing in a particular direction. In the same 
direction of his viewpoint different trees are located in a row with different heights (obviously in straight line). 
Heights of trees are mentioned in the form of array as below.
WAP to find out how many trees are visible to a person considering the viewing direction is parallel to ground.

int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80}

output : 7 trees are visible*/ 

package shivangi;

public class A28_VisibleTreeByHeight {
	
	int findVisibleTreeByHeight(int[] treeHeight) {
		int count = 0;
		int max = 0;
		for(int index=0; index<=treeHeight.length-1; index++) {
			if(max<treeHeight[index]) {
				count = count+1;
				max = treeHeight[index];
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80};
		A28_VisibleTreeByHeight a28 = new A28_VisibleTreeByHeight();
		int output = a28.findVisibleTreeByHeight(treeHeight);
		System.out.println("A person can see total : " + output + " tress in front of their direction(in row)");
	}
}


/*Dry run -
//0<20/1/20  20<30/2/30   30<40/3/40  40<60/4/60  60<70/5/70  70<75/6/75  75<80/7/80*/