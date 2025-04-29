package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import bo4e.enums.Messwertstatus;
import bo4e.enums.Messwertstatuszusatz;
import com.fasterxml.jackson.annotation.JsonInclude;

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
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.0.0/src/bo4e_schemas/com/Zeitreihenwert.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Zeitreihenwert extends COM {
    private final ComTyp _typ = ComTyp.ZEITREIHENWERT;
    private Messwertstatus status;
    private Messwertstatuszusatz statuszusatz;
    private Double wert;
    private Zeitraum zeitraum;

    public Zeitreihenwert() {
    }

    private Zeitreihenwert(ZeitreihenwertBuilder builder) {
        super(builder);
        this.status = builder.status;
        this.statuszusatz = builder.statuszusatz;
        this.wert = builder.wert;
        this.zeitraum = builder.zeitraum;
    }

    public ComTyp get_typ() {
        return _typ;
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
    * Der in dem Zeitraum gültige Wert.
    */
    public Double getWert() {
        return wert;
    }

    /**
    * Der in dem Zeitraum gültige Wert.
    */
    public void setWert(Double wert) {
        this.wert = wert;
    }

    /**
    * Zeitraum für das Messintervall
    */
    public Zeitraum getZeitraum() {
        return zeitraum;
    }

    /**
    * Zeitraum für das Messintervall
    */
    public void setZeitraum(Zeitraum zeitraum) {
        this.zeitraum = zeitraum;
    }

    public static ZeitreihenwertBuilder builder() {
        return new ZeitreihenwertBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ZeitreihenwertBuilder extends COMBuilder {
        private Messwertstatus status;
        private Messwertstatuszusatz statuszusatz;
        private Double wert;
        private Zeitraum zeitraum;

        private ZeitreihenwertBuilder() {
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
        public ZeitreihenwertBuilder setStatuszusatz(Messwertstatuszusatz statuszusatz) {
            this.statuszusatz = statuszusatz;
            return this;
        }

        /**
        * Der in dem Zeitraum gültige Wert.
        */
        public ZeitreihenwertBuilder setWert(Double wert) {
            this.wert = wert;
            return this;
        }

        /**
        * Zeitraum für das Messintervall
        */
        public ZeitreihenwertBuilder setZeitraum(Zeitraum zeitraum) {
            this.zeitraum = zeitraum;
            return this;
        }

        public ZeitreihenwertBuilder set_id(String _id) {
            super.set_id(_id);
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