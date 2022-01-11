package sagarAcharya;

public class Exam_2_SagarAch {
	
	void pairsInArray(int arr[],int num) {
		//int sum = num;
		//int num1 = 0;
		//int num2 = 0;
		for(int i = 0; i<arr.length-1; i++) {
			for(int innerI = i+1; innerI<arr.length; innerI++) {
				if(num == arr[i] + arr[innerI])
					System.out.println(arr[i] + "," + arr[innerI]);
			}
		}		
		//return sum;
	}
	
	void findSingleOcc(int[] num) {
		for (int i = 0; i < num.length; i++) {
			int cnt = 0;
			for (int innerI = 0; innerI < num.length; innerI++) {
				if (num[i] == num[innerI])
					cnt++;
			}
			if (cnt == 1)
				System.out.print(num[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Exam_2_SagarAch exam2 = new Exam_2_SagarAch();
		int a[] = {5,1,2,7,6,3,4,9};
		System.out.println("Pairs with sum of given num are :");
		exam2.pairsInArray(a, 6);
		int num[] = {5,8,1,2,4,3,2,1};
		System.out.println("single occurence from given array is : ");
		exam2.findSingleOcc(num);
	}
}


/*1. How to find all pairs in an array of integers whose sum is equal to the given number*
i/p  : {5,1,2,7,6,3,4,9} , sum : 6
o/p : {5,1}, {2,4}



*2. WAP to print a single occurrence element from the array in Java?*
i/p  : {5,8,1,2,4,3,2,1}
o/p : {5,8,4,3}*/
