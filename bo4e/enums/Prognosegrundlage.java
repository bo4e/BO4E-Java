package bo4e.enums;

import java.io.IOException;

/**
 * Prognosegrundlage (WERTE, PROFILE).
 */
public enum Prognosegrundlage {
    PROFILE, WERTE;

    public String toValue() {
        switch (this) {
            case PROFILE: return "PROFILE";
            case WERTE: return "WERTE";
        }
        return null;
    }

    public static Prognosegrundlage forValue(String value) throws IOException {
        if (value.equals("PROFILE")) return PROFILE;
        if (value.equals("WERTE")) return WERTE;
        throw new IOException("Cannot deserialize Prognosegrundlage");
    }
}
