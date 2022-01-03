package nasir;

public class A18_case3 {
public static void main(String[] args) {
	A18_India india =new A18_UAE(); // This is dynamic polymorphism
	System.out.println(india.stateName);
	System.out.println(india.udaiNumber);
	//System.out.println(india.eid); //CE: compilation error because india is refernece variable of India class so it will gaurentee of India class. Property ( variable ) does not get changed at the time of dynamic polymorphism 
	india.findCitizen();// this method is same in both classes but in runtime, behaviour(methods) will get changed and JVM will take method of child class
	india.setId();
	//india.eidId();////CE: compilation error because eidId() method is not exactly same in both classes.
	
}
}
