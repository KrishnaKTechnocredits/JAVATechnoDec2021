package anjali.Exam4;

public class Exam4_program1 {
	static boolean checkNextNoIsSquare(int[] arr)
	{
		boolean flag=true;
		
		for(int index=0;index<arr.length-1;index++) 
		{
			if((arr[index]*arr[index])!=arr[index+1]) 
			{
				flag =false;
				break;
			}
        }
	return flag;
	}

	public static void main(String[] args) {
		int[] arr= {2,4,16};
		boolean output=checkNextNoIsSquare(arr);
		System.out.println(output);
	}

}
