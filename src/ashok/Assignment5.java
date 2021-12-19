package ashok;
class AssignFive{
	
	void evenPrint(int startNumber, int endNumber){
		for(int num = startNumber; num<=endNumber; num++){
			if(num % 2 == 0){
				System.out.println(num);
			}
		}
	}
	
	void evenPrintFive(int startNumber, int endNumber){
		for(int num = startNumber; num<=endNumber; num++){
			if(num % 5 == 0){
				System.out.println(num);
			}
		}
	}
	
	void evenPrintFiveThree(int startNumber, int endNumber){
		for(int num = startNumber; num<=endNumber; num++){
			if(num % 5 == 0 && num % 3 == 0 ){
				System.out.println(num);
			}
		}
	}
	
	void evenPrintSevenThree(int startNumber, int endNumber){
		for(int num = startNumber; num<=endNumber; num++){
			if(num % 7 == 0){
				System.out.println(num + " is divisible by 7" );
			} else if (num % 13 == 0) {
				System.out.println(num + " is divisible by 13");
			}
		}
	}
	
	void userDefSum(int startNumber, int endNumber){
		int sum=0;
		for(int num = startNumber; num<=endNumber; num++){
			sum = sum + num;				
		}
			System.out.println(sum);
	}
	
	void oddEvenDiffPrint(int startNumber, int endNumber){
		int eSum=0;
		int oSum=0;
		for(int num = startNumber; num<=endNumber; num++){
			if(num%2==0){
			eSum = eSum + num;
			} else if(num%2!=0){
				oSum = oSum + num;
			}
		}
			System.out.println(oSum-eSum);
	}
	
	void oddRevPrint(int startNumber, int endNumber){
		for(int num = endNumber; num>=startNumber; num--){
			if(num%2!=0){
				System.out.println(num);
			}
		}
	}
	public static void main(String[] args){
	
		AssignFive assignFive = new AssignFive();
		System.out.println("Output : Even numbers are:");//
		assignFive.evenPrint(10,15);//1 Assignment
		System.out.println("Output : Divisible by 5, numbers are:");
		assignFive.evenPrintFive(10,30);//2Assignment
		System.out.println("Output : Divisible by 5 and 3, numbers are:");
		assignFive.evenPrintFiveThree(5,18);//3Assignment
		System.out.println("Output : Divisible by 7 or 13, numbers are:");
		assignFive.evenPrintSevenThree(5,40);
		System.out.println("User Defined sum");
		assignFive.userDefSum(1,5);
		System.out.println("User Defined odd even difference");
		assignFive.oddEvenDiffPrint(3,9);
		System.out.println("Print odd number in reverse");
		assignFive.oddRevPrint(10,20);
		System.out.println("---END---");
	}

}
