package technocredits.overridingdemo;

// final is a keyword
// final keyword is applicable on variables , methods, class
// variable - we can't change the value of final variable, reinitialization is not allowed
// local and instance variable can be declared as final.
// final static variables are allowed, static -> shared/single copy and final -> we can't reinitialize that variable
// private final static variable are allowed ??? Yes
// final method can't be overriden
// if class is final then we can't extends that class.

final public class Manager {
	private final static String COLNAME = "MIT"; 
	private final static String DBUSERNAME = "mkanani";
	private final static String DBPASSWORD = "mkanani123";
	String name = "Maulik";
	int x = 10;
	
	void m1() {
		//x = 10;
		//x++; // x = x + 1;
		System.out.println(x+1);
		int y = x + 10 + x ;
		System.out.println(x++);
		int total = 100;
		total = 200;
		total++;
		
		final double pi = 3.14;	
	}
	
	final void m2() {
		
	}
	
}
