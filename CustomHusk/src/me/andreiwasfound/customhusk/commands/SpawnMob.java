package me.andreiwasfound.customhusk.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_15_R1.CraftWorld;
import org.bukkit.entity.Player;

import me.andreiwasfound.customhusk.mobs.CustomHusk;
import net.minecraft.server.v1_15_R1.WorldServer;

public class SpawnMob implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("spawnhusk")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("Console cannot use this command");
				return true;
			}
			Player player = (Player) sender;
			
			WorldServer world = ((CraftWorld) player.getWorld()).getHandle();
			CustomHusk husky = new CustomHusk(player.getLocation());
			world.addEntity(husky);
			player.sendMessage(ChatColor.RED + "Husk Spawned!");
			return true;
		}
		return false;
	}

}
