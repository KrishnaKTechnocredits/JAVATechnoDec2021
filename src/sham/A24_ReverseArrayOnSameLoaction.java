package sham;

public class A24_ReverseArrayOnSameLoaction {

	String reverseString(String name)
	{
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		
		return rev;
	}
	void reverseArrayOnSameLoaction()
	{
		String input  = "Hi techno hello";
		
	String arr[]=	input.split(" ");
	String reverseArray="";
	for(int i=0;i<arr.length;i++)
	{
		reverseArray=reverseArray+reverseString(arr[i])+" ";
	}
	System.out.println("Reverse Array is: "+reverseArray.trim());
	}
	
	public static void main(String[] args) {
		A24_ReverseArrayOnSameLoaction reverseArray= new A24_ReverseArrayOnSameLoaction();
		String input  = "Hi techno hello";
		reverseArray.reverseArrayOnSameLoaction();
	}

}
