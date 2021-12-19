package karan;

public class Assignment_5 {
	/*Assignment - 5 : 16th Dec2021

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
		void evenNumbers(int startNumber,int endNumber){     // Even number method
	        System.out.println("\n Even number:");		
	        for(int num = startNumber; num<=endNumber; num++){
				if(num%2==0){
					System.out.println(num + "-> No is even Number");
				}
			}
		}		 
		
		void divisibleBy5(int startNumber,int endNumber){     // Divisible by 5 method
	        System.out.println("\n Divisible by 5:");		
	        for(int num = startNumber; num<=endNumber; num++){
				if(num%5==0){
					System.out.println(num + "-> Divisible by 5");
				}
			}
		}		  
		
		void divisibleBy5And3(int startNumber,int endNumber){     // Divisible by 5 and 3 method
	        System.out.println("\n Divisible by 5 and 3:");		
	        for(int num = startNumber; num<=endNumber; num++){
				if(num%5==0 && num%3==0){
					System.out.println(num + "-> Divisible by 5 and 3");
				}
			}
		}

		void divisibleBy7And13(int startNumber,int endNumber){     // Divisible by 7 and 13 method
	        System.out.println("\n Divisible by 7 and 13:");		
	        for(int num = startNumber; num<=endNumber; num++){
				if(num%7==0){
					System.out.println(num + "is divisible by 7");
				}
				else if(num%13==0){
					System.out.println(num + "is divisible by 13");	
				}
			}
		}	
		
		void sumOfAllNo(int startNumber,int endNumber){     // Sum of numbers 1 to 5
	        System.out.println("\n Sum of all number from 1 to 5:");
				int sum = 0;
	        for(int num = startNumber; num<=endNumber; num++){
				sum = num + sum;
			}
			System.out.println("\n Sum is:"+ sum);
		}	
		
		void sumOfOddEvenNumbers(int startNumber,int endNumber){     // Sum of odd & Even number method
	        System.out.println("\n Difference between Sum of odd & Even number:");
				int even =0;
				int odd =0;
	        for(int num = startNumber; num<=endNumber; num++){
				if(num%2==0){
					even= even +num;
				}
				else{
					odd= odd +num;
				}
			}
			System.out.println("\n Sum of even and odd:\t"+(odd - even));
		}	
		
		void reverseofOddNumbers(int startNumber,int endNumber){     // Printing odd number in reverse
	        System.out.println("\n Sum of odd & Even number:");
	        for(int num = endNumber; num > startNumber;num--){
				if(num%3==0){
					System.out.println("Reverse number printing only odd No :"+num);
				}
			}
			
		}	
		
		public static void main(String[] args){
			Assignment_5 assignment5= new Assignment_5();
			assignment5.evenNumbers(10,15);
			assignment5.divisibleBy5(10,30);
			assignment5.divisibleBy5And3(5,18);
			assignment5.divisibleBy7And13(5,40);
			assignment5.sumOfAllNo(1,5);
			assignment5.sumOfOddEvenNumbers(3,9);
			assignment5.reverseofOddNumbers(10,20);
		}	
}
