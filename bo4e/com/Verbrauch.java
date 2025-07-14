package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import bo4e.enums.Mengeneinheit;
import bo4e.enums.Messwertstatus;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.OffsetDateTime;
import java.util.List;

/**
* Abbildung eines zeitlich abgegrenzten Verbrauchs
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Verbrauch.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Verbrauch JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.1.0-rc1/src/bo4e_schemas/com/Verbrauch.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Verbrauch extends COM {
    private final ComTyp _typ = ComTyp.VERBRAUCH;
    private Mengeneinheit einheit;
    private OffsetDateTime enddatum;
    private Messwertstatus messwertstatus;
    private String obisKennzahl;
    private OffsetDateTime startdatum;
    private Double wert;

    public Verbrauch() {
    }

    private Verbrauch(VerbrauchBuilder builder) {
        super(builder);
        this.einheit = builder.einheit;
        this.enddatum = builder.enddatum;
        this.messwertstatus = builder.messwertstatus;
        this.obisKennzahl = builder.obisKennzahl;
        this.startdatum = builder.startdatum;
        this.wert = builder.wert;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Gibt die Einheit zum jeweiligen Wert an
    */
    public Mengeneinheit getEinheit() {
        return einheit;
    }

    /**
    * Gibt die Einheit zum jeweiligen Wert an
    */
    public void setEinheit(Mengeneinheit einheit) {
        this.einheit = einheit;
    }

    /**
    * Exklusives Ende des Zeitraumes, für den der Verbrauch angegeben wird.
    * Ein ZeitPUNKT kann mit start==ende angegeben werden.
    */
    public OffsetDateTime getEnddatum() {
        return enddatum;
    }

    /**
    * Exklusives Ende des Zeitraumes, für den der Verbrauch angegeben wird.
    * Ein ZeitPUNKT kann mit start==ende angegeben werden.
    */
    public void setEnddatum(OffsetDateTime enddatum) {
        this.enddatum = enddatum;
    }

    /**
    * Messwertstatus includes the plausibility of the value
    */
    public Messwertstatus getMesswertstatus() {
        return messwertstatus;
    }

    /**
    * Messwertstatus includes the plausibility of the value
    */
    public void setMesswertstatus(Messwertstatus messwertstatus) {
        this.messwertstatus = messwertstatus;
    }

    /**
    * Die OBIS-Kennzahl für den Wert, die festlegt, welche Größe mit dem Stand gemeldet wird,
    * z.B. '1-0:
    */
    public String getObisKennzahl() {
        return obisKennzahl;
    }

    /**
    * Die OBIS-Kennzahl für den Wert, die festlegt, welche Größe mit dem Stand gemeldet wird,
    * z.B. '1-0:
    */
    public void setObisKennzahl(String obisKennzahl) {
        this.obisKennzahl = obisKennzahl;
    }

    /**
    * Inklusiver Beginn des Zeitraumes, für den der Verbrauch angegeben wird
    */
    public OffsetDateTime getStartdatum() {
        return startdatum;
    }

    /**
    * Inklusiver Beginn des Zeitraumes, für den der Verbrauch angegeben wird
    */
    public void setStartdatum(OffsetDateTime startdatum) {
        this.startdatum = startdatum;
    }

    /**
    * Gibt den absoluten Wert der Menge an
    */
    public Double getWert() {
        return wert;
    }

    /**
    * Gibt den absoluten Wert der Menge an
    */
    public void setWert(Double wert) {
        this.wert = wert;
    }

    public static VerbrauchBuilder builder() {
        return new VerbrauchBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class VerbrauchBuilder extends COMBuilder {
        private Mengeneinheit einheit;
        private OffsetDateTime enddatum;
        private Messwertstatus messwertstatus;
        private String obisKennzahl;
        private OffsetDateTime startdatum;
        private Double wert;

        private VerbrauchBuilder() {
        }

        /**
        * Gibt die Einheit zum jeweiligen Wert an
        */
        public VerbrauchBuilder setEinheit(Mengeneinheit einheit) {
            this.einheit = einheit;
            return this;
        }

        /**
        * Exklusives Ende des Zeitraumes, für den der Verbrauch angegeben wird.
        * Ein ZeitPUNKT kann mit start==ende angegeben werden.
        */
        public VerbrauchBuilder setEnddatum(OffsetDateTime enddatum) {
            this.enddatum = enddatum;
            return this;
        }

        /**
        * Messwertstatus includes the plausibility of the value
        */
        public VerbrauchBuilder setMesswertstatus(Messwertstatus messwertstatus) {
            this.messwertstatus = messwertstatus;
            return this;
        }

        /**
        * Die OBIS-Kennzahl für den Wert, die festlegt, welche Größe mit dem Stand gemeldet wird,
        * z.B. '1-0:
        */
        public VerbrauchBuilder setObisKennzahl(String obisKennzahl) {
            this.obisKennzahl = obisKennzahl;
            return this;
        }

        /**
        * Inklusiver Beginn des Zeitraumes, für den der Verbrauch angegeben wird
        */
        public VerbrauchBuilder setStartdatum(OffsetDateTime startdatum) {
            this.startdatum = startdatum;
            return this;
        }

        /**
        * Gibt den absoluten Wert der Menge an
        */
        public VerbrauchBuilder setWert(Double wert) {
            this.wert = wert;
            return this;
        }

        public VerbrauchBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public VerbrauchBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Verbrauch build() {
            return new Verbrauch(this);
        }
    }
}