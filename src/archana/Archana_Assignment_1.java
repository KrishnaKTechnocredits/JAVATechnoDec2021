package archana;
class Archana_Assignment_1{
	String name , middleName , surname ,birthdate, address  ;
	int rollno  ;
	
	void setdata(){
		name = "Archana" ;
		birthdate = "4th Apr 1986";
		middleName = "Manoj" ;
		surname = "Jadhav" ; 
		address = "501-LaChapelle Baner" ;
		rollno = 1 ;
	}
	
	void studentName(){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails(){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollno);
		
	}
	
	public static void main(String[]args){
		Archana_Assignment_1 studinfo = new Archana_Assignment_1 ();
		//studinfo.setdata();
		studinfo.studentName();
		studinfo.studentOtherDetails();
	}
	
	
	
}