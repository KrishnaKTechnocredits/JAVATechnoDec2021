package swati;

public class A28_Tree {

	public static void main(String[] args) {
		int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80};
		int max=0;
		int cnt=0;
		for(int i=1;i<treeHeight.length;i++) {
			if(max<treeHeight[i]) {
				max=treeHeight[i];
				cnt++;
			}
			
		}
		System.out.println("No of trees visible "+cnt);
	}

}
