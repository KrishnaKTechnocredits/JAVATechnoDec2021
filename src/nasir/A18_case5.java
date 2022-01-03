package nasir;

public class A18_case5 {
public static void main(String[] args) {
	A18_India india=new A18_India(); // after line 6, this will be India india = new UAE();
	A18_UAE uae =new A18_UAE();
	india=uae; // we are assigning uae value into india reference variable hence india will have new UAE(). this becomes [India india=new UAE()]
	System.out.println(india.stateName);
	System.out.println(india.udaiNumber);
	//System.out.println(india.eid);//Compilation error because Variable of class UAE (Child class ) will not be counted 
	india.setId();
	india.findCitizen(); // output will be of child class i.e. UAE class because compile to run time methods get changed
	//india.eidId();// compilation error because method are not exactly same in both classes.
	
}
}
