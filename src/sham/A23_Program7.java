/*Program 7 : Verify if 2 arrays are identical.

int[] arr1 = {10,44,-33};
int[] arr2 = {10,44,-33};

output : both arrays are identical.

int[] arr3 = {10,44,-33};
int[] arr4 = {10,44,-33,55};

output : both arrays are not identical.
 */
package sham;

public class A23_Program7 {

	void checkArrayIdentical(int arr1[], int arr2[]) {
		boolean flag = false;
		if (arr1.length == arr2.length) {
			for (int index=0; index< arr1.length;index++) {
				flag = false;
				if (arr1[index] == arr2[index])
					flag = true;
				}
		}
		 else {
	    	   System.out.println("The mentioned array are not identical because length not matched");
		 }	
		if (flag == true) 
			System.out.println("The mentioned array are identical");
		else 
			System.out.println("The mentioned array are not identical");	
     
	}
	
	public static void main(String[] args) {
		A23_Program7 program7 = new A23_Program7();
		int[] arr1 = { 10, 44, -33};
		int[] arr2 = { 10, 44, -33 };
		program7.checkArrayIdentical(arr1, arr2);		
      
	}

}
