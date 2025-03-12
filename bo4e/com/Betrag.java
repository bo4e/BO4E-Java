package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.Waehrungscode;

import java.util.List;

/**
* Die Komponente wird dazu verwendet, Summenbeträge (beispielsweise in Angeboten und
* Rechnungen) als Geldbeträge
* abzubilden. Die Einheit ist dabei immer die Hauptwährung also Euro, Dollar etc…
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Betrag.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Betrag JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.5.0/src/bo4e_schemas/com/Betrag.json>`_
*/
public class Betrag extends COM {
    private Waehrungscode waehrung;
    private Double wert;

    public Betrag() {
    }

    private Betrag(BetragBuilder builder) {
        super(builder);
        this.waehrung = builder.waehrung;
        this.wert = builder.wert;
    }

    /**
    * Die entsprechende Waehrung
    */
    public Waehrungscode getWaehrung() {
        return waehrung;
    }

    /**
    * Die entsprechende Waehrung
    */
    public void setWaehrung(Waehrungscode waehrung) {
        this.waehrung = waehrung;
    }

    /**
    * Gibt den Betrag des Preises an.
    */
    public Double getWert() {
        return wert;
    }

    /**
    * Gibt den Betrag des Preises an.
    */
    public void setWert(Double wert) {
        this.wert = wert;
    }

    public static BetragBuilder builder() {
        return new BetragBuilder();
    }

    public static class BetragBuilder extends COMBuilder {
        private Waehrungscode waehrung;
        private Double wert;

        private BetragBuilder() {
        }

        /**
        * Die entsprechende Waehrung
        */
        public BetragBuilder setWaehrung(Waehrungscode waehrung) {
            this.waehrung = waehrung;
            return this;
        }

        /**
        * Gibt den Betrag des Preises an.
        */
        public BetragBuilder setWert(Double wert) {
            this.wert = wert;
            return this;
        }

        public BetragBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public BetragBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Betrag build() {
            return new Betrag(this);
        }
    }
}