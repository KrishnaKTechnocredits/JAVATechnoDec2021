/*
1. How to find all pairs in an array of integers whose sum is equal to the given number
i/p  : {5,1,2,7,6,3,4,9} , sum : 6
o/p : {5,1}, {2,4}

2. WAP to print a single occurrence element from the array in Java?
i/p  : {5,8,1,2,4,3,2,1}
o/p : {5,8,4,3}
*/
package shivangi.exam;

public class Shivangi_Exam2 {
	void findSumOfPairs() {
		int[] arr = {5,1,2,7,6,3,4,9};
		int sum = 6;
		System.out.println("Pairs whose sum is equal to "+sum+" : ");
		for(int index=0; index<arr.length; index++) {
			for(int innerIndex=0; innerIndex<arr.length; innerIndex++) {
				if(sum == (arr[index] + arr[innerIndex])) {
					System.out.println("{"+arr[index]+" , "+arr[innerIndex]+"}");
				}
			}
		}
	}
	
	void findUniqueElement() {
		int[] arr = {5,8,1,2,4,3,2,1};
		System.out.println("Unique elements in array are : ");
		for(int index=0; index<arr.length; index++) {
			int count = 0;
			for(int innerIndex=0; innerIndex<arr.length; innerIndex++) {
				if(arr[index] == arr[innerIndex]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(arr[index] + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		Shivangi_Exam2 shivangi_Exam2 = new Shivangi_Exam2();
		shivangi_Exam2.findUniqueElement();
		System.out.println();
		shivangi_Exam2.findSumOfPairs();
	}
}
