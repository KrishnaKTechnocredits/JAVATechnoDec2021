package rashmi;

public class Prog2Test {
	  boolean checkPrime(int numberToCheck) {
   	   if(numberToCheck == 1) {
              return false;
          }
          for (int i = 2; i*i <= numberToCheck; i++) {
              if (numberToCheck % i == 0) {
                  return false;
              }
          }
          return true;

   }
    int primeSum(int startnum, int endnum)
   {
       int sum = 0;
       int count = 1;
       for (int i = startnum; i <= endnum; i++) {
           boolean isPrime = checkPrime(i);
           if (isPrime && count < 11) {
               sum = sum + i;
               count++;
           }
       }
       return sum;
   }
   public static void main(String[] args) {   
       int startnum = 2, endnum = 1000;
       Prog2Test prog2test = new Prog2Test();
       int sum = prog2test.primeSum (startnum, endnum);
       System.out.println(sum);
   }
}
