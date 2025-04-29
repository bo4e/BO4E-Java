package bo4e.enums;

import java.io.IOException;

/**
 * Profiltyp (temperaturabhängig / Standardlastprofil).
 */
public enum Profiltyp {
    SLP_SEP, TLP_TEP;

    public String toValue() {
        switch (this) {
            case SLP_SEP: return "SLP_SEP";
            case TLP_TEP: return "TLP_TEP";
        }
        return null;
    }

    public static Profiltyp forValue(String value) throws IOException {
        if (value.equals("SLP_SEP")) return SLP_SEP;
        if (value.equals("TLP_TEP")) return TLP_TEP;
        throw new IOException("Cannot deserialize Profiltyp");
    }
}
