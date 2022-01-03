package kalyani;

public class A15_CountOFPositiveNum {
	
	int[] arr = {12,-11,99,11,23,-44};
	 int count ;
	 void countPositiveNum(){
	 
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0) {
			count++;
			}
		}	
		System.out.println("Count of positive number in array is " + count);
	}
	
	public static void main(String args[]){
		A15_CountOFPositiveNum count = new A15_CountOFPositiveNum();
		count.countPositiveNum();
	}
}
