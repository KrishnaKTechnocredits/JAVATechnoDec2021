package yogeshNimbalkar;

public class Exam2 {

	void displayUniqueNumber(int[] arr) {
		//int count = 0;
		for(int index=0; index<arr.length; index++) {
			int count =0;
			for(int innerindex=0; innerindex<arr.length; innerindex++) {
				if(arr[index] == arr[innerindex])
					count++;
			}
			if(count==1) {
				System.out.print(arr[index] + " ");
			}
		}
	}
	
	void displayPairs(int[] arr, int sum) {
		for(int index=0; index<arr.length-1; index++) {
			for(int innerindex=index+1; innerindex<arr.length; innerindex++) {
				if(sum == (arr[index] +arr[innerindex] ))
					System.out.println("{" + arr[index] +" , " + arr[innerindex] + "}");			
			}
		}
	}
	
	public static void main(String[] args) {
		Exam2 exam2 = new Exam2();
		int[] input = {5,8,1,2,4,3,2,1};
		System.out.println("Unique numbers in giver array :");
		exam2.displayUniqueNumber(input);
		System.out.println("\nPairs with sum is 6 : ");
		int[] input1 = {5,1,2,7,6,3,4,9};
		exam2.displayPairs(input1,6);
	}
}
