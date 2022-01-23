package sagarAcharya;

import java.util.Arrays;
import java.util.jar.Attributes.Name;

public class A24_String {

	public static void main(String[] args) {
		A24_String a24 = new A24_String();
		a24.findWordsAndLength("Hi Hello");
		a24.vowelsFromWords("aashvi technocredits");
		a24.arryaOfDigitsFromWords("Te1c2h C94re3");
	}
	
	void findWordsAndLength(String input) {
		String[] arr = input.split(" ");
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i] + "--" + arr[i].length());
		}
	} 
	
	int vowels(String word) {
		int count = 0;
		for(int i = 0;i<word.length();i++) {
			char ch = word.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}
	
	void vowelsFromWords(String input) {
		System.out.println("Vowel count for individual words are : ");
		String[] str = input.split(" ");
		for(int i = 0;i<str.length;i++) {
			System.out.println(str[i] + "--" + vowels(str[i]));
		}
	}
	
	String getDigits(String input) {
		String temp = "";
		for(int i = 0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(Character.isDigit(ch)) {
				temp += ch;
			}
		}
		
		return temp;
	}
	
	String[] arryaOfDigitsFromWords(String input) {
		String[] arr= input.split(" ");
		String[] a1 = new String[arr.length];
		
		for(int i =0;i<arr.length;i++) {
			a1[i] = getDigits(arr[i]);
		}
		System.out.println("New array is : " + Arrays.toString(a1));
		return a1;
	}
}

/*1. WAP to find out total words in a given string & print each word with its length
Input    : Hi Hello
Output : Total 2 words
              Hi --> 2
              Hello --> 5


2. WAP to find our total vowels in each word from the given string
Input    : aashvi technocredits
Output : aashvi --> 3
              technocredits --> 4

3. WAP to retuen array of words containing only digits.
Input    : "Te1c2h C94re3"
Output : "12" "943"

4. WAP to reverse each word on the same index
Input    : "Hi techno hello"
Output : "iH onhcet olleh"

5. WAP to convert first character of word with capital letter
Input    : "anvit harsh dipali"
Output : "Anvit Harsh Dipali"

6. WAP to reverse each word and convert first letter of each word into capital
Input    : "Vrushali Sagar Shital"
Output : "IlahsurV Ragas LatihS"

7. WAP to reverse the case of each char in a given word
Input    : "TeCHnoC*


*/