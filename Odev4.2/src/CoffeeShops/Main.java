package CoffeeShops;

import CoffeeShops.Entities.Customer;
import CoffeeShops.abstracts.CustomerService;
import CoffeeShops.concretes.KpsManager;
import CoffeeShops.concretes.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(1,"MUSTAFA BERKAY","AKDENÝZ",1992, Long.parseLong("45670837112"));
		CustomerService cm = new StarbucksCustomerManager(new KpsManager());
		cm.Save(customer);
	}

}
