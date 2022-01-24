package rushikesh;
//Assignment-25 : 18th Jan'2022
//
//Program 1 : Find the single missing number from the array.
//int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
//output: 3
public class Assignment25 {
	int sum,sum1,result=0;
	 void sumOfFirst10NaturalNumbers(){
      for(int i=0;i<=10;i++){
	    sum=sum+i;
      }
	 }
	 void sumOfArray(int[] arr){
		 for(int index=0;index<arr.length;index++){
			 sum1=sum1+arr[index];
		 }
		 result=sum-sum1;
		 System.out.println("The missing number is:" +result);
	 }
	public static void main(String[] args) {
		Assignment25 assignment25=new Assignment25();
		assignment25.sumOfFirst10NaturalNumbers();
		int[] a={ 1, 2, 8, 10, 9, 5, 7, 6, 4 };
		assignment25.sumOfArray(a);
	}
}
