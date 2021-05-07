package CoffeeShops.concretes;

import CoffeeShops.Entities.Customer;
import CoffeeShops.abstracts.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfPerson(Customer customer) {
		return true;
	}

}
