package sagarAcharya;

class A2_Param{
	
	public static void main(String[] args){
		A2_Param assignment5 = new A2_Param();
		assignment5.printEvenNumbers(10,15);
		assignment5.range1(10,30);
		assignment5.range2(5,18);
		assignment5.range3(5,40);
		assignment5.range4(1,5);
		assignment5.range5(3,9);
		assignment5.range6(10,20);
	}
	
	void printEvenNumbers(int startNumber, int endNumber){
		for(int num = startNumber; num<=endNumber; num++){
			if(num % 2 == 0)
				System.out.println("Even Numbers : " + num);
		}
	}
	
	void range1(int startNumber, int endNumber){
		for(int num = startNumber; num<=endNumber; num++){
			if(num % 5 == 0)
				System.out.println("Numbers are : " + num);
		}
	}
	
	void range2(int startNumber, int endNumber){
		for(int num = startNumber; num<=endNumber; num++){
			if(num % 5 == 0 && num % 3 ==0)
				System.out.println("Divisible by 5 & 3 are : " + num);
		}
	}	
	
	void range3(int startNumber, int endNumber){
		System.out.println("Divisible by 7 or 13 are : ");
		for(int num = startNumber; num<=endNumber; num++){				
			if(num % 7 == 0 )
				System.out.println(num + "is divisible by 7" );
			else if(num % 13 == 0 )
				System.out.println(num + "is divisible by 13");
		}
	}
	
	void range4(int startNumber, int endNumber){
		int total=0;
		for(int num = startNumber; num<=endNumber; num++){
			total = total + num;
		}
		System.out.println("Sum is : " + total);
	}
	
	void range5(int startNumber, int endNumber){
		int odd=0;
		int even=0;
		for(int num = startNumber; num<=endNumber; num++){
			if(num % 2 == 0)
				even = even + num;
			else
				odd = odd + num;
		}
		System.out.println(odd-even);
	}
	
	void range6(int startNumber, int endNumber){
		for(int num = endNumber; num>=startNumber; num--){
			if(num % 2 != 0)
				System.out.println(num);
		}
	}
}