package anjali;

public class A5_assigment5 {

	public static void main(String[] args) {
		A5_assigment5 assignment5 = new A5_assigment5();
		assignment5.printEvenNumber( 10,15);
		assignment5.checkDivisibleby5(10,30);
		assignment5.checkDivisibleby3and5(5,18);
		assignment5.checkDivisibleby7and13(5,40);
		assignment5.sum(1,5);
		assignment5.sumEvenOdd(3,9);
		assignment5.oddReverse(10,20);
    }
	
	void printEvenNumber(int startNumber,int endNumber){
		for(int num=startNumber; num<=endNumber;num ++){
			if(num%2==0){
				System.out.println(num);
			}
		}
	}
	
	void checkDivisibleby5(int startNumber,int endNumber){
		for(int num=startNumber; num <=endNumber;num ++){
			if(num%5==0){
				System.out.println(num);
			}
		}
	}
	
	void checkDivisibleby3and5(int startNumber,int endNumber){
			for(int num=startNumber;num<=endNumber;num ++){
					if(num%3==0 && num%5==0){
						System.out.println("The numbers divisible by 3&5 are: " +num);
					}
			}
	}	

    void checkDivisibleby7and13(int startNumber,int endNumber){
			for(int num=startNumber; num<=endNumber;num ++){
					if(num%7==0 || num%13==0){
						System.out.println("The numbers divisible by 7&13 are: " +num);
					}
			}						
	}
	
	void sum(int startNumber,int endNumber){
		int sum=0;
		for(int num=startNumber; num<=endNumber;num ++){
		sum=sum+num;
		}
		System.out.println("The addition is: " +sum);	
	}
	
	void sumEvenOdd(int startNumber,int endNumber){
		int numSum=0,numOdd=0;
		for(int num=startNumber; num<=endNumber;num ++)
		{			
				if(num%2==0)
				{
			     numSum=numSum+num;
				}
			   else
			   {
				 numOdd=numOdd+num;
               }				 
		}
			int diff= (numSum-numOdd);
		
		System.out.println("Difference is :"+diff);
	}
	
	void oddReverse(int startNumber,int endNumber){
		for(int num=endNumber; num>=startNumber;num--){
			if(!(num%2==0)){
			System.out.println(num);
			}
		}
	}	
	
} 
