package yogeshNagar;

public class A28_TreeLogic {

	void getTreeCount(int[] treeHeight) {
		int max=0;
		int count=0;
		for(int index=0;index<treeHeight.length;index++) {
			if(max<treeHeight[index]) {
				max=treeHeight[index];
				count++;
			}
		}
		System.out.println(count+" Trees are visible");
	}
	public static void main(String[] args) {
		A28_TreeLogic treeLogic = new A28_TreeLogic();
		
		int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80};
		treeLogic.getTreeCount(treeHeight);
	}
}