/*
 Programming Test - 5 : 9th Feb'2022 

Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are. Return the total number of matching pairs of socks that a person can have

Example:

Input :  9 10 20 20 10 10 30 50 10 20

Output : 3

Input : 100 200 300 100 400 400 500 600

Output : 2

Hint : Use HashMap
 */
package anjali;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Anjali_Test_5 {

	static int TreeMap(Integer arr[]) 
	{
		TreeMap<Integer,Integer> map= new TreeMap<Integer,Integer>();
		for(int index=0;index<arr.length;index++) 
		{
			
			if(map.containsKey(arr[index])) 
				map.put(arr[index], map.get(arr[index])+1);
			else
				map.put(arr[index], 1);
		}
		
		int count=0;
	     for(int num:map.values()) 
	     {
	    	count=count+(num/2);
	     }
        
		return count;
	}
	
	public static void main(String[] args) {
		Integer[] colorcode = { 9, 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		int output=TreeMap(colorcode);
		System.out.println(output);
		
		Integer[] colorcode1 = { 100 ,200 ,300, 100, 400, 400, 500 ,600 };
		int output1=TreeMap(colorcode1);
		System.out.println(output1);

	}

}

