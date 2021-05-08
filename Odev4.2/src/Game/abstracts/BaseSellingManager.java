package Game.abstracts;

import Game.entities.Game;
import Game.entities.Player;

public abstract class BaseSellingManager implements SellerService {

	@Override
	public void Sell(Player player, Game game) {
		System.out.println("Sat�� Bilgileri");
		System.out.println("---------------");
		System.out.println("Oyuncu Bilgileri");
		System.out.println("----------------");
		System.out.println("Ad� Soyad�: " + player.getFirsName() + " " + player.getLastName());
		System.out.println("TC No: " + player.getNationalityId());
		System.out.println("Do�um Y�l�: " + player.getYearOfBirth());
		System.out.println("Oyun Bilgileri");
		System.out.println("--------------");
		System.out.println("Oyun Ad�: " + game.getName());
		System.out.println("Oyun Fiyat�: "+ game.getPrice());
	}

}
