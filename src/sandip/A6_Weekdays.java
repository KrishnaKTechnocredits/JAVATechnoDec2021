package sandip;

class A6_Weekdays{

	void weekend(int dayIndex){
		if(dayIndex<=5 && dayIndex>0){
			System.out.println("Its a weekday");
		}else if(dayIndex>=6 && dayIndex<=7){
			System.out.println("Its a weekend");
		}else if(dayIndex<=0){
			System.out.println("Invalid Input");
		}else if(dayIndex>=8){
			System.out.println("Invalid Input");
		}
	}
	
	public static void main(String[]args){
	A6_Weekdays weekdays_1=new A6_Weekdays();
	weekdays_1.weekend(4);
	weekdays_1.weekend(-1);
	weekdays_1.weekend(1);
	weekdays_1.weekend(0);
	weekdays_1.weekend(8);
	}
}