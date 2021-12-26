package archana;

public class Ass11_RepeatChar {
	
		static int findRepeatChar(String s)
	    {
		    int place = -1, Findex, Sindex;
	        for (Findex = 0; Findex < s.length(); Findex++)
	        {
	            for (Sindex = Findex + 1; Sindex < s.length(); Sindex++)
	            {
	                if (s.charAt(Findex) == s.charAt(Sindex))
	                {
	                	place = Findex;
	                    break;
	                }
	            }
	            if (place != -1)
	                break;
	        }
	     
	        return place;
	    }
		static void reverseString(String s)
	    {
			for (int Findex = s.length()-1 ;Findex >= 0;  Findex--) {
				 System.out.println("Reverse string : "+s.charAt(Findex));
			}
	       
	    
	    }
	    static public void main (String[] args)
	    {
	        String str = "archanajadhav";
	        int pos = findRepeatChar(str);	         
	        if (pos == -1)
	            System.out.println("Not found");
	        else
	        System.out.println("Repeat Charecter in stinrg is : " +str.charAt(pos));
	        System.out.println("----------------------------");
	        reverseString("archana");
	    }

}

