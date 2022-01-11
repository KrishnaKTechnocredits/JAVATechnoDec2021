package shamli;

public class Exam2 {
	
	void findPairOfElements(int arr1[],int sum)
	{
		for(int i=0;i<arr1.length;i++) {
			 int num =arr1[i];			 
			  for(int j=0;j<arr1.length;j++) {
				  int num1=0;
				  if(num>arr1[j])
					  num1=num+arr1[j];
				  if(sum==num1)
					  System.out.println(num+" "+arr1[j]);
			  }
		 }
	}
	
	void getSingleOccuranceOfElement(int[] input)
	{
		for(int i=0;i<input.length;i++){
			int count=0;
			for(int j=0;j<input.length;j++){
				if(input[i]==input[j])
					count++;
			}
			if(count==1)
				System.out.println(input[i]+" ");
		}
	}
	


	public static void main(String[] args)
	{
		Exam2 exam2program1 = new Exam2();
		Exam2 exam2program2 = new Exam2();
		int arr1[]= {5,1,2,7,6,3,4,9};
		System.out.println("Pai of elements from given array whose sum is 6 are :");
		exam2program1.findPairOfElements(arr1,6);
		int arr2[]= {5,8,1,2,4,3,2,1};
		System.out.println("All single occurances of elements from given array are :");
		exam2program2.getSingleOccuranceOfElement(arr2);	
	}

}
