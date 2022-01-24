package vishakha;

public class Ass25Missing_Number {
	
	void findMissingNum() {
		int[] arr = {1,2,8,10,9,5,7,6,4};
		int n = arr.length+1;
		int expSum = (n*(n+1)/2);
		//System.out.println(expSum);
		for(int index=0; index<=arr.length-1; index++) {
			expSum = expSum - arr[index];
		}
		System.out.println("Missing number between 1 to 10 is :" + expSum);
	
	}

	public static void main(String[] args) {
		Ass25Missing_Number a25 = new Ass25Missing_Number();
		a25.findMissingNum();0
		
	}
}
