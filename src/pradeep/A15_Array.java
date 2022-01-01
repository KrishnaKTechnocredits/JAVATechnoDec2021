package pradeep;

public class A15_Array {
	
	//Program 1 : return maximum number from give array.	
	int returnMaxNum(int[] num) {
		int max=num[0];
		for(int index=1; index<num.length; index++) {
			if(max<num[index]) {
				max=num[index];
			}
		}
		return max;
	}
	
	//Program 2 : return minimum number from give array.	
	int returnMinNum(int[] num) {
		int min=num[0];
		for(int index=1; index<num.length; index++) {
			if(min>num[index]) {
				min=num[index];
			}
		}
		return min;
	}
	
	//Program 3 : return count of positive number from give array.	
	int countPosNum(int[] num) {
		int countPos=0;
		
		for(int index=0; index<num.length; index++) {
			if(num[index]>0) {
				countPos++;
			}
		}
		return countPos;
	}
	
	//Program 4 : return sum of positive numbers from given array.
	int sumOfPosNum(int[] num) {
		int sum=0;
		
		for(int index=0; index<num.length; index++) {
			if(num[index]>0) {
				sum=sum + num[index];
			}				
		}
		return sum;
	}
	
	//Program 5 : print sum of all even positive numbers from given array.
	int sumOfEvenPosNum(int[] num) {
		int sum=0;
		
		for(int index=0; index<num.length; index++) {
			if(num[index]>0 && num[index]%2==0) {
				sum=sum + num[index];
			}				
		}
		return sum;
	}
	
	// Program 6 : return name having maximum length from given array.
	String getMaxLengthString(String[] arr) {
		int max = arr[0].length();
		String maxString=arr[0];
		
		for(int index=1; index<arr.length; index++) {
			if(max<arr[index].length()) {
				max=arr[index].length();
				maxString=arr[index];
			}
		}
		return maxString;
	}
		
	public static void main(String[] args) {
		int num[] = {10, 14, 12, -50, 15, 17,-18};
		String[] arr = {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
		A15_Array a15_Array =new A15_Array();
		
		int max = a15_Array.returnMaxNum(num);
		System.out.println("Maximum number in given array: " + max);
		int min = a15_Array.returnMinNum(num);
		System.out.println("Minimum number in given array: " + min);
		int countPos = a15_Array.countPosNum(num);
		System.out.println("No of positive number is: " + countPos);
		int sumPos = a15_Array.sumOfPosNum(num);
		System.out.println("sum of positive number is: " + sumPos);
		int sumEvenPos = a15_Array.sumOfEvenPosNum(num);
		System.out.println("sum of Even positive number is: " + sumEvenPos);
		String maxString = a15_Array.getMaxLengthString(arr);
		System.out.println("Maximum length string in given array is " + maxString);
	}
}
