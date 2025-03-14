package bo4e.com;

import bo4e.ZusatzAttribut;

import java.util.List;

/**
* Mit dieser Komponente werden mehrere Kostenpositionen zusammengefasst.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Kostenblock.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Kostenblock JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.6.0/src/bo4e_schemas/com/Kostenblock.json>`_
*/
public class Kostenblock extends COM {
    private String kostenblockbezeichnung;
    private List<Kostenposition> kostenpositionen;
    private Betrag summeKostenblock;

    public Kostenblock() {
    }

    private Kostenblock(KostenblockBuilder builder) {
        super(builder);
        this.kostenblockbezeichnung = builder.kostenblockbezeichnung;
        this.kostenpositionen = builder.kostenpositionen;
        this.summeKostenblock = builder.summeKostenblock;
    }

    /**
    * Bezeichnung für einen Kostenblock. Z.B. Netzkosten, Messkosten, Umlagen, etc.
    */
    public String getKostenblockbezeichnung() {
        return kostenblockbezeichnung;
    }

    /**
    * Bezeichnung für einen Kostenblock. Z.B. Netzkosten, Messkosten, Umlagen, etc.
    */
    public void setKostenblockbezeichnung(String kostenblockbezeichnung) {
        this.kostenblockbezeichnung = kostenblockbezeichnung;
    }

    /**
    * Hier sind die Details zu einer Kostenposition aufgeführt. Z.B.:
    * Alliander Netz Heinsberg GmbH, 01.02.2018, 31.12.2018, Arbeitspreis HT, 3.660 kWh, 5,8200
    * ct/kWh, 213,01 €
    */
    public List<Kostenposition> getKostenpositionen() {
        return kostenpositionen;
    }

    /**
    * Hier sind die Details zu einer Kostenposition aufgeführt. Z.B.:
    * Alliander Netz Heinsberg GmbH, 01.02.2018, 31.12.2018, Arbeitspreis HT, 3.660 kWh, 5,8200
    * ct/kWh, 213,01 €
    */
    public void setKostenpositionen(List<Kostenposition> kostenpositionen) {
        this.kostenpositionen = kostenpositionen;
    }

    /**
    * Die Summe aller Kostenpositionen dieses Blocks
    */
    public Betrag getSummeKostenblock() {
        return summeKostenblock;
    }

    /**
    * Die Summe aller Kostenpositionen dieses Blocks
    */
    public void setSummeKostenblock(Betrag summeKostenblock) {
        this.summeKostenblock = summeKostenblock;
    }

    public static KostenblockBuilder builder() {
        return new KostenblockBuilder();
    }

    public static class KostenblockBuilder extends COMBuilder {
        private String kostenblockbezeichnung;
        private List<Kostenposition> kostenpositionen;
        private Betrag summeKostenblock;

        private KostenblockBuilder() {
        }

        /**
        * Bezeichnung für einen Kostenblock. Z.B. Netzkosten, Messkosten, Umlagen, etc.
        */
        public KostenblockBuilder setKostenblockbezeichnung(String kostenblockbezeichnung) {
            this.kostenblockbezeichnung = kostenblockbezeichnung;
            return this;
        }

        /**
        * Hier sind die Details zu einer Kostenposition aufgeführt. Z.B.:
        * Alliander Netz Heinsberg GmbH, 01.02.2018, 31.12.2018, Arbeitspreis HT, 3.660 kWh, 5,8200
        * ct/kWh, 213,01 €
        */
        public KostenblockBuilder setKostenpositionen(List<Kostenposition> kostenpositionen) {
            this.kostenpositionen = kostenpositionen;
            return this;
        }

        /**
        * Die Summe aller Kostenpositionen dieses Blocks
        */
        public KostenblockBuilder setSummeKostenblock(Betrag summeKostenblock) {
            this.summeKostenblock = summeKostenblock;
            return this;
        }

        public KostenblockBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public KostenblockBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Kostenblock build() {
            return new Kostenblock(this);
        }
    }
}