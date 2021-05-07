package CoffeeShops.concretes;

import CoffeeShops.Entities.Customer;
import CoffeeShops.abstracts.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if(customerCheckService.CheckIfPerson(customer)) {
			super.Save(customer);	
		}
		else {
			System.out.println("Kimlik Bilgilerine Ait Kiþi Bulunamadý.");
		}
	}
}
