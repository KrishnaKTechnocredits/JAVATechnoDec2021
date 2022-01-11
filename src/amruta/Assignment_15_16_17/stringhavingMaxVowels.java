/*  Assignment - 17 : 1st Jan'2022

Program 2: return String having maximum vowels from given array.
Sample input : String[] arr = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
output : aakanksha

*/

package amruta.Assignment_15_16_17;
class stringhavingMaxVowels{
	
	void countVowelsInString(String[] arr){
		int vcount = 0;
		String str = "";
		
		for(int index = 0; index < arr.length; index++){
			int vowelCount = 0;
			
			for(int innerindex = 0; innerindex < arr[index].length(); innerindex++){
			
				char ch = arr[index].charAt(innerindex);
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
					vowelCount++;
				}
			}
			if(vcount < vowelCount){
				vcount = vowelCount;
				str = arr[index];
			}
		}
		System.out.println("String having maximum vowels from given array is "+str);
	}
	
	public static void main(String[] args){
		String[] input = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
		
		stringhavingMaxVowels maxvowels = new stringhavingMaxVowels();
		maxvowels.countVowelsInString(input);
	}
}