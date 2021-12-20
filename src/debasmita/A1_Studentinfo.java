package debasmita;

public class A1_Studentinfo {
	 String name;
	   String middlename;
	   String surname;
	   String birthdate;
	   String address;
	   int rollNumber;
	   
	   void setData() {
	       name = "Debasmita";
		   surname = "Mishra";
		   birthdate = "23rd Feb 1993";
		   address = "D7 103 Kendriya Vihar";
		   rollNumber = 04;
		}
	   void studentName() {
	       System.out.println(name);
		   System.out.println(middlename);
		   System.out.println(surname);
	   }
	   void studentOtherDetails() {
	       System.out.println(birthdate);
		   System.out.println(address);
		   System.out.println(rollNumber);
	   }
	   public static void main(String[] args) {

	       A1_Studentinfo studentinfo = new A1_Studentinfo();
	       studentinfo.setData();
	       studentinfo.studentName();
	       studentinfo.studentOtherDetails();
	   }

}
