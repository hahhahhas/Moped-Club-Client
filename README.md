# Moped Club Client — Fabric 1.21.11

This is a **source project**, not a prebuilt or tested `.jar`. It currently implements a Right Shift GUI with cosmetic placeholder switches; ESP and Freecam are **not implemented**.

## GitHub build (no local Java or Gradle needed)

1. Extract the ZIP. Open the `Moped_Club_Client_Corrected` folder.
2. Upload the **folders** `.github` and `src` as folders, and the root files, preserving the paths. Do not flatten all files into the repository root.
3. The repository must show `.github/workflows/build.yml` and `src/main/java/club/moped/MopedClient.java`.
4. Open **Actions** > **Build Moped Club Client** > **Run workflow**.
5. If the build succeeds, download the artifact. Unzip it and put the non-sources mod `.jar` in your Modrinth Fabric 1.21.11 profile's `mods` folder.

GitHub Actions will report compilation errors if any; compilation has not been verified in this environment.
