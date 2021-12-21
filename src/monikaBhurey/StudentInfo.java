package monikaBhurey;
class StudentInfo
{
		String Name,middlename,surname,birthdate,address;
		int rollno;
		
		void setData(){
			Name = "Shikha";
			middlename = "Amit";
			surname = "Patel";
			birthdate = "10th Aug 1998";
			address = "G-809, Heaven Apartment, Baner, Pune.";
			rollno = 34;
		}
		
		void studentName(){
			System.out.println(Name);
			System.out.println(middlename);
			System.out.println(surname);
		}
		
		void studentOtherDetails(){
			System.out.println(birthdate);
			System.out.println(address);
			System.out.println(rollno);
		}
		
		public static void main(String[] args){
			StudentInfo studentinfo = new StudentInfo();
			studentinfo.setData();
			studentinfo.studentName();
			studentinfo.studentOtherDetails();
		}	
}
