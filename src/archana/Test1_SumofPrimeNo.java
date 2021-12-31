package archana;

public class Test1_SumofPrimeNo {

	 int sumPrimeno()
	 {
	      int ct=0,Num=0,index1=1,index2=1; 
	      int sum=0;
	      while(Num<10)  
	       {  
	            index2=1;  
	            ct=0;  
	            while(index2<=index1)  
	              {  
	                 if(index1%index2==0)  
	                   ct++;  
	                 
	                   index2++;   
	              }  
	             if(ct==2)  
	              {  	                    
	                   Num++;  
	                   sum =sum+index2; 
	              }  
	         index1++;  
	        }  
	    return sum;
	 }
	    public static void main(String[] args) {
		 Test1_SumofPrimeNo Test1 = new Test1_SumofPrimeNo();		
		 int sum=Test1.sumPrimeno();		 
		 System.out.println("sum of first 10 prime no : " + sum);
		}
	
}
