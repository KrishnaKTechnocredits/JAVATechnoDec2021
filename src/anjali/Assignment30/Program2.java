/*2. WAP to find out unique elements from the given array an return in the form of an array.
Input    : {1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16}
Output : {1, 9, 3, 16, 59, 4}

Input    : {19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0}
Output : {19, 8, 0, 60, 56, 97, 33}
 */
package anjali.Assignment30;

import java.util.Arrays;

public class Program2 {
	int count=0;

	 int[] program2(int arr[]) 
		{
		    count=0;
			int[] output= new int [arr.length];
		    boolean flag=true;
			for(int index=0;index<arr.length;index++) 
			{
				flag=true;
				for(int index1=0;index1<count;index1++) 
				{
					if(arr[index]==output[index1]) 
					{
						flag=false;
						break;
					}
				}
					
				if(flag) 
				{
					output[count]=arr[index];
					count++;
				}
						
			}
			return output;
	    }
		
		int [] removeExtraZero(int arr[]) 
		{
			int[] output =program2(arr);
			int finalArray[]= new int [count];
			for(int index=0;index<count;index++) 
			{
				finalArray[index]=output[index];
			}
			return finalArray;
			
		}
	public static void main(String[] args) {
		Program2 program2= new Program2();
		int arr[]={1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16};
		int[] finaloutput=program2.removeExtraZero(arr);
	   System.out.println(Arrays.toString(finaloutput));
	    System.out.println("************************************");
	    int arr1[] ={19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0};
	    int[] finaloutput1=program2.removeExtraZero(arr1);
	    System.out.println(Arrays.toString(finaloutput1));
	}

}
