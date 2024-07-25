package bo4e.enums;

import java.io.IOException;

/**
 * Art der Speicherung
 */
public enum Speicherart {
    BATTERIESPEICHER, PUMPSPEICHER, SONSTIGE_SPEICHERART, WASSERSTOFFSPEICHER;

    public String toValue() {
        switch (this) {
            case BATTERIESPEICHER: return "BATTERIESPEICHER";
            case PUMPSPEICHER: return "PUMPSPEICHER";
            case SONSTIGE_SPEICHERART: return "SONSTIGE_SPEICHERART";
            case WASSERSTOFFSPEICHER: return "WASSERSTOFFSPEICHER";
        }
        return null;
    }

    public static Speicherart forValue(String value) throws IOException {
        if (value.equals("BATTERIESPEICHER")) return BATTERIESPEICHER;
        if (value.equals("PUMPSPEICHER")) return PUMPSPEICHER;
        if (value.equals("SONSTIGE_SPEICHERART")) return SONSTIGE_SPEICHERART;
        if (value.equals("WASSERSTOFFSPEICHER")) return WASSERSTOFFSPEICHER;
        throw new IOException("Cannot deserialize Speicherart");
    }
}
