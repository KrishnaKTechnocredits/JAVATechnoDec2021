package kavleen;

public class Assignment23 {

	int maxNum=0;
	
	void secondMax(int[] arr){
		int max = arr[0] ;
		int second = arr[1];
		
		for (int index = 2 ; index<arr.length; index++){
			if(max<arr[index]){
			  second = max;
			  max = arr[index];
		}
		else if (second<arr[index]){
			second = arr[index];
		}
	  }
	  		System.out.println("The second largest number in the array is : " + second );
    }
	
	public static void main (String [] args){
		Assignment23 assignment23 = new Assignment23();
		int[] num = {1,11,3,99,66,54,22,44};
		assignment23.secondMax(num);
		
		
	}
}
