package bo4e.enums;

import java.io.IOException;

/**
 * Codes der Summenzeitreihentypen.
 *
 * Die nachfolgenden Codes sind in DE7111 zu nutzen:
 *
 * https://www.edi-energy.de/index.php?id=38&tx_bdew_bdew%5Buid%5D=695&tx_bdew_bdew%5Baction%5D=download
 * &tx_bdew_bdew%5Bcontroller%5D=Dokument&cHash=67782e05d8b0f75fbe3a0e1801d07ed0
 */
public enum Zeitreihentyp {
    EGS, LGS, NZR, SES, SES_TES, SLS, SLS_TLS, TES, TLS;

    public String toValue() {
        switch (this) {
            case EGS: return "EGS";
            case LGS: return "LGS";
            case NZR: return "NZR";
            case SES: return "SES";
            case SES_TES: return "SES_TES";
            case SLS: return "SLS";
            case SLS_TLS: return "SLS_TLS";
            case TES: return "TES";
            case TLS: return "TLS";
        }
        return null;
    }

    public static Zeitreihentyp forValue(String value) throws IOException {
        if (value.equals("EGS")) return EGS;
        if (value.equals("LGS")) return LGS;
        if (value.equals("NZR")) return NZR;
        if (value.equals("SES")) return SES;
        if (value.equals("SES_TES")) return SES_TES;
        if (value.equals("SLS")) return SLS;
        if (value.equals("SLS_TLS")) return SLS_TLS;
        if (value.equals("TES")) return TES;
        if (value.equals("TLS")) return TLS;
        throw new IOException("Cannot deserialize Zeitreihentyp");
    }
}
