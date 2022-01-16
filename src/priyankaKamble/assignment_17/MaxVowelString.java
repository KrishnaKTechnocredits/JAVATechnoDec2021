package priyankaKamble.assignment_17;

import java.util.Arrays;
/*Program 2: return String having maximum vowels from given array.
Sample input : String[] arr = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
output : aakanksha*/

public class MaxVowelString {
	int count,maxCount=0;
	String maxVowelName="";
	
	int findVowel(String arr) {
		 arr = arr.toLowerCase();
		 count=0;
		for (int innerIndex =0 ; innerIndex< arr.length(); innerIndex++) {
			char ch = arr.charAt(innerIndex);
			if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == '0' || ch == 'u')
				count++;
			}
		System.out.println("Count of vowels in String '"+arr+ "' is - "+count );
		return count;
	}

	String findMaxVowel(String[] arr) {
		for (int index =0 ; index< arr.length; index++) {
			findVowel(arr[index]);
			if(maxCount < count) {
				maxCount = count;
				maxVowelName = arr[index]; 
			}
		}
		return maxVowelName;
	}
	
	
	public static void main(String[] args) {
		MaxVowelString  maxVowelString = new MaxVowelString();
		String[] arr = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
		System.out.println("Given String Array = " + Arrays.asList(arr)+ "\n");
		System.out.println("\nString with Maximum Vowels from Given Array is => '" + maxVowelString.findMaxVowel(arr)+"'");
	}
}
