package ashish;

public class A17_ArrayTriplet {

	static void displayTriplets(int[] arr) {
		System.out.println(" Triplets in array are : ");
		for(int i = 1; i<arr.length-1; i++) {
			if((arr[i-1] == (arr[i]-1)) && (arr[i] == arr[i+1] -1))
					System.out.println(" " + arr[i-1] + "," + arr[i] + "," + arr[i+1]);
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,13,14,15,16,19,20,22,23,24};
		A17_ArrayTriplet.displayTriplets(arr);
	}
}
