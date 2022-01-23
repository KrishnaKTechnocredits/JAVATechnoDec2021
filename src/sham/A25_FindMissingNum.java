package sham;

public class A25_FindMissingNum {

	public static void main(String[] args) {
		A25_FindMissingNum findMissingNum= new A25_FindMissingNum();
		int array[]= {1,2,3,7,8,5,6,10,4};
		findMissingNum.findMissingNumFromArray(array);

	}

	 void findMissingNumFromArray(int array[]) {
		 int n=array.length+1;
		int expectedSum= (n*(n+1)/2);
		System.out.println("Total sum of Number: "+expectedSum);
		for(int i=0;i<array.length;i++)
		{
			expectedSum= expectedSum-array[i];	
		}
		System.out.println("Missing number:"+expectedSum);
	 }
}
