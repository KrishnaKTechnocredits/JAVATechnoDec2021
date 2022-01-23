package nishika;

public class A17_triplets {
	
	void findTriplet(int[] arr) {
		for (int index=0; index<=arr.length-3; index++) {
			if(arr[index]+1 == arr[index+1]  &&  arr[index+1]+1 == arr[index+2] )
				System.out.println(arr[index] + "-->" + arr[index+1] + "-->" + arr[index+2]);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		int[] arr = {10,13,14,15,16,19,20,22,23,24};
		A17_triplets a17_triplets = new A17_triplets();
		a17_triplets.findTriplet(arr);	
	}
	
}
