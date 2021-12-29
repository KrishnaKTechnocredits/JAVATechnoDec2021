package debasmita;

public class Test_1 {
	int count,sum;
	void isPrime(int num) {
		boolean flag = true;
		if(count<10) {
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				flag= false;
				break;
			}
		}
		    if(flag==true) {
			  sum=sum+num;
			  count++;
		}
	}
}
	void sumOfFirst10PrimeNosInRange(int fno,int lno) {
		  sum = 0;
	     for(int startNo=fno; startNo<=lno; startNo++) {
			isPrime(startNo);
		 }
	       System.out.println(sum);
	}
		
	public static void main(String[] args) {
		Test_1 test = new Test_1();
		test.sumOfFirst10PrimeNosInRange(10,100);
	}
}
			
			
		
	


