package tech.spencercolton.kits.Util;

import org.bukkit.configuration.ConfigurationSection;

/**
 * @author Spencer Colton
 */
public class Config {

    private static ConfigurationSection config;

    public static void init(ConfigurationSection cs) {
        config = cs;
    }

    public static Object get(String s) {
        return config.get(s);
    }

    public static void set(String s, Object o) {
        config.set(s, o);
    }

    public static ConfigurationSection getSection(String s) {
        return config.getConfigurationSection(s);
    }

}
