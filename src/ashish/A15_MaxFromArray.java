package ashish;

public class A15_MaxFromArray {

	int maxNumberFromArray(int arr[]) {
		int maxNumber = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(maxNumber < arr[i])
				maxNumber = arr[i];
		}
		return maxNumber;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A15_MaxFromArray maxFromArray = new A15_MaxFromArray();
		int arr[] = {10, 8, 15, 20, 4, 17};
		System.out.println(" Max number from array {10, 8, 15, 20, 4, 17} is : " + maxFromArray.maxNumberFromArray(arr));
	}
}
