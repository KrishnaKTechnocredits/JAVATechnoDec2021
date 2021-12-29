/*Create a class to satisfy below requirements. 
                  a) Print Number is prime if Given number is prime. (parameterized method)
                  b) Print all the prime numbers between range 100->120. (parameterized method)
                  c) Print total count of prime numbers between 100->120.
                  d) Find sum of all prime numbers between 100->120
                  e) Find avg of prime numbers between 100->120 */

package anjali;

	public class A10_PrimeNumberAllprogramms {
		  int count;
		  int sum=0;
		 
		  void isNumberPrime(int num){
		  boolean flag=false;
			
		  for(int index =2;index<=num/2;index++){
				if((num%index==0)) {
					//System.out.println("The "+num+"  is not prime no");	
					flag=true;
					break;
				}
			}
			if(flag==false) {
				System.out.println("The "+num+" is prime no");
				count++;
				sum=sum+num;
			}
		  }
		
		  void printNumberInGivenRange(int firstNumber,int lastNumber){
			for(int index =firstNumber;index<lastNumber;index++) {
				isNumberPrime(index);
			}
		  }
		
		  void printTotalCountOFNumberInGivenRange(){
			System.out.println("The count of prime number is : "+count);
		  }
			
		  void printSumOFNumberInGivenRange() {
			System.out.println("The sum of prime number is : "+sum);
		  }
		
		  void avgOFNumberInGivenRange(){
			
			int Avg=sum/count;
			System.out.println("The avg of prime number is : "+Avg);
		  }
	
	        public static void main(String[] args) {
			A10_PrimeNumberAllprogramms a1PrimeNumberAllprogramms=new A10_PrimeNumberAllprogramms();
			//a1PrimeNumberAllprogramms.isNumberPrime(17);
	        a1PrimeNumberAllprogramms.printNumberInGivenRange(1,50);
			a1PrimeNumberAllprogramms.printTotalCountOFNumberInGivenRange();
			a1PrimeNumberAllprogramms.printSumOFNumberInGivenRange();
			a1PrimeNumberAllprogramms.avgOFNumberInGivenRange();
			
	
		
		}

}
	
	
	
