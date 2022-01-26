package rushikesh.assign23;
//Program 1 : Find second max from given array.
//input : {1,11,3,99,66,54,22,44};
//output : 66
public class Assign23_1 {
	int findMaxNum(int [] arr) {
		int max=arr[0];
		
		for(int index=0;index<arr.length;index++) {
			if(max<arr[index]) {
				max=arr[index];
				arr[index]=0;
			}
		}
		return max;
	}
	int findNthMax(int [] arr,int num) {
		int nth = 0;
		for(int index=0;index<num;index++) {
			nth=findMaxNum(arr);
		}
		return nth;		
	}

	
	public static void main(String[] args) {
		Assign23_1 assign23_1=new Assign23_1();
		int arr[] = {1,11,3,99,66,54,22,44};
		int num1 =assign23_1.findNthMax(arr, 2);		
		System.out.println(num1);
	}
}
