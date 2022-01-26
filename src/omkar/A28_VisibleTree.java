package omkar;

public class A28_VisibleTree {

	int  countVisibleTree(int arr[]){
		int cnt=0;
		int maxhight=0;
		for(int index=0;index<arr.length;index++)
		{
			if(arr[index]>maxhight)
			{
				maxhight=arr[index];
				cnt++;
			}
		}
		return cnt;

	}

	public static void main(String[] args) {
		A28_VisibleTree a28_VisibleTree = new A28_VisibleTree ();
		int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80};
		int output=a28_VisibleTree.countVisibleTree(treeHeight);
		System.out.println(output+" tress are visible");
	}
}
