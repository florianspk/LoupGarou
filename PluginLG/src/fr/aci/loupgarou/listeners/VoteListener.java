package fr.aci.loupgarou.listeners;

import fr.aci.loupgarou.classes.LGPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.event.player.PlayerAnimationType;

public class VoteListener implements Listener {
	@EventHandler
	public void onClick(PlayerAnimationEvent e) {
		if(e.getAnimationType() == PlayerAnimationType.ARM_SWING)
			LGPlayer.thePlayer(e.getPlayer()).chooseAction();
	}
	@EventHandler
	public void onBreak(BlockBreakEvent e) {
		e.setCancelled(true);
	}
}
