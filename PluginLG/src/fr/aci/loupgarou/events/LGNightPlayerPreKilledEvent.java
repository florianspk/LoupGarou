package fr.aci.loupgarou.events;

import fr.aci.loupgarou.classes.LGGame;
import fr.aci.loupgarou.classes.LGPlayer;
import fr.aci.loupgarou.events.LGPlayerKilledEvent.Reason;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.event.Cancellable;

public class LGNightPlayerPreKilledEvent extends LGEvent implements Cancellable {
	public LGNightPlayerPreKilledEvent(LGGame game, LGPlayer killed, Reason reason) {
		super(game, game1);
		this.killed = killed;
		this.reason = reason;
	}

	@Getter @Setter boolean cancelled;
    
    @Getter private final LGPlayer killed;
    @Getter @Setter private Reason reason;
	
}
