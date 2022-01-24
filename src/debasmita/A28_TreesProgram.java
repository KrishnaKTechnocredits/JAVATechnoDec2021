package debasmita;

public class A28_TreesProgram {
	
	void MaxHeightTrees(int[] arr) {
		int max=arr[0];
		int count=1;
		for(int index=1;index<arr.length;index++) {
			int max1=arr[index];
			if(max1>max)
				count++;
			    max=max1;
		}
		System.out.println(count+" Trees are visible");
	}

	public static void main(String[] args) {
		 A28_TreesProgram treesprogram=new A28_TreesProgram();
		 int[] treeheight= {20,15,30,40,60,45,70,60,55,75,80};
		 treesprogram.MaxHeightTrees(treeheight);
		 
	}
}
