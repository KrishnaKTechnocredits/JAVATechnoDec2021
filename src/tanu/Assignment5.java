package tanu;

class Assignment5{
	int total=0;
	int eventotal=0;
	int oddtotal=0;
	int diff=0;
	
	void printEvenNumbers(int startnum, int endnum)
	{
		for(int num= startnum; num<=endnum; num++){
			if(num%2==0){
			System.out.println(num);
			}
		}
	}
	
	void DivideRange(int startnum, int endnum)
	{
		for(int num = startnum; num<=endnum; num++){
			if (num%5==0){
			System.out.println(num);
			}
		}
	}
	
	void DivideOrRange(int startnum, int endnum)
	{
		for(int num = startnum; num<=endnum; num++){
			if ((num%7==0)||(num%13==0)){
			System.out.println(num);
			}
		}
	}
	
	void DivideAndRange(int startnum, int endnum)
	{
		for(int num = startnum; num<=endnum; num++){
			if ((num%5==0)&&(num%3==0)){
			System.out.println(num);
			}
		}
	}
	
	void SumNumber(int start, int end)
	{
		for(int index =start; index<=end; index++){
		  total = total + index;
		}
		System.out.println(total);
	}
	
	void EvenMinusOdd(int start, int end)
	{
		for(int index =start; index<=end; index++){
			if(index%2==0){
				eventotal= eventotal+ index;
			}
			else{
				oddtotal= oddtotal+ index;
			}
		}
	  System.out.println(oddtotal-eventotal);
	}
	
	void Reverse(int startnum, int endnum)
	{
		for(int num= endnum; num>=startnum; num--){
			if(num%2==1){
			System.out.println(num);
			}
		}
	}

    public static void main(String [] arg){
      Assignment5 assignment5 = new Assignment5();
	  assignment5.printEvenNumbers(1,5);
	  assignment5.SumNumber(1,5);
	  assignment5.DivideRange(1,5);
	  assignment5.DivideOrRange(1,5);
	  assignment5.DivideAndRange(20,30);
	  assignment5.EvenMinusOdd(1,5);
	  assignment5.Reverse(10,20);
	}
	  	  
   }
	
	