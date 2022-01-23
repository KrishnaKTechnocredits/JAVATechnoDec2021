package anvit;

public class A25_Single_Missing_Number {
	
	void missingNumber(int[] arr) {
		int num = arr.length +1;
		int expSum = (num*(num+1)/2);
		for(int i = 0; i<arr.length;i++) {
			expSum = expSum - arr[i];
		}
		System.out.println(expSum);
	}
	
	public static void main(String[] args) {
		A25_Single_Missing_Number a25_Single_Missing_Number = new A25_Single_Missing_Number();
		int[] num = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
		a25_Single_Missing_Number.missingNumber(num);
	}
}
