package yogeshNimbalkar;

import java.util.Arrays;

// verify the 2 arrays are identical
public class A23_ArrayIdentical {

	//Approach - 1
	boolean checkArrayIdentical(int[] arr1, int[] arr2) {
		boolean flag = true;
		if(arr1.length == arr2.length) {
			for(int index=0; index<arr1.length; index++) {
				if(arr1[index] != arr2[index]) {
					flag = false;
					break;
				}
			}
		}else {
			flag = false;
		}
		return flag;
	}
	
	//Approach - 2
	boolean checkArrayIdentical1(int[] arr1, int[] arr2) {
		String str1 = Arrays.toString(arr1);
		String str2 = Arrays.toString(arr2);
		boolean flag = str1.equals(str2);
		return flag;
	}
	
	public static void main(String[] args) {
		A23_ArrayIdentical arrayIdentical = new A23_ArrayIdentical();
		int[] input1 = {10,44,-33};
		int[] input2 = {10,44,-33};
		System.out.println("Is Given array identitical : " + arrayIdentical.checkArrayIdentical(input1, input2));
		System.out.println("Is Given array identitical : " + arrayIdentical.checkArrayIdentical1(input1, input2));
	}
}
