package vrushali;

class A55_FindDays{
	void days(int dayindex){
		if((dayindex >= 1) && (dayindex <= 5)){
			System.out.println("dayIndex -> " + dayindex + " : Weekday");
		}else if((dayindex > 5) && (dayindex <= 7)){
			System.out.println("dayIndex -> " + dayindex + " : Weekend");
		}else if ((dayindex < 1)||(dayindex >=7)){
			System.out.println("dayIndex -> " + dayindex + " : Invalid Index");
		}		
	}
	
	public static void main(String[] args){
		A55_FindDays findDays = new A55_FindDays();
		findDays.days(3);
		findDays.days(6);
		findDays.days(11);
		findDays.days(-3);
	}	
}