package archana;

//import java.util.ArrayList;
import java.util.HashSet;
//import java.util.List;

import swati.Swati_Assignment18.Main;

public class Ass34_Client {

	HashSet<Ass34_Employee> getEmployeeInfo() {
		HashSet<Ass34_Employee> listOfEmployee = new HashSet<Ass34_Employee>();
		listOfEmployee.add(new Ass34_Employee(1, "Archana"));
		listOfEmployee.add(new Ass34_Employee(2, "Madhavi"));
		listOfEmployee.add(new Ass34_Employee(3, "Anuja"));
		listOfEmployee.add(new Ass34_Employee(4, "Anamika"));
		listOfEmployee.add(new Ass34_Employee(1, "Archana"));
		return listOfEmployee;
	}

	public static void main(String[] args) {
		Ass34_Client cl = new Ass34_Client();
		HashSet<Ass34_Employee> listOfEmployee = cl.getEmployeeInfo();
		for (Ass34_Employee emp : listOfEmployee) {
			System.out.println(emp);
		}

	}

}
