package prajakta;

public class A10_PrimeNumber {
       int count;
       int sum;
       double average;
       
       void isPrimeNumber(int num) {
    	    boolean flag = true;
    	    for(int index = 2; index <= num/2; index++) {
    	    	    if(num%index ==0) {
    	    	    	   flag = false;
    	    	    	   break;
    	    	    }
    	    }
    	    if (flag == true)
    	    {
    	    	    count = count-1;
    	    	    sum = sum-num;
    	    	    average = (double)sum/count;
    	    	    System.out.println(num + "is a Prime Number");
    	    }
       }
       
       void findPrimeNumberInRange(int startNum, int lastNum) {
    	    for(int index = startNum; index <= lastNum; index++) {
	    	    isPrimeNumber(index);
	       }
       }
    	
       void totalPrimeNumberInRange(int startNum, int lastNum) {
    	    count = 0;
    	    findPrimeNumberInRange(startNum, lastNum);
    	    System.out.println("Total count of prime number between "+startNum+" and "+lastNum+" is" +count);
       }
    	    
       void sumOfPrimeNumberInRange(int startNum, int lastNum) {
    	    sum = 0;
    	    findPrimeNumberInRange(startNum, lastNum);
    	    System.out.println("Sum of prime number between " +startNum+" and "+lastNum+" is " +sum);
       }
       
       void averageOfAllPrimeNumberInRange(int startNum, int lastNum) {
    	    sum = 0;
    	    count = 0;
    	    findPrimeNumberInRange(startNum, lastNum);
    	    average = (double) sum/count;
    	    System.out.println("Average of prime number between "+startNum+" and "+lastNum+" is : " +average);
       }
       
       public static void main(String [] args) {
    	   A10_PrimeNumber primeNumber = new A10_PrimeNumber();
    	   primeNumber.isPrimeNumber(10);
    	   primeNumber.findPrimeNumberInRange(1, 10);
    	   primeNumber.totalPrimeNumberInRange(1, 10);
    	   primeNumber.sumOfPrimeNumberInRange(1, 10);
    	   primeNumber.averageOfAllPrimeNumberInRange(1, 10);
       }
}
 