package rohini;

/*Assignment - 10 : 23rd Dec’2021
Create a class to satisfy below requirements.
a) Print Number is prime if Given number is prime. (parameterized method)
b) Print all the prime numbers between range 100->120. (parameterized method)
c) Print total count of prime numbers between 100->120.
d) Find sum of all prime numbers between 100->120
e) Find avg of prime numbers between 100->120*/

public class Rohini_Assignment10 {
	
	int count,sum;
	boolean isfindPrimeNumber(int Num) {
		boolean flag=true;
		for(int index=2;index<=Num/2;index++)
		{
			if(Num%index==0) {
			flag=false;
			break;
			}
			
		}
		if(flag==true) { 
			System.out.println("Prime Number : "+Num);}

		
		return flag;
		
	}
	
	void findPrimeInRange(int startNum,int endNum) {
		int sum=0,count=0,avg=0;
		for(int index=startNum;index<=endNum;index++) {
			boolean flag = isfindPrimeNumber(index);
			if(flag == true) {
				count++;
				sum = sum + index;
			}
	}
		System.out.println("Sum of all prime Numbers is : "+sum);
		System.out.println("count of all prime Numbers is : "+count);
		System.out.println("Average of all prime Numbers is : "+(sum/count));
		
	}
	
	public static void main(String[] args) {
		Rohini_Assignment10 primeNum = new Rohini_Assignment10();
	    primeNum.isfindPrimeNumber(87);
	    primeNum.findPrimeInRange(100, 120);
		
	}

}
