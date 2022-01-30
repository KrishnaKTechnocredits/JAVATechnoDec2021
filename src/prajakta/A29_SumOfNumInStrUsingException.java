package prajakta;

public class A29_SumOfNumInStrUsingException {

	void sumOfNumbers(String str){
		String[] input = str.split(" ");
		int sum = 0;
		for(int index = 0; index < input.length; index++){
			try{
				sum = sum + Integer.parseInt(input[index]);
			}catch(Exception e){
			}
		}
		System.out.println("Sum of Number in Given String is : "+sum);
	}

	public static void main(String[] args){
		A29_SumOfNumInStrUsingException assign29 = new A29_SumOfNumInStrUsingException();
		String str = "I have 15 years and 3 months of automation experience";
		System.out.println(str);
		assign29.sumOfNumbers(str);
	}
} 