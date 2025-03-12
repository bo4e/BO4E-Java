package bo4e.enums;

import java.io.IOException;

public enum TarifTyp {
    TARIF;

    public String toValue() {
        switch (this) {
            case TARIF: return "TARIF";
        }
        return null;
    }

    public static TarifTyp forValue(String value) throws IOException {
        if (value.equals("TARIF")) return TARIF;
        throw new IOException("Cannot deserialize TarifTyp");
    }
}
