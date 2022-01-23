package sagarAcharya;
import java.util.Scanner;

class A16_P2_VowelsInArray{
	
	public static void main(String[] args){
		A16_P2_VowelsInArray a16 = new A16_P2_VowelsInArray();
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter name on which you need vowel count.");
		//String s = sc.next();
		//a16.getVowels(s);
		String[] arr = {"priyanka", "swati", "acharya", "hevin" };
		a16.findVowelsInArray(arr);
	}
	
	int getVowels(String name){
		int count = 0;
		for(int index = 0;index<name.length();index++){
			if(name.charAt(index) == 'a' || name.charAt(index) == 'e' || name.charAt(index) == 'i' || name.charAt(index) == 'o' || name.charAt(index) == 'u'){
				count++;
			}
		}
		//System.out.println(name + "--" + count);
		return count;
	}
	
	void findVowelsInArray(String[] input){
		int cnt = 0;
		for(int index = 0;index<input.length;index++){
			int temp = getVowels(input[index]);
			System.out.println(input[index] + "--" + temp);
			cnt += temp;
		}
		System.out.println("Total count of vowels are : "+cnt);
	}
	
}

/* Assignment - 16 : 31st Dec'2021

print count of vowels in each input from String array and print total vowels.
input : String[] arr = {"priyanka", "swati", "acharya", "hevin" }
output : priyanka -> 3
              swati -> 2
              acharya -> 3
              hevin -> 2
total vowels -> 10
 */