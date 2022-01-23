package krishna.Assignment_28;

public class Assignment28_TreeVisibility {
	static int arr[] = { 20, 15, 30, 40, 60, 45, 70, 60, 55, 75, 80 };

	static int findTrees() {
		int count = 1;
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(findTrees() + " trees are visible.");
	}
}
