package fr.aci.loupgarou.events;

import fr.aci.loupgarou.classes.LGGame;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.event.Cancellable;

public class LGNightEndEvent extends LGEvent implements Cancellable {
	public LGNightEndEvent(LGGame game) {
		super(game, game1);
	}
	
	@Getter @Setter private boolean cancelled;
}