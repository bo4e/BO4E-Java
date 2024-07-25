package bo4e.enums;

import java.io.IOException;

/**
 * Art der E-Mobilität
 */
public enum EMobilitaetsart {
    E_MOBILITAETSLADESAEULE, LADEPARK, WALLBOX;

    public String toValue() {
        switch (this) {
            case E_MOBILITAETSLADESAEULE: return "E_MOBILITAETSLADESAEULE";
            case LADEPARK: return "LADEPARK";
            case WALLBOX: return "WALLBOX";
        }
        return null;
    }

    public static EMobilitaetsart forValue(String value) throws IOException {
        if (value.equals("E_MOBILITAETSLADESAEULE")) return E_MOBILITAETSLADESAEULE;
        if (value.equals("LADEPARK")) return LADEPARK;
        if (value.equals("WALLBOX")) return WALLBOX;
        throw new IOException("Cannot deserialize EMobilitaetsart");
    }
}
