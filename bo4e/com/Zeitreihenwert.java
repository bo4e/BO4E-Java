package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.Messwertstatus;
import bo4e.enums.Messwertstatuszusatz;

import java.util.List;

/**
 * Abbildung eines Zeitreihenwertes bestehend aus Zeitraum, Wert und Statusinformationen.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Zeitreihenwert.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Zeitreihenwert JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.3.2/src/bo4e_schemas/com/Zeitreihenwert.json>`_
 */
public class Zeitreihenwert extends COM {
    private Messwertstatus status;
    private Messwertstatuszusatz statuszusatz;
    private Double wert;
    private Zeitspanne zeitspanne;

    public Zeitreihenwert() {
    }

    private Zeitreihenwert(ZeitreihenwertBuilder builder) {
        super(builder);
        this.status = builder.status;
        this.statuszusatz = builder.statuszusatz;
        this.wert = builder.wert;
        this.zeitspanne = builder.zeitspanne;
    }

    /**
     * Der Status gibt an, wie der Wert zu interpretieren ist, z.B. in Berechnungen.
     */
    public Messwertstatus getStatus() {
        return status;
    }

    /**
     * Der Status gibt an, wie der Wert zu interpretieren ist, z.B. in Berechnungen.
     */
    public void setStatus(Messwertstatus status) {
        this.status = status;
    }

    /**
     * Eine Zusatzinformation zum Status, beispielsweise ein Grund für einen fehlenden Wert.
     */
    public Messwertstatuszusatz getStatuszusatz() {
        return statuszusatz;
    }

    /**
     * Eine Zusatzinformation zum Status, beispielsweise ein Grund für einen fehlenden Wert.
     */
    public void setStatuszusatz(Messwertstatuszusatz statuszusatz) {
        this.statuszusatz = statuszusatz;
    }

    /**
     * Zeitespanne für das Messintervall
     */
    public Double getWert() {
        return wert;
    }

    /**
     * Zeitespanne für das Messintervall
     */
    public void setWert(Double wert) {
        this.wert = wert;
    }

    /**
     * Zeitespanne für das Messintervall
     */
    public Zeitspanne getZeitspanne() {
        return zeitspanne;
    }

    /**
     * Zeitespanne für das Messintervall
     */
    public void setZeitspanne(Zeitspanne zeitspanne) {
        this.zeitspanne = zeitspanne;
    }

    public static ZeitreihenwertBuilder builder() {
        return new ZeitreihenwertBuilder();
    }

    public static class ZeitreihenwertBuilder extends COMBuilder {
        private Messwertstatus status;
        private Messwertstatuszusatz statuszusatz;
        private Double wert;
        private Zeitspanne zeitspanne;

        private ZeitreihenwertBuilder() {
        }

        /**
         * Der Status gibt an, wie der Wert zu interpretieren ist, z.B. in Berechnungen.
         */
        public Messwertstatus getStatus() {
            return status;
        }

        /**
         * Der Status gibt an, wie der Wert zu interpretieren ist, z.B. in Berechnungen.
         */
        public ZeitreihenwertBuilder setStatus(Messwertstatus status) {
            this.status = status;
            return this;
        }

        /**
         * Eine Zusatzinformation zum Status, beispielsweise ein Grund für einen fehlenden Wert.
         */
        public Messwertstatuszusatz getStatuszusatz() {
            return statuszusatz;
        }

        /**
         * Eine Zusatzinformation zum Status, beispielsweise ein Grund für einen fehlenden Wert.
         */
        public ZeitreihenwertBuilder setStatuszusatz(Messwertstatuszusatz statuszusatz) {
            this.statuszusatz = statuszusatz;
            return this;
        }

        /**
         * Zeitespanne für das Messintervall
         */
        public Double getWert() {
            return wert;
        }

        /**
         * Zeitespanne für das Messintervall
         */
        public ZeitreihenwertBuilder setWert(Double wert) {
            this.wert = wert;
            return this;
        }

        /**
         * Zeitespanne für das Messintervall
         */
        public Zeitspanne getZeitspanne() {
            return zeitspanne;
        }

        /**
         * Zeitespanne für das Messintervall
         */
        public ZeitreihenwertBuilder setZeitspanne(Zeitspanne zeitspanne) {
            this.zeitspanne = zeitspanne;
            return this;
        }

        public ZeitreihenwertBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public ZeitreihenwertBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Zeitreihenwert build() {
            return new Zeitreihenwert(this);
        }
    }
}