package net.avcd.hpn;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.options.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

@Environment(EnvType.CLIENT)
public class HidePlayerName implements ModInitializer {
    public static boolean render_players = true;
    public static boolean render_else = true;

    private static KeyBinding render_players_keybinding;
    private static KeyBinding render_else_keybinding;

    @Override
    public void onInitialize() {
        System.out.println("[Hide Player Name] Initialized");

        HidePlayerName.render_players_keybinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "Toggle render player names", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_P, "Hide Player Name"
        ));

        HidePlayerName.render_else_keybinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "Toggle render entity names", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_O, "Hide Player Name"
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (HidePlayerName.render_players_keybinding.wasPressed())
                HidePlayerName.render_players = !HidePlayerName.render_players;
            if (HidePlayerName.render_else_keybinding.wasPressed())
                HidePlayerName.render_else = !HidePlayerName.render_else;
        });
    }
}
