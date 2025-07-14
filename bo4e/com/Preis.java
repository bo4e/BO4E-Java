package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import bo4e.enums.Mengeneinheit;
import bo4e.enums.Preisstatus;
import bo4e.enums.Waehrungseinheit;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Abbildung eines Preises mit Wert, Einheit, Bezugswert und Status.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Preis.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Preis JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.1.0-rc1/src/bo4e_schemas/com/Preis.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Preis extends COM {
    private final ComTyp _typ = ComTyp.PREIS;
    private Mengeneinheit bezugswert;
    private Waehrungseinheit einheit;
    private Preisstatus status;
    private Double wert;

    public Preis() {
    }

    private Preis(PreisBuilder builder) {
        super(builder);
        this.bezugswert = builder.bezugswert;
        this.einheit = builder.einheit;
        this.status = builder.status;
        this.wert = builder.wert;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Angabe, für welche Bezugsgröße der Preis gilt. Z.B. kWh.
    */
    public Mengeneinheit getBezugswert() {
        return bezugswert;
    }

    /**
    * Angabe, für welche Bezugsgröße der Preis gilt. Z.B. kWh.
    */
    public void setBezugswert(Mengeneinheit bezugswert) {
        this.bezugswert = bezugswert;
    }

    /**
    * Währungseinheit für den Preis, z.B. Euro oder Ct.
    */
    public Waehrungseinheit getEinheit() {
        return einheit;
    }

    /**
    * Währungseinheit für den Preis, z.B. Euro oder Ct.
    */
    public void setEinheit(Waehrungseinheit einheit) {
        this.einheit = einheit;
    }

    /**
    * Gibt den Status des veröffentlichten Preises an
    */
    public Preisstatus getStatus() {
        return status;
    }

    /**
    * Gibt den Status des veröffentlichten Preises an
    */
    public void setStatus(Preisstatus status) {
        this.status = status;
    }

    /**
    * Gibt die nominale Höhe des Preises an.
    */
    public Double getWert() {
        return wert;
    }

    /**
    * Gibt die nominale Höhe des Preises an.
    */
    public void setWert(Double wert) {
        this.wert = wert;
    }

    public static PreisBuilder builder() {
        return new PreisBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class PreisBuilder extends COMBuilder {
        private Mengeneinheit bezugswert;
        private Waehrungseinheit einheit;
        private Preisstatus status;
        private Double wert;

        private PreisBuilder() {
        }

        /**
        * Angabe, für welche Bezugsgröße der Preis gilt. Z.B. kWh.
        */
        public PreisBuilder setBezugswert(Mengeneinheit bezugswert) {
            this.bezugswert = bezugswert;
            return this;
        }

        /**
        * Währungseinheit für den Preis, z.B. Euro oder Ct.
        */
        public PreisBuilder setEinheit(Waehrungseinheit einheit) {
            this.einheit = einheit;
            return this;
        }

        /**
        * Gibt den Status des veröffentlichten Preises an
        */
        public PreisBuilder setStatus(Preisstatus status) {
            this.status = status;
            return this;
        }

        /**
        * Gibt die nominale Höhe des Preises an.
        */
        public PreisBuilder setWert(Double wert) {
            this.wert = wert;
            return this;
        }

        public PreisBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public PreisBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Preis build() {
            return new Preis(this);
        }
    }
}