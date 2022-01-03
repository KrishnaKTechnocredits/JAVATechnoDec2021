package nasir;
// Case 2 will able to take all variable and methods of both class because UAE is child class which is inherited by India class. Child class can access all variable and methods of Parent class
public class A18_case2 {
	public static void main(String[] args) {
		A18_UAE uae =new A18_UAE();
		System.out.println(uae.stateName);
		System.out.println(uae.udaiNumber);
		System.out.println(uae.eid);
		uae.setId();
		uae.findCitizen();
		uae.eidId();
	}
}
