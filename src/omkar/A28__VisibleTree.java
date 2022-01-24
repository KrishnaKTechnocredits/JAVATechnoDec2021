package omkar ;
public class A28__VisibleTree {

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
		A28__VisibleTree a28__VisibleTree = new A28__VisibleTree ();
		int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80};
		int output=a28__VisibleTree.countVisibleTree(treeHeight);
		System.out.println(output+" tress are visible");
	}
}
