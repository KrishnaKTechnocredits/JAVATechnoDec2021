package nasir;

public class Exam2_Test {
	//int sum=6;	
	 void findPairOfSum(int[] arr, int sum) {
		 for(int index=0;index<arr.length;index++) {
			 int num =arr[index];			 
			  for(int innerIndex=0;innerIndex<arr.length;innerIndex++) {
				  int num1=0;
				  if(num<arr[innerIndex])
					  num1=num+arr[innerIndex];
				  if(sum==num1)
					  System.out.println(num+" "+arr[innerIndex]);
			  }
		 }
		 System.out.println("................");
	 }
	 
	 void singleOccurance(int[] arr) {
		 for(int index=0;index<arr.length;index++) {
			 int number= arr[index];
			 int count=0;
			 for(int innerIndex=0;innerIndex<arr.length;innerIndex++) {
				 if(number==arr[innerIndex]) 
				 		count++;
			 }
			 if(count==1)
				 System.out.println(number);
		 }
	 }
	
	 public static void main(String[] args) {
		Exam2_Test exam = new Exam2_Test();
		int[] input = {5,1,2,7,6,3,4,9};
		exam.findPairOfSum(input,6);
		int[] input1= {5,8,1,2,4,3,2,1};
		exam.singleOccurance(input1);
	}
}
