package shital;

class A15_MaxLengthofString{

	
	String findMaxLength(String[] name){
		String temp="";
		int nameLength=name[0].length();
		for(int index=1;index<name.length;index++){
			if(nameLength< name[index].length()){
				temp=name[index];
			}
		}
		System.out.println("Max length is:"+temp);
		return temp;
	}
	
	public static void main(String[] args){
		A15_MaxLengthofString maxLengthOfString=new A15_MaxLengthofString();
		String[] name = {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
		maxLengthOfString.findMaxLength(name);
	}
}




		

