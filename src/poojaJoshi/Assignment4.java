package poojaJoshi;

class Assignment4{
	
	void findWeekdaysAndWeekends(int dayIndex){
		if(dayIndex>=1 && dayIndex<=5){
			System.out.println("Weekday");
		}
		else if(dayIndex>=6 && dayIndex<=7){
			System.out.println("Weekend");
		}
		else if (dayIndex>=7 || dayIndex <=1){
			System.out.println("Invalid Index");
		}
	}
	
	
	public static void main (String[] args){
		Assignment4 assignment4 = new Assignment4();
		assignment4.findWeekdaysAndWeekends(3);
		assignment4.findWeekdaysAndWeekends(6);
		assignment4.findWeekdaysAndWeekends(11);
		assignment4.findWeekdaysAndWeekends(-3);
	}
}