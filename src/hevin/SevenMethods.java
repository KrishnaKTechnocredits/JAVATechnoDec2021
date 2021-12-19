package hevin;

class SevenMethods{
	
	void evenNumbers(int firstNumber, int lastNumber){
		System.out.println("This is an Even Numbers");
			for(int N = firstNumber; N<=lastNumber; N++){
				if(N%2 == 0)
					System.out.println(N);
		}
	}
	
	void divisibleByFive(int firstNumber, int lastNumber){
		System.out.println("Below Numbers Are Divisible By 5");
			for(int N = firstNumber; N<=lastNumber; N++){
				if(N%5 == 0)
					System.out.println(N);
		}		
	}
	
	void divisibleByFiveAndThree(int firstNumber, int lastNumber){
		System.out.println("Below Numbers Are Divisible By 5 & 3");
			for(int N = firstNumber; N<=lastNumber; N++){
				if(N%3 == 0 && N%5 == 0)
					System.out.println(N);
		}		
	}
	
	void divisibleBySevenOrThirteen(int firstNumber, int lastNumber){
		System.out.println("Divisible By 7 & 13");
			for(int N = firstNumber; N<=lastNumber; N++){
				if(N%7 == 0)
					System.out.println(N+ "is Divisible By 7");
				else if(N%13 == 0)
					System.out.println(N+ "is Divisible By 13");
		}		
	}
	
	void diffOddandEven(int firstNumber, int lastNumber){
		int n1 = 0, n2 = 0;
		int diff;
			System.out.println("Difference of Odd & Even Number's Sum");
				for(int N = firstNumber; N<=lastNumber; N++){
					if(N%2 == 0)
						n1 = n1 + N;
					else
						n2 = n2 + N;
				}
					diff = n2 - n1;
					System.out.println(diff);
	}
	
	void reverseOdd(int firstNumber, int lastNumber){
		System.out.println("Reverse Odd Numbers");
			for(int N = firstNumber; N>=lastNumber; N--){
				if(N%2!= 0)
					System.out.println(N);
		}		
	}
	
	void sumOfAll(int firstNumber, int lastNumber){
		int sum=0;
			System.out.println("Sum Of All Numbers");
				for(int N = firstNumber; N<=lastNumber; N++){
					sum = sum + N;
				}
				System.out.println(sum);		
	}
	
	public static void main (String[] a){
		SevenMethods sevenmethods = new SevenMethods();
		sevenmethods.evenNumbers(10,15);
		sevenmethods.divisibleByFive(10,30);
		sevenmethods.divisibleByFiveAndThree(5,18);
		sevenmethods.divisibleBySevenOrThirteen(5,40);
		sevenmethods.diffOddandEven(3,9);
		sevenmethods.reverseOdd(20,10);
		sevenmethods.sumOfAll(1,5);
	}
}
