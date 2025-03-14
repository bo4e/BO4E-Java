package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.Steuerkennzeichen;
import bo4e.enums.Waehrungscode;

import java.util.List;

/**
* Abbildung eines Steuerbetrages.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Steuerbetrag.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Steuerbetrag JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.6.0/src/bo4e_schemas/com/Steuerbetrag.json>`_
*/
public class Steuerbetrag extends COM {
    private Double basiswert;
    private Steuerkennzeichen steuerkennzeichen;
    private Double steuerwert;
    private Waehrungscode waehrung;

    public Steuerbetrag() {
    }

    private Steuerbetrag(SteuerbetragBuilder builder) {
        super(builder);
        this.basiswert = builder.basiswert;
        this.steuerkennzeichen = builder.steuerkennzeichen;
        this.steuerwert = builder.steuerwert;
        this.waehrung = builder.waehrung;
    }

    /**
    * Nettobetrag für den die Steuer berechnet wurde. Z.B. 100
    */
    public Double getBasiswert() {
        return basiswert;
    }

    /**
    * Nettobetrag für den die Steuer berechnet wurde. Z.B. 100
    */
    public void setBasiswert(Double basiswert) {
        this.basiswert = basiswert;
    }

    /**
    * Kennzeichnung des Steuersatzes, bzw. Verfahrens.
    */
    public Steuerkennzeichen getSteuerkennzeichen() {
        return steuerkennzeichen;
    }

    /**
    * Kennzeichnung des Steuersatzes, bzw. Verfahrens.
    */
    public void setSteuerkennzeichen(Steuerkennzeichen steuerkennzeichen) {
        this.steuerkennzeichen = steuerkennzeichen;
    }

    /**
    * Aus dem Basiswert berechnete Steuer. Z.B. 19 (bei UST_19)
    */
    public Double getSteuerwert() {
        return steuerwert;
    }

    /**
    * Aus dem Basiswert berechnete Steuer. Z.B. 19 (bei UST_19)
    */
    public void setSteuerwert(Double steuerwert) {
        this.steuerwert = steuerwert;
    }

    /**
    * Währung. Z.B. Euro.
    */
    public Waehrungscode getWaehrung() {
        return waehrung;
    }

    /**
    * Währung. Z.B. Euro.
    */
    public void setWaehrung(Waehrungscode waehrung) {
        this.waehrung = waehrung;
    }

    public static SteuerbetragBuilder builder() {
        return new SteuerbetragBuilder();
    }

    public static class SteuerbetragBuilder extends COMBuilder {
        private Double basiswert;
        private Steuerkennzeichen steuerkennzeichen;
        private Double steuerwert;
        private Waehrungscode waehrung;

        private SteuerbetragBuilder() {
        }

        /**
        * Nettobetrag für den die Steuer berechnet wurde. Z.B. 100
        */
        public SteuerbetragBuilder setBasiswert(Double basiswert) {
            this.basiswert = basiswert;
            return this;
        }

        /**
        * Kennzeichnung des Steuersatzes, bzw. Verfahrens.
        */
        public SteuerbetragBuilder setSteuerkennzeichen(Steuerkennzeichen steuerkennzeichen) {
            this.steuerkennzeichen = steuerkennzeichen;
            return this;
        }

        /**
        * Aus dem Basiswert berechnete Steuer. Z.B. 19 (bei UST_19)
        */
        public SteuerbetragBuilder setSteuerwert(Double steuerwert) {
            this.steuerwert = steuerwert;
            return this;
        }

        /**
        * Währung. Z.B. Euro.
        */
        public SteuerbetragBuilder setWaehrung(Waehrungscode waehrung) {
            this.waehrung = waehrung;
            return this;
        }

        public SteuerbetragBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public SteuerbetragBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Steuerbetrag build() {
            return new Steuerbetrag(this);
        }
    }
}