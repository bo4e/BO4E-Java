package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Gibt die Staffelgrenzen der jeweiligen Preise an
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Preisstaffel.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Preisstaffel JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.7.0/src/bo4e_schemas/com/Preisstaffel.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Preisstaffel extends COM {
    private final ComTyp _typ = ComTyp.PREISSTAFFEL;
    private String artikelId;
    private Double einheitspreis;
    private Sigmoidparameter sigmoidparameter;
    private Double staffelgrenzeBis;
    private Double staffelgrenzeVon;

    public Preisstaffel() {
    }

    private Preisstaffel(PreisstaffelBuilder builder) {
        super(builder);
        this.artikelId = builder.artikelId;
        this.einheitspreis = builder.einheitspreis;
        this.sigmoidparameter = builder.sigmoidparameter;
        this.staffelgrenzeBis = builder.staffelgrenzeBis;
        this.staffelgrenzeVon = builder.staffelgrenzeVon;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Standardisierte vom BDEW herausgegebene Liste, welche im Strommarkt die
    * BDEW-Artikelnummer ablöst
    */
    public String getArtikelId() {
        return artikelId;
    }

    /**
    * Standardisierte vom BDEW herausgegebene Liste, welche im Strommarkt die
    * BDEW-Artikelnummer ablöst
    */
    public void setArtikelId(String artikelId) {
        this.artikelId = artikelId;
    }

    /**
    * Preis pro abgerechneter Mengeneinheit
    */
    public Double getEinheitspreis() {
        return einheitspreis;
    }

    /**
    * Preis pro abgerechneter Mengeneinheit
    */
    public void setEinheitspreis(Double einheitspreis) {
        this.einheitspreis = einheitspreis;
    }

    /**
    * Parameter zur Berechnung des Preises anhand der Jahresmenge und weiterer netzbezogener
    * Parameter
    */
    public Sigmoidparameter getSigmoidparameter() {
        return sigmoidparameter;
    }

    /**
    * Parameter zur Berechnung des Preises anhand der Jahresmenge und weiterer netzbezogener
    * Parameter
    */
    public void setSigmoidparameter(Sigmoidparameter sigmoidparameter) {
        this.sigmoidparameter = sigmoidparameter;
    }

    /**
    * Exklusiver oberer Wert, bis zu dem die Staffel gilt
    */
    public Double getStaffelgrenzeBis() {
        return staffelgrenzeBis;
    }

    /**
    * Exklusiver oberer Wert, bis zu dem die Staffel gilt
    */
    public void setStaffelgrenzeBis(Double staffelgrenzeBis) {
        this.staffelgrenzeBis = staffelgrenzeBis;
    }

    /**
    * Inklusiver unterer Wert, ab dem die Staffel gilt
    */
    public Double getStaffelgrenzeVon() {
        return staffelgrenzeVon;
    }

    /**
    * Inklusiver unterer Wert, ab dem die Staffel gilt
    */
    public void setStaffelgrenzeVon(Double staffelgrenzeVon) {
        this.staffelgrenzeVon = staffelgrenzeVon;
    }

    public static PreisstaffelBuilder builder() {
        return new PreisstaffelBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class PreisstaffelBuilder extends COMBuilder {
        private String artikelId;
        private Double einheitspreis;
        private Sigmoidparameter sigmoidparameter;
        private Double staffelgrenzeBis;
        private Double staffelgrenzeVon;

        private PreisstaffelBuilder() {
        }

        /**
        * Standardisierte vom BDEW herausgegebene Liste, welche im Strommarkt die
        * BDEW-Artikelnummer ablöst
        */
        public PreisstaffelBuilder setArtikelId(String artikelId) {
            this.artikelId = artikelId;
            return this;
        }

        /**
        * Preis pro abgerechneter Mengeneinheit
        */
        public PreisstaffelBuilder setEinheitspreis(Double einheitspreis) {
            this.einheitspreis = einheitspreis;
            return this;
        }

        /**
        * Parameter zur Berechnung des Preises anhand der Jahresmenge und weiterer netzbezogener
        * Parameter
        */
        public PreisstaffelBuilder setSigmoidparameter(Sigmoidparameter sigmoidparameter) {
            this.sigmoidparameter = sigmoidparameter;
            return this;
        }

        /**
        * Exklusiver oberer Wert, bis zu dem die Staffel gilt
        */
        public PreisstaffelBuilder setStaffelgrenzeBis(Double staffelgrenzeBis) {
            this.staffelgrenzeBis = staffelgrenzeBis;
            return this;
        }

        /**
        * Inklusiver unterer Wert, ab dem die Staffel gilt
        */
        public PreisstaffelBuilder setStaffelgrenzeVon(Double staffelgrenzeVon) {
            this.staffelgrenzeVon = staffelgrenzeVon;
            return this;
        }

        public PreisstaffelBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public PreisstaffelBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Preisstaffel build() {
            return new Preisstaffel(this);
        }
    }
}