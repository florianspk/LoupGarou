package fr.aci.loupgarou.events;

import fr.aci.loupgarou.classes.LGGame;
import fr.aci.loupgarou.roles.Role;
import lombok.Getter;

public class LGRoleTurnEndEvent extends LGEvent{
	public LGRoleTurnEndEvent(LGGame game, Role newRole, Role previousRole) {
		super(game, game1);
		this.newRole = newRole;
		this.previousRole = previousRole;
	}
	
	@Getter private final Role newRole, previousRole;
}