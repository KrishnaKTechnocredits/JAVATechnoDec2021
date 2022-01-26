package anvit;

public class A28_Visible_Trees {
	
	void findVisibleTrees(int[] treeHeight) {
		int maxTree = treeHeight[0];
		int count = 1;
		for(int i = 0; i<treeHeight.length;i++) {
			if(treeHeight[i]>maxTree) {
				maxTree = treeHeight[i];
				count++;
			}
		}
		System.out.println(count + " Trees are visible");
	}
	
	public static void main(String[] args) {
		A28_Visible_Trees a28_Visible_Trees = new A28_Visible_Trees();
		int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80};
		a28_Visible_Trees.findVisibleTrees(treeHeight);
	}

}
