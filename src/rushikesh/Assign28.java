package rushikesh;
//Assignment 28 : 23rd Jan'2022
//
//Consider the case where a person is standing on plane ground and viewing in a particular direction. In the same direction of his viewpoint different trees are located in a row with different heights (obviously in straight line). Heights of trees are mentioned in the form of array as below.
//WAP to find out how many trees are visible to a person considering the viewing direction is parallel to ground.
//
//int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80}
//
//output : 7 trees are visible 

public class Assign28 {
	int countOfVisibleTrees(int [] arr) {
		int temp=0,count=0;
		for(int index=0;index<arr.length;index++) {
			if(temp<arr[index]) {
				temp=arr[index];
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Assign28 assign28=new Assign28();
		int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80};
		int num=assign28.countOfVisibleTrees(treeHeight);
		System.out.println("Count of Visible trees is "+num);
	}
}
