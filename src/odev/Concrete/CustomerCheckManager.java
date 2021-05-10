package odev.Concrete;

import odev.Abstacts.CustomerCheckService;
import odev.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {

		
		return true;
	}

}
