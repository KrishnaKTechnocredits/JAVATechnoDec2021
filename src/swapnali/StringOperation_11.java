package swapnali;

public class StringOperation_11 {

	int firstOccurrenceOfChar(String Name, char ch) {
		 int index;
		 for( index=0;index<Name.length();index++){
			 if(Name.charAt(index)==ch) {
				 System.out.println("The first occurence of "+ch+" charater in string "+Name +"is "+index);
			    break;
			 }
		 } 
		return index;
	 }
		
	 int lastOccurrenceOfChar(String Name,char ch) {
			int index;
			 for(index=Name.length()-1;index>=0;index--)
			 {
				 if(Name.charAt(index)==ch)
				 {
					 System.out.println("The last occurence of "+ch+" charater in string "+Name+"is "+index);
				   break;
				 }
			 } 
			return index;
		}
	 
	 boolean charFound(String Name,char ch){
		 int index;
		 boolean flag=false;
		 for( index=0;index<Name.length();index++){
			 if(Name.charAt(index)==ch)
				 System.out.println();
				 flag=true;
		}
		return flag;
		
	 }
	 
	int totalOccOfChar(String Name, char ch){
		 int index;
		 int count=0;
        for( index=0;index<Name.length();index++){
			 if(Name.charAt(index)==ch)
				count++;
		  }
		return count;
	 }
	 public static void main(String[] args) {
		 	StringOperation_11 strops = new StringOperation_11();
		 	strops.firstOccurrenceOfChar("Technocredit",'e');
		 	strops.lastOccurrenceOfChar("Technocredit",'e');
			boolean b=strops.charFound("Technocredit",'e');
			System.out.println(b);
			int sum=strops.totalOccOfChar("Technocredit",'e');
			System.out.println("The total occurnace of given char is :"+sum);
	}

}
