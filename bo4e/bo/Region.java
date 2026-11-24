package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Regionsoperation;
import bo4e.enums.BoTyp;

import java.util.List;

/**
* Modellierung einer Region als Liste von Regionsoperationen.
*
* Die Reihenfolge der Regionsoperationen ist relevant,
* wird aber nicht zwingend durch die Sortierung innerhalb der Liste definiert. Die
* Sortierung der Regionsoperationen
* wird durch das Feld `prioritaet` im COM `Regionsoperation` explizit festgelegt, um
* technischen Problemen bei
* spezifischen Umsetzungen vorzubeugen und Klarheit zu schaffen.
* Bei einer Implementierung sollte darauf geachtet werden, dass sich "prioritaeten" nicht
* doppeln können.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Region.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Region JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202601.0.0/src/bo4e_schemas/bo/Region.json>`_
*/
public class Region extends Geschaeftsobjekt {
    private final BoTyp _typ = BoTyp.REGION;
    private String beschreibung;
    private String bezeichnung;
    private List<Regionsoperation> regionsoperationen;

    public Region() {
    }

    private Region(RegionBuilder builder) {
        super(builder);
        this.beschreibung = builder.beschreibung;
        this.bezeichnung = builder.bezeichnung;
        this.regionsoperationen = builder.regionsoperationen;
    }

    public BoTyp get_typ() {
        return _typ;
    }

    /**
    * Beschreibung der Region
    */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
    * Beschreibung der Region
    */
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
    * Bezeichnung der Region
    */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
    * Bezeichnung der Region
    */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
    * Eine (unsortierte) Liste von Regionsoperationen.
    * Die Sortierung wird durch das Feld `prioritaet` im COM `Regionsoperation` festgelegt.
    */
    public List<Regionsoperation> getRegionsoperationen() {
        return regionsoperationen;
    }

    /**
    * Eine (unsortierte) Liste von Regionsoperationen.
    * Die Sortierung wird durch das Feld `prioritaet` im COM `Regionsoperation` festgelegt.
    */
    public void setRegionsoperationen(List<Regionsoperation> regionsoperationen) {
        this.regionsoperationen = regionsoperationen;
    }

    public static RegionBuilder builder() {
        return new RegionBuilder();
    }

    public static class RegionBuilder extends GeschaeftsobjektBuilder {
        private String beschreibung;
        private String bezeichnung;
        private List<Regionsoperation> regionsoperationen;

        private RegionBuilder() {
        }

        /**
        * Beschreibung der Region
        */
        public RegionBuilder setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
            return this;
        }

        /**
        * Bezeichnung der Region
        */
        public RegionBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * Eine (unsortierte) Liste von Regionsoperationen.
        * Die Sortierung wird durch das Feld `prioritaet` im COM `Regionsoperation` festgelegt.
        */
        public RegionBuilder setRegionsoperationen(List<Regionsoperation> regionsoperationen) {
            this.regionsoperationen = regionsoperationen;
            return this;
        }

        public RegionBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public RegionBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Region build() {
            return new Region(this);
        }
    }
}