package sham;

public class Test1_FindSum {
	int count;

	void findPrimeNumbers(int num) {
		boolean flag = true;

		for(int i=2; i<num/2; i++) {			
			if(num%i == 0) {
				flag = false;
				break;
			}	
		}
		if(flag == true) {
			count++;
		}
	}

	void display(int startRange, int endRange) {
		int sum =0;
		for(int i = startRange; i<=endRange; i++) {
			if(count<10) {			
				findPrimeNumbers(i);
				sum = sum +i;				
			}			
		}
		System.out.println("Sum of given Range From "+startRange+ "  and End Range "+endRange+" is:  "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1_FindSum p2_sumOfPrimeNo = new Test1_FindSum();
		p2_sumOfPrimeNo.display(40,100);
	}

}
