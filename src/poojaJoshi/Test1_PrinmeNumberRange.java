package poojaJoshi;

public class Test1_PrinmeNumberRange {
	
	boolean isPrimeNo(int num){
		boolean flag = true;
		for(int i=2;i<=(num/2);i++){
			if(num%i==0){
				flag = false;
				break;
			}
		}
		/*if(flag==true)
		{
			//System.out.println( num  + " The prime Number " );
		}	*/	
			return flag;
	}

	void sumOfPrimNumber(int fnum , int lnum){
		int sum = 0 , cnt = 0 , num = fnum;
		while(cnt < 10 && num <= lnum){
			if(isPrimeNo(num) == true){
				cnt++;
				sum = sum + num;
			}
			num++;
		}
		System.out.println("first 10 Prime numbers sum in range of " +fnum+ " and " +lnum+ " is: " + sum);
	}

	public static void main(String[] args){
		Test1_PrinmeNumberRange pn = new Test1_PrinmeNumberRange();
		pn.sumOfPrimNumber(20,90);
	}
}
