package tech.spencercolton.kits;

import org.bukkit.plugin.java.JavaPlugin;
import tech.spencercolton.kits.Util.Config;

/**
 * @author Spencer Colton
 */
public class Kits extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        reloadConfig();

        Config.init(this.getConfig());
    }

    @Override
    public void onDisable() {

    }

}
