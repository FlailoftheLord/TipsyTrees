package me.flail.tipsytrees;

import java.util.Locale;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.TreeType;
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

			Material oldType = playerWorld.getBlockAt(targetLocation).getType();

			playerWorld.getBlockAt(targetLocation).setType(Material.DIRT);

			plugin.getServer().getScheduler().scheduleSyncDelayedTask(plugin, () -> {

				Location newLoc = player.getTargetBlockExact(100).getLocation().add(0, 1, 0);

				switch (attribute) {

				case "info":
					player.sendMessage(plugin.tools.chat(
							"<prefix> &aYour server is running TipsyTrees &7version <version> &2by FlailoftheLord"));
					break;

				case "oak":
					playerWorld.generateTree(newLoc, TreeType.TREE);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "wood":
					playerWorld.generateTree(newLoc, TreeType.TREE);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "tree":
					playerWorld.generateTree(newLoc, TreeType.TREE);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "bigoak":
					playerWorld.generateTree(newLoc, TreeType.BIG_TREE);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "bigtree":
					playerWorld.generateTree(newLoc, TreeType.BIG_TREE);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "largetree":
					playerWorld.generateTree(newLoc, TreeType.BIG_TREE);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "largeoak":
					playerWorld.generateTree(newLoc, TreeType.BIG_TREE);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "big_oak":
					playerWorld.generateTree(newLoc, TreeType.BIG_TREE);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "big_tree":
					playerWorld.generateTree(newLoc, TreeType.BIG_TREE);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "large_oak":
					playerWorld.generateTree(newLoc, TreeType.BIG_TREE);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "large_tree":
					playerWorld.generateTree(newLoc, TreeType.BIG_TREE);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "spruce":
					playerWorld.generateTree(newLoc, TreeType.REDWOOD);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "redwood":
					playerWorld.generateTree(newLoc, TreeType.MEGA_REDWOOD);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "tallspruce":
					playerWorld.generateTree(newLoc, TreeType.TALL_REDWOOD);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "tall_spruce":
					playerWorld.generateTree(newLoc, TreeType.TALL_REDWOOD);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "jungle":
					playerWorld.generateTree(newLoc, TreeType.SMALL_JUNGLE);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "tall_jungle":
					playerWorld.generateTree(newLoc, TreeType.JUNGLE);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "talljungle":
					playerWorld.generateTree(newLoc, TreeType.JUNGLE);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "largejungle":
					playerWorld.generateTree(newLoc, TreeType.JUNGLE);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "large_jungle":
					playerWorld.generateTree(newLoc, TreeType.JUNGLE);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "bush":
					playerWorld.generateTree(newLoc, TreeType.JUNGLE_BUSH);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated bush!"));
					break;
				case "junglebush":
					playerWorld.generateTree(newLoc, TreeType.JUNGLE_BUSH);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated bush!"));
					break;
				case "birch":
					playerWorld.generateTree(newLoc, TreeType.BIRCH);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "tallbirch":
					playerWorld.generateTree(newLoc, TreeType.TALL_BIRCH);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "tall_birch":
					playerWorld.generateTree(newLoc, TreeType.TALL_BIRCH);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "acacia":
					playerWorld.generateTree(newLoc, TreeType.ACACIA);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "orangewood":
					playerWorld.generateTree(newLoc, TreeType.ACACIA);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "dark":
					playerWorld.generateTree(newLoc, TreeType.DARK_OAK);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "darkoak":
					playerWorld.generateTree(newLoc, TreeType.DARK_OAK);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				case "dark_oak":
					playerWorld.generateTree(newLoc, TreeType.DARK_OAK);
					player.sendMessage(plugin.tools.chat("<prefix> &agenerated tree!"));
					break;
				default:
					player.sendMessage(
							plugin.tools.chat("<prefix> &cInvalid Tree type! type &7/tree help &cfor valid types"));

				}

			}, 3);

			plugin.getServer().getScheduler().scheduleSyncDelayedTask(plugin, () -> {

				playerWorld.getBlockAt(targetLocation).setType(oldType);

			}, 6);

		} catch (NullPointerException e) {

			player.sendMessage(plugin.tools.chat("<prefix> &cTrees cannot be generated on a liquid block or air!"));

		}

	}

}
