package omkar;

class Assignment5{
	void range(int r1 , int r2 ){
		for(int i=r1;i<=r2;i++){
			int ans=i%2;
			if(ans==0)
			System.out.println("Even number is " +i);
			}
	}
	
	void divBy5(int r1, int r2){
		for (int i = r1; i<=r2 ; i++){
			int ans = i%5;
			if(ans==0)
			System.out.println(" Divisible by 5 , number is " +i);
		}
	}
	
	void divBy3And5(int r1, int r2){
		for (int i = r1; i<=r2 ; i++){
			int ans1 = i%3 ;
			int ans2 = i %5 ;
			if( ans1 == 0 && ans2 == 0)
			System.out.println(" Divisible by 5 & 3, numbers are: " +i);
		}
		
	}
	
	void divBy7OR13(int r1, int r2){
		for (int i = r1; i<=r2 ; i++){
			int ans1 = i%7 ;
			int ans2 = i %13 ;
			if( ans1 == 0)
			System.out.println(i +  " Divisible by 7 ");
			else if ( ans2 == 0)
			System.out.println(i + " Divisible by 13");	
		}
	}
	
	void totalAdd(int r1, int r2){
		int sum=0 ; 
		for (int i = r1; i<=r2 ; i++){
			sum = sum+i ;
		}
		System.out.println(" total is" +sum);
	}

	void diffOddEven(int r1 , int r2 ){
		int evenNo=0;
		int oddNo=0;
		for(int i=r1;i<=r2;i++){
			int ans=i%2;
			if (ans==0)
				evenNo=evenNo+i;
			else
				oddNo=oddNo+i;
		}	
		int total=oddNo-evenNo;
		System.out.println("Diff is  " +total);
	}
	
	void oddRevers(int r1 , int r2){
		for (int i=r2;i>=r1; i--){
			if (i%2==1)
			System.out.println(i);			
		}	
	}
	
	public static void main(String [] args){
		Assignment5 assignment5 = new Assignment5();
		assignment5.range(10,20);
		assignment5.divBy5(5,15);
		assignment5.divBy3And5(1,15);
		assignment5.divBy7OR13(1,26);
		assignment5.totalAdd(1,5);
		assignment5.diffOddEven(3,9);
		assignment5.oddRevers(10,20);
	}	

}