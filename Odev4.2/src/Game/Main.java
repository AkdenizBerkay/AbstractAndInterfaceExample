package Game;

import Game.abstracts.BaseSellingManager;
import Game.abstracts.CheckPlayerService;
import Game.abstracts.PlayerService;
import Game.concretes.KpsManager;
import Game.concretes.PlayerManager;
import Game.concretes.PrivateDaySellingManager;
import Game.entities.Campaign;
import Game.entities.Game;
import Game.entities.Player;

public class Main {

	public static void main(String[] args) {
		Player player = new Player(1,"MUSTAFA BERKAY","AKDENÝZ",1992, Long.parseLong("45670837112"));
		Game game = new Game(1,"Counter Strike",100);
		Campaign campaign = new Campaign(1, "23Nisan", 30, "Savaþ Oyunu");
		
		CheckPlayerService checkPlayerService = new KpsManager();
		PlayerService ps = new PlayerManager(checkPlayerService);
		ps.add(player);
		
		BaseSellingManager seller = new PrivateDaySellingManager(campaign);
		seller.Sell(player, game);
	}

}
