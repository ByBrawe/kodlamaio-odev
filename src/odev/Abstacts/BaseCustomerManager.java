package odev.Abstacts;

import odev.Entities.Customer;

public abstract class BaseCustomerManager implements CustormerService{

	@Override
	public void Save(Customer customer) {
			
		System.out.println("Save to db : " + customer.getFirstName() + " " + customer.getLastName());

		
	}

}
