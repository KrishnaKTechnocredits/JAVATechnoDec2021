package nishika;

public class Assignment15_array {

	int maxNum() {
		int[] arr= {1010,22,25,27,909,88};
		int max = arr[0];
		
		for(int index=1; index<arr.length; index++ ) {
			if(max < arr[index])
				max=arr[index];
		}
		return max;
	}
	
	int minNum() {
		int[] arr= {20,3,5,20,10}; 
		int min = arr[0];
		
		for(int index=1; index<arr.length; index++) {
			if(min > arr[index]) 
				min=arr[index];
		}return min;
	}
	
	int returnCountOfPositiveNum() {
		 int[] arr = {12,25,-11,99,11,23,-44};
		 int count=0;
		 
		 for(int index=0; index<arr.length; index++) {
			 if(arr[index] > 0 ) 
				 count++;
		 }return count;
	}
	
	int sumOfPositiveNum() {
		int[] arr = {10,20,-33,-55,2};
		int sum=0;
		
		for(int index=0; index<arr.length; index++) {
			if(arr[index] > 0) 
				sum = sum + arr[index];
		}return sum;
	}	
	
	int sumOfEvenNumber() {
		int[] arr = {10,13, -14, -20, 22, 3};
		int evensum=0;
		
		for(int index=0; index<arr.length; index++) {
			if(arr[index] > 0 && arr[index] % 2 == 0) 
				evensum = evensum + arr[index];
		}return evensum;
	}	
	
	public static void main(String[] args) {
		Assignment15_array assignment15_array = new Assignment15_array();
		int max = assignment15_array.maxNum();
		System.out.println("max num is -> " + max);
		int min = assignment15_array.minNum();
		System.out.println("min num is -> " +min);
		int count = assignment15_array.returnCountOfPositiveNum();
		System.out.println("return count of positive num -> " +count);
		int sum = assignment15_array.sumOfPositiveNum();
		System.out.println("Sum of positive num -> " +sum);
		int evensum = assignment15_array.sumOfEvenNumber();
		System.out.println("Sum of evennumber -> " +evensum);
	}	 
}
