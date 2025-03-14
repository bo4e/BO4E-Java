package bo4e.com;

import bo4e.ZusatzAttribut;

import java.util.List;

/**
* Unterhalb von Angebotsteilen sind die Angebotspositionen eingebunden.
* Hier werden die angebotenen Bestandteile einzeln aufgeführt. Beispiel:
* Positionsmenge: 4000 kWh
* Positionspreis: 24,56 ct/kWh
* Positionskosten: 982,40 EUR
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Angebotsposition.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Angebotsposition JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.6.0/src/bo4e_schemas/com/Angebotsposition.json>`_
*/
public class Angebotsposition extends COM {
    private String positionsbezeichnung;
    private Betrag positionskosten;
    private Menge positionsmenge;
    private Preis positionspreis;

    public Angebotsposition() {
    }

    private Angebotsposition(AngebotspositionBuilder builder) {
        super(builder);
        this.positionsbezeichnung = builder.positionsbezeichnung;
        this.positionskosten = builder.positionskosten;
        this.positionsmenge = builder.positionsmenge;
        this.positionspreis = builder.positionspreis;
    }

    /**
    * Bezeichnung der jeweiligen Position des Angebotsteils
    */
    public String getPositionsbezeichnung() {
        return positionsbezeichnung;
    }

    /**
    * Bezeichnung der jeweiligen Position des Angebotsteils
    */
    public void setPositionsbezeichnung(String positionsbezeichnung) {
        this.positionsbezeichnung = positionsbezeichnung;
    }

    /**
    * Kosten (positionspreis * positionsmenge) für diese Angebotsposition
    */
    public Betrag getPositionskosten() {
        return positionskosten;
    }

    /**
    * Kosten (positionspreis * positionsmenge) für diese Angebotsposition
    */
    public void setPositionskosten(Betrag positionskosten) {
        this.positionskosten = positionskosten;
    }

    /**
    * Menge des angebotenen Artikels (z.B. Wirkarbeit in kWh), in dieser Angebotsposition
    */
    public Menge getPositionsmenge() {
        return positionsmenge;
    }

    /**
    * Menge des angebotenen Artikels (z.B. Wirkarbeit in kWh), in dieser Angebotsposition
    */
    public void setPositionsmenge(Menge positionsmenge) {
        this.positionsmenge = positionsmenge;
    }

    /**
    * Preis pro Einheit/Stückpreis des angebotenen Artikels.
    */
    public Preis getPositionspreis() {
        return positionspreis;
    }

    /**
    * Preis pro Einheit/Stückpreis des angebotenen Artikels.
    */
    public void setPositionspreis(Preis positionspreis) {
        this.positionspreis = positionspreis;
    }

    public static AngebotspositionBuilder builder() {
        return new AngebotspositionBuilder();
    }

    public static class AngebotspositionBuilder extends COMBuilder {
        private String positionsbezeichnung;
        private Betrag positionskosten;
        private Menge positionsmenge;
        private Preis positionspreis;

        private AngebotspositionBuilder() {
        }

        /**
        * Bezeichnung der jeweiligen Position des Angebotsteils
        */
        public AngebotspositionBuilder setPositionsbezeichnung(String positionsbezeichnung) {
            this.positionsbezeichnung = positionsbezeichnung;
            return this;
        }

        /**
        * Kosten (positionspreis * positionsmenge) für diese Angebotsposition
        */
        public AngebotspositionBuilder setPositionskosten(Betrag positionskosten) {
            this.positionskosten = positionskosten;
            return this;
        }

        /**
        * Menge des angebotenen Artikels (z.B. Wirkarbeit in kWh), in dieser Angebotsposition
        */
        public AngebotspositionBuilder setPositionsmenge(Menge positionsmenge) {
            this.positionsmenge = positionsmenge;
            return this;
        }

        /**
        * Preis pro Einheit/Stückpreis des angebotenen Artikels.
        */
        public AngebotspositionBuilder setPositionspreis(Preis positionspreis) {
            this.positionspreis = positionspreis;
            return this;
        }

        public AngebotspositionBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public AngebotspositionBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Angebotsposition build() {
            return new Angebotsposition(this);
        }
    }
}