package jayashri;

class Test1_Prg1{

	void nonRepeating(String name){
		for (int i = 0; i < name.length(); i++){
            int count = 0;
		for (int j = 0; j < name.length(); j++){
            if (name.charAt(i) == name.charAt(j))
            count++;
        }
        if (count == 1){
            System.out.println("The first non repeating character from given String is: " + name.charAt(i));
            break;
            }
        }		
	}
	public static void main(String[] args){
	Test1_Prg1 test1_prg1 = new Test1_Prg1();
	test1_prg1.nonRepeating("technocredits");	
	}
}