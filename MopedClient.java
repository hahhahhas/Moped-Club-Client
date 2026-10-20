package club.moped;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public final class MopedClient implements ClientModInitializer {
    public static boolean rainbow = true;
    public static boolean coords = false;
    public static boolean meme = false;
    public static boolean minimalHud = false;
    public static boolean fakePower = false;
    private static KeyBinding menu;

    @Override public void onInitializeClient() {
        menu = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.mopedclub.menu", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_RIGHT_SHIFT,
            KeyBinding.Category.MISC
        ));
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (menu.wasPressed()) {
                if (client.currentScreen instanceof MopedScreen) client.setScreen(null);
                else client.setScreen(new MopedScreen());
            }
        });
    }
}
