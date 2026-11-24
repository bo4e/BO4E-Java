package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import bo4e.enums.Steuerart;
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
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202607.1.0-rc2/src/bo4e_schemas/com/Steuerbetrag.json>`_
*/
public class Steuerbetrag extends COM {
    private final ComTyp _typ = ComTyp.STEUERBETRAG;
    private Double basiswert;
    private Steuerart steuerart;
    private Double steuersatz;
    private Double steuerwert;
    private Waehrungscode waehrungscode;

    public Steuerbetrag() {
    }

    private Steuerbetrag(SteuerbetragBuilder builder) {
        super(builder);
        this.basiswert = builder.basiswert;
        this.steuerart = builder.steuerart;
        this.steuersatz = builder.steuersatz;
        this.steuerwert = builder.steuerwert;
        this.waehrungscode = builder.waehrungscode;
    }

    public ComTyp get_typ() {
        return _typ;
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
    * Kennzeichnung der Steuerart, bzw. Verfahrens.
    */
    public Steuerart getSteuerart() {
        return steuerart;
    }

    /**
    * Kennzeichnung der Steuerart, bzw. Verfahrens.
    */
    public void setSteuerart(Steuerart steuerart) {
        this.steuerart = steuerart;
    }

    /**
    * Angabe des Steuersatzes in %
    */
    public Double getSteuersatz() {
        return steuersatz;
    }

    /**
    * Angabe des Steuersatzes in %
    */
    public void setSteuersatz(Double steuersatz) {
        this.steuersatz = steuersatz;
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
    public Waehrungscode getWaehrungscode() {
        return waehrungscode;
    }

    /**
    * Währung. Z.B. Euro.
    */
    public void setWaehrungscode(Waehrungscode waehrungscode) {
        this.waehrungscode = waehrungscode;
    }

    public static SteuerbetragBuilder builder() {
        return new SteuerbetragBuilder();
    }

    public static class SteuerbetragBuilder extends COMBuilder {
        private Double basiswert;
        private Steuerart steuerart;
        private Double steuersatz;
        private Double steuerwert;
        private Waehrungscode waehrungscode;

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
        * Kennzeichnung der Steuerart, bzw. Verfahrens.
        */
        public SteuerbetragBuilder setSteuerart(Steuerart steuerart) {
            this.steuerart = steuerart;
            return this;
        }

        /**
        * Angabe des Steuersatzes in %
        */
        public SteuerbetragBuilder setSteuersatz(Double steuersatz) {
            this.steuersatz = steuersatz;
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
        public SteuerbetragBuilder setWaehrungscode(Waehrungscode waehrungscode) {
            this.waehrungscode = waehrungscode;
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