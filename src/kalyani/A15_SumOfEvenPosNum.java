package kalyani;

public class A15_SumOfEvenPosNum {
	
	int[] arr = {10,13, -14, -20, 22, 3};
	int count ;
	int sum =0;
	 void sumPositiveNum(){
		 for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0) {
			sum = sum+ arr[i];
			}
		}	
		System.out.println("Sum of positive number in array is " + sum);
	}
	
	public static void main(String args[]){
		A15_SumOfPositiveNum count = new A15_SumOfPositiveNum();
		count.sumPositiveNum();
	}
}
