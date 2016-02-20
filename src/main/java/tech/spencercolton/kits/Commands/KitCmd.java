package tech.spencercolton.kits.Commands;

import org.bukkit.command.CommandSender;
import tech.spencercolton.kits.Util.KitCommand;

/**
 * @author Spencer Colton
 */
public class KitCmd extends KitCommand.AbstractCommand {

    public static final String name = "kit";
    public static final String syntax = "/kit [name]";
    public static final String permission = "kits.kit";

    @Override
    public String name() {
        return name;
    }

    @Override
    public String permission() {
        return permission;
    }

    @Override
    public String syntax() {
        return syntax;
    }

    @Override
    public void execute(CommandSender sender, String... args) {

    }

    @Override
    public String predictPermission(CommandSender sender, String... args) {
        return args.length == 1 ? this.permission() + "." + args[0] : this.permission();
    }

}
