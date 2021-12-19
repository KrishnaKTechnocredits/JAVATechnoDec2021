package nehaPatil;


class Assignment{

    void printEvenNumber(int startNumber, int endNumber){
	    for(int num =startNumber; num<=endNumber;num++){
		    if(num%2==0)
			    System.out.println("even number "+ num);
		}
	}
	
	void printDivideByFive(int startNumber,int endNumber){
		for(int num =startNumber; num<=endNumber;num++){
			if(num%5==0)
				System.out.println(" Number divide by five "+ num);
		}
	}
	void printDivideBy5and3(int startNumber,int endNumber){
		for(int num =startNumber; num<=endNumber;num++){
			if(num%5==0 && num%3==0)
				System.out.println(" Number divide by five and three "+ num);
		}
	}
	
	void printDivideBy7and13(int startNumber,int endNumber){
		for(int num =startNumber; num<=endNumber;num++){
			if(num%7==0)
				System.out.println(" Number divide by seven "+ num);
			if(num%13==0)
			    System.out.println(" Number divide by Thirteen "+ num);
		}
	}
	void printSum(int startNumber,int endNumber){
		int sum=0;
		for(int num =startNumber; num<=endNumber;num++){
		     sum=sum+num;
		}
			System.out.println(" Sum of all the numbers "+ sum);
	}
	void printOddNumber(int startNumber, int endNumber){
	    for(int num =endNumber; num>=startNumber;num--){
		    if(num%2!=0)
			    System.out.println("Odd number "+ num);
		}
	}
	public static void main(String[] args){
	    Assignment assignment = new Assignment();
		assignment.printEvenNumber(10,15);
		assignment.printDivideByFive(10,30);
		assignment.printDivideBy7and13(5,40);
		assignment.printDivideBy5and3(5,18);
		assignment.printOddNumber(10,20);
		assignment.printSum(1,5);
	}
}