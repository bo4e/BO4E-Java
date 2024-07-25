package bo4e.enums;

import java.io.IOException;

/**
 * Nutzung der technischen Ressource
 */
public enum TechnischeRessourceNutzung {
    SPEICHER, STROMERZEUGUNGSART, STROMVERBRAUCHSART;

    public String toValue() {
        switch (this) {
            case SPEICHER: return "SPEICHER";
            case STROMERZEUGUNGSART: return "STROMERZEUGUNGSART";
            case STROMVERBRAUCHSART: return "STROMVERBRAUCHSART";
        }
        return null;
    }

    public static TechnischeRessourceNutzung forValue(String value) throws IOException {
        if (value.equals("SPEICHER")) return SPEICHER;
        if (value.equals("STROMERZEUGUNGSART")) return STROMERZEUGUNGSART;
        if (value.equals("STROMVERBRAUCHSART")) return STROMVERBRAUCHSART;
        throw new IOException("Cannot deserialize TechnischeRessourceNutzung");
    }
}
