/*Assignment-25 : 18th Jan'2022
Program 1 : Find the single missing number from the array.
int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
output: 3
 */
package anjali;

public class Anjali_Assignment25 {
	
	void findMissingNoInArray(int arr[]){
		int n=arr.length+1;
		int total=n*(n+1)/2;
		for(int index=0;index<arr.length;index++){
			total=total-arr[index];
		}
		System.out.println("The Missing no is array is : "+total);
	}
	
	              /* OR*/
	
	void findMissingNoInArray2option(int arr[]){
		int sum=0;
		int n=arr.length+1;
		int expected_sum=n*(n+1)/2;
		for(int index=0;index<arr.length;index++){
			sum=sum+arr[index];
		}
		int missingno= expected_sum-sum;
		System.out.println("The Missing no is array is : "+missingno);
	}
	
	public static void main(String[] args) {
		Anjali_Assignment25 anjali_Assignment25 = new Anjali_Assignment25();
		int arr[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
		anjali_Assignment25.findMissingNoInArray(arr);
		anjali_Assignment25.findMissingNoInArray2option(arr);
	}

}
