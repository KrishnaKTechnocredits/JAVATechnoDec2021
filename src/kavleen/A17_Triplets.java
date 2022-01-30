package kavleen;

public class A17_Triplets {
	
	void Triplet(int [] arr) {
		for(int index = 0;index<arr.length-2; index++) {
			int nxtValue= arr[index+1];
			int nxtToNext= arr[index+2];
			if(nxtValue== arr[index]+1 && nxtToNext == nxtValue+1)
				System.out.println(arr[index] + "-->" + nxtValue + "-->" + nxtToNext);
		}
	}
	public static void main (String [] args) {
		A17_Triplets triplets = new A17_Triplets();
		int[] arr = {10,13,14,15,16,19,22,23,24};
		triplets.Triplet(arr);
	}
	
}
