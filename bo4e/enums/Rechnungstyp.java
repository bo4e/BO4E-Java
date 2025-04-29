package bo4e.enums;

import java.io.IOException;

/**
 * Abbildung verschiedener Rechnungstypen zur Kennzeichnung von Rechnungen
 */
public enum Rechnungstyp {
    ABSCHLAGSRECHNUNG, ABSCHLUSSRECHNUNG, AUSGLEICHSENERGIERECHNUNG, BESCHAFFUNGSRECHNUNG, ENDKUNDENRECHNUNG, INTEGRIERTE_13_TE_RECHNUNG, MEHRMINDERMENGENRECHNUNG, MESSSTELLENBETRIEBSRECHNUNG, MONATSRECHNUNG, NETZNUTZUNGSRECHNUNG, TURNUSRECHNUNG, ZUSAETZLICHE_13_TE_RECHNUNG, ZWISCHENRECHNUNG;

    public String toValue() {
        switch (this) {
            case ABSCHLAGSRECHNUNG: return "ABSCHLAGSRECHNUNG";
            case ABSCHLUSSRECHNUNG: return "ABSCHLUSSRECHNUNG";
            case AUSGLEICHSENERGIERECHNUNG: return "AUSGLEICHSENERGIERECHNUNG";
            case BESCHAFFUNGSRECHNUNG: return "BESCHAFFUNGSRECHNUNG";
            case ENDKUNDENRECHNUNG: return "ENDKUNDENRECHNUNG";
            case INTEGRIERTE_13_TE_RECHNUNG: return "INTEGRIERTE_13TE_RECHNUNG";
            case MEHRMINDERMENGENRECHNUNG: return "MEHRMINDERMENGENRECHNUNG";
            case MESSSTELLENBETRIEBSRECHNUNG: return "MESSSTELLENBETRIEBSRECHNUNG";
            case MONATSRECHNUNG: return "MONATSRECHNUNG";
            case NETZNUTZUNGSRECHNUNG: return "NETZNUTZUNGSRECHNUNG";
            case TURNUSRECHNUNG: return "TURNUSRECHNUNG";
            case ZUSAETZLICHE_13_TE_RECHNUNG: return "ZUSAETZLICHE_13TE_RECHNUNG";
            case ZWISCHENRECHNUNG: return "ZWISCHENRECHNUNG";
        }
        return null;
    }

    public static Rechnungstyp forValue(String value) throws IOException {
        if (value.equals("ABSCHLAGSRECHNUNG")) return ABSCHLAGSRECHNUNG;
        if (value.equals("ABSCHLUSSRECHNUNG")) return ABSCHLUSSRECHNUNG;
        if (value.equals("AUSGLEICHSENERGIERECHNUNG")) return AUSGLEICHSENERGIERECHNUNG;
        if (value.equals("BESCHAFFUNGSRECHNUNG")) return BESCHAFFUNGSRECHNUNG;
        if (value.equals("ENDKUNDENRECHNUNG")) return ENDKUNDENRECHNUNG;
        if (value.equals("INTEGRIERTE_13TE_RECHNUNG")) return INTEGRIERTE_13_TE_RECHNUNG;
        if (value.equals("MEHRMINDERMENGENRECHNUNG")) return MEHRMINDERMENGENRECHNUNG;
        if (value.equals("MESSSTELLENBETRIEBSRECHNUNG")) return MESSSTELLENBETRIEBSRECHNUNG;
        if (value.equals("MONATSRECHNUNG")) return MONATSRECHNUNG;
        if (value.equals("NETZNUTZUNGSRECHNUNG")) return NETZNUTZUNGSRECHNUNG;
        if (value.equals("TURNUSRECHNUNG")) return TURNUSRECHNUNG;
        if (value.equals("ZUSAETZLICHE_13TE_RECHNUNG")) return ZUSAETZLICHE_13_TE_RECHNUNG;
        if (value.equals("ZWISCHENRECHNUNG")) return ZWISCHENRECHNUNG;
        throw new IOException("Cannot deserialize Rechnungstyp");
    }
}
