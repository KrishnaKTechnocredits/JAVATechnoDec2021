package kalyani;

public class A15_MinNumArr {
	
int []arr = {10,20,30};
	
	void MinNum(){
		int min = arr[0];
		for(int i=0;i>arr.length;i++){
			if(min < arr[i]) {
			min=arr[i];
			}
		}	
		System.out.println("Minimum num in array is " + min);
	}
	
	public static void main(String args[]){
		A15_MinNumArr MinNumArr = new A15_MinNumArr();
		MinNumArr.MinNum();
	}
}
