package yogiraj;

public class Assignment28
{
	int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80};
	
	int count=0;
	
	public void visibleTree()
	{
		int max = treeHeight[0];

		for(int i=0; i<treeHeight.length; i++)
		{
			if (treeHeight[i] > max || treeHeight[i] == max) 
			{
				count++;
				
				max = treeHeight[i];
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) 
	{
		Assignment28 a = new Assignment28();
		
		a.visibleTree();
	}

}
