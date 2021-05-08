package Game.concretes;

import Game.abstracts.CheckPlayerService;
import Game.entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class KpsManager implements CheckPlayerService {

	@Override
	public boolean isTc(Player player) {
		KPSPublicSoap kps = new KPSPublicSoapProxy();
		try {
			return kps.TCKimlikNoDogrula(player.getNationalityId(), player.getFirsName(),
					player.getLastName(), player.getYearOfBirth());
		} catch (Exception ex) {
			return false;
		}
	}
}
