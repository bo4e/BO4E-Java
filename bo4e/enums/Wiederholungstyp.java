package bo4e.enums;

import java.io.IOException;

/**
 * Klassifiziert einen Tagtyp, an dem ein wiederkehrendes Schaltschema (z.B. die
 * Umschaltzeiten einer
 * `Zaehlzeitdefinition`) gilt. Die Werte teilen sich in drei Gruppen auf:
 *
 * * `TAEGLICH` – gilt an jedem Tag des Jahres.
 * * Gruppenbezeichnungen (`WERKTAGS`, `WOCHENENDE`, `FEIERTAGS`) – fassen mehrere
 * Wochentage zusammen.
 * Was als Feiertag zählt, wird durch den Feiertagskalender der `Zaehlzeitdefinition`
 * bestimmt.
 * * Einzelne Wochentage (`MONTAGS` … `SONNTAGS`).
 */
public enum Wiederholungstyp {
    DIENSTAGS, DONNERSTAGS, FEIERTAGS, FREITAGS, MITTWOCHS, MONTAGS, SAMSTAGS, SONNTAGS, TAEGLICH, WERKTAGS, WOCHENENDE;

    public String toValue() {
        switch (this) {
            case DIENSTAGS: return "DIENSTAGS";
            case DONNERSTAGS: return "DONNERSTAGS";
            case FEIERTAGS: return "FEIERTAGS";
            case FREITAGS: return "FREITAGS";
            case MITTWOCHS: return "MITTWOCHS";
            case MONTAGS: return "MONTAGS";
            case SAMSTAGS: return "SAMSTAGS";
            case SONNTAGS: return "SONNTAGS";
            case TAEGLICH: return "TAEGLICH";
            case WERKTAGS: return "WERKTAGS";
            case WOCHENENDE: return "WOCHENENDE";
        }
        return null;
    }

    public static Wiederholungstyp forValue(String value) throws IOException {
        if (value.equals("DIENSTAGS")) return DIENSTAGS;
        if (value.equals("DONNERSTAGS")) return DONNERSTAGS;
        if (value.equals("FEIERTAGS")) return FEIERTAGS;
        if (value.equals("FREITAGS")) return FREITAGS;
        if (value.equals("MITTWOCHS")) return MITTWOCHS;
        if (value.equals("MONTAGS")) return MONTAGS;
        if (value.equals("SAMSTAGS")) return SAMSTAGS;
        if (value.equals("SONNTAGS")) return SONNTAGS;
        if (value.equals("TAEGLICH")) return TAEGLICH;
        if (value.equals("WERKTAGS")) return WERKTAGS;
        if (value.equals("WOCHENENDE")) return WOCHENENDE;
        throw new IOException("Cannot deserialize Wiederholungstyp");
    }
}
