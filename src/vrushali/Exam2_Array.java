/*2. WAP to print a single occurrence element from the array in Java?
i/p  : {5,8,1,2,4,3,2,1}
o/p : {5,8,4,3}*/


package vrushali;

public class Exam2_Array {
	void findSingleOccurranceOfNumber(int[]arr) {
		for(int index = 0; index<arr.length; index++) {
			int count = 0;
			for(int j= 0; j< arr.length; j++) {
				if(arr[index] == arr[j])
					count++;
			}
			if(count == 1 ) 
				System.out.print( arr[index]+ " ");
		}
	}

	public static void main(String[] args) {
		Exam2_Array singleOccurranceOfNumber = new Exam2_Array();
		int[] arr = {5,8,1,2,4,3,2,1};
		singleOccurranceOfNumber.findSingleOccurranceOfNumber(arr);
	}
}
