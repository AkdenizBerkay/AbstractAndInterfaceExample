package Game.concretes;

import Game.abstracts.CheckPlayerService;
import Game.entities.Player;

public class CheckPlayerManager implements CheckPlayerService{

	@Override
	public boolean isTc(Player player) {
		return true;
	}

}
