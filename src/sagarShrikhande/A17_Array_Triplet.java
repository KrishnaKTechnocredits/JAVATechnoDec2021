package sagarShrikhande;

public class A17_Array_Triplet {
	
	void findTripletInArray(int[] arr) {
		boolean flag =true;
		if(arr.length >=3) {
			for(int index =0; index< arr.length-2; index++) {
				if(arr[index+2]-arr[index+1]== 1 && arr[index+1]-arr[index] ==1) {
					System.out.println(arr[index] + " -> "+arr[index+1]+" -> "+arr[index+2]);
					flag =false; 
				}
			}
			if(flag== true)
				System.out.println("No consecutive triplet in array input");
		}
		else
			System.out.println("Invalid input: array should have atleast 3 elements");
	}
	
	public static void main(String[] args) {
		A17_Array_Triplet a17_Array_Triplet = new A17_Array_Triplet();
		int[] arr = {10,13,14,15,16,19,20,22,23,24};
		a17_Array_Triplet.findTripletInArray(arr);
	}
}

/*Assignment - 17 : 1st Jan'2022
Program 1: Print all triplets in which all 3 numbers are consecutive.

Sample input : int[] arr = {10,13,14,15,16,19,20,22,23,24};
output : 13 -> 14 -> 15
              14 -> 15 -> 16
              22 -> 23 -> 24 
*/