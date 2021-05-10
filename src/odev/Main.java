package odev;

import odev.Abstacts.BaseCustomerManager;
import odev.Adapters.MernisServiceAdapter;
import odev.Concrete.NeroCustomerManager;
import odev.Concrete.StarbucksCustomerManager;
import odev.Entities.Customer;

public class Main {

	public static void main(String[] args) {

		
		BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager1.Save(new Customer(1, "ÖMER NURÝ", "TEKTAÞ", 1998, "1231233222"));
		
		
		BaseCustomerManager customerManager2 = new NeroCustomerManager(new MernisServiceAdapter());
		customerManager2.Save(new Customer(2, "ÖMER", "TEKTAÞ", 1998, "1233333"));
		
		
		
		
		
	}

}
