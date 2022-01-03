package yogeshNimbalkar;

public class A18_Case2 {

	public static void main(String[] args) {
		A18_Child child = new A18_Child();
		System.out.println(child.x);	//Parent properties travel to child class 
		System.out.println(child.y);
		System.out.println(child.z);
		child.m1();		//Parent properties travel to child class
		child.m2();	//Parent to child those eligible properties travel that child class do not have, - therefore m2 of child get executed here. 
		child.m3();
	}
}
