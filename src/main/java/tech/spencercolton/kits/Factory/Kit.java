package tech.spencercolton.kits.Factory;

import tech.spencercolton.kits.Util.Config;

/**
 * @author Spencer Colton
 */
public class Kit {

    private final String name;

    Kit(String name) {
        this.name = name;
    }

    public static boolean exists(String name) {
        return Config.get("kits." + name) != null;
    }

}
