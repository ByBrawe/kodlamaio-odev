package odev.Concrete;

import odev.Abstacts.BaseCustomerManager;
import odev.Abstacts.CustomerCheckService;
import odev.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(odev.Abstacts.CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

		
	@Override
	public void Save(Customer customer) {
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			
			super.Save(customer);
			
		}else {
			
			System.out.println("Not a valid person : " + customer.getFirstName() + " " + customer.getLastName());

				
		}
			

		
	}
	
	
	

}
