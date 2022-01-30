package sagarShrikhande.arrayAndStrings;

public class Test4_P1_Array {
	
	boolean nextElementIsSquareOfPreviousInArray(int[] arr) {
		boolean flag = true;
		for(int index=0; index<arr.length-1; index++)
			if(arr[index+1] != arr[index]*arr[index]) {
				flag=false;
				break;
			}
		
		return flag;
	}
	
	public static void main(String[] args) {
		int[] arr1= {2,4,16,256};		// expected output true
		int[]arr2 = {3,9,81,5485};     //expected output false
		Test4_P1_Array test4_P1_Array = new Test4_P1_Array();
		System.out.println(test4_P1_Array.nextElementIsSquareOfPreviousInArray(arr1));
		System.out.println(test4_P1_Array.nextElementIsSquareOfPreviousInArray(arr2));
	}

}
