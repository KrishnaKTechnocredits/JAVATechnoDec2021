package anvit;
	
	class A9_Shop {
		
		int availablemaggie = 50;
		int availabledosa = 43;
		int availablepackets = 39;
		int availablepanipuri = 43;
		int availablemasala = 73;
		
		void purchaseItem(int maggie, int dosa, int packets, int panipuri, int masala) {
			if(availablemaggie >= maggie) 
				availablemaggie = availablemaggie - maggie;
			else
				System.out.println("Insufiicient Stock of maggie");
			
			if(availabledosa >= dosa)
				availabledosa = availabledosa - dosa;
			else
				System.out.println("Insuficient Stock of dosa");
			
			if (availablepackets >= packets)
				availablepackets = availablepackets - packets;
			else
				System.out.println("Insuficient Stock of packets");
			
			if(availablepanipuri >= panipuri)
				availablepanipuri = availablepanipuri - panipuri;
			else
				System.out.println("Insufiicient Stock of panipuri");
			
			if(availablemasala >= masala)
				availablemasala = availablemasala - masala;
			else
				System.out.println("Insufiicient Stock of masala");
		}
		
		void  printOutOfStockItem() {
			
			if(availablemaggie == 0 )
				System.out.println("Maggie is out of stock");
				
			if(availabledosa == 0)
				System.out.println("dosa is out of stock");
				
			if(availablepackets == 0)
				System.out.println("packets are out of stock");
				
			if(availablepanipuri ==0)
				System.out.println("panipuri is out of stock");
				
			if(availablemasala == 0)
				System.out.println("Masala is out of stock");
				
		}
		
		void printAvailableStockItem() {
			
			if(availablemaggie > 0) {
				System.out.println("Available stock of maggie is "+ availablemaggie);	
			}
			if(availabledosa > 0) {
				System.out.println("available stock od dosa is " + availabledosa);	
			}
			if(availablepackets > 0) {
				System.out.println("available stock of packets is " + availablepackets);
			}
			if(availablepanipuri > 0) {
				System.out.println("available stock of packets is " + availablepanipuri);	
			}
			if(availablemasala > 0) {
				System.out.println("available stock of masala is "+ availablemasala);
			}
				
		}
		
		public static void main(String[] args) {
			A9_Shop customer = new A9_Shop();
				customer.purchaseItem(50,30,20,10,73);
				System.out.println();
				customer.printOutOfStockItem();
				System.out.println();
				customer.printAvailableStockItem();
		}
}
