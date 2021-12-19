package ranjeet;
class AssignmentFive{
	void printEvenNumber(int startNo, int endNo){
		int num;
		System.out.println("Even numbers are :");
		for(num = startNo; num<=endNo; num++){
			if(num%2 == 0){
				System.out.println(num);
			}
		}
	}
	
	void divisibleByFive(int startNo, int endNo){
		int num;
		System.out.println("Number is devisible by 5 is = ");
		for(num = startNo; num<=endNo; num++){
			if(num%5 == 0){
				System.out.println(num);
			}
		}	
	}
	
	void devide(int startNo, int endNo){
		int num;
		System.out.println("Number is divisible by 5 and 3 is = ");
		for(num = startNo; num <=endNo; num++ ){
			if(num%5 == 0 && num%3 ==0){
			System.out.println(num);
			}
		}
	}
	
	void printData(int startNo, int endNo){
		int num;
		for(num = startNo; num <=endNo; num++){
			if(num%7 == 0){
				System.out.println(num+" is devisible by 7");
			}else if(num%13 == 0){
				System.out.println(num+" is devisible by 13");
			}
		}
	}
	
	void sum(int startNo, int endNo){
		int num;
		int ad = 0;
		for(num = startNo; num<=endNo; num++){
			ad = ad + num;
		}
		
		System.out.println(ad);
	}
	void sumOfOdd(int startNo, int endNo){
		int num;
		int sumOfEvenNo = 0;
		int sumOfOddNo = 0;
		int res;
		System.out.println("Difference between sum of odd numbers and even numbers is : ");
		for(num = startNo; num<=endNo; num++){
			if(num%2 == 0){
				sumOfEvenNo = sumOfEvenNo + num;
			}if(num%2 != 0){
				sumOfOddNo = sumOfOddNo + num;
			}
		}
			if(sumOfEvenNo>sumOfOddNo){
				res = sumOfEvenNo - sumOfOddNo;
				System.out.println(res);
			}else{
				res = sumOfOddNo - sumOfEvenNo;
				System.out.println(res);
			}
	}
	
	void oddNumbers(int startNo, int endNo){
		int num;
		System.out.println("Odd number is : ");
		for(num=endNo; num>=startNo; num--){
			if(num%2!=0){
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args){
		AssignmentFive assignmentFive = new AssignmentFive();
		assignmentFive.printEvenNumber(10, 15);
		assignmentFive.divisibleByFive(10, 30);
		assignmentFive.devide(5, 18);
		assignmentFive.printData(7, 30);
		assignmentFive.sum(1, 50);
		assignmentFive.sumOfOdd(3, 9);
		assignmentFive.oddNumbers(10, 20);
	}
}