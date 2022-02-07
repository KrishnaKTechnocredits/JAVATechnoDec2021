/*
Program 7: 
Return the frequency of each numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]

 */
package anjali.Assignment33;

import java.util.TreeMap;

public class A33_Program7_findFreqOfNumberUsingTreeMap {
	
	static TreeMap<Integer,Integer> findFreqOfNumberUsingTreeMap(int arr[]) 
	{
		TreeMap<Integer,Integer> treemap= new TreeMap<Integer,Integer>();
			for(int index=0;index<arr.length;index++)
			{
				if(treemap.containsKey(arr[index]))
					treemap.put(arr[index],treemap.get(arr[index])+1);
				else
					treemap.put(arr[index], 1);
			}
			return treemap;
		
	}

	public static void main(String[] args) {
		int arr[]= {1,8,6,3,4,5,2,3,6,9,8,4};
		TreeMap<Integer,Integer> output =findFreqOfNumberUsingTreeMap(arr);
		System.out.println(output);

	}

}
