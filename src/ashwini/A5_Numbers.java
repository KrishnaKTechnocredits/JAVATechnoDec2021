package ashwini;
public class A5_Numbers 
{
	void evenNumbers(int startNumber, int endNumber){
		System.out.print("Even Numbers in the given range: ");
		for(int index = startNumber ; index <= endNumber ; index++){
			if(index % 2 == 0){
				System.out.print(index+" ");
			}
		}
		System.out.println();
	}
	
	void divisibleBy5(int startNumber, int endNumber){
		System.out.print("Numbers divisible by 5 in the given range: ");
		for(int index = startNumber ; index <= endNumber ; index++){
			if(index % 5 ==0)
				System.out.print(index+" ");
		}
		System.out.println();
	}
	
	void divisibleBy5AND3(int startNumber, int endNumber){
		System.out.print("Numbers divisible by 3 and 5 in the given range: ");
		for(int index = startNumber ; index <= endNumber ; index++){
			if(index % 5 == 0 && index % 3 == 0)
				System.out.print(index+" ");
		}
		System.out.println();
	}
	
	void divisibleBy7OR13(int startNumber, int endNumber){
		System.out.println("Numbers divisible by 7 or 13 in the given range: ");
		for(int index = startNumber ; index <= endNumber ; index++){
			if(index % 7 == 0)
				System.out.println(index+" is divisible by 7");
			else if(index % 13 == 0)
				System.out.println(index+" is divisible by 13");
		}
	}
	
	void sumOfNumbers(int startNumber, int endNumber){
		int sum = 0;
		for(int index = startNumber ;  index <=endNumber ; index++ ){
			sum = sum+index;
		}
		System.out.print("Sum of the numbers in the given range is: "+sum);
		System.out.println();
	}
	
	void differenceOddEvenSum(int startNumber, int endNumber){
		int evenSum = 0;
		int oddSum = 0;
		for(int index  = startNumber ; index <= endNumber ; index++ ){
			if(index % 2 == 0)
				evenSum = evenSum + index;
			else	
				oddSum = oddSum + index;
		}
		System.out.println("Difference between the sum of odd and even numbers in the given range is: "+(oddSum - evenSum));
	}
	
	void oddNumbersReverse(int startNumber, int endNumber){
		System.out.print("Odd Numbers in the given range and in reverse order: ");
		for(int index = endNumber ; index >=startNumber ; index-- ){
			if(index % 2 != 0)
				System.out.print(index+" ");
		}
		System.out.println();
	}
	
	void divisibilityCheck(int startNum, int endNum, int num){
		System.out.print("Numbers divisible by "+num+" in the given range is: ");
		for(int index = startNum ; index <= endNum ; index++){
			if(index % 3 == 0)
				System.out.print(index+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] a){
		A5_Numbers numbers = new A5_Numbers();
		numbers.evenNumbers(10, 15);
		numbers.divisibleBy5(10, 30);
		numbers.divisibleBy5AND3(5, 18);
		numbers.divisibleBy7OR13(5, 40);
		numbers.sumOfNumbers(1, 5);
		numbers.differenceOddEvenSum(3, 9);
		numbers.oddNumbersReverse(10 , 20);
		numbers.divisibilityCheck(1, 10, 3);
	}
}
