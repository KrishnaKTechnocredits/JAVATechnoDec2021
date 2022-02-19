package gauravk.Programs47;
/*
 * 19.Compute the first five Fibonacci numbers.
o/p : 0, 1, 1, 2, 3
 */
public class FirstNFibonacci {
	
	void firstNFibonacci(int n) {
		int x = 0;
		int y = 1;
		int a=0;
		System.out.print(x+","+y+",");
		for(int i= 3; i<=n; i++) {
			a=x+y;
			x=y;
			y=a;
			System.out.print((a)+",");
		}
	}
	
	public static void main(String[] args) {
		FirstNFibonacci fibo = new FirstNFibonacci();
		fibo.firstNFibonacci(10);
	}
}
