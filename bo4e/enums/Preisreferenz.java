package bo4e.enums;

import java.io.IOException;

/**
 * Referenz worauf sich eine Preisposition bezieht.
 */
public enum Preisreferenz {
    ANZAHL, ENERGIEMENGE, LEISTUNG, PAUSCHAL, ZEITRAUM;

    public String toValue() {
        switch (this) {
            case ANZAHL: return "ANZAHL";
            case ENERGIEMENGE: return "ENERGIEMENGE";
            case LEISTUNG: return "LEISTUNG";
            case PAUSCHAL: return "PAUSCHAL";
            case ZEITRAUM: return "ZEITRAUM";
        }
        return null;
    }

    public static Preisreferenz forValue(String value) throws IOException {
        if (value.equals("ANZAHL")) return ANZAHL;
        if (value.equals("ENERGIEMENGE")) return ENERGIEMENGE;
        if (value.equals("LEISTUNG")) return LEISTUNG;
        if (value.equals("PAUSCHAL")) return PAUSCHAL;
        if (value.equals("ZEITRAUM")) return ZEITRAUM;
        throw new IOException("Cannot deserialize Preisreferenz");
    }
}
