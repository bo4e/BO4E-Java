package bo4e.enums;

import java.io.IOException;

/**
 * Beschreibung des Steuerkanals
 */
public enum SteuerkanalLeistungsbeschreibung {
    AN_AUS, GESTUFT;

    public String toValue() {
        switch (this) {
            case AN_AUS: return "AN_AUS";
            case GESTUFT: return "GESTUFT";
        }
        return null;
    }

    public static SteuerkanalLeistungsbeschreibung forValue(String value) throws IOException {
        if (value.equals("AN_AUS")) return AN_AUS;
        if (value.equals("GESTUFT")) return GESTUFT;
        throw new IOException("Cannot deserialize SteuerkanalLeistungsbeschreibung");
    }
}
