package krishna.Assignment_23_StringArray;

public class Assignment_23_FindNumber_String {

	int maxNum(int[] arr) {
		int max = 0;
		int temp = 0;
		for (int index = 0; index < arr.length; index++) {
			if (max < arr[index]) {
				max = arr[index];
				temp = index;
			}
		}
		arr[temp] = 0;
		return max;
	}

	void printMax(int[] arr, int n) {
		int found = 0;
		for (int i = 1; i <= n; i++) 
			found = maxNum(arr);
		System.out.println("The Second Highest Number : " +found);
	}
	
	public static void main(String[] args) {
		int[] arr = { 10, 5, 13, 25, 54, 66, 3 };
		Assignment_23_FindNumber_String ass23 = new Assignment_23_FindNumber_String();
		ass23.printMax(arr, 2);
	}
}
