/*Name : Pooja Rajguru
Test 1 , 25/12/2021*/

package poojaRajguru;

public class Test1_PrimeNumber {
	
	boolean isPrimeNo(int num){
		boolean flag = true;
		for(int i=2;i<=(num/2);i++){
			if(num%i==0){
				flag = false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println( num  + " The prime Number " );
		}		
			return flag;
	}
	
	void sumOfPrimNumber(int start , int end){
		int sum = 0 , cnt = 0 , num = start;
		while(cnt < 10 && num <= end){
			if(isPrimeNo(num) == true){
				cnt++;
				sum = sum + num;
			}
			num++;
		}
		System.out.println("Sum of fiest 10 prime numbers in range " + start+ " to " + end+ " is : " + sum);
	}

	public static void main(String[] args){
		Test1_PrimeNumber pn = new Test1_PrimeNumber();
		pn.sumOfPrimNumber(5,40);
	}
}

