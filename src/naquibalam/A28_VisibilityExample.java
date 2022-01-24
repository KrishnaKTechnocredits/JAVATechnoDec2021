package naquibalam;

public class A28_VisibilityExample {

	String getVisibleTreeCount(int[] treeHeight) {
		
		int max = treeHeight[0];
		int count = 1;
		for (int i = 1; i < treeHeight.length; i++) {
			if (treeHeight[i] > max) {
				count++;
				max = treeHeight[i];
			}
		}
		return String.valueOf(count) + " trees are visible";
	}
	public static void main(String[] args) {
		A28_VisibilityExample a28_VisibilityExample = new A28_VisibilityExample();
		int[] arr = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80};
		System.out.println(a28_VisibilityExample.getVisibleTreeCount(arr));
	}

}
