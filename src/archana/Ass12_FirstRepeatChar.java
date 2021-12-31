package archana;
import java.util.Scanner;

public class Ass12_FirstRepeatChar {
	
	static void repeatChar(String name)
    {
		int place = -1, Findex, Sindex;
        for (Findex = 0; Findex < name.length(); Findex++)
        {
            for (Sindex = Findex + 1; Sindex < name.length(); Sindex++)
            {
                if (name.charAt(Findex) == name.charAt(Sindex))
                {
                	place = Findex;
                    break;
                }
            }
            if (place != -1)
                break;
        }
        if (place == -1)
            System.out.println("Not found");
        else
        System.out.println("Repeat Charecter in stinrg is : " +name.charAt(place));
    }
	
	 static public void main (String[] args)
	    {        
	    	  Scanner scan = new Scanner(System.in);   
		      System.out.println("Enter name  : ");
		      String  name = scan.next();
		      repeatChar(name);	      
		      scan.close();
	    }
}
