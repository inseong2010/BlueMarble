package kr.co.skeleton.bluemarble;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class tabcom implements TabCompleter {

    static List<String> arguments = new ArrayList<>();
    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String alias, @NotNull String[] args) {
        return bm();
    }

    public static List<String> bm() {
        if (arguments.isEmpty()) {
            arguments.add("help");
            arguments.add("roll");
            arguments.add("goldenkey");
        }
        return arguments;
    }
}
