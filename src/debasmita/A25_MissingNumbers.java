package debasmita;

public class A25_MissingNumbers {
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
	 public static void main(String[] args){
	    A25_MissingNumbers missingnumbers=new A25_MissingNumbers();
		missingnumbers.sumOfFirst10NaturalNumbers();
		int[] a={ 1, 2, 8, 10, 9, 5, 7, 6, 4 };
		missingnumbers.sumOfArray(a);
	 }
}
