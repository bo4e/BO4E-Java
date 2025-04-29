package bo4e.enums;

import java.io.IOException;

/**
 * Art des Abwicklungsmodell (E-Mob)
 */
public enum Abwicklungsmodell {
    MODELL_1, MODELL_2;

    public String toValue() {
        switch (this) {
            case MODELL_1: return "MODELL_1";
            case MODELL_2: return "MODELL_2";
        }
        return null;
    }

    public static Abwicklungsmodell forValue(String value) throws IOException {
        if (value.equals("MODELL_1")) return MODELL_1;
        if (value.equals("MODELL_2")) return MODELL_2;
        throw new IOException("Cannot deserialize Abwicklungsmodell");
    }
}
