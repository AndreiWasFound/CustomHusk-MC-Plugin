package me.andreiwasfound.customhusk;

import org.bukkit.plugin.java.JavaPlugin;

import me.andreiwasfound.customhusk.commands.SpawnMob;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		this.getCommand("spawnhusk").setExecutor(new SpawnMob());
	}
	
	@Override
	public void onDisable() {
		
	}

}
