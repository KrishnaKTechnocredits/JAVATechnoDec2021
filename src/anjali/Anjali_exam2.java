/*1. How to find all pairs in an array of integers whose sum is equal to the given number
i/p  : {5,1,2,7,6,3,4,9} , sum : 6
o/p : {5,1}, {2,4}


2. WAP to print a single occurrence element from the array in Java?
i/p  : {5,8,1,2,4,3,2,1}
o/p : {5,8,4,3}
 */
package anjali;

public class Anjali_exam2 {
	
	static void printPairsInArray(int arr [],int sum){
		for(int index=0;index<arr.length;index++){
			for(int index1=index+1;index1<arr.length;index1++){
		         if(arr[index]+arr[index1]==sum)
		        	 System.out.println("{"+arr[index]+","+arr[index1]+"}");
			}
		}
	}
		         
	static void printSingleOccrOfChar(){
	
		int arr []= {5,8,1,2,4,3,2,1};
		for(int index=0;index<arr.length;index++){
			int cnt=0;
			for(int index1=0;index1<arr.length;index1++){
				if(arr[index]==arr[index1])
					cnt++;
			}
			if(cnt==1)
				System.out.println(arr[index]);
		}
	}

	public static void main(String[] args) {
		int arr[]= {5,1,2,7,6,3,4,9};
		printPairsInArray(arr,6);
		System.out.println("*************************************");
		printSingleOccrOfChar();
	}

}