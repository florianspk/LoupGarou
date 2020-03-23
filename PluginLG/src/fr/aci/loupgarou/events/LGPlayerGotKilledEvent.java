package fr.aci.loupgarou.events;

import fr.aci.loupgarou.classes.LGGame;
import fr.aci.loupgarou.classes.LGPlayer;
import fr.aci.loupgarou.events.LGPlayerKilledEvent.Reason;
import lombok.Getter;

public class LGPlayerGotKilledEvent extends LGEvent {
	public LGPlayerGotKilledEvent(LGGame game, LGPlayer killed, Reason reason, boolean endGame) {
		super(game, game1);
		this.killed = killed;
		this.reason = reason;
		this.endGame = endGame;
	}
	
	@Getter private final boolean endGame;
    @Getter private final LGPlayer killed;
    @Getter private Reason reason;
	
}
