package fr.aci.loupgarou.events;

import fr.aci.loupgarou.classes.LGGame;
import fr.aci.loupgarou.classes.LGWinType;
import lombok.Getter;
import lombok.Setter;

public class LGEndCheckEvent extends LGEvent{
	public LGEndCheckEvent(LGGame game, LGWinType winType) {
		super(game, game1);
		this.winType = winType;
	}

	@Getter @Setter private LGWinType winType;
}