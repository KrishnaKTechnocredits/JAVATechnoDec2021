package priyankaKamble.assignment_16;

import java.util.Arrays;

/*Assignment - 16 : 31st Dec'2021
print count of vowels in each input from String array and print total vowels.
input : String[] arr = {"priyanka", "swati", "acharya", "hevin" }
output : priyanka -> 3
              swati -> 2
              acharya -> 3
              hevin -> 2
total vowels -> 10*/

public class VowelFromStringArray {
  int totalCount=0;int count;
  
	int printVowel(String arr) {
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
	
	int countVowels(String[] arr) {
		for (int index =0 ; index< arr.length; index++) {
			printVowel(arr[index]);
			totalCount= totalCount + count;
		}
		return totalCount;
	}
	public static void main(String[] args) {
		VowelFromStringArray vowelFromStringArray = new VowelFromStringArray();
		String[] arr = {"Priyanka", "Swati", "Acharya", "Hevin" };
		System.out.println("GIven Array is - " + Arrays.asList(arr) +"\n");
		System.out.println("\nTotal vowel count of input Array- "+vowelFromStringArray.countVowels(arr) );
	}
}
