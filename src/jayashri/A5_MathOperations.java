package jayashri;

class A5_MathOperations{

	void evenNum(int startnumber, int endnumber){
		System.out.println("***********************************");
		System.out.println("Even Numbers from 10 to 15 are:");
		for(int num=startnumber;num<=endnumber;num++){				
			if(num % 2 == 0){
				System.out.println(num);
			}
		}
	}

	void divbyfive(int startnumber, int endnumber){
		System.out.println("***********************************");
		System.out.println("Numbers divisible by 5 are:");
		for(int num=startnumber;num<=endnumber;num++){				
			if(num % 5 == 0){
				System.out.println(num);
			}
		}
	}

	void divbyf_t(int startnumber, int endnumber){
		System.out.println("***********************************");
		System.out.println("Numbers divisible by 5 & 3 are:");
		for(int num=startnumber;num<=endnumber;num++){				
			if(num % 5 == 0 && num % 3 == 0){
				System.out.println(num);
			}
		}
	}	

	void divbyS_T(int startnumber, int endnumber){
		System.out.println("***********************************");
		System.out.println("Numbers divisible by 7 or 13, numbers are:");
		for(int num=startnumber;num<=endnumber;num++){				
			if(num % 7 == 0 || num % 13 == 0){
				if(num % 7 == 0){
					System.out.println(num+ " is divisible by 7");
				}
				else{
					System.out.println(num+ " is divisible by 13");
				}
			}
		}
	}
	
	void sumNum(int startnumber, int endnumber){
		System.out.println("***********************************");
		int sum1 = 0;	
		for(int num=startnumber;num<=endnumber;num++){		
			sum1 = sum1 + num ;	
		}
		System.out.println("Sum of all numbers is : "+sum1);
	}
	
	void difference(int startnumber, int endnumber){
		System.out.println("***********************************");
		System.out.println("Difference calculation ");
		int sumofeven = 0;	
		int sumofodd = 0;
		int diff=0;
		
		for(int num=startnumber;num<=endnumber;num++){
			if(num % 2 == 0){
				sumofeven = num + sumofeven;
			}	
			else{
				sumofodd = num + sumofodd;
			}	
		}
		System.out.println("Sum of all even numbers is : "+sumofeven);
		System.out.println("Sum of all even numbers is : "+sumofodd);
		diff = sumofodd - sumofeven;
		System.out.println("Difference between odd and even is : "+diff);
	}
	
	void print(int startnumber, int endnumber){
		System.out.println("***********************************");
		System.out.println("Odd numbers in reverse order ");
		for(int num=endnumber;num>=startnumber;num--){
			if(num % 1 == 0){
				System.out.println(num);
			}	
		}
	}
	public static void main(String[] args){
		A5_MathOperations a5_MathOperations = new A5_MathOperations();
		a5_MathOperations.evenNum(10,15);
		a5_MathOperations.divbyfive(10,30);
		a5_MathOperations.divbyf_t(5,18);
		a5_MathOperations.divbyS_T(5,40);
		a5_MathOperations.sumNum(1,15);
		a5_MathOperations.difference(3,9);
		a5_MathOperations.print(1,10);

	}
}

























