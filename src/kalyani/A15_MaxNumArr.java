package kalyani;

public class A15_MaxNumArr {

int []arr = {10,20,30};
	
	void MaxNum(){
		int max = arr[0];
		for(int i=0;i<arr.length;i++){
			if(max < arr[i]) {
			max=arr[i];
			}
		}	
		System.out.println("Maximum num in array is " + max);
	}
	
	public static void main(String args[]){
		A15_MaxNumArr MaxNumArr = new A15_MaxNumArr();
		MaxNumArr.MaxNum();
		
	}
}
