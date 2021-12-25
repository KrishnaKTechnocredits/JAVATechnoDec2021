package anshuma;
public class Test_2 {
 

    boolean checkPrime(int numberToCheck)

    {

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

    int primeSum(int firstnum, int lastnum)

    {

        int sum = 0;
        int count = 1;

        for (int i = firstnum; i <= lastnum; i++) {
            boolean isPrime = checkPrime(i);

            if (isPrime && count < 11) {
            sum = sum + i;
            count ++ ;

            }

        }

        return sum;

    }
    public static void main(String[] args)

    {

        int firstnum = 2, lastnum =1000;
        Test_2 test2 = new Test_2();
        int sum = test2.primeSum(firstnum,lastnum);
        System.out.println(sum);
      

    }
}