package bo4e.enums;

import java.io.IOException;

public enum ZaehlerTyp {
    ZAEHLER;

    public String toValue() {
        switch (this) {
            case ZAEHLER: return "ZAEHLER";
        }
        return null;
    }

    public static ZaehlerTyp forValue(String value) throws IOException {
        if (value.equals("ZAEHLER")) return ZAEHLER;
        throw new IOException("Cannot deserialize ZaehlerTyp");
    }
}
