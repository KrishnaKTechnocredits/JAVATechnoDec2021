package nasir;
class A10_PrimeNumber {
	int count;
	int sum;
	void displayPrime(int num){
		boolean flag = true;
		for(int index=2;index<num;index++){
			if(num%index==0){
				flag=false;
				//System.out.println(num+" is not a prime number ");
				break;
				}								
		}
			if(flag==true){
				System.out.println(num+" is a prime number");
				count++;
				sum=sum+num;
			}			
	}
	
	void allPrimeNumber(int startNum, int endNum){
		for(int i=startNum;i<=endNum;i++){
			displayPrime(i);
	}	
	}
	void totalPrimeNumber(int startNum,int endNum){
		for(int i=startNum;i<=endNum;i++){
			displayPrime(i);
		}
		System.out.println("Total count of prime number is "+count);
	}	
	void averageOfAllPrime(int startNum, int endNum){
		for(int i=startNum;i<=endNum;i++){
			displayPrime(i);
		}
		System.out.println("Average of all the Prime Number is "+(sum/count));
	}
	
	public static void main(String[]args){	
		A10_PrimeNumber primenumber =new A10_PrimeNumber();
		primenumber.displayPrime(17);
		primenumber.allPrimeNumber(100,200);
		primenumber.totalPrimeNumber(35,150);
		primenumber.averageOfAllPrime(1,10);
	}
}