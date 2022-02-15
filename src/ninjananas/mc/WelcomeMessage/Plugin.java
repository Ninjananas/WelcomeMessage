package ninjananas.mc.WelcomeMessage;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin implements Listener{

    @Override
    public void onEnable() {
    	this.saveDefaultConfig();
    	this.getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
    	event.getPlayer().sendMessage(this.getConfig().getString("message"));
    }
}
