package tanu;
class Assignment25{
	int expsum;
	int num;
	void findMissingArray(int [] arr){
		 num= arr.length+1;
		 expsum= num*(num+1)/2;
		 for(int index=0; index<arr.length; index++) {
			 expsum=expsum-arr[index];
		 }
		System.out.println("Missing number from the array is ->"+ "{"+expsum+"}");
	}
	
 public static void main(String[] arg) {
	Assignment25 assignment=new Assignment25();
	int [] userinput= {1, 2, 8, 10, 9, 5, 7, 6, 4};
	assignment.findMissingArray(userinput);
 }	
}