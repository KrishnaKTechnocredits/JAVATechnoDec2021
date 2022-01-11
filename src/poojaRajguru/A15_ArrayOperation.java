package poojaRajguru;

public class A15_ArrayOperation {
	public static void main(String[] ags){
		A15_ArrayOperation ao = new A15_ArrayOperation();
		int ans = ao.maxNumber();
		System.out.println("Maximum number from given array is : " +  ans);
		int ans1 = ao.minNumber();
		System.out.println("Minimum number from given array is : " + ans1);
		int sum = ao.sumOfPositiveNumbers();
		System.out.println("Sum of positive numbers from given array is : " + sum);
		int even=ao.evenNumberSum();
		System.out.println("Sum of even positive numbers from given array is : " + even);
		int count = ao.positiveCount();
		System.out.println("Count of positive numbers from given array is : " + count);
		String[] strArr = {"Karan", "Shweta", "Pallavi","Abhishek", "Sagar"};
		System.out.println("Name with maximum length in given array is : " + ao.maxLengthString(strArr));
	}

	int minNumber(){
		int min =0;
		int[] arr = {10,20,30,40,50,5,90};
		for(int i =0;i<arr.length;i++){
			for(int j = 1;j<arr.length;j++){
				if(arr[i]>arr[j])
					min = arr[j];
			}
		}
		return(min);
	}

	int maxNumber(){
		int max =0;
		int[] arr = {10,20,30,40,50,5,90};
		for(int i =0;i<arr.length;i++){
			for(int j = 1;j<arr.length;j++){
				if(arr[i]<arr[j])
					max = arr[j];
			}
		}
		return(max);
	}

	int sumOfPositiveNumbers(){
		//int avg = 0;
		int sum =0;
		int[] arr = {12,-11,99,11,23,-24};
		//int length = arr.length;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				sum=sum+arr[i];
			}
		}
		return(sum);
	}

	int evenNumberSum(){
		int evenSum=0;
		int[] arr = {10,13,-14,-20,22,3};
		for(int i=0;i<arr.length;i=i+2){ 
			if(arr[i]>0){
				evenSum=evenSum+arr[i];
			}
		}
		return(evenSum);	
	}

	int positiveCount(){
		int count=0;
		int arr[]={12,-11,99,11,23,-44};
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				count++;
			}
		}
		return(count);	
	}

	String maxLengthString(String[] input) {
		int maxLength = input[0].length();
		String name = input[0];
		for(int index=1; index<input.length; index++)
			if(maxLength < input[index].length()) {
				maxLength = input[index].length();
				name = input[index];
			}
		return name;
	}

}

