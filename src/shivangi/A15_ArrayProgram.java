package shivangi;

public class A15_ArrayProgram {
	void findMaxNumberFromArray(){ 
		int[] arr = {10, 99, 11, 17, 119, 113, 114};
		int maxNum = arr[0];
		for(int index=1; index<arr.length; index++){
			if(maxNum < arr[index]){
				maxNum = arr[index];
			}
		}
		System.out.println("Max number is : " + maxNum);
	}
	
	void findMinNumberFromArray(){
		int[] arr = {10, 99, 11, 17, 119, 5, 2};
		int minNum = arr[0];
		for(int index=1; index<arr.length; index++){ 
			if(minNum > arr[index]){
				minNum = arr[index];
			}
		}
		System.out.println("Minimum number is : " + minNum);
	}
	
	void findCountOfPositiveNumFromArray(){
		int[] arr = {12,-11,99,11,23,-44};
		int count = 0;
		for(int index=0; index<arr.length; index++){
			if(arr[index] > 0){
				count++;
			}
		}
		System.out.println("total count of positive num is : " + count);
	}
	
	void findSumOfPositiveNumFromArray(){
		int[] arr = {10,20,-33,-55,2};
		int sum = 0;
		for(int index=0; index<arr.length; index++){
			if(arr[index] > 0){
				sum = sum+arr[index];
			}
		}
		System.out.println("total sum of positive num is : " + sum);
	}
	
	void findSumOfAllPositiveEvenNum(){
		int[] arr = {10,13, -14, -20, 22, 3};
		int sum = 0;
		for(int index=0; index<arr.length; index++){
			if(arr[index]>0){
				if(arr[index] % 2 == 0){
					sum = sum + arr[index];
				}
			}
		}
		System.out.println("total sum of all positive even num is : " + sum);
	}
	
	void findNameWithMaxLength(){
		String[] arr = {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
		int maxStrLength = arr[0].length();
		String maxString = arr[0];
		for(int index=1; index<arr.length; index++){
			if(maxStrLength < (arr[index].length())){
				maxString = arr[index];
				maxStrLength = arr[index].length();
			}
		}
		System.out.println(maxString + "->" + maxStrLength);
	}
	
	public static void main(String[] args){
		A15_ArrayProgram a15_ArrayProgram = new A15_ArrayProgram();
		a15_ArrayProgram.findMaxNumberFromArray();
		System.out.println();
		a15_ArrayProgram.findMinNumberFromArray();
		System.out.println();
		a15_ArrayProgram.findCountOfPositiveNumFromArray();
		System.out.println();
		a15_ArrayProgram.findSumOfPositiveNumFromArray();
		System.out.println();
		a15_ArrayProgram.findSumOfAllPositiveEvenNum();
		System.out.println();
		a15_ArrayProgram.findNameWithMaxLength();
	}
}
