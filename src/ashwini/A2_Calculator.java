package ashwini;

public class A2_Calculator {
		int num1=10;
		int num2=2;
		
		void add()
		{
			int ans=num1+num2;
			System.out.println("The additon is: "+ans);
		}
		
		void sub()
		{
			int ans=num1-num2;
			System.out.println("The substraction is: "+ans);
		}
		
		void div()
		{
			int ans=num1/num2;
			System.out.println("The division is: "+ans);
		}
		
		void mul()
		{
			int ans=num1*num2;
			System.out.println("The multiplication is: "+ans);
		}
		
		public static void main(String[] args)
		{
			A2_Calculator c=new A2_Calculator();
			c.add();
			c.sub();
			c.div();
			c.mul();
		}
}
