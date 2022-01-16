package nasir;
class A22_FibonacciSeries {
	void fibonacciNumbers(int input){  //0,1,1,2,3,5,8,13
		int num1=0;
		int num2=1;
		System.out.println(num1);
		System.out.println(num2);
		for(int index=1; index<=input-2; index++){
			num2=num1+num2; //1 , 1+1 =2
			System.out.println(num2); //1 , 2
			num1 =num2-num1; // 1-0 = 1
		}
		System.out.println("..............");
	}
	
	void seriesStartFrom5(int endNumber){
		int num1=2;
		int num2=3;
		for(int index=0; index<endNumber; index++){
			num2=num1+num2;
			num1 =num2-num1;
				if(num2>=5){
			System.out.println(num2);
	}
		}
		System.out.println("..............");
	}
	
	void startFrom5To34(int endNumber){
		int num1=2;
		int num2=3;
		for(int index=0; index<endNumber; index++){
			num2=num1+num2;
			num1 =num2-num1;
				if(num2>=5 && num2<=34){
			System.out.println(num2);
	}
		}
	}
	
	void generateSumMoreThan50(int input){  //0,1,1,2,3,5,8,13
		int num1=0;
		int num2=1;
		int sum=0;
		int count=0;
		for(int index=1; index<input; index++){
			num2=num1+num2; 
			num1 =num2-num1;
			sum=sum+num2; 
			count++;
			if(sum>=50)
				System.out.println("Total count of Fibonacci number which generate more than or equal to 50 is "+count);
			
		}
		System.out.println("..............");
	}
	public static void main(String[]args){
		A22_FibonacciSeries fibonacci = new A22_FibonacciSeries();
		fibonacci.fibonacciNumbers(8);
		fibonacci.seriesStartFrom5(3);
		fibonacci.startFrom5To34(34);
		fibonacci.generateSumMoreThan50(8);
	}
}