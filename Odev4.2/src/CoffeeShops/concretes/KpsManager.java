package CoffeeShops.concretes;

import CoffeeShops.Entities.Customer;
import CoffeeShops.abstracts.CustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class KpsManager implements CustomerCheckService {

	@Override
	public boolean CheckIfPerson(Customer customer) {
		KPSPublicSoap kps = new KPSPublicSoapProxy();
		try {
			return kps.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName(),
					customer.getLastName(), customer.getYearOfBirth());
		} catch (Exception ex) {
			return false;
		}
	}
}
