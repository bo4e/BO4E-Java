package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import bo4e.enums.Dienstleistungstyp;

import java.util.List;

/**
* Abbildung einer abrechenbaren Dienstleistung.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Dienstleistung.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Dienstleistung JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.1.0-rc1/src/bo4e_schemas/com/Dienstleistung.json>`_
*/
public class Dienstleistung extends COM {
    private final ComTyp _typ = ComTyp.DIENSTLEISTUNG;
    private String bezeichnung;
    private Dienstleistungstyp dienstleistungstyp;

    public Dienstleistung() {
    }

    private Dienstleistung(DienstleistungBuilder builder) {
        super(builder);
        this.bezeichnung = builder.bezeichnung;
        this.dienstleistungstyp = builder.dienstleistungstyp;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Bezeichnung der Dienstleistung
    */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
    * Bezeichnung der Dienstleistung
    */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
    * Kennzeichnung der Dienstleistung
    */
    public Dienstleistungstyp getDienstleistungstyp() {
        return dienstleistungstyp;
    }

    /**
    * Kennzeichnung der Dienstleistung
    */
    public void setDienstleistungstyp(Dienstleistungstyp dienstleistungstyp) {
        this.dienstleistungstyp = dienstleistungstyp;
    }

    public static DienstleistungBuilder builder() {
        return new DienstleistungBuilder();
    }

    public static class DienstleistungBuilder extends COMBuilder {
        private String bezeichnung;
        private Dienstleistungstyp dienstleistungstyp;

        private DienstleistungBuilder() {
        }

        /**
        * Bezeichnung der Dienstleistung
        */
        public DienstleistungBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * Kennzeichnung der Dienstleistung
        */
        public DienstleistungBuilder setDienstleistungstyp(Dienstleistungstyp dienstleistungstyp) {
            this.dienstleistungstyp = dienstleistungstyp;
            return this;
        }

        public DienstleistungBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public DienstleistungBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Dienstleistung build() {
            return new Dienstleistung(this);
        }
    }
}