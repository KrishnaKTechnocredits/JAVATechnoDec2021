/*
 * Assignment - 15 : 30th Dec'2021

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
output : Abhishek
 */
package anjali;

public class Anjali_Assignment15 {
	int maxNumber(){
		int[] arr = {12,-11,99,11,23,-44};
		int max=arr[0];
		for(int index=1;index<arr.length;index++) {
			if(arr[index]>max)
				max=arr[index];
		}
		return max;
	}
	
	int minNumber(){
		int[] arr = {12,-11,99,11,23,-44};
		int min=arr[0];
		for(int index=1;index<arr.length;index++) {
			if(arr[index]<min)
				min=arr[index];
		}
		return min;
	}
	
	int sumOfPostiveNumber(){
		int[] arr = {10,20,-33,-55,2};
        int sum=0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]>0)
				sum=sum+arr[index];
		}
		return sum;
	}
	
	int countOfPostiveNumber(){
		int[] arr = {12,-11,99,11,23,-44};
        int count=0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]>0)
				count++;
		}
		return count;
	}
	
	void sumOfEvenPostiveNumber(){
		 int[] arr = {10,13,-14,-20,22,3};
        int sum=0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]>0) {
				if(arr[index]%2==0) 
					sum=sum+arr[index];
            }	
		}
		System.out.println("sum of all even positive numbers from given array is : "+sum );
	}
	
	String nameMaxlength(){
		String[] arr = {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
		String name="";
		int maxlength= arr[0].length();
		for(int index=1;index<arr.length;index++){
			if(arr[index].length()> maxlength) {
				maxlength=arr[index].length();
			    name=arr[index];
			}
		}
		return name;
	}
	
    
	public static void main(String[] args) {
		 Anjali_Assignment15 a15= new  Anjali_Assignment15();
		 int maxNumber=a15.maxNumber();
		 System.out.println("The maximum no is given array is : "+maxNumber);
		 int minNumber= a15.minNumber();
		 System.out.println("The minimum no is given array is : "+minNumber);
		 int sum=a15.sumOfPostiveNumber();
		 System.out.println("The sum of of postive elements in array is : "+sum);
		 int count=a15.countOfPostiveNumber();
		 System.out.println("The count of postive elemnts in array is : "+count);
		 a15.sumOfEvenPostiveNumber();
		 String maxName=a15.nameMaxlength();
		 System.out.println( maxName);
	}
}
