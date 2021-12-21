package swati;
public class A1_Student {

	String name;
	String middle;
	String last;
	String Bdate;
	String Address;
	int Rollno;
	
	void setData(String name,String middle,String last,String Bdate,String Address,int Rollno) {
		
		this.name=name;
		this.middle=middle;
		this.last=last;
		this.Bdate=Bdate;
		this.Address=Address;
		this.Rollno=Rollno;
	}
	void studentName() {
		System.out.println(name);
		System.out.println(middle);
		System.out.println(last);
	}
	void studentOther() {
		System.out.println(Bdate);
		System.out.println(Address);
		System.out.println(Rollno);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A1_Student student=new A1_Student();
student.setData("Jui", "Sagar", "Parab", "19Aug","NJ" , 3);
student.studentName();
student.studentOther();
	}

}
