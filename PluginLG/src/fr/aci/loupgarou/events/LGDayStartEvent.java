package fr.aci.loupgarou.events;

import fr.aci.loupgarou.classes.LGGame;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.event.Cancellable;

public class LGDayStartEvent extends LGEvent implements Cancellable {
	public LGDayStartEvent(LGGame game) {
		super(game, game1);
	}
	
	@Getter @Setter private boolean cancelled;
}