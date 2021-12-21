package dharam;

public class A6_Numbers{

	void evenNumber(int startIndex, int endIndex){
		for (int num= startIndex; num<= endIndex; num++){
			if (num%2==0);
				System.out.println("even number are: " + num);
		}
	}
	void divideBy(int startIndex, int endIndex){
		for (int num= startIndex; num<= endIndex; num++){
			if (num%5==0);
			System.out.println(num);
		}
	}
	void dividBy3and5 (int startIndex, int endIndex){
		for(int num = startIndex; num <= endIndex; num++){
			if (num%3==0 && num%5==0);
			System.out.println(num);
		}
	}
	
	void doSum(int startNumber, int endNumber){
		int sum=0;
		for(int num= startNumber; num<=endNumber; num++){
			sum= sum+num;	
		}
		System.out.println(sum);
	}
	
	void displayData(int endNumber, int startNumber){
		for(int index= endNumber; index>=startNumber; index--){
			if (index%2!=0);
			System.out.println(index);
		}
	}
	
	void divideByBy(int startIndex, int endIndex){
		for (int num= startIndex; num>endIndex; num++){
			if(num%7==0 || num%13==0){
				if (num%7==0);
					System.out.println("7 is divisible by"+ num);
				if (num%13==0);
					System.out.println("13 is divisible by"+ num);
			}	
		}
	}
	
	public static void main (String[]agrs){
		Assignment6 assignment6 = new Assignment6();
		assignment6.evenNumber(10,15);
		assignment6.evenNumber(10,30);
		assignment6.divideBy(5,18);
		assignment6.doSum(1,5);
		assignment6.displayData(20,10);
		assignment6.divideByBy(5,40);
		}
}