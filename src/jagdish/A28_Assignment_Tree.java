package jagdish;

public class A28_Assignment_Tree {
	int findtreeheight(int[] number) {
		int count = 1;
		int maxheight = number[0];
		for (int index = 1; index < number.length; index++) {
			if (maxheight < number[index]) {
				maxheight = number[index];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		A28_Assignment_Tree a28 = new A28_Assignment_Tree();
		int[] treeHeight = { 20, 15, 30, 40, 60, 45, 70, 60, 55, 75, 80 };
		System.out.println("The Total Trees are visible are: " + a28.findtreeheight(treeHeight));
	}
}
