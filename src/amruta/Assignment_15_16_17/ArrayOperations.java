/*  Assignment - 15 : 30th Dec'2021

Write a program to satisfy below requirement. Make sure method should take Array as parameter. 

Program 1 : return maximum number from give array.
Program 2 : return minimum number from given array.
Program 3: return count of positive numbers from given array.
sample input : int[] arr = {12,-11,99,11,23,-44}
output : 4
Program 4 : return sum of positive numbers from given array.
sample input : int[] arr = {10,20,-33,-55,2};
output : 32
Program 5 : print sum of all even positive numbers from given array.
sample input : int[] arr = {10,13, -14, -20, 22, 3};
output : 32
hint : 10 + 22 = 32
Program 6 : return name having maximum length from given array.
input : String[] arr = {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
output : Abhishek  */

package amruta.Assignment_15_16_17;
public class ArrayOperations {
	
	//Program 1 : Return maximum number from give array.
	
	int printmaxnumber(int[] arr) {
		 int max = arr[0];
		for (int index = 1 ; index < arr.length ; index++) {
			if(arr[index] > max){
				max =  arr[index];
			}		
		}
		return max;
	}
	
	//Program 2 : Return minimum number from given array.
	int printminnumber(int[] arr) {
		 int min = arr[0];
		for (int index = 1 ; index < arr.length ; index++) {
			if(arr[index] < min){
				min =  arr[index];
			}		
		}
		return min;
	}
	
	/*Program 3 : Return count of positive numbers from given array.
	sample input : int[] arr = {12,-11,99,11,23,-44}
	output : 4 */
	
	int countOfPositiveNumber(int[] arr){
		int count = 0;
		for (int index = 0 ; index < arr.length ; index++) {
			if(arr[index] > 0)		
			count++;
		}
		return count;
	}
	
	/* Program 4 : return sum of positive numbers from given array.
	sample input : int[] arr = {10,20,-33,-55,2};
	output : 32 */
	
	int sumOfPositiveNumbers(int[] arr){
		int sum = 0;
		
		for(int index = 0; index < arr.length; index++){
			if(arr[index] > 0)
			sum = sum + arr[index];
		}
		return sum;
	}
	
	/* Program 5 : print sum of all even positive numbers from given array.
	sample input : int[] arr = {10,13, -14, -20, 22, 3};
	output : 32 
	hint : 10 + 22 = 32 */
	
	int sumofEvenSumNumbers(int[] arr){
		int sum = 0;
		
		for(int index = 0; index < arr.length; index++){
			if(arr[index] > 0 && arr[index] % 2 == 0)
				sum = sum + arr[index];
		}
		return sum;
	}
	
	/* Program 6 : return name having maximum length from given array.
	input : String[] arr = {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
	output : Abhishek */
	
	String maxLenString(String[] arr){
		int maxlen = 0;
		String maxlenstr = "";
		for(int index = 0; index < arr.length; index++){
			if(arr[index].length() > maxlen){
				maxlen = arr[index].length();
				maxlenstr = arr[index];
			}
		}
		return maxlenstr;
	}
	
	public static void main(String[] args) {
		int[] num = {22,35,65,88,11,23,95};
		ArrayOperations arrayoperations = new ArrayOperations();
		
		int maximumnumber = arrayoperations.printmaxnumber(num);
		System.out.println("Maximum Number is : "+ maximumnumber);
		
		System.out.println("----------------------------------------------");
		
		int minimumnumber = arrayoperations.printminnumber(num);
		System.out.println("Minimum Number is :"+ minimumnumber);
		
		System.out.println("----------------------------------------------");
		
		int[] arr = {12,-11,99,11,23,-44};
		
		int countofPositiveNum = arrayoperations.countOfPositiveNumber(arr);
		System.out.println("Count of positive Number is : "+ countofPositiveNum);
		
		
		int[] arr1 = {10,20,-33,-55,2};
		
		System.out.println("----------------------------------------------");
		
		int sumofPositiveNum = arrayoperations.sumOfPositiveNumbers(arr1);
		System.out.println("Sum of positive Numbers is : "+ sumofPositiveNum);
		
		System.out.println("----------------------------------------------");
		
		int sumofEvenPositiveNum = arrayoperations.sumofEvenSumNumbers(arr1);
		System.out.println("Sum of Even positive Numbers is : "+ sumofEvenPositiveNum);
		
		System.out.println("----------------------------------------------");
		
		String[] str = {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
		
		String temp = arrayoperations.maxLenString(str);
		System.out.println("String having maximum length is : "+ temp);
	}
}