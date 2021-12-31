package shital;

class Test1Program2{
	
	
	int countOfPrimeNumber=0;
	boolean isPrime(int number){
		
		boolean flag=true;
		for(int index=2;index<number/2;index++){
			if(number%index==0){
				flag=false;
				break;
			}
		}
		if(flag==true){
			System.out.println("Prime No is : "+number);
			countOfPrimeNumber++;	
		}	
		return flag;
	}
	
	void findRangeofPrimeNumber(int firstNumber, int lastnumber){
		int sum=0;
		boolean primefound=true;
		System.out.println("Prime Number between "+firstNumber+" to "+lastnumber+" :");
		for(int index=firstNumber;index<=lastnumber;index++){
			if(countOfPrimeNumber<10)
				
			if(isPrime(index)==true){
				sum=sum+index;
				primefound =false;
			}
		}	
			System.out.println("\nSum of All Prime Numbers is: "+sum);
	}
	
	public static void main(String[] args){
		Test1Program2 test1Program2=new Test1Program2();
		test1Program2.findRangeofPrimeNumber(30,100);
	}
}
	
	