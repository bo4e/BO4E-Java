package bo4e.enums;

import java.io.IOException;

/**
 * Profilverfahren: synthetisch/ analytisch.
 */
public enum Profilverfahren {
    ANALYTISCH, SYNTHETISCH;

    public String toValue() {
        switch (this) {
            case ANALYTISCH: return "ANALYTISCH";
            case SYNTHETISCH: return "SYNTHETISCH";
        }
        return null;
    }

    public static Profilverfahren forValue(String value) throws IOException {
        if (value.equals("ANALYTISCH")) return ANALYTISCH;
        if (value.equals("SYNTHETISCH")) return SYNTHETISCH;
        throw new IOException("Cannot deserialize Profilverfahren");
    }
}
