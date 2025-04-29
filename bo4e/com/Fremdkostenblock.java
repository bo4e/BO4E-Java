package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;

import java.util.List;

/**
* Komponente zur Abbildung eines Kostenblocks in den Fremdkosten
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Fremdkostenblock.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Fremdkostenblock JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.0.0/src/bo4e_schemas/com/Fremdkostenblock.json>`_
*/
public class Fremdkostenblock extends COM {
    private final ComTyp _typ = ComTyp.FREMDKOSTENBLOCK;
    private String kostenblockbezeichnung;
    private List<Fremdkostenposition> kostenpositionen;
    private Betrag summeKostenblock;

    public Fremdkostenblock() {
    }

    private Fremdkostenblock(FremdkostenblockBuilder builder) {
        super(builder);
        this.kostenblockbezeichnung = builder.kostenblockbezeichnung;
        this.kostenpositionen = builder.kostenpositionen;
        this.summeKostenblock = builder.summeKostenblock;
    }

    public ComTyp get_typ() {
        return _typ;
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
    * Alliander Netz Heinsberg GmbH, 2018-02-01, 2019-01-01, Arbeitspreis HT, 3.660 kWh,
    * 5,8200 ct/kWh, 213,01 €
    */
    public List<Fremdkostenposition> getKostenpositionen() {
        return kostenpositionen;
    }

    /**
    * Hier sind die Details zu einer Kostenposition aufgeführt. Z.B.:
    * Alliander Netz Heinsberg GmbH, 2018-02-01, 2019-01-01, Arbeitspreis HT, 3.660 kWh,
    * 5,8200 ct/kWh, 213,01 €
    */
    public void setKostenpositionen(List<Fremdkostenposition> kostenpositionen) {
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

    public static FremdkostenblockBuilder builder() {
        return new FremdkostenblockBuilder();
    }

    public static class FremdkostenblockBuilder extends COMBuilder {
        private String kostenblockbezeichnung;
        private List<Fremdkostenposition> kostenpositionen;
        private Betrag summeKostenblock;

        private FremdkostenblockBuilder() {
        }

        /**
        * Bezeichnung für einen Kostenblock. Z.B. Netzkosten, Messkosten, Umlagen, etc.
        */
        public FremdkostenblockBuilder setKostenblockbezeichnung(String kostenblockbezeichnung) {
            this.kostenblockbezeichnung = kostenblockbezeichnung;
            return this;
        }

        /**
        * Hier sind die Details zu einer Kostenposition aufgeführt. Z.B.:
        * Alliander Netz Heinsberg GmbH, 2018-02-01, 2019-01-01, Arbeitspreis HT, 3.660 kWh,
        * 5,8200 ct/kWh, 213,01 €
        */
        public FremdkostenblockBuilder setKostenpositionen(List<Fremdkostenposition> kostenpositionen) {
            this.kostenpositionen = kostenpositionen;
            return this;
        }

        /**
        * Die Summe aller Kostenpositionen dieses Blocks
        */
        public FremdkostenblockBuilder setSummeKostenblock(Betrag summeKostenblock) {
            this.summeKostenblock = summeKostenblock;
            return this;
        }

        public FremdkostenblockBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public FremdkostenblockBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Fremdkostenblock build() {
            return new Fremdkostenblock(this);
        }
    }
}