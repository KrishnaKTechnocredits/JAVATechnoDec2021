package shital;

class A5{
	
	void findEvenNo(){
		System.out.println("Even No between 10 to 15: ");
		for(int num=10;num<=15;num++){
			if(num%2 ==0)
				System.out.println(num);			
		}
	}
	
	void diviesiblNoCaseOne(){
		System.out.println("List of No Divisible by 5: ");
		for(int num=10;num<=30;num++)
			if(num%5==0)
				System.out.println(num);
	}
	
	void divisibleNoCaseTwo(){
		System.out.println("List of No Divisible by 5 & 3: ");
		for(int num=5;num<=18;num++)
			if(num%5==0 && num%3==0){
				System.out.println(num);
			}
	}
	
	void divisibleNoCaseThree(){
		System.out.println("List of No Divisible by 7 or 13: ");
		for(int num=5;num<=40;num++)
			if(num%7==0 || num%13==0){
				if(num%7==0)
					System.out.println(num +" is Divisible by 7");
				else
					System.out.println(num +" is Divisible by 13");
			}
	}
	
	void sum(){
		int ans=0;
		for(int num=1;num<=5;num++)
			ans=ans+num;
			System.out.println("Sum of 1 to 5 Numbers: "+ans);
	}
	
	void evenOddDifference(){
		System.out.println("Difference between Even and Odd No: ");
		int even=0;
		int odd=0;
			for(int num=3;num<=9;num++)
				if(num%2==0)
					even=even+num;
				else 
					odd=odd+num;
				System.out.println(odd-even);
	}
	
	void reverseOrder(){
		System.out.println("odd numbers in reverse order: ");
		for(int num=20;num>=10;num--)
			if(num%2 !=0)
				System.out.println(num);
	}
	
	public static void main(String[]args){
		A5 assignment5=new A5();
		assignment5.findEvenNo();
		assignment5.diviesiblNoCaseOne();
		assignment5.divisibleNoCaseTwo();
		assignment5.divisibleNoCaseThree();
		assignment5.sum();
		assignment5.evenOddDifference();
		assignment5.reverseOrder();
	}
}