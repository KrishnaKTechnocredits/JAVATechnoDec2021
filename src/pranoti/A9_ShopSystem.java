package pranoti;

public class A9_ShopSystem {
	int maggieInitialQ = 50, dosaInitialQ = 43, pouchesInitialQ = 39, panipuriInitialQ = 43, masalasInitialQ = 73;

	void purchaseItem(int maggieReqQ, int dosaReqQ, int pouchesReqQ, int panipuriReqQ, int masalasRequestedQ) {
		if (maggieInitialQ >= maggieReqQ) {
			maggieInitialQ = maggieInitialQ - maggieReqQ;
		} else
			System.out.println("Insufficient stock,requested Q is " + maggieReqQ + " availble is " + maggieInitialQ);

		if (dosaInitialQ >= dosaReqQ) {
			dosaInitialQ = dosaInitialQ - dosaReqQ;
		} else
			System.out.println("Insufficient stock,requested Q is " + dosaReqQ + " availble is " + dosaInitialQ);

		if (pouchesInitialQ >= pouchesReqQ) {
			pouchesInitialQ = pouchesInitialQ - pouchesReqQ;
		} else
			System.out.println("Insufficient stock,requested Q is " + pouchesReqQ + " availble is " + pouchesInitialQ);

		if (panipuriInitialQ >= panipuriReqQ) {
			panipuriInitialQ = panipuriInitialQ - panipuriReqQ;
		} else
			System.out.println("Insufficient stock,requested Q is " + panipuriReqQ + " availble is " + panipuriInitialQ);

		if (masalasInitialQ >= masalasRequestedQ) {
			masalasInitialQ = masalasInitialQ - masalasRequestedQ;
		} else
			System.out.println("Insufficient stock,requested Q is " + masalasRequestedQ + " availble is " + masalasInitialQ);
	}
	void printOutOfStockItem() {
		boolean flag = true;
		if(maggieInitialQ == 0) {
			System.out.println("Maggie is out of stock");
			flag=false;
		}
		
		if(dosaInitialQ == 0) {
			System.out.println("dosa is out of stock");
			flag=false;
		}
		
		if(pouchesInitialQ == 0) {
			System.out.println("pouches are out of stock");
			flag=false;
		}
		
		if(panipuriInitialQ == 0) {
			System.out.println("panipuri is out of stock");
			flag=false;
		}
		
		if(masalasInitialQ == 0) {
			System.out.println("masalas are out of stock");
			flag=false;
		}
		
		if(flag == true) {
			System.out.println("none of item is out of stock");
		}
	}
	
	void printAvailableStockItem() {
		boolean availableflag = true;
		if(maggieInitialQ > 0) {
			System.out.println("Maggie is avaible with Q : " +maggieInitialQ);
			availableflag=false;
		}
		
		if(dosaInitialQ > 0) {
			System.out.println("dosa is avaible with Q : "+dosaInitialQ);
			availableflag=false;
		}
		
		if(pouchesInitialQ > 0) {
			System.out.println("pouches are avaible with Q : "+pouchesInitialQ);
			availableflag=false;
		}
		
		if(panipuriInitialQ > 0) {
			System.out.println("panipuri is avaible with Q : "+panipuriInitialQ);
			availableflag=false;
		}
		
		if(masalasInitialQ > 0) {
			System.out.println("masalas avaible with Q : "+masalasInitialQ);
			availableflag=false;
		}
		
		if(availableflag == true) {
			System.out.println("none of item is Available in stock");
		}
	}
	
	public static void main(String[] args) {
		A9_ShopSystem shopSystem = new A9_ShopSystem();
		shopSystem.purchaseItem(20, 6, 25, 20, 16);
		shopSystem.purchaseItem(10, 20, 10, 3, 38);
		shopSystem.printOutOfStockItem();
		shopSystem.printAvailableStockItem();
	}

}
