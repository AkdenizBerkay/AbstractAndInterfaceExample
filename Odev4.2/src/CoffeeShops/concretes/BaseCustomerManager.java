package CoffeeShops.concretes;

import CoffeeShops.Entities.Customer;
import CoffeeShops.abstracts.CustomerService;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void Save(Customer customer) {
		System.out.println("Müþteri Kaydedildi.");
	}


}
