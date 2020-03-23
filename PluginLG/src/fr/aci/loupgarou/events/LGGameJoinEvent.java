package fr.aci.loupgarou.events;

import fr.aci.loupgarou.classes.LGGame;
import fr.aci.loupgarou.classes.LGPlayer;
import lombok.Getter;

public class LGGameJoinEvent extends LGEvent{
	public LGGameJoinEvent(LGGame game, LGPlayer player) {
		super(game, game1);
		this.player = player;
	}

	@Getter LGPlayer player;
}
