package me.flail.tipsytrees;

import java.util.Locale;

import org.bukkit.Bukkit;
import org.bukkit.TreeType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.world.StructureGrowEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class TipsyTrees extends JavaPlugin {

	public ConsoleCommandSender console = Bukkit.getConsoleSender();

	public Tools tools = new Tools(this);

	public TreeCommand trees = new TreeCommand(this);

	@Override
	public void onEnable() {

		getCommand("tipsytrees").setExecutor(this);

	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		String cmd = command.getName().toLowerCase(Locale.ENGLISH);

		switch (cmd) {

		case "tipsytrees":

			command.setPermission("tipsytrees.use");
			command.setPermissionMessage(tools.chat("<prefix> &4you don't have permission."));
			command.setUsage(tools.chat("<prefix> &cProper usage&8: &7/tree [tree-type:list]"));

			if (sender instanceof Player) {

				Player operator = (Player) sender;

				if (args.length == 1) {

					switch (args[0].toLowerCase(Locale.ENGLISH)) {

					case "help":

						operator.sendMessage(tools.chat(
								"<prefix> &7Use one of the following tree types: &aOak, LargeOak, Birch, LargeBirch, Spruce, LargeSpruce, Jungle, LargeJungle, Acacia, DarkOak"));
						break;

					default:

						trees.generateTree(operator, args[0]);
						break;

					}

				} else {
					operator.sendMessage(tools
							.chat("<prefix> &agrows a tree on the block your cursor is pointing at. Use /tree [type]"));
					operator.sendMessage(tools.chat(
							"&7Use one of the following tree types: &aOak, LargeOak, Birch, LargeBirch, Spruce, LargeSpruce, Jungle, LargeJungle, Acacia, DarkOak"));

				}

			}

		}

		return true;
	}

	@EventHandler
	public void treeGenerate(StructureGrowEvent event) {

		if (event.getSpecies().equals(TreeType.TREE) && !event.isFromBonemeal()) {

			event.getBlocks().iterator();

		}

	}

}
