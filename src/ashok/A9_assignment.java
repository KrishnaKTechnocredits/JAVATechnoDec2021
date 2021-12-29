package ashok;

public class A9_assignment {
	int maggie = 50;
	int dosa = 39;
	int panipuri = 60;
	int masala = 200;
	
	void purchaseItem(int pmaggie, int pdosa, int ppanipuri, int pmasala) {
		
		if(maggie >= pmaggie) {
			maggie = maggie - pmaggie;
		}else { 
			System.out.println("Maggie insuffient stock to deliver "+pmaggie+" Availabe stock is "+maggie+ " Only");
		}
		if(dosa >= pdosa) {
			dosa = dosa - pdosa;
		}else { 
			System.out.println("Dosa insuffient stock to deliver "+pdosa+" Availabe stock is "+dosa+ " Only");
		}
		if(panipuri >= ppanipuri) {
			panipuri = panipuri - ppanipuri;
		}else { 
			System.out.println("Panipuri insuffient stock to deliver "+ppanipuri+" Availabe stock is "+panipuri+ " Only");
		}
		if(masala >= pmasala) {
			masala = masala - pmasala;
		}else { 
				System.out.println("Masala insuffient stock to deliver "+pmasala+" Availabe stock is "+masala+ " Only");
		}
		
	}
	
	void printOutOfStockItem(){
		if(maggie == 0) {
			System.out.println("Maggie is out of stock "  );
		}
		if(dosa == 0) {
			System.out.println("Dosa is out of stock "  );
		}
		if(panipuri == 0 ) {
			System.out.println("Panipuri is out of stock "  );
		}
		if(masala == 0 ) {
			System.out.println("Panipuri is out of stock "  );
		}
	}

	void printAvailableStockItem() {
		System.out.println("Maggie current stock " + maggie + "" );
		System.out.println("Dosa current stock " + dosa + "" );
		System.out.println("Panipuri current stock " + panipuri + "" );
		System.out.println("Masala current stock " + masala + "" );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A9_assignment a9_assignment = new A9_assignment();
		a9_assignment.purchaseItem(50,0,20,300);
		a9_assignment.printAvailableStockItem();
		a9_assignment.printOutOfStockItem();
	}

}
