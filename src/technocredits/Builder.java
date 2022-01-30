package technocredits;

public class Builder {

	final int GSTNUMBER; // Blank final variable
	final String BUILDERNAME; 
	String address;
	
	Builder(int gstNumber, String builderName){
		//this();
		GSTNUMBER = gstNumber;
		this.BUILDERNAME = builderName;
	}
	
	Builder(){
		this(1112,"Vaibhav");
		//GSTNUMBER = 111;
		//this.BUILDERNAME = "Deepak";
	}
	
	void setAdress(String address) {
		this.address = address;
	}
	
	void printDetails() {
		System.out.println(BUILDERNAME + "--" + GSTNUMBER);
	}
}
