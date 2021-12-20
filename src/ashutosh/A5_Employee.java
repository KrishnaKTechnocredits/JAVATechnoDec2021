package ashutosh;

class A5_Employee{
		
		int empid;
		String empname;
		int deptid;
		
		void printData (){
		
				int x=10;
				System.out.println ("Employee ID is " + empid);
				System.out.println ("Employee ID is " + empid + " And Employee name is " + empname);	
		
		}
		
		public static void main (String[] args){
		
		A5_Employee employee = new A5_Employee ();
		employee.printData(); 
		
		}


}