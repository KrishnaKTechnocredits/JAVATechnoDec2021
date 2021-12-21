package krishna;

class A5_Num{
	void even_Num(int startNum, int endNum){
		System.out.println("The Even Number are : " );
		for(int num = startNum; num<=endNum; num++){
			if(num%2 == 0)
				System.out.println(num);
		}
	}
	
	void range_Num(int startNum, int endNum){
		System.out.println("The Number Divisible by 5 are : ");
			for(int num = startNum; num<=endNum; num++){
				if(num%5 == 0)
					System.out.println(num);
			}
	}
	
	void divide_Num(int startNum, int endNum){
		System.out.println("Divisible by 5 and 3 Number are : ");
			for(int num = startNum; num<=endNum; num++){
				if(num%5 == 0 && num%3 == 0)
					System.out.println(num);
			}
	}
	
	void div_Num(int startNum, int endNum){
		System.out.println("Divisible by 7 or 13 Number are : ");
		for(int num = startNum; num<=endNum; num++){
			if(num%7 == 0)
				System.out.println(num + " Divisible by 7");
			else if(num%13 == 0)
				System.out.println(num + " Divisible by 13");
			}
	}
	
	void sum_Num(int startNum, int endNum){
		int temp = 0;
		for(int num = startNum; num<=endNum; num++)
			temp = temp + num;
			System.out.println("Sum is : " + temp);
	}
	
	void sumDiff_OE_Num(int startNum, int endNum){
		int temp = 0; int temp1 = 0; 
		int diff = 0;
		System.out.println("Difference between sum of odd numbers and even numbers in a given range :");
		for(int num = startNum; num<=endNum; num++){
			if(num%2 == 0)
				temp = temp + num;
			else
				temp1 = temp1 + num;
		}
		diff = temp1 - temp;
		System.out.println(diff);
	}
	
	void odd_Rev_Num(int startNum, int endNum){
		int temp2 = 0;
		System.out.println("Reverse Odd Number are : ");
		for(int num1 = endNum; num1>=startNum; num1--){
			temp2 = num1;
			if(temp2%2!= 0)
				System.out.println(temp2);
		}
	
	}
	
	public static void main(String[] args){
		A5_Num number = new A5_Num();
		number.even_Num(10, 15);
		number.range_Num(10, 30);
		number.divide_Num(5, 18);
		number.div_Num(5, 40);
		number.sum_Num(1, 5);
		number.sumDiff_OE_Num(3, 9);
		number.odd_Rev_Num(10, 20);
	}
}