package rohini;

public class Rohini_Test1_Program2 {
 
	void FindSumofPrime(int startNum,int endNum) {
		int sum=0,count=0;
		boolean flag=true;
		for(int i=startNum;i<=endNum;i++) {
			for (int j =i;j<=i/2;j++) {
			if(j%i==0) {
				flag=false;
				
				}
			}
			if(count==10 && flag==true)
				sum=sum+i;
		        count++;
			}
		System.out.println("Sum is : "+sum);
	
	}
	
	public static void main(String[] args) {
		Rohini_Test1_Program2 primeNum= new Rohini_Test1_Program2();
		primeNum.FindSumofPrime(100,220);
		

	}

}
