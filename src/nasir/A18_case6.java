package nasir;

public class A18_case6 {
	public static void main(String[] args) {
		A18_India india = new A18_UAE();
		A18_UAE uae =new A18_UAE();
		uae=(A18_UAE)india;//External type casting used because reference Type for both class are different and class India is parent class so we need to bring this down to make equal of child refernece type
		System.out.println(uae.stateName);
		System.out.println(uae.eid);
		System.out.println(uae.udaiNumber);
		uae.eidId();
		uae.findCitizen();
		uae.setId();
	}
}
