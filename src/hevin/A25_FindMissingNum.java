package hevin;

public class A25_FindMissingNum {

	void findMissingEleFromArray() {
		int[] arr = {1, 2, 8, 10, 9, 5, 7, 6, 4};
		int n = arr.length+1;
		int expSum = (n*(n+1)/2);

		for(int index=0; index<=arr.length-1; index++) {
			expSum = expSum - arr[index];
		}
		System.out.println("Missing number is : " + expSum);
	}

	public static void main(String[] args) {
		A25_FindMissingNum a25 = new A25_FindMissingNum();
		a25.findMissingEleFromArray();
	}
}
