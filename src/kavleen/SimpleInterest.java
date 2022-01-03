package kavleen;

class Assignment3{
 
   double SimpleInterest;
   double Celcius;
    
	void SimpleInterest(int p , float r , float t ){
	  SimpleInterest = (p*r*t)/100;
	  System.out.println("SimpleInterest is " + SimpleInterest);
	
	}
	
	void Temperature(float f){
	  Celcius = (f-32)*5/9;
	  System.out.println("Temperature in Celcius is " + Celcius);
	
	}
	
	public static void main (String [] args){
	   Assignment3 assignment3 = new Assignment3() ; 
	   assignment3.SimpleInterest (10,15,25);
	   assignment3.Temperature(50);
	
	}

}
