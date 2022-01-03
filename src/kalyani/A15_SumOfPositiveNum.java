package kalyani;

public class A15_SumOfPositiveNum {

	int[] arr = {10,20,-33,-55,2};
	int count ;
	int sum =0;
	 void sumPositiveNum(){
	 
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0) {
			count++;
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
