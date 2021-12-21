package debasmita;

public class A4_Week {
	 void check(int index) {
	      if(index>=1 && index<=5) {
		      System.out.println("It is a Weekday");
		  }
		  else if(index>5 && index<=7) {
		      System.out.println("It is a Weekend");
		  }
		  else { 
		      System.out.println("Invalid index");
		  }
	    }
		
	   public static void main(String[] args) {
	        A4_Week week = new A4_Week();
			week.check(1);
			week.check(6);
			week.check(9);
	   }
}
