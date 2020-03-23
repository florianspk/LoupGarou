package fr.aci.loupgarou.events;

import fr.aci.loupgarou.classes.LGGame;
import fr.aci.loupgarou.classes.LGPlayer;
import fr.aci.loupgarou.classes.LGWinType;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.event.Cancellable;

import java.util.List;

public class LGGameEndEvent extends LGEvent implements Cancellable {
	@Getter @Setter private boolean cancelled;
	@Getter private final LGWinType winType;
	@Getter private final List<LGPlayer> winners;
	public LGGameEndEvent(LGGame game, LGWinType winType, List<LGPlayer> winners) {
		super(game, game1);
		this.winType = winType;
		this.winners = winners;
	}

	@Override
	public boolean isCancelled() {
		return false;
	}

	@Override
	public void setCancelled(boolean b) {

	}
}