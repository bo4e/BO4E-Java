package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import bo4e.enums.Mengeneinheit;
import bo4e.enums.Preisstatus;
import bo4e.enums.Preistyp;
import bo4e.enums.Waehrungseinheit;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Abbildung eines Tarifpreises mit Preistyp und Beschreibung abgeleitet von COM Preis.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Tarifpreis.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Tarifpreis JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.0.0/src/bo4e_schemas/com/Tarifpreis.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Tarifpreis extends COM {
    private final ComTyp _typ = ComTyp.TARIFPREIS;
    private String beschreibung;
    private Mengeneinheit bezugswert;
    private Waehrungseinheit einheit;
    private Preistyp preistyp;
    private Preisstatus status;
    private Double wert;

    public Tarifpreis() {
    }

    private Tarifpreis(TarifpreisBuilder builder) {
        super(builder);
        this.beschreibung = builder.beschreibung;
        this.bezugswert = builder.bezugswert;
        this.einheit = builder.einheit;
        this.preistyp = builder.preistyp;
        this.status = builder.status;
        this.wert = builder.wert;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Beschreibung des Preises. Hier können z.B. Preisdetails angegeben sein, beispielsweise
    * "Drehstromzähler".
    */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
    * Beschreibung des Preises. Hier können z.B. Preisdetails angegeben sein, beispielsweise
    * "Drehstromzähler".
    */
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
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
    * Angabe des Preistypes (z.B. Grundpreis)
    */
    public Preistyp getPreistyp() {
        return preistyp;
    }

    /**
    * Angabe des Preistypes (z.B. Grundpreis)
    */
    public void setPreistyp(Preistyp preistyp) {
        this.preistyp = preistyp;
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

    public static TarifpreisBuilder builder() {
        return new TarifpreisBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class TarifpreisBuilder extends COMBuilder {
        private String beschreibung;
        private Mengeneinheit bezugswert;
        private Waehrungseinheit einheit;
        private Preistyp preistyp;
        private Preisstatus status;
        private Double wert;

        private TarifpreisBuilder() {
        }

        /**
        * Beschreibung des Preises. Hier können z.B. Preisdetails angegeben sein, beispielsweise
        * "Drehstromzähler".
        */
        public TarifpreisBuilder setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
            return this;
        }

        /**
        * Angabe, für welche Bezugsgröße der Preis gilt. Z.B. kWh.
        */
        public TarifpreisBuilder setBezugswert(Mengeneinheit bezugswert) {
            this.bezugswert = bezugswert;
            return this;
        }

        /**
        * Währungseinheit für den Preis, z.B. Euro oder Ct.
        */
        public TarifpreisBuilder setEinheit(Waehrungseinheit einheit) {
            this.einheit = einheit;
            return this;
        }

        /**
        * Angabe des Preistypes (z.B. Grundpreis)
        */
        public TarifpreisBuilder setPreistyp(Preistyp preistyp) {
            this.preistyp = preistyp;
            return this;
        }

        /**
        * Gibt den Status des veröffentlichten Preises an
        */
        public TarifpreisBuilder setStatus(Preisstatus status) {
            this.status = status;
            return this;
        }

        /**
        * Gibt die nominale Höhe des Preises an.
        */
        public TarifpreisBuilder setWert(Double wert) {
            this.wert = wert;
            return this;
        }

        public TarifpreisBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public TarifpreisBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Tarifpreis build() {
            return new Tarifpreis(this);
        }
    }
}