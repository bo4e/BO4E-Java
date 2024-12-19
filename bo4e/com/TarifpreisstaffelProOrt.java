package bo4e.com;

import bo4e.ZusatzAttribut;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Gibt die Staffelgrenzen der jeweiligen Preise an
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/TarifpreisstaffelProOrt.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `TarifpreisstaffelProOrt JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/com/TarifpreisstaffelProOrt.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TarifpreisstaffelProOrt extends COM {
    private Double arbeitspreis;
    private Double arbeitspreisNT;
    private Double grundpreis;
    private Double staffelgrenzeBis;
    private Double staffelgrenzeVon;

    public TarifpreisstaffelProOrt() {
    }

    private TarifpreisstaffelProOrt(TarifpreisstaffelProOrtBuilder builder) {
        super(builder);
        this.arbeitspreis = builder.arbeitspreis;
        this.arbeitspreisNT = builder.arbeitspreisNT;
        this.grundpreis = builder.grundpreis;
        this.staffelgrenzeBis = builder.staffelgrenzeBis;
        this.staffelgrenzeVon = builder.staffelgrenzeVon;
    }

    /**
    * Der Arbeitspreis in ct/kWh
    */
    public Double getArbeitspreis() {
        return arbeitspreis;
    }

    /**
    * Der Arbeitspreis in ct/kWh
    */
    public void setArbeitspreis(Double arbeitspreis) {
        this.arbeitspreis = arbeitspreis;
    }

    /**
    * Der Arbeitspreis für Verbräuche in der Niedertarifzeit in ct/kWh
    */
    public Double getArbeitspreisNT() {
        return arbeitspreisNT;
    }

    /**
    * Der Arbeitspreis für Verbräuche in der Niedertarifzeit in ct/kWh
    */
    public void setArbeitspreisNT(Double arbeitspreisNT) {
        this.arbeitspreisNT = arbeitspreisNT;
    }

    /**
    * Der Grundpreis in Euro/Jahr
    */
    public Double getGrundpreis() {
        return grundpreis;
    }

    /**
    * Der Grundpreis in Euro/Jahr
    */
    public void setGrundpreis(Double grundpreis) {
        this.grundpreis = grundpreis;
    }

    /**
    * Oberer Wert, bis zu dem die Staffel gilt (exklusive)
    */
    public Double getStaffelgrenzeBis() {
        return staffelgrenzeBis;
    }

    /**
    * Oberer Wert, bis zu dem die Staffel gilt (exklusive)
    */
    public void setStaffelgrenzeBis(Double staffelgrenzeBis) {
        this.staffelgrenzeBis = staffelgrenzeBis;
    }

    /**
    * Unterer Wert, ab dem die Staffel gilt (inklusive)
    */
    public Double getStaffelgrenzeVon() {
        return staffelgrenzeVon;
    }

    /**
    * Unterer Wert, ab dem die Staffel gilt (inklusive)
    */
    public void setStaffelgrenzeVon(Double staffelgrenzeVon) {
        this.staffelgrenzeVon = staffelgrenzeVon;
    }

    public static TarifpreisstaffelProOrtBuilder builder() {
        return new TarifpreisstaffelProOrtBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class TarifpreisstaffelProOrtBuilder extends COMBuilder {
        private Double arbeitspreis;
        private Double arbeitspreisNT;
        private Double grundpreis;
        private Double staffelgrenzeBis;
        private Double staffelgrenzeVon;

        private TarifpreisstaffelProOrtBuilder() {
        }

        /**
        * Der Arbeitspreis in ct/kWh
        */
        public TarifpreisstaffelProOrtBuilder setArbeitspreis(Double arbeitspreis) {
            this.arbeitspreis = arbeitspreis;
            return this;
        }

        /**
        * Der Arbeitspreis für Verbräuche in der Niedertarifzeit in ct/kWh
        */
        public TarifpreisstaffelProOrtBuilder setArbeitspreisNT(Double arbeitspreisNT) {
            this.arbeitspreisNT = arbeitspreisNT;
            return this;
        }

        /**
        * Der Grundpreis in Euro/Jahr
        */
        public TarifpreisstaffelProOrtBuilder setGrundpreis(Double grundpreis) {
            this.grundpreis = grundpreis;
            return this;
        }

        /**
        * Oberer Wert, bis zu dem die Staffel gilt (exklusive)
        */
        public TarifpreisstaffelProOrtBuilder setStaffelgrenzeBis(Double staffelgrenzeBis) {
            this.staffelgrenzeBis = staffelgrenzeBis;
            return this;
        }

        /**
        * Unterer Wert, ab dem die Staffel gilt (inklusive)
        */
        public TarifpreisstaffelProOrtBuilder setStaffelgrenzeVon(Double staffelgrenzeVon) {
            this.staffelgrenzeVon = staffelgrenzeVon;
            return this;
        }

        public TarifpreisstaffelProOrtBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public TarifpreisstaffelProOrtBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public TarifpreisstaffelProOrt build() {
            return new TarifpreisstaffelProOrt(this);
        }
    }
}