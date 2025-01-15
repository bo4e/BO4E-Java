package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Regionskriterium;
import bo4e.enums.Typ;

import java.util.List;

/**
* Modellierung einer Region als Menge von Kriterien, die eine Region beschreiben
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Region.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Region JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/bo/Region.json>`_
*/
public class Region extends Geschaeftsobjekt {
    private final Typ _typ = Typ.REGION;
    private String bezeichnung;
    private List<Regionskriterium> negativListe;
    private List<Regionskriterium> positivListe;

    public Region() {
    }

    private Region(RegionBuilder builder) {
        super(builder);
        this.bezeichnung = builder.bezeichnung;
        this.negativListe = builder.negativListe;
        this.positivListe = builder.positivListe;
    }

    public Typ get_typ() {
        return _typ;
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
    * Negativliste der Kriterien zur Definition der Region
    */
    public List<Regionskriterium> getNegativListe() {
        return negativListe;
    }

    /**
    * Negativliste der Kriterien zur Definition der Region
    */
    public void setNegativListe(List<Regionskriterium> negativListe) {
        this.negativListe = negativListe;
    }

    /**
    * Positivliste der Kriterien zur Definition der Region
    */
    public List<Regionskriterium> getPositivListe() {
        return positivListe;
    }

    /**
    * Positivliste der Kriterien zur Definition der Region
    */
    public void setPositivListe(List<Regionskriterium> positivListe) {
        this.positivListe = positivListe;
    }

    public static RegionBuilder builder() {
        return new RegionBuilder();
    }

    public static class RegionBuilder extends GeschaeftsobjektBuilder {
        private String bezeichnung;
        private List<Regionskriterium> negativListe;
        private List<Regionskriterium> positivListe;

        private RegionBuilder() {
        }

        /**
        * Bezeichnung der Region
        */
        public RegionBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * Negativliste der Kriterien zur Definition der Region
        */
        public RegionBuilder setNegativListe(List<Regionskriterium> negativListe) {
            this.negativListe = negativListe;
            return this;
        }

        /**
        * Positivliste der Kriterien zur Definition der Region
        */
        public RegionBuilder setPositivListe(List<Regionskriterium> positivListe) {
            this.positivListe = positivListe;
            return this;
        }

        public RegionBuilder setId(String id) {
            super.setId(id);
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