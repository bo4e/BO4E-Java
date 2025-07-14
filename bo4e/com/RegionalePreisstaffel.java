package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Mit dieser Komponente können Staffelpreise abgebildet werden, die sich auf eine Region
* beziehen.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/RegionalePreisstaffel.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `RegionalePreisstaffel JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.1.0-rc1/src/bo4e_schemas/com/RegionalePreisstaffel.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegionalePreisstaffel extends COM {
    private final ComTyp _typ = ComTyp.REGIONALEPREISSTAFFEL;
    private String artikelId;
    private Double einheitspreis;
    private RegionaleGueltigkeit regionaleGueltigkeit;
    private Sigmoidparameter sigmoidparameter;
    private Double staffelgrenzeBis;
    private Double staffelgrenzeVon;

    public RegionalePreisstaffel() {
    }

    private RegionalePreisstaffel(RegionalePreisstaffelBuilder builder) {
        super(builder);
        this.artikelId = builder.artikelId;
        this.einheitspreis = builder.einheitspreis;
        this.regionaleGueltigkeit = builder.regionaleGueltigkeit;
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
    * Regionale Eingrenzung der Preisstaffel
    */
    public RegionaleGueltigkeit getRegionaleGueltigkeit() {
        return regionaleGueltigkeit;
    }

    /**
    * Regionale Eingrenzung der Preisstaffel
    */
    public void setRegionaleGueltigkeit(RegionaleGueltigkeit regionaleGueltigkeit) {
        this.regionaleGueltigkeit = regionaleGueltigkeit;
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

    public static RegionalePreisstaffelBuilder builder() {
        return new RegionalePreisstaffelBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class RegionalePreisstaffelBuilder extends COMBuilder {
        private String artikelId;
        private Double einheitspreis;
        private RegionaleGueltigkeit regionaleGueltigkeit;
        private Sigmoidparameter sigmoidparameter;
        private Double staffelgrenzeBis;
        private Double staffelgrenzeVon;

        private RegionalePreisstaffelBuilder() {
        }

        /**
        * Standardisierte vom BDEW herausgegebene Liste, welche im Strommarkt die
        * BDEW-Artikelnummer ablöst
        */
        public RegionalePreisstaffelBuilder setArtikelId(String artikelId) {
            this.artikelId = artikelId;
            return this;
        }

        /**
        * Preis pro abgerechneter Mengeneinheit
        */
        public RegionalePreisstaffelBuilder setEinheitspreis(Double einheitspreis) {
            this.einheitspreis = einheitspreis;
            return this;
        }

        /**
        * Regionale Eingrenzung der Preisstaffel
        */
        public RegionalePreisstaffelBuilder setRegionaleGueltigkeit(RegionaleGueltigkeit regionaleGueltigkeit) {
            this.regionaleGueltigkeit = regionaleGueltigkeit;
            return this;
        }

        /**
        * Parameter zur Berechnung des Preises anhand der Jahresmenge und weiterer netzbezogener
        * Parameter
        */
        public RegionalePreisstaffelBuilder setSigmoidparameter(Sigmoidparameter sigmoidparameter) {
            this.sigmoidparameter = sigmoidparameter;
            return this;
        }

        /**
        * Exklusiver oberer Wert, bis zu dem die Staffel gilt
        */
        public RegionalePreisstaffelBuilder setStaffelgrenzeBis(Double staffelgrenzeBis) {
            this.staffelgrenzeBis = staffelgrenzeBis;
            return this;
        }

        /**
        * Inklusiver unterer Wert, ab dem die Staffel gilt
        */
        public RegionalePreisstaffelBuilder setStaffelgrenzeVon(Double staffelgrenzeVon) {
            this.staffelgrenzeVon = staffelgrenzeVon;
            return this;
        }

        public RegionalePreisstaffelBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public RegionalePreisstaffelBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public RegionalePreisstaffel build() {
            return new RegionalePreisstaffel(this);
        }
    }
}