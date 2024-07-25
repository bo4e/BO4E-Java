package bo4e.enums;

import java.io.IOException;

/**
 * Verbrauchsart der technischen Ressource
 */
public enum TechnischeRessourceVerbrauchsart {
    E_MOBILITAET, KRAFT_LICHT, STRASSENBELEUCHTUNG, WAERME;

    public String toValue() {
        switch (this) {
            case E_MOBILITAET: return "E_MOBILITAET";
            case KRAFT_LICHT: return "KRAFT_LICHT";
            case STRASSENBELEUCHTUNG: return "STRASSENBELEUCHTUNG";
            case WAERME: return "WAERME";
        }
        return null;
    }

    public static TechnischeRessourceVerbrauchsart forValue(String value) throws IOException {
        if (value.equals("E_MOBILITAET")) return E_MOBILITAET;
        if (value.equals("KRAFT_LICHT")) return KRAFT_LICHT;
        if (value.equals("STRASSENBELEUCHTUNG")) return STRASSENBELEUCHTUNG;
        if (value.equals("WAERME")) return WAERME;
        throw new IOException("Cannot deserialize TechnischeRessourceVerbrauchsart");
    }
}
