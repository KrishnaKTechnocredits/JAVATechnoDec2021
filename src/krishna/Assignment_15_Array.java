package krishna;

public class Assignment_15_Array {
	
	int maxNum_GivenArray(int[] arr){
		int max = arr[0];
		for(int i= 0; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	
	int minNum_GivenArray(int[] arr) {
		int min = arr[0];
		for(int i= 0; i < arr.length; i++) {
			if(arr[i] < min)
				min = arr[i];
		}
		return min;
	}
	
	int return_PositiveNum(int[] arr) {
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > 0)
				count++;
		}
		return count;
	}
	
	void sum_PosNum(int[] arr) {
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > 0)
				sum = sum + arr[i];
			
		}
		System.out.println("The Sum of Positive Number is : " + sum);
	}
	
	void sum_AllEven_PosNum(int[] arr) {
		int sum1 = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 ==0) 
				if(arr[i] > 0)
					sum1 = sum1 + arr[i];
		}
		System.out.println("The Sum Of All Even Positive Number is : " + sum1);
	}
	
	void maxLen_GivenArray(String[] name){
		String max = name[0] + " ";
		for(int i= 0; i < name.length; i++) {
			if(name[i].length() > max.length())
				max = name[i];
		}
		System.out.println("Name having maximum length in a given array : " + max);
	}
	
	public static void main(String[] args) {
		int num[] = {5, -10, -15, 20, 4, 6, -20};
		int n = num.length; 
		Assignment_15_Array ass15 = new Assignment_15_Array();
		System.out.println("Maximum Number in Array : " +ass15.maxNum_GivenArray(num));
		System.out.println("Minimum Number in Array : " +ass15.minNum_GivenArray(num));
		ass15.sum_PosNum(num);
		ass15.sum_AllEven_PosNum(num);
		
		String name[] =  {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
		int findStr = name.length;
		ass15.maxLen_GivenArray(name);
	}

}
