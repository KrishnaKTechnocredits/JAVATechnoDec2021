package yogeshNimbalkar;

public class A18_Case1 {

	public static void main(String[] args) {
		A18_Parent parent1 = new A18_Parent();
		System.out.println(parent1.x);
		System.out.println(parent1.y);
//		System.out.println(parent1.z); Child properties can not travel from child to parent, - not visible in Parent class 
		parent1.m1();
		parent1.m2();
//		parent1.m3(); Child properties can not travel from child to parent, - not visible in Parent class
	}
}
