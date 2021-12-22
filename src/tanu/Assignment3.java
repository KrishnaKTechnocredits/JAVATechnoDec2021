package tanu;

class Assignment3{

  void interestData(int principle, int time, double rate){
    double si= (principle*time*rate)/100;
    System.out.println("Simple Intrest is: "+si);
}	 
  void celsiusData(double fa){
	  double cel =( fa-32)*5/9;
      System.out.println("Celsius Value is: "+cel);
  }
  public static void main(String[] arg){
     Assignment3 assignment3 = new Assignment3();
     assignment3.interestData(10,22,35);
	 assignment3.celsiusData(58);
	 }
}	 