package technocredits.overridingdemo;

public class Employee {//extends Manager{

	public void m1() {
		
	}
	
	/* Manager class final method can't be overriden
	 * void m2() {
		
	}*/
	
	public static void main(String[] args) {
		Manager mng = new Manager();
		mng.name = "Techno";
		mng.x = 1000;
	}
}
