package net.fabricmc.example;

import static org.lwjgl.opengl.GL32C.*;

public final class GLUtil {
    private GLUtil() {}

    public static void glSetEnabled(int cap, boolean state) {
        if (state)
            glEnable(cap);
        else
            glDisable(cap);
    }
}
