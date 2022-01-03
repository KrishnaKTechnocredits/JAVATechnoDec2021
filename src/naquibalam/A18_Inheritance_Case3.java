package naquibalam;

public class A18_Inheritance_Case3 {

	public static void main(String[] args) {
		A18_Inheritance_Parent parentDataType_ChildClass = new A18_Inheritance_Child();
		System.out.println(parentDataType_ChildClass.x);
		System.out.println(parentDataType_ChildClass.y);
		//System.out.println(parentDataType_ChildClass.z);
		
		parentDataType_ChildClass.m1();
		parentDataType_ChildClass.m2();
		//parentDataType_ChildClass.m3();
	}
}
