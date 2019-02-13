package me.flail.tipsytrees;

import org.bukkit.ChatColor;
import org.bukkit.TreeType;

public class Tools {

	private TipsyTrees plugin;

	public Tools(TipsyTrees plugin) {
		this.plugin = plugin;
	}

	public String chat(String s) {

		String prefix = "&6[&2&lTrees&6]";

		String version = plugin.getDescription().getVersion();

		if (s != null) {

			String response = ChatColor.translateAlternateColorCodes('&',
					s.replace("<prefix>", prefix).replaceAll("<version>", version));

			return response;

		} else {
			return ChatColor.translateAlternateColorCodes('&', prefix + " &cTipsyTrees ChatERROR!");
		}

	}

	public TreeType treeType(String type) {
		switch (type) {

		case "oak":
			return TreeType.TREE;
		case "wood":
			return TreeType.TREE;
		case "tree":
			return TreeType.TREE;
		case "bigoak":
			return TreeType.BIG_TREE;
		case "bigtree":
			return TreeType.BIG_TREE;
		case "largetree":
			return TreeType.BIG_TREE;
		case "largeoak":
			return TreeType.BIG_TREE;
		case "big_oak":
			return TreeType.BIG_TREE;
		case "big_tree":
			return TreeType.BIG_TREE;
		case "large_oak":
			return TreeType.BIG_TREE;
		case "large_tree":
			return TreeType.BIG_TREE;
		case "spruce":
			return TreeType.REDWOOD;
		case "redwood":
			return TreeType.MEGA_REDWOOD;
		case "tallspruce":
			return TreeType.TALL_REDWOOD;
		case "tall_spruce":
			return TreeType.TALL_REDWOOD;
		case "jungle":
			return TreeType.SMALL_JUNGLE;
		case "tall_jungle":
			return TreeType.JUNGLE;
		case "talljungle":
			return TreeType.JUNGLE;
		case "largejungle":
			return TreeType.JUNGLE;
		case "large_jungle":
			return TreeType.JUNGLE;
		case "bush":
			return TreeType.JUNGLE_BUSH;
		case "junglebush":
			return TreeType.JUNGLE_BUSH;
		case "birch":
			return TreeType.BIRCH;
		case "tallbirch":
			return TreeType.TALL_BIRCH;
		case "tall_birch":
			return TreeType.TALL_BIRCH;
		case "acacia":
			return TreeType.ACACIA;
		case "orangewood":
			return TreeType.ACACIA;
		case "dark":
			return TreeType.DARK_OAK;
		case "darkoak":
			return TreeType.DARK_OAK;
		case "dark_oak":
			return TreeType.DARK_OAK;
		default:
			return null;

		}

	}

}
