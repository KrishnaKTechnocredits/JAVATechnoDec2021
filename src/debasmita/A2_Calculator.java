package debasmita;

public class A2_Calculator { 
	 int sum ,difference, mul, div;
		
		void add(int x,int y) {
		       sum = x+y;
			   System.out.println(sum);
	    }
		void subtract(int x,int y) {
		       difference = x-y;
			   System.out.println(difference);
		}
		void multiply(int x, int y) {
		       mul = x*y ;
			   System.out.println(mul);
		}
		void division(int x, int y) {
		       div = x/y ;
			   System.out.println(div);
		}
		public static void main(String[] args) {
			A2_Calculator calculator = new A2_Calculator();
			calculator.add(50,25);
			calculator.subtract(45,35);
			calculator.multiply(15,14);
			calculator.division(60,30);
		}

}
