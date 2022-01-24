package hevin;

public class A28_FindVisibleTrees {

	int countVisibleTrees(int[] height) {

		int count = 1;
		int max = height[0];

		for (int index = 1; index < height.length; index++) {
			if (height[index] > max || height[index] == max) {
				count++;
				max = height[index];
			}
		}
		System.out.println(count + " Trees are Visible.");
		return count;
	}

	public static void main(String[] a) {

		A28_FindVisibleTrees a28 = new A28_FindVisibleTrees();
		int[] height = {20, 15, 30, 40, 60, 45, 70, 60, 55, 75, 80,};
		a28.countVisibleTrees(height);

	}
}
