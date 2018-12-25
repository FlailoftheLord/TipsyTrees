package me.flail.tipsytrees;

import org.bukkit.ChatColor;

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

}
