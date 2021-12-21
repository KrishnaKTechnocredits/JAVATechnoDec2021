package krishna;

class A5_Candidate{
	String name, middlename, surname, address, dateofbirth;
	int rollnumber;
		
	void candidateName(){
		name="Krishna";
		middlename="Kumar";
		surname="Aditya";
		System.out.println(name);
		System.out.println(middlename);
		System.out.println(surname);
	}	
			
	void candidateOtherDetails(){
		dateofbirth="10th Aug 1998";
		address="G-809,Heaven Apartment,Baner,Pune";
		rollnumber=34;
		System.out.println(dateofbirth);
		System.out.println(address);
		System.out.println(rollnumber);
	}
	
	public static void main (String[] args){
		A5_Candidate c1 = new A5_Candidate();
		c1.candidateName();
		c1.candidateOtherDetails();
	}
}