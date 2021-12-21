package anvit;

class A5_Evennumbers{
	
	void evenNumbers(){
		System.out.println("Even numbers are: ");
		for(int i=10; i<=15; i++){
			if(i%2==0)
				System.out.println(i);
		}
	}
	
	void divisibleby5(){
		System.out.println("Divisible by 5, numbers are:");
		for(int i=10; i<=30; i++){
			if(i%5==0)
				System.out.println(i);
		}
	}
	
	void divisibleby5and3(){
		System.out.println("Divisible by 5 & 3, numbers are: ");
		for(int i=5; i<=18; i++){
			if(i%5==0 && i%3==0)
				System.out.println(i);
		}
	}
	
	void divisibleby7or13(){
		System.out.println("Divisible by 7 or 13, numbers are: ");
		for(int i=5; i<=40; i++){
			if(i%7==0){
				System.out.println(i + " is divisible by 7");
			}else if(i%13==0){
				System.out.println(i + " is divisible by 13");
			}
		}
		
	}
	
	void sum(){
		int i = 1;
		int t = 0;
		for( ; i<=5; i++){
			t = t + i;
		}
		System.out.println("sum is " + t);
	}
	
	void difference(){
		int n = 0;
		int w = 0;
		for(int i=3; i<=9; i++){
			if(i%2==0){
				n=n+i;
			}else if(i%2!=0){
				w=w+i;
			}
		}
		System.out.println(w-n);
	}
	
	void odd(){
		for(int i=20; i>=10; i--){
			if(i%2!=0){
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args){
		A5_Evennumbers assignment5 = new A5_Evennumbers();
		assignment5.evenNumbers();
		System.out.println();
		assignment5.divisibleby5();
		System.out.println();
		assignment5.divisibleby5and3();
		System.out.println();
		assignment5.divisibleby7or13();
		System.out.println();
		assignment5.sum();
		System.out.println();
		assignment5.difference();
		System.out.println();
		assignment5.odd();
	}
}