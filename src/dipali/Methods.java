package dipali;

public class Methods {

	void evenNumbers(double start, double end){
		for(double num = start; num<=end; num++){
			if(num%2==0){
				System.out.println(num +" is Even number");
			}
		}
	}
	
	void divideMethodOne(double start, double end){
		for(double num = start; num<=end; num++){
			if(num%5==0){
				System.out.println(num +"is divided by 5");
			}
		}
	}
	
	void divideMethodTwo(double start, double end){
		for(double num = start; num<=end; num++){
			if(num%5==0 && num%3==0){
				System.out.println(num +"is divided by 5 & 3");
			}
		}
	}
	
	void divideMethodThree(double start, double end){
		for(double num = start; num<=end; num++){
			if(num%7==0){
				System.out.println(num +"is divided by 7");
			}else if(num%13==0){
				System.out.println(num +"is divided by 13");
			}
		}
	}
	
	void rangeSum(double start, double end){
		double total=0;
		for(double num = start; num<=end; num++){
			if(num%7==0){
				System.out.println(num +" is divided by 7");
			}else if (num%13==0){
				System.out.println(num +" is divided by 13");
			}
		}
	}
	
	void addition(double start, double end){
		double total=0;
		for(double num = start; num<=end; num++) {
			total=total+num;
		}
		System.out.println(total+ " is the total addition");
	}
	
	void difference(double start, double end){
		double difference=0;
		double odd=0;
		double even=0;
		for(double num = start; num<=end; num++){
			if(num%2==0)
				even=even+num;
		}
		difference= odd-even;
		System.out.println(difference+ " is the difference");
	}
	
	void oddReverse(int start,int end){
		for(int num = start; num>=end; num --){
			if(num%2!=0)
				System.out.println(num + "odd numbers in reverse order are ");
		}
	}
	
	public static void main(String[] args){
		Methods method = new Methods();
		method.evenNumbers(10,15);
		method.divideMethodOne(10,30);
		method.divideMethodTwo(10,30);
		method.rangeSum(10,45);
		method.addition(10,20);
		method.difference(10,15);
		method.oddReverse(10,25);
	}

}
