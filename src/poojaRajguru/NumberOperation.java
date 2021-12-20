package poojaRajguru;

class NumberOperation{
	void evenNumber(int start , int end){
		System.out.println("The Even no are as Follows : ");
		for(int i=start;i<=end;i++){
			if(i%2 ==0)
				System.out.println(i);			
		}
	}
	
	void divFive(int start , int end){
		System.out.println("The Numbers divisible by 5 are as Follows : ");
		for(int i=start;i<=end;i++){
			if(i%5 ==0)
				System.out.println(i);			
		}
	}	
	
	void divFiveAndThree(int start , int end){
		System.out.println("The Numbers divisible by 3 and 5 are as Follows : ");
		for(int i=start;i<=end;i++){
			if(i%3==0 && i%5 ==0)
				System.out.println(i);			
		}
	}	
	
	void divSevenOrThirteen(int start , int end){
		for(int i=start;i<=end;i++){
		if(i%7==0)
			System.out.println("No is divisible by 7 : " + i);			
		else if(i%13 ==0)
				System.out.println("No is divisible by 13 : " + i);			
		}
	}	
	
	void addition(int start , int end){
		int sum = 0;
		for(int i=start;i<=end;i++)
			sum = sum+i;
			System.out.println("The Sum is : " + sum  );
	}

	void difference(int start , int end){
		int even = 0 , odd = 0;
		for(int i=start;i<=end;i++){
			if(i%2 == 0)
				even = even + i;
			else 
				odd = odd + i ;
		}
		System.out.println("The Differnece is : " + ( even - odd ));
	}	
	
	void reverse(int start , int end){
		int even = 0 , odd = 0;
		for(int i=end;i>= start;i--){
			if(i%2 == 1)
				System.out.println(i);
		}
	}	
		
	public static void main(String[] args){
		NumberOperation No = new NumberOperation();
		No.evenNumber(10,15);
		No.divFive(10,30);
		No.divFiveAndThree(5,18);
		No.divSevenOrThirteen(5,40);
		No.addition(1,5);
		No.difference(3,9);
		No.reverse(1,5);
	}
}