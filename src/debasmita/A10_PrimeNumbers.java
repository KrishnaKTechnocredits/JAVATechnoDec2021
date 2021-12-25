package debasmita;

public class A10_PrimeNumbers {
	 int count;
	 int sum;
	 void primeOrNot(int num) {
	        boolean flag= true;
			for(int index=2; index<num/2; index++) {
			    if(num%index==0){
				   flag=false;
				   break;
			    }
			}
			if(flag==true){
			   System.out.println(num+" is a prime number");
			   count++;
			   sum=sum+num;
			}
			
	  }
	  void primeNoInRange(int firstNo,int lastNo) {
		   for(int startNo=firstNo; startNo<=lastNo; startNo++) {
			   primeOrNot(startNo);
		   }
	  }
	  void totalNoOfPrimeNumbers() {
		 System.out.println("total number of prime numbers in given range are: "+count);
	  }
	  void sumOfAllPrimeNumbers() {
		  System.out.println("Sum  of all prime numbers in given range are: "+sum);
	  }
	  void averageOfAllPrimeNumbers() {
		  int avg;
		  avg=sum/count;
		  System.out.println("Average of all prime numbers in given range are: "+avg);
	  }
	  
	  public static void main(String[] args) {
	        A10_PrimeNumbers primenumbers = new A10_PrimeNumbers();
			primenumbers.primeOrNot(17);
			primenumbers.primeNoInRange(50,100);
			primenumbers.totalNoOfPrimeNumbers();
			primenumbers.sumOfAllPrimeNumbers();
			primenumbers.averageOfAllPrimeNumbers();
	  }
}
