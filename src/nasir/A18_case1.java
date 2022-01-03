package nasir;
// this case used when parent class object is created at the time of Inheritance
public class A18_case1 {
	public static void main(String[] args) {
		A18_India india =new A18_India();
		System.out.println(india.stateName);
		System.out.println(india.udaiNumber);
		//System.out.println(india.eid); // CE: Compile time error because eid variable is belongs to child class and reference variable of object gaureentee of parent class
		india.setId();
		india.findCitizen();
		//india.eidId();//CE :Compile time error because eidID() method is belongs to child class and reference variable of object gaureentee of parent class 
	
		
	}
}
