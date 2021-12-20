package ashutosh;

class Employee{
		
		int empid;
		String empname;
		int deptid;
		
		void printData (){
		
				int x=10;
				System.out.println ("Employee ID is " + empid);
				System.out.println ("Employee ID is " + empid + " And Employee name is " + empname);	
		
		}
		
		public static void main (String[] args){
		
		Employee employee = new Employee ();
		employee.printData(); 
		
		}


}