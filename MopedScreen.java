package club.moped;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public final class MopedScreen extends Screen {
    public MopedScreen() { super(Text.literal("Moped Club Client")); }

    @Override protected void init() {
        int x = width / 2 - 105, y = height / 2 - 92;
        addDrawableChild(ButtonWidget.builder(Text.literal("Rainbow Mode: " + state(MopedClient.rainbow)), b -> { MopedClient.rainbow = !MopedClient.rainbow; reopen(); }).dimensions(x,y,210,20).build());
        addDrawableChild(ButtonWidget.builder(Text.literal("Coordinates: " + state(MopedClient.coords)), b -> { MopedClient.coords = !MopedClient.coords; reopen(); }).dimensions(x,y+25,210,20).build());
        addDrawableChild(ButtonWidget.builder(Text.literal("Meme Mode: " + state(MopedClient.meme)), b -> { MopedClient.meme = !MopedClient.meme; reopen(); }).dimensions(x,y+50,210,20).build());
        addDrawableChild(ButtonWidget.builder(Text.literal("Minimal HUD: " + state(MopedClient.minimalHud)), b -> { MopedClient.minimalHud = !MopedClient.minimalHud; reopen(); }).dimensions(x,y+75,210,20).build());
        addDrawableChild(ButtonWidget.builder(Text.literal("Fake OP Mode: " + state(MopedClient.fakePower)), b -> { MopedClient.fakePower = !MopedClient.fakePower; reopen(); }).dimensions(x,y+100,210,20).build());
        addDrawableChild(ButtonWidget.builder(Text.literal("Close [Right Shift]"), b -> close()).dimensions(x,y+130,210,20).build());
    }
    private String state(boolean b) { return b ? "ON" : "OFF"; }
    private void reopen() { if (client != null) client.setScreen(new MopedScreen()); }
    @Override public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        int color = MopedClient.rainbow ? java.awt.Color.HSBtoRGB((System.currentTimeMillis()%6000)/6000f,0.8f,1f) : 0xFFFF55FF;
        context.drawCenteredTextWithShadow(textRenderer, "MOPED CLUB CLIENT", width/2, height/2-118, color);
        context.drawCenteredTextWithShadow(textRenderer, "100% certified goofy | cosmetic features", width/2, height/2+72, 0xFFAAAAAA);
    }
    @Override public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        if (keyCode == org.lwjgl.glfw.GLFW.GLFW_KEY_RIGHT_SHIFT) { close(); return true; }
        return super.keyPressed(keyCode, scanCode, modifiers);
    }
    @Override public boolean shouldPause() { return false; }
}
