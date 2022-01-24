/*  Program 2 = WAP to find our total vowels in each word from the given string
Input    : aashvi technocredits
Output : aashvi --> 3
         technocredits --> 4		*/

package amruta.Assignment_24;

class FindVowels{

	void findVowelsFromString(String str){
		
		String[] strarr = str.split(" ");
				
		for(int index = 0; index < strarr.length; index++){
			
			int vowelCount = 0;
			for(int innerindex = 0; innerindex < strarr[index].length(); innerindex++){
				
					char ch = strarr[index].charAt(innerindex);
				
					if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
						vowelCount++;
					}
			}
			System.out.println("\nIn string "+strarr[index] + " vowel count is ---> "+ vowelCount);
		}
	}

	public static void main(String[] str){
		
		String input = "aashvi technocredits";
		
		new FindVowels().findVowelsFromString(input);
	}
}