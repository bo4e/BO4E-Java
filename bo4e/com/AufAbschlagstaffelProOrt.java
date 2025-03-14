package bo4e.com;

import bo4e.ZusatzAttribut;

import java.util.List;

/**
* Gibt den Wert eines Auf- oder Abschlags und dessen Staffelgrenzen an
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/AufAbschlagstaffelProOrt.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `AufAbschlagstaffelProOrt JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.6.0/src/bo4e_schemas/com/AufAbschlagstaffelProOrt.json>`_
*/
public class AufAbschlagstaffelProOrt extends COM {
    private Double staffelgrenzeBis;
    private Double staffelgrenzeVon;
    private Double wert;

    public AufAbschlagstaffelProOrt() {
    }

    private AufAbschlagstaffelProOrt(AufAbschlagstaffelProOrtBuilder builder) {
        super(builder);
        this.staffelgrenzeBis = builder.staffelgrenzeBis;
        this.staffelgrenzeVon = builder.staffelgrenzeVon;
        this.wert = builder.wert;
    }

    /**
    * Oberer Wert, bis zu dem die Staffel gilt.
    */
    public Double getStaffelgrenzeBis() {
        return staffelgrenzeBis;
    }

    /**
    * Oberer Wert, bis zu dem die Staffel gilt.
    */
    public void setStaffelgrenzeBis(Double staffelgrenzeBis) {
        this.staffelgrenzeBis = staffelgrenzeBis;
    }

    /**
    * Unterer Wert, ab dem die Staffel gilt.
    */
    public Double getStaffelgrenzeVon() {
        return staffelgrenzeVon;
    }

    /**
    * Unterer Wert, ab dem die Staffel gilt.
    */
    public void setStaffelgrenzeVon(Double staffelgrenzeVon) {
        this.staffelgrenzeVon = staffelgrenzeVon;
    }

    /**
    * Der Wert für den Auf- oder Abschlag.
    */
    public Double getWert() {
        return wert;
    }

    /**
    * Der Wert für den Auf- oder Abschlag.
    */
    public void setWert(Double wert) {
        this.wert = wert;
    }

    public static AufAbschlagstaffelProOrtBuilder builder() {
        return new AufAbschlagstaffelProOrtBuilder();
    }

    public static class AufAbschlagstaffelProOrtBuilder extends COMBuilder {
        private Double staffelgrenzeBis;
        private Double staffelgrenzeVon;
        private Double wert;

        private AufAbschlagstaffelProOrtBuilder() {
        }

        /**
        * Oberer Wert, bis zu dem die Staffel gilt.
        */
        public AufAbschlagstaffelProOrtBuilder setStaffelgrenzeBis(Double staffelgrenzeBis) {
            this.staffelgrenzeBis = staffelgrenzeBis;
            return this;
        }

        /**
        * Unterer Wert, ab dem die Staffel gilt.
        */
        public AufAbschlagstaffelProOrtBuilder setStaffelgrenzeVon(Double staffelgrenzeVon) {
            this.staffelgrenzeVon = staffelgrenzeVon;
            return this;
        }

        /**
        * Der Wert für den Auf- oder Abschlag.
        */
        public AufAbschlagstaffelProOrtBuilder setWert(Double wert) {
            this.wert = wert;
            return this;
        }

        public AufAbschlagstaffelProOrtBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public AufAbschlagstaffelProOrtBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public AufAbschlagstaffelProOrt build() {
            return new AufAbschlagstaffelProOrt(this);
        }
    }
}