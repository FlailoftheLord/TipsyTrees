package me.flail.tipsytrees;

import java.util.Locale;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class TreeCommand {

	private TipsyTrees plugin;

	public TreeCommand(TipsyTrees plugin) {
		this.plugin = plugin;
	}

	public void generateTree(Player player, String attributes) {

		String attribute = attributes.toLowerCase(Locale.ENGLISH);

		World playerWorld = player.getWorld();

		try {

			Location targetLocation = player.getTargetBlockExact(64).getLocation();

			int x = targetLocation.getBlockX();
			int y = targetLocation.getBlockY();
			int z = targetLocation.getBlockZ();

			Material oldType = playerWorld.getBlockAt(targetLocation).getType();
			Material oldType2 = playerWorld.getBlockAt(x + 1, y, z).getType();
			Material oldType3 = playerWorld.getBlockAt(x, y, z + 1).getType();
			Material oldType4 = playerWorld.getBlockAt(x + 1, y, z + 1).getType();

			playerWorld.getBlockAt(targetLocation).setType(Material.DIRT);

			plugin.getServer().getScheduler().scheduleSyncDelayedTask(plugin, () -> {

				Location newLoc = player.getTargetBlockExact(100).getLocation().add(0, 1, 0);

				switch (attribute) {

				case "info":
					player.sendMessage(plugin.tools.chat(
							"<prefix> &aYour server is running TipsyTrees &7version <version> &2by FlailoftheLord"));
					break;

				default:
					if (plugin.tools.treeType(attribute) != null) {
						playerWorld.generateTree(newLoc, plugin.tools.treeType(attribute.toLowerCase()));
						player.sendMessage(plugin.tools.chat("<prefix> &aGenerated &7" + attribute + "&a!"));
					} else {
						player.sendMessage(
								plugin.tools.chat("<prefix> &cInvalid Tree type! type &7/tree help &cfor valid types"));
					}

				}

			}, 1);

			plugin.getServer().getScheduler().scheduleSyncDelayedTask(plugin, () -> {

				playerWorld.getBlockAt(targetLocation).setType(oldType);
				playerWorld.getBlockAt(x + 1, y, z).setType(oldType2);
				playerWorld.getBlockAt(x, y, z + 1).setType(oldType3);
				playerWorld.getBlockAt(x + 1, y, z + 1).setType(oldType4);

			}, 3);

		} catch (Throwable t) {

			player.sendMessage(plugin.tools.chat("<prefix> &cTrees cannot be generated on a liquid block or air!"));

		}

	}

}
