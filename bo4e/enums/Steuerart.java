package bo4e.enums;

import java.io.IOException;

/**
 * Zur Kennzeichnung verschiedener Steuerarten.
 */
public enum Steuerart {
    RCV, UST, VST;

    public String toValue() {
        switch (this) {
            case RCV: return "RCV";
            case UST: return "UST";
            case VST: return "VST";
        }
        return null;
    }

    public static Steuerart forValue(String value) throws IOException {
        if (value.equals("RCV")) return RCV;
        if (value.equals("UST")) return UST;
        if (value.equals("VST")) return VST;
        throw new IOException("Cannot deserialize Steuerart");
    }
}
