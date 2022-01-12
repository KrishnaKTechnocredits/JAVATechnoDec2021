package vaibhav.Practice.PriorityForImportStatement.P1;

import vaibhav.Practice.PriorityForImportStatement.P2.B;

public class A {

	
	void m1() {
		System.out.println("P1.A");
	}

	public static void main(String[] args) {
	
		// Import Statement will take consider the 
		B b1 = new B();
		b1.m1();
		
		// Qualified path
		vaibhav.Practice.PriorityForImportStatement.P1.B b2 = new vaibhav.Practice.PriorityForImportStatement.P1.B();
		b2.m1();
	}
}
