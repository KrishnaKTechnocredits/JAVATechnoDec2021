package swapnali;

public class primeOperation {
	int count;
	int sum=0;
		 
	  void isNumberPrime(int num){
	  boolean flag=false;			
		  for(int index =2;index<=num/2;index++){
			if((num%index==0)) {	
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println(num+" is prime no");
			count++;
			sum=sum+num;
			}
		  }
		
		  void printPrimeRange(int start,int end){
			for(int index =start;index<end;index++) {
				isNumberPrime(index);
			}
		  }
		
		  void totalPrime(){
			System.out.println("The total of prime number is : "+count);
		  }
			
		  void sumOfPrime() {
			System.out.println("The sum of prime number is : "+sum);
		  }
		
		  void avgofNumber(){			
			int Avg=sum/count;
			System.out.println("The average of prime number is : "+Avg);
		  }
	
	        public static void main(String[] args) {
	        	primeOperation prime=new primeOperation();
			
	        	prime.printPrimeRange(1,30);
	        	prime.totalPrime();
	        	prime.sumOfPrime();
	        	prime.avgofNumber();
	
		
		}

}
