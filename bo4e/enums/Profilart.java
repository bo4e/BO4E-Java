package bo4e.enums;

import java.io.IOException;

/**
 * Profilart: temperaturabh./Standardlastprofil.
 */
public enum Profilart {
    ART_LASTPROFIL, ART_STANDARDEINSPEISEPROFIL, ART_STANDARDLASTPROFIL, ART_TAGESPARAMETERABHAENGIGES_EINSPEISEPROFIL, ART_TAGESPARAMETERABHAENGIGES_LASTPROFIL;

    public String toValue() {
        switch (this) {
            case ART_LASTPROFIL: return "ART_LASTPROFIL";
            case ART_STANDARDEINSPEISEPROFIL: return "ART_STANDARDEINSPEISEPROFIL";
            case ART_STANDARDLASTPROFIL: return "ART_STANDARDLASTPROFIL";
            case ART_TAGESPARAMETERABHAENGIGES_EINSPEISEPROFIL: return "ART_TAGESPARAMETERABHAENGIGES_EINSPEISEPROFIL";
            case ART_TAGESPARAMETERABHAENGIGES_LASTPROFIL: return "ART_TAGESPARAMETERABHAENGIGES_LASTPROFIL";
        }
        return null;
    }

    public static Profilart forValue(String value) throws IOException {
        if (value.equals("ART_LASTPROFIL")) return ART_LASTPROFIL;
        if (value.equals("ART_STANDARDEINSPEISEPROFIL")) return ART_STANDARDEINSPEISEPROFIL;
        if (value.equals("ART_STANDARDLASTPROFIL")) return ART_STANDARDLASTPROFIL;
        if (value.equals("ART_TAGESPARAMETERABHAENGIGES_EINSPEISEPROFIL")) return ART_TAGESPARAMETERABHAENGIGES_EINSPEISEPROFIL;
        if (value.equals("ART_TAGESPARAMETERABHAENGIGES_LASTPROFIL")) return ART_TAGESPARAMETERABHAENGIGES_LASTPROFIL;
        throw new IOException("Cannot deserialize Profilart");
    }
}
