package ashish;

class A2_WhichDay{
	
	void dayOfWeek(int dayIndex){
			if(dayIndex>=1 && dayIndex<=5)
				System.out.println("Sad! " + dayIndex + " is index of weekday.");
			else if(dayIndex==6 || dayIndex==7)
				System.out.println("Yuppie! " + dayIndex + " is index of weekend.");
			else
				System.out.println("Oops! " + dayIndex + " is not a valid index.");		
	}
	
	public static void main(String[] args){
		A2_WhichDay whichDay = new A2_WhichDay();
		whichDay.dayOfWeek(3);
		whichDay.dayOfWeek(6);
		whichDay.dayOfWeek(11);
		whichDay.dayOfWeek(-3);
	}
}