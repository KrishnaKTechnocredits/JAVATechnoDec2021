package priya;

public class SumOfPairs {
	
	static void getPairSum(int[] arr, int sum)
    {
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum) {
                	System.out.println("{" +arr[i]+ "," +arr[j]+ "}");  
                }
    }
	
	public static void main(String args[])
	    {
	        int[] arr ={5,1,2,7,6,3,4,9};
	        int sum = 6;
	        getPairSum(arr, sum);
	    }	    
}

