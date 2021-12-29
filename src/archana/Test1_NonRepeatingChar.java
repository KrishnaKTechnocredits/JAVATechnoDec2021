package archana;

public class Test1_NonRepeatingChar {
	
	char NonRepeatingChar(String name) {
		
	 Character c = null;
     int strLength = name.length();

     for (int index =0; index<strLength-1; index++){

         int flag = 0;
         for(int index2 = index+1; index2<strLength-index; index2++){

             if(name.charAt(index) == name.charAt(index2)){
                 flag++;
                 break;
             }
             else
                 continue;
         }

         if (flag==0){
             c = name.charAt(index);
             break;
         }

     }
     return c;
	}	    
	 public static void main(String[] args) {
		    Test1_NonRepeatingChar ss =new Test1_NonRepeatingChar();
		   char Fchar= ss.NonRepeatingChar("technocredits");
		   System.out.println("First Non Repeat Char From Given String is :"+Fchar);
		    
	 }
}
