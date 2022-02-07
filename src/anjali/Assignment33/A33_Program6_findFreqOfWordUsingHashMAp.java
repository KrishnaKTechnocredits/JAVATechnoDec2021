/*
Program 6: 
Find all character frequency from each name given in String array.
Input : Array -> {"raj", "aarya", "aavruti", "shruti","raj", "aarya"}
 */
package anjali.Assignment33;

import java.util.HashMap;

public class A33_Program6_findFreqOfWordUsingHashMAp {
	
	static HashMap <String,Integer> findFreqOfWordUsingHashMAp(String[] arr) 
	{
		HashMap<String,Integer> hashmap = new HashMap<>();
		for(int index=0;index<arr.length;index++)
		{
			String s=arr[index];
			if(hashmap.containsKey(s))
				hashmap.put(s, hashmap.get(s)+1);
			else
		        hashmap.put(s, 1);
		}
		return hashmap;
		
	}

	public static void main(String[] args) {
		String arr[] ={"raj", "aarya", "aavruti", "shruti","raj", "aarya"};
		HashMap <String,Integer> output	=findFreqOfWordUsingHashMAp(arr);
		System.out.println(output);

	}

}
