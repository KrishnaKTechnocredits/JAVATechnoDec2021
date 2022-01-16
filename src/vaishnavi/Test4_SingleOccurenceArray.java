package vaishnavi;

public class Test4_SingleOccurenceArray {

	void printSingleOccurenceArray(int[] arr) {
		for(int index = 0; index < arr.length; index++) {
			int count =0;
			for(int index1 = 0; index1 < arr.length; index1++) {
				if(arr[index] == arr[index1])
					count++;
			}
			if (count==1) {
				System.out.println(arr[index] + "  ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4_SingleOccurenceArray test4_SingleOccurenceArray = new Test4_SingleOccurenceArray();
		int[] arr = {5,8,1,2,4,3,2,1};
		System.out.println("Single Occurence from the array in Java :");
		test4_SingleOccurenceArray.printSingleOccurenceArray(arr);

	}

}
