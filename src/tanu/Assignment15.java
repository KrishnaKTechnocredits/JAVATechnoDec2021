package tanu;

class Assignment15 {

	
	void maxNumber(int[] number) {
		int max = number[0];
		for(int index=0; index<number.length;index++)
		{
			if(number[index]>max)
			{
				max = number[index];
			}
		}
		System.out.println("Max number in given array is " + max);
		}

	
	void minNumber(int[] number) {
		int min= number[0];
		for(int index=0; index<number.length;index++)
		{
			if(number[index]<min)
			{
				min = number[index];
			}
		}
		System.out.println("Min number in given array is " + min);
		}
	
	
	void countPositiveNumber(int[] number) {
		int count=0;
		for(int index=0; index<number.length;index++)
		{
			if(number[index]>0)
			{
				count++;
			}
		}
		System.out.println("Positive number count in given array is " + count);
		}
	
	void sumOfPositiveNumber(int[] number) {
		int sum=0;
		for(int index=0; index<number.length;index++)
		{
			if(number[index]>0)
			{
				sum = sum + number[index];
			}
		}
		System.out.println("Sum of positive number in given array is " + sum);
		}
	
	void sumOfEvenPositiveNumber(int[] number) {
		int sum=0;
		for(int index=0; index<number.length;index++)
		{
			if(number[index]>0)
			{
				if(number[index]%2==0) {
					sum = sum + number[index];
				}
			}
		}
		System.out.println("Sum of even positive number in given array is " + sum);
		}
	
	void maximumLengthString(String[] name) {
		int maxLength = name[0].length();
		String maxName = "";
		for(int index=0; index<name.length;index++)
		{
			if(name[index].length()>maxLength)
			{
				maxLength = name[index].length();
				maxName = name[index];
				
			}
		}
		System.out.println("Max length name in given array is " + maxName);
		}
	
	public static void main(String[] arg) {

		Assignment15 assignment15 = new Assignment15();
		int[] userinput = {10,50,3,8,20};
		assignment15.maxNumber(userinput);
		int[] userinput1 = {11,10,3,8,2};
		assignment15.minNumber(userinput1);
		int[] userinput2 = {12,-11,99,-11,23,-44};
		assignment15.countPositiveNumber(userinput2);
		int[] userinput3 = {12,-11,99,-11,23,-44};
		assignment15.sumOfPositiveNumber(userinput3);
		int[] userinput4 = {12,-11,99,-11,23,-44};
		assignment15.sumOfEvenPositiveNumber(userinput4);
		assignment15.sumOfPositiveNumber(userinput3);
		String[] userinput5 =  {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
		assignment15.maximumLengthString(userinput5);
	}
}
