/*  Assignment-25 : 18th Jan'2022

*Program 1 : Find the single missing number from the array.*
int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
output: 3

*Try for multiple missing numbers in the same array*    */

package amruta.Assignment_25;

class MisiingNumber{
	
	void findMissingNum(int[] arr){
		
		int n = arr.length+1;
		int excpectSum = (n*(n+1)/2);
		
		for(int index = 0; index < arr.length; index++){
			excpectSum = excpectSum - arr[index];
		}
		System.out.println("\nSingle Missing Number from Given Array is - "+excpectSum);
	}
	
	public static void main(String[] args){
		
		int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
		new MisiingNumber().findMissingNum(num);
	}
}