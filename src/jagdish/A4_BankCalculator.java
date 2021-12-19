package jagdish;
class A4_BankCalculator
{
	int number1 = 10;
	int number2 = 2;
	int total;
	
	void add()
	  {
        total = total+ (number1 + number2);
	    System.out.println("Addtion is " + total);
	  }
	   
	void sub()
	  {
        total = total + (number1 - number2);
	    System.out.println("Subtraction is " + total);
	  }
	   
	void multi()
	  {
        total = total +(number1 * number2);
	    System.out.println("multiplication is " + total);
	  }
	   
	void divi()
	  {
        total = total + (number1 / number2);
	    System.out.println("Division is " + total);
	  }  
	  
	void printtotal()
	 {
		 System.out.println(total);
	 }
	 
	 public static void main(String[] args)
	  {
		 A4_BankCalculator bankcalculator = new A4_BankCalculator();
		 bankcalculator.add();
		 bankcalculator.sub();
		 bankcalculator.multi();
		 bankcalculator.divi();
		 bankcalculator.printtotal();
	  }
}