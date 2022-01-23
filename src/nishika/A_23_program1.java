package nishika;

 		/* * Find second max from given array.
		input : {1,11,3,99,66,54,22,44};
		output : 66 */
 
public class A_23_program1 {
		
	void findSecondMax(int[] arr) {
		
		int max = arr[0];
		int secondMax = arr[1];
		
		if(arr[0] > arr[1]) {
			max=arr[0];
			secondMax=arr[1];
		}
		
		for(int index=2; index<arr.length; index++) {
			if(max<arr[index]) {
				secondMax=max;
				max=arr[index];
			}
			else if(max>arr[index] && secondMax<arr[index]) {
				secondMax=arr[index];
			}
		}
		System.out.println("secondMax num is-->"+secondMax );
	}
	
	public static void main(String[] args) {
		A_23_program1  a_23_Program1 = new A_23_program1 ();
		int[] arr = {1,11,3,99,66,54,22,44};
		a_23_Program1.findSecondMax(arr);	
	}
}
