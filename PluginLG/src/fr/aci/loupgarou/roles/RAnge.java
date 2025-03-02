package fr.aci.loupgarou.roles;

import fr.aci.loupgarou.classes.LGGame;
import fr.aci.loupgarou.classes.LGPlayer;
import fr.aci.loupgarou.classes.LGWinType;
import fr.aci.loupgarou.events.*;
import fr.aci.loupgarou.events.LGPlayerKilledEvent.Reason;
import org.bukkit.event.EventHandler;

import java.util.ArrayList;

public class RAnge extends Role{
	public RAnge(LGGame game) {
		super(game);
	}
	@Override
	public RoleType getType() {
		return RoleType.NEUTRAL;
	}
	@Override
	public RoleWinType getWinType() {
		return RoleWinType.VILLAGE;
	}
	@Override
	public String getName() {
		return "§d§lAnge";
	}
	@Override
	public String getFriendlyName() {
		return "de l'"+getName();
	}
	@Override
	public String getShortDescription() {
		return "Tu gagnes si tu remplis ton objectif";
	}
	@Override
	public String getDescription() {
		return "Tu es §d§lNeutre§f et tu gagnes si tu remplis ton objectif. Ton objectif est d'être éliminé par le village lors du premier vote de jour. Si tu réussis, tu gagnes la partie. Sinon, tu deviens un §a§lVillageois§f.";
	}
	@Override
	public String getTask() {
		return "";
	}
	@Override
	public String getBroadcastedTask() {
		return "";
	}
	@Override
	public int getTimeout() {
		return -1;
	}
	@EventHandler
	public void onVoteStart(LGVoteEvent e) {
		if(e.getGame() == getGame()) {
			night = getGame().getNight();
			vote = true;
			for(LGPlayer lgp : getPlayers())
				if(!lgp.isDead())
					lgp.sendMessage("§9§oFais en sorte que les autres votent contre toi !");
		}
	}
	boolean vote;
	@EventHandler
	public void onDayEnd(LGDayEndEvent e) {
		if(e.getGame() == getGame()) {
			if(getPlayers().size() > 0 && getGame().getNight() == night+1 && vote) {
				Role villageois = null;
				for(Role role : getGame().getRoles()) {
					if(role instanceof RVillageois)
						villageois = role;
				}
				
				if(villageois == null)
					getGame().getRoles().add(villageois = new RVillageois(getGame()));
				
				for(LGPlayer lgp : getPlayers()) {
					lgp.sendMessage("§4§oTu as échoué, tu deviens §a§l§oVillageois§4§o...");
					lgp.setRole(villageois);
					villageois.join(lgp);
				}
				
				getPlayers().clear();
				getGame().updateRoleScoreboard();
			}
			vote = false;
		}
	}
	ArrayList<LGPlayer> winners = new ArrayList<LGPlayer>();
	int night = 1;
	@EventHandler
	public void onDeath(LGPlayerGotKilledEvent e) {
		if(e.getGame() == getGame())
			if(e.getReason() == Reason.VOTE && e.getKilled().getRole() == this && getGame().getNight() == night)
				winners.add(e.getKilled());
	}
	
	@EventHandler
	public void onWinCheck(LGEndCheckEvent e) {
		if(e.getGame() == getGame())
			if(winners.size() > 0)
				e.setWinType(winners.size() == 1 && winners.get(0).getCache().has("inlove") ? LGWinType.COUPLE : LGWinType.ANGE);
	}
	
	@EventHandler
	public void onWin(LGGameEndEvent e) {
		if(e.getGame() == getGame())
			if(e.getWinType() == LGWinType.ANGE)
				e.getWinners().addAll(winners);
	}
}
