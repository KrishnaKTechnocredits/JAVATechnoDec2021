package kavleen;

public class Assignment28 {

	int visibleTree(int [] arr) {
		int count = 0 ;
		int maxHeight= 0;
		
		for (int index = 0 ; index<arr.length;index++) {
			if(arr[index]>maxHeight) {
				maxHeight = arr[index];
				count++;
			}
		}
		return count;
		
	}
	
	public static void main (String []args) {
		Assignment28 assignment = new Assignment28();
		int [] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80};
		int output= assignment.visibleTree(treeHeight);
		System.out.println("Total trees visible are : " + output);
	}
}
