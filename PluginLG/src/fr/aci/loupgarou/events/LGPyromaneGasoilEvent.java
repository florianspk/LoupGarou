package fr.aci.loupgarou.events;

import fr.aci.loupgarou.classes.LGGame;
import fr.aci.loupgarou.classes.LGPlayer;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.event.Cancellable;

public class LGPyromaneGasoilEvent extends LGEvent implements Cancellable {
	public LGPyromaneGasoilEvent(LGGame game, LGPlayer player) {
		super(game, game1);
		this.player = player;
	}
	
	@Getter @Setter private boolean cancelled;
	@Getter @Setter private LGPlayer player;
}