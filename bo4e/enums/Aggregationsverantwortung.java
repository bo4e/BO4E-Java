package bo4e.enums;

import java.io.IOException;

/**
 * Mögliche Qualifier für die Aggregationsverantwortung
 */
public enum Aggregationsverantwortung {
    UENB, VNB;

    public String toValue() {
        switch (this) {
            case UENB: return "UENB";
            case VNB: return "VNB";
        }
        return null;
    }

    public static Aggregationsverantwortung forValue(String value) throws IOException {
        if (value.equals("UENB")) return UENB;
        if (value.equals("VNB")) return VNB;
        throw new IOException("Cannot deserialize Aggregationsverantwortung");
    }
}
