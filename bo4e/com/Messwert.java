package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import bo4e.enums.Messwertstatus;
import bo4e.enums.Messwertstatuszusatz;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.OffsetDateTime;
import java.util.List;

/**
* Abbildung eines Messwertes mit Stati, Zeitpunkt und Wert.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Messwert.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Messwert JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202607.1.0-rc2/src/bo4e_schemas/com/Messwert.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Messwert extends COM {
    private final ComTyp _typ = ComTyp.MESSWERT;
    private Messwertstatus messwertstatus;
    private Messwertstatuszusatz messwertstatuszusatz;
    private Menge wert;
    private OffsetDateTime zeitpunkt;

    public Messwert() {
    }

    private Messwert(MesswertBuilder builder) {
        super(builder);
        this.messwertstatus = builder.messwertstatus;
        this.messwertstatuszusatz = builder.messwertstatuszusatz;
        this.wert = builder.wert;
        this.zeitpunkt = builder.zeitpunkt;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Gibt den Status des Messwerts an.
    */
    public Messwertstatus getMesswertstatus() {
        return messwertstatus;
    }

    /**
    * Gibt den Status des Messwerts an.
    */
    public void setMesswertstatus(Messwertstatus messwertstatus) {
        this.messwertstatus = messwertstatus;
    }

    /**
    * Gibt den Status Zusatz des Messwerts an.
    */
    public Messwertstatuszusatz getMesswertstatuszusatz() {
        return messwertstatuszusatz;
    }

    /**
    * Gibt den Status Zusatz des Messwerts an.
    */
    public void setMesswertstatuszusatz(Messwertstatuszusatz messwertstatuszusatz) {
        this.messwertstatuszusatz = messwertstatuszusatz;
    }

    /**
    * Gibt die gemessene Menge an.
    */
    public Menge getWert() {
        return wert;
    }

    /**
    * Gibt die gemessene Menge an.
    */
    public void setWert(Menge wert) {
        this.wert = wert;
    }

    /**
    * Gibt den Zeitpunkt des Messwerts an.
    */
    public OffsetDateTime getZeitpunkt() {
        return zeitpunkt;
    }

    /**
    * Gibt den Zeitpunkt des Messwerts an.
    */
    public void setZeitpunkt(OffsetDateTime zeitpunkt) {
        this.zeitpunkt = zeitpunkt;
    }

    public static MesswertBuilder builder() {
        return new MesswertBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class MesswertBuilder extends COMBuilder {
        private Messwertstatus messwertstatus;
        private Messwertstatuszusatz messwertstatuszusatz;
        private Menge wert;
        private OffsetDateTime zeitpunkt;

        private MesswertBuilder() {
        }

        /**
        * Gibt den Status des Messwerts an.
        */
        public MesswertBuilder setMesswertstatus(Messwertstatus messwertstatus) {
            this.messwertstatus = messwertstatus;
            return this;
        }

        /**
        * Gibt den Status Zusatz des Messwerts an.
        */
        public MesswertBuilder setMesswertstatuszusatz(Messwertstatuszusatz messwertstatuszusatz) {
            this.messwertstatuszusatz = messwertstatuszusatz;
            return this;
        }

        /**
        * Gibt die gemessene Menge an.
        */
        public MesswertBuilder setWert(Menge wert) {
            this.wert = wert;
            return this;
        }

        /**
        * Gibt den Zeitpunkt des Messwerts an.
        */
        public MesswertBuilder setZeitpunkt(OffsetDateTime zeitpunkt) {
            this.zeitpunkt = zeitpunkt;
            return this;
        }

        public MesswertBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public MesswertBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Messwert build() {
            return new Messwert(this);
        }
    }
}