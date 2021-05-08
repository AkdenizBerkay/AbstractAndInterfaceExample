package Game.concretes;

import Game.abstracts.BaseSellingManager;
import Game.entities.Campaign;
import Game.entities.Game;
import Game.entities.Player;

public class PrivateDaySellingManager extends BaseSellingManager{
	
	private Campaign campaign;
	
	public PrivateDaySellingManager(Campaign campaign) {
		super();
		this.campaign = campaign;
	}

	@Override
	public void Sell(Player player, Game game) {
		super.Sell(player, game);
		System.out.println(campaign.getName() + " kampasýna özel satýþ fiyatý: " + game.getPrice()*(100-campaign.getDiscount())/100);
	}
}
