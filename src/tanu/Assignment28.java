package tanu;

class Assignment28 {
	
	void visibleTress(int[] input) {
		int fronttree = 0;
		int backtree = 0;
		int count = 0;
		for(int index=0;index<input.length;index++)
		{
			backtree = input[index];
			if(fronttree<backtree)
			{
				count++;
				fronttree = backtree;
			}
		}
		System.out.println(count);
		
	}
	
	public static void main(String[] args)
	{
		Assignment28 assignment = new Assignment28();
		int[] treeHeight = {20, 15, 30, 40, 60, 45 ,70, 60, 55, 75, 80};
		assignment.visibleTress(treeHeight);
	}
}