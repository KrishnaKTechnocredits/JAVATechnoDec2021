package yogeshNimbalkar;

public class A28_TreesVisible {

	int getTreeVisibleCount (int[] arr) {
		int maxHeight = 0;
		int count=0;
		for(int index=0; index<arr.length; index++) {
			if(maxHeight < arr[index]) {
				maxHeight = arr[index];
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		A28_TreesVisible treesvisible = new A28_TreesVisible();
		int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80};
		System.out.println("Number of tree visible : " + treesvisible.getTreeVisibleCount(treeHeight));
	}
}
