package vaishnavi;

public class A29_ExceptionHandlingExample {
	void findSumOfAllIntCountFromString() {
		String str = "I have 1 year and 5 months experience in Java and 2 years and 6 months experience in testing. ";
		String[] str1=str.split(" ");
		int sum = 0;
		for(int index=0;index < str1.length; index++) {
			try {
				sum = sum +Integer.parseInt(str1[index]);
			}catch(NumberFormatException ne) {
				
			}
		}
		System.out.println("Sum of all integers count from string is " + sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A29_ExceptionHandlingExample a29_ExceptionHandlingExample =new A29_ExceptionHandlingExample();
		a29_ExceptionHandlingExample.findSumOfAllIntCountFromString();
		
	}

}
