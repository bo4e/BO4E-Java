package bo4e.enums;

import java.io.IOException;

/**
 * Gibt an, um was für eine Zahlungsart es sich handelt.
 */
public enum Zahlungsart {
    SEPA_LASTSCHRIFT, UEBERWEISUNG;

    public String toValue() {
        switch (this) {
            case SEPA_LASTSCHRIFT: return "SEPA_LASTSCHRIFT";
            case UEBERWEISUNG: return "UEBERWEISUNG";
        }
        return null;
    }

    public static Zahlungsart forValue(String value) throws IOException {
        if (value.equals("SEPA_LASTSCHRIFT")) return SEPA_LASTSCHRIFT;
        if (value.equals("UEBERWEISUNG")) return UEBERWEISUNG;
        throw new IOException("Cannot deserialize Zahlungsart");
    }
}
