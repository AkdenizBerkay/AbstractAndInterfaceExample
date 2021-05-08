package Game.concretes;

import Game.abstracts.CheckPlayerService;
import Game.abstracts.PlayerService;
import Game.entities.Player;

public class PlayerManager implements PlayerService{

	private CheckPlayerService checkPlayer;
	public PlayerManager(CheckPlayerService checkPlayer) {
		super();
		this.checkPlayer = checkPlayer;
	}

	@Override
	public void add(Player player) {
		if(checkPlayer.isTc(player)) {
			System.out.println("Yeni oyuncu kaydedildi: " + player.getFirsName() + " " + player.getLastName());
		}
		else {
			System.out.println("Kaydetme i�lemi yap�lamad�.");
		}
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirsName() + " " + player.getLastName() + " bilgileri g�ncellendi.");
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirsName() + " " + player.getLastName() + " silindi.");
	}

}
