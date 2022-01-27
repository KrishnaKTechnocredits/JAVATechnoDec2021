package shamli;

public class Test4Program1 {
	
	void findArrayIsArrayOfSquares(int [] arr)
	{
		int squarecount=0;
		for(int index=0;index<arr.length-1;index++)
		{
			
			if((arr[index]*arr[index])==arr[index+1])
				squarecount++;
		}
		if(squarecount==arr.length-1)
			System.out.println("True");
		else
			System.out.println("False");

	}

	public static void main(String[] args) {
		Test4Program1 test4program1= new Test4Program1();
		int[] arr1= {2,4,16,256};
		int[] arr2= {2,4,16,256,81};
		test4program1.findArrayIsArrayOfSquares(arr1);
		test4program1.findArrayIsArrayOfSquares(arr2);
	}
}
