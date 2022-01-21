package poojaRajguru;

public class A25_FindMissingNumberFromArray {
	
	void findMissingNumberFromArray(int[] arr) {
		int len = arr.length + 1;
		int num = (len * (len+1) / 2);
		for(int index = 0;index<arr.length;index++) {
			num = num - arr[index];			
		}
		System.out.println("The Missing Number From Given Array is : " + num);
		
	}
	public static void main(String[] args) {
		A25_FindMissingNumberFromArray find = new A25_FindMissingNumberFromArray();
		int[] arr = {1,2,4,8,9,6,5,7,10};
		find.findMissingNumberFromArray(arr);
	}

}
