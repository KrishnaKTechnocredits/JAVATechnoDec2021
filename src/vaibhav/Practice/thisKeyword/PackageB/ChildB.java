package vaibhav.Practice.thisKeyword.PackageB;

import vaibhav.Practice.thisKeyword.PackageA.ParentA;

public class ChildB extends ParentA {

	void m1() {
		int x = 100;

		ChildB child = new ChildB();
		ParentA parentA = new ParentA();

		System.out.println("Print x : " + x);
		System.out.println("Print this.x :" + this.x);
		System.out.println("Print child.x :" + child.x);

		System.out.println("Print super.x :" + super.x);
		//System.out.println("Print parentA.x :" + parentA.x);

		System.out.println();
		System.out.println("Print this 	:" + this);
		System.out.println("Print child	:" + child);
		//System.out.println("Print super :" + super);
		System.out.println("Print parentA	:" + parentA);

	}

	public static void main(String[] args) {
		ChildB childB = new ChildB();
		childB.m1();

	}
}
