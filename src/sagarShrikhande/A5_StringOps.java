package sagarShrikhande;
class A5_StringOps{

	void printEvenNumbers(int startNumber, int endNumber){
		System.out.println("Output of method 1: ");
	    for(int num = startNumber; num<=endNumber; num++){
			if(num % 2 == 0)
				System.out.println(num);
		}
    }
	
	void divisibleBy5(int startNumber, int endNumber){
		System.out.println("Output of method 2: ");
		for(int num = startNumber; num<=endNumber; num++){
			if(num % 5 == 0)
				System.out.println(num);
		}
	}
	
	void divisibleBy5And3(int startNumber, int endNumber){
		System.out.println("Output of method 3: ");
		System.out.println("Divisible by 5 & 3, numbers are:");
		for(int num = startNumber; num<=endNumber; num++){
			if(num % 5 == 0 && num % 3 == 0 )
				System.out.println(num);
		}
	}
	
	void divisibleBy7Or13(int startNumber, int endNumber){
		System.out.println("Output of method 4: ");
		System.out.println("Divisible by 7 or 13, numbers are: ");
		for(int num = startNumber; num<=endNumber; num++){
			if(num % 7 == 0 || num % 13 == 0 ){
				if(num % 7 == 0)
					System.out.println(num +"is divisible by 7");
				else
					System.out.println(num +"is divisible by 13");
			}
		}
	}
	
	void sumOfInput(int startNumber, int endNumber){
		System.out.println("Output of method 5: ");
		int sum = 0;
	    for(int num = startNumber; num<=endNumber; num++){
			sum = sum+num;
		}
		System.out.println("Sum is "+ sum);
    }
	
	void diffOfSumOfOddEven(int startNumber, int endNumber){
		System.out.println("Output of method 6: ");
		int even = 0;
		int odd = 0;
	    for(int num = startNumber; num<=endNumber; num++){
			if(num % 2 == 0)
				even = even+num;
			else
				odd = odd+num;
		}
		System.out.println(odd - even);
    }
	
	void printOddNumbersRev(int startNumber, int endNumber){
		System.out.println("Output of method 7: ");
	    for(int num = endNumber; num>=startNumber; num--){
			if(num % 2 != 0)
				System.out.println(num);
		}
    }
	
	public static void main(String[] a){
		A5_StringOps a5_StringOps = new A5_StringOps();
		a5_StringOps.printEvenNumbers(10,15);
		a5_StringOps.divisibleBy5(10,30);
		a5_StringOps.divisibleBy5And3(5,18);
		a5_StringOps.divisibleBy7Or13(5,40);
		a5_StringOps.sumOfInput(1,5);
		a5_StringOps.diffOfSumOfOddEven(3,9);
		a5_StringOps.printOddNumbersRev(10,20);
	}	
}














/* Assignment - 5 : 16th Dec2021

Write only one program having the following methods. [7 methods in same program] 

1. print all even numbers in a given range. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14	
Hint : void printEvenNumbers(int startNumber, int endNumber){
	              for(int num = startNumber; num<=endNumber; num++){
                      }
          }

2. On user defined range print all numbers which are divisible by 5. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 30
Output : Divisible by 5, numbers are:
		 10
		 15
		 20
		 25
		 30	

3. On user defined range print all numbers which are divisible by 5 and divisible by 3. 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 18
Output : Divisible by 5 & 3, numbers are:
		 15

4. On user defined range print all numbers which are divisible by 7 or 13. 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 7 or 13, numbers are:
		 7 is divisible by 7
		 13 is divisible by 13
		 14 is divisible by 7
		 21 is divisible by 7
		 26 is divisible by 13
		 28 is divisible by 7
		 35 is divisible by 7
		 39 is divisible by 13
		 
5. Find sum of all the numbers in user define range.
Input : Range -> 1 to 5
output : sum is 15

6. Find difference between sum of odd numbers and even numbers in a given range
Input : Range -> 3 to 9
output : 6
hint : (3+5+7+9) - (4+6+8) = 6
       
7. Print only odd numbers in reverse order.
Input : Range -> 10 to 20
output : 19
         17
         15
         13
         11
*/

