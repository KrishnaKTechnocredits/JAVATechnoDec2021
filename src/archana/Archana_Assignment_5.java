package archana;
class Archana_Assignment_5{
	
	void evennumber(){
		for(int num=10; num<=15;num++){
			
			if(num%2==0){			   
			   System.out.println("Even No. are : " + num);			   
			}
		}
		System.out.println("--------------------------------------(1)--------------------------");
	}	
	void divby5(){
       for(int num=10; num<=30;num++){
			
			if(num%5==0){			   
			   System.out.println("No's divby5 by 5 are : " + num);			   
			}
		}
        System.out.println("--------------------------------------(2)--------------------------");		
	}	
	  void divby5and3(){
      for(int num=5; num<=18;num++){
			
			if(num%5==0 && num%3==0){			   
			   System.out.println("No divide by 5 and 3 is : " + num);			   
			}
		}
        System.out.println("--------------------------------------(3)--------------------------");	
	  }
	  void divby7and3(){		  
      for(int num=5; num<=40;num++){
			
			    if(num%7==0 ){
			       System.out.println(num +" is divisible by 7");
			    }
				 if(num%13==0){
                 System.out.println(num +" is divisible by 3");					 
			    }
		}		
        System.out.println("--------------------------------------(4)--------------------------");	
    }
	void sum1to5(int n1 , int n2){
		int sum =0;
		for(int num=n1; num<=n2;num++){			
			    
	       sum = sum + num ;
			    
		}
        System.out.println("Sum of 1 to 5 is : " + sum);		
        System.out.println("--------------------------------------(5)--------------------------");	
	}
	void oddEvendiff(int n1, int n2){
          int sumOddno=0;
		  int sumEveno=0;
		 // int diff=0;
        for(int num=n1; num<=n2;num++){			
			    
				if(num%2!=0){				   
	               sumOddno = sumOddno + num ;
				}
				if(num%2==0){				   
	               sumEveno = sumEveno + num ;
				}
			    
		}
        System.out.println("Sum of odd no is : " + sumOddno +", Sum of Even no : "+ sumEveno +" And Difference is := "+ (sumOddno - sumEveno ));       
        System.out.println("--------------------------------------(6)--------------------------");
	}
	void reverse(int n1,int n2){
		System.out.println("Odd no in reverse order : ");
		for(int num=n2; num>=n1;num--){			
			    
				if(num%2!=0){				   
	               System.out.println(num);	
				}
				
		}        
        System.out.println("--------------------------------------(7)--------------------------");	
	}
		
	
	
	    public static void main (String[] args){
		Archana_Assignment_5 evenno = new Archana_Assignment_5();
		evenno.evennumber();
		evenno.divby5();
		evenno.divby5and3();
		evenno.divby7and3();
		evenno.sum1to5(1 , 5);	
		evenno.oddEvendiff(3,9);
		evenno.reverse(10,20);
		
	}
}