package kavleen;

public class Assignment23_Order {
	String orderOfString(String input){
		
		  String name = "";
		  String name1 = "";
		  String name2 = "";
		  String name3 = "";
		  for (int index = 0 ; index<input.length();index++){
			  char ch = input.charAt(index);
			  if(Character.isLetter(ch) && Character.isLowerCase(ch)){
				  name +=ch;
			  }else if (Character.isDigit(ch)){
				  name1 +=ch;
			  }else if(Character.isLetter(ch) && Character.isUpperCase(ch))
				  name2 +=ch;
			  else
					  name3 += ch;
			  }
		   return (name + name1 + name2 + name3);
		}
		public static void main(String [] args){
			Assignment23_Order assignmentorder = new Assignment23_Order();
			String input = "te4c&Hno7CreD-8i*ts&-*";
			System.out.println(assignmentorder.orderOfString(input));
		}

}
