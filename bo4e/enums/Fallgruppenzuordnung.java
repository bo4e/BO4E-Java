package bo4e.enums;

import java.io.IOException;

/**
 * Fallgruppenzuordnung nach edi@energy
 */
public enum Fallgruppenzuordnung {
    GABI_RLM_IM_NOMINIERUNGSERSATZVERFAHREN, GABI_RLM_MIT_TAGESBAND, GABI_RLM_OHNE_TAGESBAND;

    public String toValue() {
        switch (this) {
            case GABI_RLM_IM_NOMINIERUNGSERSATZVERFAHREN: return "GABI_RLM_IM_NOMINIERUNGSERSATZVERFAHREN";
            case GABI_RLM_MIT_TAGESBAND: return "GABI_RLM_MIT_TAGESBAND";
            case GABI_RLM_OHNE_TAGESBAND: return "GABI_RLM_OHNE_TAGESBAND";
        }
        return null;
    }

    public static Fallgruppenzuordnung forValue(String value) throws IOException {
        if (value.equals("GABI_RLM_IM_NOMINIERUNGSERSATZVERFAHREN")) return GABI_RLM_IM_NOMINIERUNGSERSATZVERFAHREN;
        if (value.equals("GABI_RLM_MIT_TAGESBAND")) return GABI_RLM_MIT_TAGESBAND;
        if (value.equals("GABI_RLM_OHNE_TAGESBAND")) return GABI_RLM_OHNE_TAGESBAND;
        throw new IOException("Cannot deserialize Fallgruppenzuordnung");
    }
}
