package tech.spencercolton.kits.Util;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import tech.spencercolton.kits.Commands.KitCmd;

import java.util.*;

/**
 * @author Spencer Colton
 */
public class KitCommand implements CommandExecutor {

    private static Map<String, AbstractCommand> cmds = new HashMap<>();

    public boolean onCommand(CommandSender sender, Command cmd, String label, String... args) {
        assert cmds.containsKey(cmd.getName().toLowerCase());


        cmds.get(cmd.getName().toLowerCase()).execute(sender, args);

        return true;
    }

    public static void init() {
        populate();
    }

    private static void populate() {
        cmds.put(KitCmd.name, new KitCmd());
    }

    public static abstract class AbstractCommand {

        public String name() {
            return "[[MISSINGNAME]]";
        }

        public String permission() {
            return "[[MISSINGPERM]]";
        }

        public String syntax() {
            return "[[MISSINGSYNTAX]]";
        }

        public String predictPermission(CommandSender sender, String... args) {
            return this.permission();
        }

        public abstract void execute(CommandSender sender, String... args);

    }

}
