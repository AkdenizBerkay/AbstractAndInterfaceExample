package Game.abstracts;

import Game.entities.Game;
import Game.entities.Player;

public abstract class BaseSellingManager implements SellerService {

	@Override
	public void Sell(Player player, Game game) {
		System.out.println("Satýþ Bilgileri");
		System.out.println("---------------");
		System.out.println("Oyuncu Bilgileri");
		System.out.println("----------------");
		System.out.println("Adý Soyadý: " + player.getFirsName() + " " + player.getLastName());
		System.out.println("TC No: " + player.getNationalityId());
		System.out.println("Doðum Yýlý: " + player.getYearOfBirth());
		System.out.println("Oyun Bilgileri");
		System.out.println("--------------");
		System.out.println("Oyun Adý: " + game.getName());
		System.out.println("Oyun Fiyatý: "+ game.getPrice());
	}

}
