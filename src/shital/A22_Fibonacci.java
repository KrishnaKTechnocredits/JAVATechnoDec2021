package shital;

class A22_Fibonacci{
	
	int n=8;
	
	void findFibonacciSeries_Case1(){
		//Print first n no of fibonacci series ( 8 numbers )-Case1
		int num1=0;
		int num2=1;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=num1;i<n-2;i++){
			int temp=num1+num2;
			System.out.println(temp);
			num1=num2;
			num2=temp;
		}
	}
	
	void fibonacciSeries_Case2() {
		////Print first n no of fibonacci series (without third variable)-Case1
		int num1=0;
		int num2=1;
		System.out.println(num1);
		System.out.println(num2);	
		for(int i=num1;i<n-2;i++) {
			num2=num1+num2;
			System.out.println(num2);
			num1=num2-num1;		
		}
	}
	
	void fibonacciSeries_Case3() {
		int num1=0;
		int num2=1;
		for(int i=0;i<n-2;i++) {
			num2=num1+num2;
			if(num2>=5) 
				System.out.println(num2);
			num1=num2-num1;
		}
	}
	
	void fibonacciSeries_Case4() {
		int num1=0;
		int num2=1;
		for(int i=0;i<n;i++) {
			num2=num1+num2;
			if(num2>=5 || n>=34)
				System.out.println(num2);
			num1=num2-num1;
		}
	}
	
	void fibonacciSeries_Case5() {
		int num1=0;
		int num2=1;
		int count=0;
		int sum=0;
		for(int i=0;i<n;i++) {
			num2=num1+num2;
			num1=num2-num1;
			while(sum>50)
				sum=sum+num2;
				count++;
		}
		System.out.println("Total Count of Number for addition is:"+count);
		
	}
	public static void main(String[] args){
		A22_Fibonacci fibonacci=new A22_Fibonacci();
		System.out.println("Case 1 - Fibonacci Series with Third Variable:");
		fibonacci.findFibonacciSeries_Case1(); //Case1
		System.out.println("Case 2 - Fibonacci Series without Third Variable:");
		fibonacci.fibonacciSeries_Case2(); //case2
		System.out.println("Case 3 - Fibonacci Series Start from 5");
		fibonacci.fibonacciSeries_Case3();
		System.out.println("Case 4 - Fibonacci Series Start from 5 and End 34");
		fibonacci.fibonacciSeries_Case4();
		System.out.println("Case 5 - Fibonacci number addition till 50");
		fibonacci.fibonacciSeries_Case5();
	}
}