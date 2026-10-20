# Moped Club Client (Fabric 1.21.11)

This is a **source project**, not an already compiled or tested Minecraft mod.

## Build without installing Gradle on your PC

1. Create a GitHub repository and upload **the contents** of this folder, including `.github/workflows/build.yml`.
2. Open your repository's **Actions** tab.
3. Select **Build Moped Club Client** and click **Run workflow** (or push to `main` to start automatically).
4. If the build succeeds, open that workflow run and download the `moped-club-client-jar` artifact.
5. Extract the artifact and put the non-`sources` `.jar` file in the `mods` folder of your Minecraft 1.21.11 Fabric Modrinth profile.
6. Ensure Fabric API is installed. Press **Right Shift** in game to open the GUI.

The current menu includes cosmetic toggle placeholders. ESP, tracers, freecam, zoom, and other cheat modules are **not implemented**. Minecraft 1.21.11 compatibility has not been verified; if GitHub Actions fails, inspect its build log.

For a local build, use Java 21 and Gradle: `gradle build`.
