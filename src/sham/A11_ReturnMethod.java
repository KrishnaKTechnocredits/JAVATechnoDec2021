package sham;

public class A11_ReturnMethod {

	int printFirstOccuranceFromString(String name,char ch)
	{
		System.out.println("---method to return first occurrence of given character from given string---");
		int tempIndex=0;
		for(int index=0;index<name.length();index++) {
			if(ch==name.charAt(index))
			{
				//System.out.println("First occurance of your character "+ch+" is at no "+ index);
				tempIndex=index;
				break;
			}		
		}
		return tempIndex;
		}
	
	int lastOccurrenceOfCharacterFromString(String name,char ch)
	{
		System.out.println("---method to return last occurrence of given character from given string---");
		int index=name.length()-1;
		for( ;index>0;index--) {			
			if(ch==name.charAt(index))
			{
				System.out.println("last occurance of your character "+ch+" is at no "+ index);
				break;
			}			
		}
		return index;
		}
	boolean  isCharacterFound(String name,char ch)
	{ 
		System.out.println("---method to return true if given character is found from given string else return false---");
		boolean flag=false;		
		for(int index=0;index<name.length();index++) {
			if(ch==name.charAt(index))
			{			
				flag=true;
				break;	
			}		
		}
		return flag;	
	}
	
	int totalOccuranceFromString(String name,char ch)
	{
		System.out.println("---method to return total occurrence of given character from given string---");
		int count=0;
		for(int index=0;index<name.length();index++) {
			if(ch==name.charAt(index))
			{
				//System.out.println("First occurance of your character "+ch+" is at no "+ index);
				count++;				
			}			
		}
		System.out.println("Total occurance of "+ch+" is "+count);
		return count;
		}
	public static void main(String[] args) {
		
		A11_ReturnMethod returnMethod= new A11_ReturnMethod();
		int firstCharposition=returnMethod.printFirstOccuranceFromString("Recommended",'m');
		if(firstCharposition!=0) {
			System.out.println("First occurance of your character is at no "+ firstCharposition);
		}else 
			System.out.println("character is not present in given String");
		
		returnMethod.lastOccurrenceOfCharacterFromString("Recommended",'m');
		boolean flag=returnMethod.isCharacterFound("Recommended",'d');
		if(flag==true) {
			System.out.println("we have found the character in string");
		}
		else
			System.out.println("character is not Found in given String");
		
		returnMethod.totalOccuranceFromString("Recommended",'e');
		//System.out.println(no);
	}

}
