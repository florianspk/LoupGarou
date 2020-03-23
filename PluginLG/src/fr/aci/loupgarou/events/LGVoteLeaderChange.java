package fr.aci.loupgarou.events;

import fr.aci.loupgarou.classes.LGGame;
import fr.aci.loupgarou.classes.LGPlayer;
import fr.aci.loupgarou.classes.LGVote;
import lombok.Getter;

import java.util.ArrayList;

public class LGVoteLeaderChange extends LGEvent{

	public LGVoteLeaderChange(LGGame game, LGVote vote, ArrayList<LGPlayer> latest, ArrayList<LGPlayer> now) {
		super(game, game1);
		this.latest = latest;
		this.now = now;
		this.vote = vote;
	}
	
	@Getter
    ArrayList<LGPlayer> latest, now;
	@Getter LGVote vote;

}
