/* Assignment - 16 : 31st Dec'2021

print count of vowels in each input from String array and print total vowels.
input : String[] arr = {"priyanka", "swati", "acharya", "hevin" }
output : priyanka -> 3
              swati -> 2
              acharya -> 3
              hevin -> 2
total vowels -> 10	*/

package amruta.Assignment_15_16_17;
class Vowels{
	
	void countVowels(String[] arr){
		int totalvowelCount = 0;		
		for(int index = 0; index < arr.length; index++){
			int vowelvount = 0;
			for(int innerindex = 0; innerindex < arr[index].length(); innerindex++){
				char ch = arr[index].charAt(innerindex);
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
					vowelvount++;
					totalvowelCount++;
				}
			}
			System.out.println("Vowels count in given string "+arr[index]+" is --> "+vowelvount);
		}
		System.out.println("Total Vowels count is --> "+totalvowelCount);
	}
	
	public static void main(String[] args){
		String[] arr = {"priyanka", "swati", "acharya", "hevin" };
		
		Vowels vowels = new Vowels();
		vowels.countVowels(arr);
	}
}