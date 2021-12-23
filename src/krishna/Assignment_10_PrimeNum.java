package krishna;

public class Assignment_10_PrimeNum {
	int countPNum;
	int sumPNum;
	
	void isPrimeNum(int avail_Num) {
		boolean flag = true;
		
		for(int i=2; i<=avail_Num/2; i++) {
			if(avail_Num % i == 0) {
				//System.out.println(avail_Num + " : Is not a Prime Number");
				flag = false; 
				break;
			}
		}
		
		if(flag == true) {
			countPNum++;
			sumPNum = sumPNum + avail_Num;
			System.out.println(avail_Num + " : Is a Prime Number");
		}
	}
	
	
	void findPrimeNum(int start, int end) {
		System.out.println("Given range is : " + (start) + " to "  +(end) +" :- ");
		countPNum = 0;
		sumPNum = 0;
		for(int i = start; i<=end; i++) {
			isPrimeNum(i);
		}
	}
	
	void count_PrimeNum() { 
		System.out.println("All available Prime Number present in range is : " + countPNum);
	}
	
	void sum_PrimeNum() {
		System.out.println("The Sum of Prime Nummber present in range is : " + sumPNum);
	}
	
	void avrg_PrimeNum(){
		double avrg = 0;
		avrg = (float)sumPNum / countPNum;
		System.out.println("The Average of Prime Nummber present in range is : " + avrg);
		}
	
	public static void main(String[] args) {
		Assignment_10_PrimeNum pNum = new Assignment_10_PrimeNum();
		pNum.isPrimeNum(13);
		System.out.println();
		pNum.findPrimeNum(5, 20);
		System.out.println();
		pNum.count_PrimeNum();
		System.out.println();
		pNum.sum_PrimeNum();
		System.out.println();
		pNum.avrg_PrimeNum();
	}

}
