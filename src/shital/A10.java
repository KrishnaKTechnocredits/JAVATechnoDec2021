package shital;

class A10{
	
	int count;
	int sum;
	
	void findPrimeNumber(int number){	
			boolean flag =true;
			for(int index=2;index<=number/2;index++)
			if(number%index==0){
				flag=false;
				break;
			}
			if(flag==true){
				System.out.println("Prime Number is:" +number);	
			count++;
			sum=sum+number;
			}	
	}

	void individualPrimeNumber(int primeNumber){
		findPrimeNumber(primeNumber);
		System.out.println("Prime No is: " +primeNumber);
		count=0;	
	}
	
	void rangeoOfPrimeNumber(int startNo, int endNo){
		System.out.println("\nList of Prime Numbers between "+startNo+" to "+endNo+" ");
		for(int num=startNo;num<=endNo;num++)
			findPrimeNumber(num);		
	}
	void countOfPrimeNumber(){
		System.out.println("\nTotal Prime Numbers is :" +count);
	}
	
	void sumOfAllPrimeNumber(){
		System.out.println("\nSum of all Prime Numbers is :" +sum);
	}
	
	void averageOfAllPrimeNumber(){
		float average=sum/count;
		System.out.println("\nAverage of all Prime Number is :" +average);
	}
	
	public static void main(String[] args){
		A10 assignment10=new A10();
		assignment10.individualPrimeNumber(20);
		assignment10.rangeoOfPrimeNumber(50,100);
		assignment10.countOfPrimeNumber();
		assignment10.sumOfAllPrimeNumber();
		assignment10.averageOfAllPrimeNumber();
	}
}