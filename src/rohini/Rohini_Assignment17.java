package rohini;


/*Assignment - 17 : 1st Jan'2022

Program 1: Print all triplets in which all 3 numbers are consecutive.

Sample input : int[] arr = {10,13,14,15,16,19,20,22,23,24};
output : 13 -> 14 -> 15
              14 -> 15 -> 16
              22 -> 23 -> 24 

Program 2: return String having maximum vowels from given array.
Sample input : String[] arr = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
output : aakanksha */

public class Rohini_Assignment17 {


	void findTriplets(int[] arr){

		for(int index = 0; index < arr.length-2; index++){

			if(arr[index+1]==arr[index]+1 && arr[index+2]==arr[index]+2){
				System .out.println("Consecutive numbers are : "+arr[index]+"-->"+arr[index+1]+"-->"+arr[index+2]);
			}	
		}
	}

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
		System.out.println("String having maximum vowels from given array is --> "+str);
	}


	public static void main(String[] args){
		int[] arr = {10,13,14,15,16,19,20,22,23,24};

		Rohini_Assignment17 Ass17 = new Rohini_Assignment17();
		
		Ass17.findTriplets(arr);

		String[] arr1 = {"Rohini", "Hi", "Techno", "Mayank" };
		Ass17.countVowelsInString(arr1);
	}


}
