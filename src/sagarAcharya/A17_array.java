package sagarAcharya;
class A17_array{
	
	public static void main(String[] args){
		A17_array a17 = new A17_array();
		int[] arr = {10,13,14,15,16,19,20,22,23,24};
		a17.printTriplets(arr);
		String[] arr1 = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
		a17.getMaxVowelName(arr1);
	}
	
	void printTriplets(int[] nums){
		for(int index = 0;index<nums.length-2;index++){
			if(nums[index]+1 == nums[index+1] && nums[index]+2 == nums[index+2]){
				System.out.println("Triplets are : " + nums[index] +"-"+ nums[index+1] +"-"+ nums[index+2]);
			}
		}
	}
	
	String getMaxVowelName(String[] input){
		int maxCount = 0;
		String name = "";
		for(int index = 0;index<input.length;index++){
			int count = 0;
			for(int innerI = 0;innerI<input[index].length();innerI++){
				if(input[index].charAt(innerI) == 'a' || input[index].charAt(innerI) == 'e' || input[index].charAt(innerI) == 'i' || input[index].charAt(innerI) == 'o' || input[index].charAt(innerI) == 'u'){
					count++;
				}
			}
			if(maxCount < count){
				maxCount = count;
				name = input[index];
			}
		}
		System.out.println("String having maximum vowels from given array is : "+name);
		return name;
	}
}

/* Assignment - 17 : 1st Jan'2022

Program 1: Print all triplets in which all 3 numbers are consecutive.

Sample input : int[] arr = {10,13,14,15,16,19,20,22,23,24};
output : 13 -> 14 -> 15
              14 -> 15 -> 16
              22 -> 23 -> 24 

Program 2: return String having maximum vowels from given array.
Sample input : String[] arr = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
output : aakanksha  */
