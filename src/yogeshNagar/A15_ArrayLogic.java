package yogeshNagar;

public class A15_ArrayLogic {
	
	int getMaxArray(int[] arr) {
		int maxArray = 0;
		for(int index=0;index<arr.length;index++) {
			if(maxArray<arr[index]) {
				maxArray=arr[index];
			}
		}
		return maxArray;
	}
	
	int getMinArray(int[] arr) {
		int minArray = arr[0];
		for(int index=0;index<arr.length;index++) {
			if(minArray>arr[index]) {
				minArray=arr[index];
			}
		}
		return minArray;
	}
	
	int getCountPositiveNumber(int[] arr) {		
		int count = 0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]>0) {
				count++;
			}
		}
		return count;		
	}
	
	int getSumPositiveInteger(int[] arr) {		
		int sum = 0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]>0) {
				sum=sum+arr[index];
			}
		}
		return sum;
	}
	
	int getSumPositiveEvenNumArrayElement(int[] arr) {	
		int sum = 0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]>0) {
				if(arr[index]%2==0) 
					sum=sum+arr[index];
			}
		}
		return sum;
	}
	
	String getNameMaxLength(String[] name) {	
		int maxNameLength = 0;
		String maxLengthname = null;
		for(int index=0;index<name.length;index++) {
			if(maxNameLength<name[index].length()) {
				maxNameLength = name[index].length();
				maxLengthname = name[index];
			}
		}
		return maxLengthname;
	}
	
	public static void main(String[] args) {
		A15_ArrayLogic arrLogic = new A15_ArrayLogic();
		int[] maxArray = {10,30,40,5,6,20};
		System.out.println("Maximum number in array "+arrLogic.getMaxArray(maxArray));

		int[] minArray = {10,30,40,5,6,20};
		System.out.println("Minimum number in array is " + arrLogic.getMinArray(minArray));
		
		int[] countArray = {12,-11,99,11,23,-44};
		System.out.println("Count of positive number is " + arrLogic.getCountPositiveNumber(countArray));
		
		int[] sumPositiveArray = {10,20,-33,-55,2};
		System.out.println("Sum of positive number in array "+arrLogic.getSumPositiveInteger(sumPositiveArray));
		
		int[] sumPositiveEvenArray = {10, 13, -14, -20, 22, 3};
		System.out.println("Sum of positive even number in array "+arrLogic.getSumPositiveEvenNumArrayElement(sumPositiveEvenArray));
		
		String[] name = {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
		System.out.println("Name with maximum length in array is " + arrLogic.getNameMaxLength(name));		
	}
}
