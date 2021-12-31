package jayashri;

public class A15_Array {

	void maxNumber(int[] maxNum){
		int max = maxNum[0];
		for(int index=1;index<maxNum.length;index++)
			if(max < maxNum[index]){
				max = maxNum[index];	
		}
		System.out.println("Maximum number from array is: "+max);
	}
	
	void minNumber(int[] minNum){
		int min = minNum[0];
		for(int index=1;index<minNum.length;index++)
			if(min > minNum[index]){
				min = minNum[index];	
		}
		System.out.println("Minimum number from array is: "+min);
	}
	
	void countOfPostive(int[] countP){
		int count = 0;
		for(int index=0; index < countP.length; index++){
			if(countP[index] >= 0)
				count++;			
		}
		System.out.println("Total count of postive number from array is: "+count);
	}
	
	void sumOfPostive(int[] sumP){
		int sum = 0;
		for(int index=0; index < sumP.length; index++){
			if(sumP[index] >= 0)
				sum = sum + sumP[index];			
		}
		System.out.println("Total sum of postive numbers from array is: "+sum);
	}
	
		void sumOfEven(int[] sumE){
		int sum2 = 0;
		for(int index=0; index < sumE.length; index++){
			if(sumE[index] >= 0){
			if(sumE[index]%2 == 0)
				sum2 = sum2 + sumE[index];	
			}
		}
		System.out.println("Total sum of even positive numbers from array is: "+sum2);
	}
	
	void maxLength(String[] maxl){
		int test = maxl[0].length();
		String str = maxl[0];
		for(int index=1; index < maxl.length; index++){
			if(maxl[index].length() > test){
					test = maxl[index].length();
					str = maxl[index];
					
			}
		}
		System.out.println("Name having maximum length from given array: "+str);
	}
	
	public static void main(String[] args){
		A15_Array a15_array = new A15_Array();
		int[] arr1 = {10,3,25,35,17};
		int[] arr2 = {12,-11,99,11,23,-44};
		int[] arr3 = {10,20,-33,-55,2};
		int[] arr4 = {10,13, -14, -20, 22, 3};
		String[] arr5 = {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
		a15_array.maxNumber(arr1);
		a15_array.minNumber(arr1);
		a15_array.countOfPostive(arr2);
		a15_array.sumOfPostive(arr3);
		a15_array.sumOfEven(arr4);
		a15_array.maxLength(arr5);
		
	}
}
