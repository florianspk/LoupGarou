package fr.aci.loupgarou.events;

import fr.aci.loupgarou.classes.LGGame;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@RequiredArgsConstructor
public class LGEvent extends Event {
	@Getter final LGGame game;
	
    private static final HandlerList handlers = new HandlerList();

	public LGEvent(LGGame game, LGGame game1) {
		this.game = game1;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
