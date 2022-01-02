package vishakha;

public class A17_ArrayTriplets {
	void printTriplets(int[] arr) {
		System.out.println("Triplets in which all 3 numbers are consecutive in given array: ");
		for(int index = 0; index<arr.length-2;index++) {
			if(arr[index]+1 == arr[index+1] && arr[index]+2 == arr[index+2])
				System.out.println(arr[index]+"->"+arr[index+1]+"->"+arr[index+2]);
		}
	}
	public static void main(String[] args) {
		int[] arr = {10,13,14,15,16,19,20,22,23,24};
		A17_ArrayTriplets a17 = new A17_ArrayTriplets();
		a17.printTriplets(arr);
	}
	
}
