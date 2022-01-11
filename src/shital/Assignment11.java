package shital;

class Assignment11{
	
	int firstOccurance(String name, char ch){
		int charIndex= -1;
		System.out.println("Given String is : "+name);
		for(int index=0;index<=name.length();index++){
			if(name.charAt(index)== ch){
				charIndex=index;
				System.out.println("\nFirst Occurance of "+ch+" is at "+charIndex+" index");		
				break;
			}
		}
		return charIndex;
	}
	
	int getLastOccuranceOfString(String name,char ch) {
		int charIndex = 0;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index)==ch) {
				charIndex=index;
			}
		}
		System.out.println("Last Occurance of "+ch+" is at "+charIndex+" index");
		return charIndex;
	}
	
	boolean charInStringOrnot(String name, char ch){
		boolean flag=true;
		
		for(int index=0;index<name.length();index++){
			if(name.charAt(index)==ch){
				System.out.println(ch+" character is found in string:"+flag);
				//System.out.println(true);
				flag =false;
				break;
			}
		}
		if(flag==true){
			System.out.println(false);
			System.out.println(ch+" character is not found in string");
		}
		return false;
	}
	
	int findTotalOccurance(String name,char ch){
		int count=0;
		for(int index=0;index<name.length();index++){
			if(name.charAt(index)==ch){
				count++;
			}
		}
		System.out.println("Total occurance of "+ch+" character is: "+count);
		return count;
	}
	
	public static void main(String[] args){
		Assignment11 assignment11=new Assignment11();
		assignment11.firstOccurance("technocredits", 'c');
		assignment11.getLastOccuranceOfString("technocredits",'o');
		assignment11.charInStringOrnot("technocredits",'c');
		assignment11.findTotalOccurance("technocredits",'c');
	}
}


