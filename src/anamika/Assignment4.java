package anamika;

public class Assignment4 {
	 void dayindex(int index) {
		 if (index>=1 && index<=5)
			 System.out.println("Weekdays");
		 else if (index==6 || index==7)
			 System.out.println("Weekend");
		 else
			 System.out.println("Invalid Index");
	 }
	 
	 public static void main (String[] args) {
		 Assignment4 assignment4=new Assignment4();
		 assignment4.dayindex(4);
		 
	}

}
