package sagarAcharya;
class A11_return{

	int getFirstOcc(String input,char ch){
		int temp = -1;
		for(int index=0;index<=input.length();index++){
			if(input.charAt(index) == ch){
				temp = index;
				break;
			}
		}
		System.out.println("Index of First occurence of "+ch+" is "+temp);
		return temp;
	}
	
	int getLastOcc(String input,char ch){
		int temp = -1;
		for(int index=0;index<input.length();index++){
			if(input.charAt(index) == ch){
				temp = index;
				//break;
			}
		}
		System.out.println("Index of Last occurence of "+ch+" is "+temp);
		return temp;
	}
	
	boolean getBooleanValue(String input,char ch){
		boolean returnCnt = true;
		boolean temp = true;
		for(int index=0;index<input.length();index++){
			if(input.charAt(index) == ch){
				System.out.println(input+"- contains the given character "+ch);
				temp = false;
				break;
			}
		}
		if(temp == true){
			returnCnt = false;
			System.out.println(input+"- given string does not contain "+ch);
		}
		return returnCnt;
	}
	
	int getTotalCount(String input,char ch){
		int count=0;
		for(int index = 0;index<input.length();index++){
			if(input.charAt(index) == ch){
				count++;
			}
		}
		System.out.println("Total count of "+ch+" in "+input+" is : " + count);
		return count;
	}
	
	public static void main(String[] args){
		A11_return a11_return = new A11_return();
		a11_return.getFirstOcc("Technocredits",'c');
		a11_return.getLastOcc("Technocreditcsc",'c');
		a11_return.getBooleanValue("Technocreditcsc",'b');
		a11_return.getTotalCount("Technocreditcsc",'c');
		
	}
}

/* Write a program with following methods. 
1. create a method to return first occurrence of given character from given string.
2. create a method to return last occurrence of given character from given string.
3. create a method to return true if given character is found from given string else return false.
4. create a method to return total occurrence of given character from given string.
 */