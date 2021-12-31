package rashmi;

public class Asgmnt2Calculator {
	void add(int num1,int num2)
	{
	  int ans = num1+num2;
	  System.out.println(ans);
	}
	void sub(int num1,int num2)
	{
	  int ans = num1-num2;
	  System.out.println(ans);
	}
	void mul(int num1,int num2)
	{
	  int ans = num1*num2;
	  System.out.println(ans);
	}
	void div(int num1,int num2)
	{
	  int ans = num1/num2;
	  System.out.println(ans);
	}
	public static void main (String [] args){
	 Asgmnt2Calculator asgmnt2calculator = new Asgmnt2Calculator();
	 asgmnt2calculator.add(10,5);
	 asgmnt2calculator.sub(10,5);
	 asgmnt2calculator.mul(10,5);
	 asgmnt2calculator.div(10,5);
	}
}
