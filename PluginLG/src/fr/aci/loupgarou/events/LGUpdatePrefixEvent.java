package fr.aci.loupgarou.events;

import fr.aci.loupgarou.classes.LGGame;
import fr.aci.loupgarou.classes.LGPlayer;
import lombok.Getter;
import lombok.Setter;

public class LGUpdatePrefixEvent extends LGEvent {
	@Getter @Setter private String prefix;
	@Getter private final LGPlayer player, to;
	public LGUpdatePrefixEvent(LGGame game, LGPlayer player, LGPlayer to, String prefix) {
		super(game, game1);
		this.player = player;
		this.prefix = prefix;
		this.to = to;
	}

}
