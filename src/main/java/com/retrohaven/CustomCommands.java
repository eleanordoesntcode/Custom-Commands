package com.retrohaven.customcommands;

import com.retrohaven.customcommands.commands.MilkCommand;
import com.retrohaven.customcommands.commands.PetCommand;
import com.retrohaven.customcommands.commands.HugCommand;
import com.retrohaven.customcommands.commands.MeowCommand;
import com.retrohaven.customcommands.commands.SillyCommand;
import com.retrohaven.customcommands.commands.WaveCommand;

import org.bukkit.plugin.java.JavaPlugin;

public class CustomCommands extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("meow").setExecutor(new MeowCommand());
        getCommand("hug").setExecutor(new HugCommand());
        getCommand("wave").setExecutor(new WaveCommand());
        getCommand("silly").setExecutor(new SillyCommand());
        getCommand("pet").setExecutor(new PetCommand());
        getCommand("milk").setExecutor(new MilkCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
