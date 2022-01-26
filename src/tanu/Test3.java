package tanu;

/*Write a program to find max digit from given number.
Input will be as number format only, DO NOT CHANGE NUMBER INTO STRING
Input : 6832774
Output :8    */



class Test3 {
void findMaxNumber(int number) {
	
	int lastnumber;
	int maxnumber=0;
	while(number!=0)
	{
		lastnumber=number%10;
		if(lastnumber>maxnumber)
		{
			maxnumber=lastnumber;
		}
		number=number/10;
	}
	
	System.out.println(maxnumber);

}
	
	public static void main(String [] arg) {
		Test3 test = new Test3();
		test.findMaxNumber(6832774);
		
	}
}