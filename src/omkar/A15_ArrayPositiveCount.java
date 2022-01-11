package omkar;



public class A15_ArrayPositiveCount {
	
	int positiveCountFromArray(int arr[]) {
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > 0)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A15_ArrayPositiveCount arrayPositiveCount = new A15_ArrayPositiveCount();
		int arr[] = {10, 8, -15, -20, 4, 17};
		System.out.println(" Count of positive numbers from array {10, 8, -15, -20, 4, 17} is : " + arrayPositiveCount.positiveCountFromArray(arr));
	}
}

