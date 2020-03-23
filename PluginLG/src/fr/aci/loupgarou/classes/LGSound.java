package fr.aci.loupgarou.classes;

import lombok.Getter;
import org.bukkit.Sound;

public enum LGSound {
	KILL(Sound.ENTITY_BLAZE_DEATH),
	START_NIGHT(Sound.ENTITY_SKELETON_DEATH),
	START_DAY(Sound.ENTITY_ZOMBIE_DEATH),
	AMBIANT_NIGHT(Sound.MUSIC_DISC_MALL),
	AMBIANT_DAY(Sound.MUSIC_DISC_MELLOHI);
	
	@Getter
    Sound sound;
	LGSound(Sound sound){
		this.sound = sound;
	}
}
