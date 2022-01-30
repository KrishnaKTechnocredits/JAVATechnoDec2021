package kavleen;

public class Assignment15 {
	int count ;
	int returnMaxNum(int[] arr) {
		int max = arr[0];
		for(int index=0 ; index<arr.length;index++) {
			if(arr[index]>max) {
				max = arr[index];
			}
		}
		return max;
	}
	
	int returnMinNum(int[] arr) {
		int min = arr[0];
		for(int index=0 ; index<arr.length;index++) {
			if(arr[index]<min) {
				min=arr[index];
			}
		}
		return min;
	}
	int returnPositiveNum(int[] arr) {
		int count = 0;
		for(int index=0 ; index<arr.length;index++) {
			if(arr[index]>0) {
				count++;
			}
		}
		return count ;
	}
	
	int returnSum(int [] arr) {
		int sum = 0 ;
		for (int index=0 ; index<arr.length;index++) {
			if(arr[index]>0) {
				sum = arr[index]+sum;
			}		
		}
		return sum;
	}
	int returnEvenPositive(int [] arr) {
		int sum = 0 ;
		for(int index=0 ; index<arr.length;index++) {
			if(arr[index]%2==0) {
				if(arr[index]>0)
				sum = sum + arr[index];
			}
		}
		return sum;
	}
	
	void returnLengthName(String[] arr) {
		String max = arr[0] + "";
		for(int index=0 ; index<arr.length;index++) {
			if(arr[index].length()>max.length()) {
				max=arr[index];
			}
		}
		System.out.println("Name having maximum length in a given array : " + max);
		
	}
	public static void main (String[] args) {
		int num[] = {10,20,-33,-55,2};
		int n = num.length;
		Assignment15 assignment15 = new Assignment15();
		System.out.println("Maximum Number in Array : " +assignment15.returnMaxNum(num));
		System.out.println("Minimum Number in Array : " +assignment15.returnMinNum(num));
		System.out.println("Total positive Number in Array : " +assignment15.returnPositiveNum(num));
		System.out.println("Sum of total positive Number in Array : " +assignment15.returnSum(num));
		System.out.println("Sum of total positive Number in Array : " +assignment15.returnEvenPositive(num));
		
		String [] arr = {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
		int stringL     = arr.length;
		assignment15.returnLengthName(arr);

	}
}
