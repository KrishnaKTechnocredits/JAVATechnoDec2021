package sagarAcharya;
class A15_Array{

	public static void main(String[] args){
		A15_Array a15 = new A15_Array();
		int[] arr = {12,-11,99,11,23,-44};
		a15.getMaxNum(arr);
		a15.getMinNum(arr);
		a15.getCountOfPositiveNum(arr);
		int[] arr1 = {10,20,-33,-55,2};
		a15.getSumOfPostveNum(arr1);
		int[] arr2 = {10,13, -14, -20, 22, 3};
		a15.getSumOfEvenPostve(arr2);
		String[] arr3 = {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
		a15.getMaxLengthName(arr3);
	}
	
	int getMaxNum(int[] num){
		int maxNum = num[0];
		for(int index = 1;index<num.length;index++){
			if(maxNum < num[index]){
				maxNum = num[index];
			}
		}
		System.out.println("maximum number from given array is : "+maxNum);
		return maxNum;
	}
	
	int getMinNum(int[] num){
		int minNum = num[0];
		for(int index = 1;index<num.length;index++){
			if(minNum > num[index]){
				minNum = num[index];
			}
		}
		System.out.println("minimum number from given array is : "+minNum);
		return minNum;
	}
	
	int getCountOfPositiveNum(int[] num){
		int count = 0;
		for(int index = 0;index<num.length;index++){
			if(num[index] >= 0){
				count++;
			}
		}
		System.out.println("Count of Positive numbers from given array are : "+count);
		return count;
	}
	
	int getSumOfPostveNum(int[] num){
		int sum = 0;
		for(int index = 0;index<num.length;index++){
			if(num[index] >= 0){
				sum += num[index];
			}
		}
		System.out.println("sum of positive numbers from given array is : "+sum);
		return sum;
	}
	
	int getSumOfEvenPostve(int[] num){
		int sum = 0;
		for(int index = 0;index<num.length;index++){
			if(num[index] >= 0 && num[index]%2 == 0){
				sum += num[index];
			}
		}
		System.out.println("sum of all even positive numbers from given array is : "+sum);
		return sum;
	}
	
	String getMaxLengthName(String[] input){
		int maxLength = input[0].length();
		String maxName = input[0];
		for(int index = 1;index<input.length;index++){
			if(maxLength < input[index].length()){
				maxLength = input[index].length();
				maxName = input[index];
			}
		}
		System.out.println("name having maximum length from given array is : "+maxName);
		return maxName;
	}
}

/* Write a program to satisfy below requirement. Make sure method should take Array as parameter. 

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
output : Abhishek
 */