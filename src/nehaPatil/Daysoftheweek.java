package nehaPatil;
class Daysoftheweek{
    
	void weekday(int dayIndex){
	    if(dayIndex >=1 && dayIndex<=5){
		    System.out.println("weekday");
		}
	    else if(dayIndex >=6 && dayIndex<=7){
		    System.out.println("weekend");
		}else{
			System.out.println("Invalid");
		}
	}
	
	public static void main(String[] args){
	    Daysoftheweek daysoftheweek = new Daysoftheweek();
	    daysoftheweek.weekday(3);
		daysoftheweek.weekday(6);
	    daysoftheweek.weekday(11);
	    daysoftheweek.weekday(-3);
	
	}
}