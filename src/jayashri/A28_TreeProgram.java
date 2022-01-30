package jayashri;

public class A28_TreeProgram {
	int treeCount(int[] newArray) {
		int count = 1;
		int maxHeight = newArray[0];
		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i] > maxHeight) {
				maxHeight = newArray[i];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		A28_TreeProgram a28_treeprogram = new A28_TreeProgram();
		int[] treeArray = { 20, 15, 30, 40, 60, 45, 70, 60, 55, 75, 80 };
		System.out.println("The count of visible trees : " + a28_treeprogram.treeCount(treeArray));
	}
}
