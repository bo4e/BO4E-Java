package bo4e.enums;

import java.io.IOException;

/**
 * Mit dieser Aufzählung können Operationen festgelegt werden.
 */
public enum Operator {
    ADDITION, DIVISION, MULTIPLIKATION, SUBTRAKTION;

    public String toValue() {
        switch (this) {
            case ADDITION: return "ADDITION";
            case DIVISION: return "DIVISION";
            case MULTIPLIKATION: return "MULTIPLIKATION";
            case SUBTRAKTION: return "SUBTRAKTION";
        }
        return null;
    }

    public static Operator forValue(String value) throws IOException {
        if (value.equals("ADDITION")) return ADDITION;
        if (value.equals("DIVISION")) return DIVISION;
        if (value.equals("MULTIPLIKATION")) return MULTIPLIKATION;
        if (value.equals("SUBTRAKTION")) return SUBTRAKTION;
        throw new IOException("Cannot deserialize Operator");
    }
}
