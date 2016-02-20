package tech.spencercolton.kits.Util;

import org.bukkit.configuration.ConfigurationSection;
import tech.spencercolton.kits.Factory.Kit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Spencer Colton
 */
public class KitManager {

    private static List<Kit> kits = new ArrayList<>();

    public static void init() {
        ConfigurationSection kitsec = Config.getSection("kits");
        Map<String, Object> kits = kitsec.getValues(false);

        for(String s : kits.keySet()) {
            ConfigurationSection kit = kitsec.getConfigurationSection(s);

        }
    }

}
