package sham;

public class A28_TreeHeight {
	void findNumberOfTreesVisible() {

		int[] treesHeight = { 20, 15, 30, 40, 60, 45, 70, 60, 55, 75, 80 };
		int maxtreeHeight = treesHeight[1];
		System.out.print("Visible trees to the person are: ");
		for (int i = 0; i < treesHeight.length; i++) {
			if (maxtreeHeight < treesHeight[i]) {
				maxtreeHeight = treesHeight[i];
				System.out.print( maxtreeHeight +" ");

			}

		}

	}

	public static void main(String[] args) {
		A28_TreeHeight treeHeight = new A28_TreeHeight();
		treeHeight.findNumberOfTreesVisible();

	}

}
