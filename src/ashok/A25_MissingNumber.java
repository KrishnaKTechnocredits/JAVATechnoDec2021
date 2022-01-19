package ashok;

public class A25_MissingNumber {
	
	void missingNumber(int[] arrNumber) {
		int n = arrNumber.length + 1;
		int expSum = (n * (n + 1) / 2);
		for (int index = 0; index < arrNumber.length; index++) {
			expSum = expSum - arrNumber[index];
		}
		System.out.println("The Missing Number from the given array is : " + expSum);
		
	}

	public static void main(String[] args) {
		A25_MissingNumber objectrefrence = new A25_MissingNumber();
		int arr[] = {1,2,3,4,6,7,8,9};
		objectrefrence.missingNumber(arr);

	}

}
