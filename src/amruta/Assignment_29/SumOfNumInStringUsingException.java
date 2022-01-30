/*  Assignment-29 : 25th Jan'2022

WAP to find out the total sum of all the numbers present in the given string without using Character class method.
Input  : I have 15 years and 3 months of automation experience
Output : Expected Sum  = 8
Hint   : Using exception handling (i.e. try catch block).     */

package amruta.Assignment_29;

class SumOfNumInStringUsingException{

	void sumOfNums(String str){
		String[] arr = str.split(" ");
		int sum = 0;
		for(int index = 0; index < arr.length; index++){
			try{
				sum = sum + Integer.parseInt(arr[index]);
			}catch(Exception e){
				//System.out.println(" Not a Number ");
			}
		}
		System.out.println("\nSum of Number in Given String is : "+sum);
	}
	
	public static void main(String[] args){
		
		String str = "I have 15 years and 3 months of automation experience";
		
		System.out.println("Given String is : "+str);
		new SumOfNumInStringUsingException().sumOfNums(str);
	}
}