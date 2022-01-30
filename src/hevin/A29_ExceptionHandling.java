package hevin;

public class A29_ExceptionHandling {
	
	void getSum(String str) {
		
		String[] inputArr = str.split(" ");
		int sum = 0;
		
		for(int index = 0; index < inputArr.length; index++) {
			try {
				sum = sum + Integer.parseInt(inputArr[index]);
			} catch (ArithmeticException ae) {		 
				System.out.println("AE");			//could not go in this
			} catch (NumberFormatException ne) {
				//System.out.println("Exception Catch");	//(Here Exception) if NFE block is not here it will catch in "Exception"
			} catch (Exception e) {
				System.out.println("Exception");	//could not go in this cz its already catch in NumberFormatException
			}	
		}
		System.out.println("Expected Sum From String = " + sum);
	}
	public static void main(String[] args) {
		A29_ExceptionHandling a29 = new A29_ExceptionHandling();
		String input = "I have 15 years and 3 months of automation experience";
		a29.getSum(input);
	}
} 
