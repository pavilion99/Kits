package tech.spencercolton.kits.Factory;

import tech.spencercolton.kits.Exceptions.NoKitDefFoundError;

/**
 * @author Spencer Colton
 */
public class KitFactory {

    public static Kit getKit(String name) throws NoKitDefFoundError {
        if(!Kit.exists(name))
            throw new NoKitDefFoundError("Couldn't find a kit with name " + name + ".");

        return new Kit(name);
    }

}
