package bo4e.enums;

import java.io.IOException;

/**
 * Gibt an, ob es sich um eine Markt- oder Messlokation handelt.
 */
public enum Lokationstyp {
    MALO, MELO, NELO, SR, TR;

    public String toValue() {
        switch (this) {
            case MALO: return "MALO";
            case MELO: return "MELO";
            case NELO: return "NELO";
            case SR: return "SR";
            case TR: return "TR";
        }
        return null;
    }

    public static Lokationstyp forValue(String value) throws IOException {
        if (value.equals("MALO")) return MALO;
        if (value.equals("MELO")) return MELO;
        if (value.equals("NELO")) return NELO;
        if (value.equals("SR")) return SR;
        if (value.equals("TR")) return TR;
        throw new IOException("Cannot deserialize Lokationstyp");
    }
}
