package bo4e.enums;

import java.io.IOException;

/**
 * Wahlrecht der Prognosegrundlage der Marktlokation.
 */
public enum WahlrechtPrognosegrundlage {
    DURCH_LF, DURCH_LF_NICHT_GEGEBEN, NICHT_WEGEN_EIGENVERBRAUCH, NICHT_WEGEN_ENWG, NICHT_WEGEN_GROSSEN_VERBRAUCHS, NICHT_WEGEN_TAGES_VERBRAUCH;

    public String toValue() {
        switch (this) {
            case DURCH_LF: return "DURCH_LF";
            case DURCH_LF_NICHT_GEGEBEN: return "DURCH_LF_NICHT_GEGEBEN";
            case NICHT_WEGEN_EIGENVERBRAUCH: return "NICHT_WEGEN_EIGENVERBRAUCH";
            case NICHT_WEGEN_ENWG: return "NICHT_WEGEN_ENWG";
            case NICHT_WEGEN_GROSSEN_VERBRAUCHS: return "NICHT_WEGEN_GROSSEN_VERBRAUCHS";
            case NICHT_WEGEN_TAGES_VERBRAUCH: return "NICHT_WEGEN_TAGES_VERBRAUCH";
        }
        return null;
    }

    public static WahlrechtPrognosegrundlage forValue(String value) throws IOException {
        if (value.equals("DURCH_LF")) return DURCH_LF;
        if (value.equals("DURCH_LF_NICHT_GEGEBEN")) return DURCH_LF_NICHT_GEGEBEN;
        if (value.equals("NICHT_WEGEN_EIGENVERBRAUCH")) return NICHT_WEGEN_EIGENVERBRAUCH;
        if (value.equals("NICHT_WEGEN_ENWG")) return NICHT_WEGEN_ENWG;
        if (value.equals("NICHT_WEGEN_GROSSEN_VERBRAUCHS")) return NICHT_WEGEN_GROSSEN_VERBRAUCHS;
        if (value.equals("NICHT_WEGEN_TAGES_VERBRAUCH")) return NICHT_WEGEN_TAGES_VERBRAUCH;
        throw new IOException("Cannot deserialize WahlrechtPrognosegrundlage");
    }
}
