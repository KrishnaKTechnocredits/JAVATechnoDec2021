package kavleen;

public class Assignment22 {

	static void First(int n) {
		int num1 = 0 ;
		int num2 = 1;
		int temp = 0 ;
		System.out.println(num1);
		for(int i = 0 ; i<=n-2;i++) {
			temp = num1 + num2;
			num1 = num2 ;
			num2 = temp;
			System.out.println(num1);
		}
		
	}
	
	static void seriesFromFifth(int n ) {
		int num1 = 0 ;
		int num2 = 1;
		int temp = 0 ; 
		while(num1<=n) {
			temp = num1+num2;
			num1= num2;
			num2= temp;
			if(num1>=5)
				System.out.println(num1);
		}
	}
	static void seriesEndwith(int startNum , int endNum) {
		int num1=0 ;
		int num2=1;
		int temp=0;
		while(num1<=5 ||num1<=endNum) {
			temp = num1+num2;
			num1= num2;
			num2= temp;
			if(num1>=5 && num1<=endNum)
		      System.out.println(num1);
		}
	}
	static  void sumofFibonacciSeries(){
		int num1=0;
		int num2=1;
		int temp=0;
		int sum=0;
		int count=0;
		sum=sum+num1;
		while(sum<=50){
			temp=num1+num2;
			num1=num2;
			num2=temp;
			count++;
			sum=sum+num1;
		}
	     System.out.println(count +" numbers are required to genereate Fibonacci Series sum >=50 ");
	}
	public static void main (String [] args) {
		System.out.println("First n numbers Fibonacci series");
		Assignment22.First(8);
		System.out.println("Fibonacci series from fifth place");
		Assignment22.seriesFromFifth(8);
		System.out.println("Fibonacci series from fifth place to thirteenth");
		Assignment22.seriesEndwith(5, 13);
		System.out.println("Fibonacci series sum uptill 50");
		Assignment22.sumofFibonacciSeries();
	}
}
