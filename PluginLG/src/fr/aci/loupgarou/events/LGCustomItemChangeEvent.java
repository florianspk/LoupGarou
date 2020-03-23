package fr.aci.loupgarou.events;

import fr.aci.loupgarou.classes.LGGame;
import fr.aci.loupgarou.classes.LGPlayer;
import lombok.Getter;

import java.util.List;

public class LGCustomItemChangeEvent extends LGEvent {
	@Getter private final LGPlayer player;
	@Getter private final List<String> constraints;
	
	public LGCustomItemChangeEvent(LGGame game, LGPlayer player, List<String> constraints) {
		super(game, game1);
		this.player = player;
		this.constraints = constraints;
	}
}
