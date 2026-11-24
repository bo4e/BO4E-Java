package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import bo4e.enums.Operator;
import bo4e.enums.Regionskriterium;

import java.util.List;

/**
* Komponente zur Abbildung einer Regionsoperation.
*
* In Kombination mit anderen Regionsoperationen kann eine Region definiert werden. Eine
* Regionsoperation ermöglicht
* die Definition einer Region in eingeschränkter Form. Durch den Operator können mehrere
* "einfache" Regionsoperationen
* miteinander kombiniert werden, um eine komplexere Region zu definieren.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Regionsoperation.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Regionsoperation JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202607.1.0-rc2/src/bo4e_schemas/com/Regionsoperation.json>`_
*/
public class Regionsoperation extends COM {
    private final ComTyp _typ = ComTyp.REGIONSOPERATION;
    private String bezeichnung;
    private String bezeichnung2;
    private Long prioritaet;
    private Double radiusInKm;
    private Regionskriterium regionskriterium;
    private Operator regionsoperator;
    private String wertBis;
    private String wertVon;

    public Regionsoperation() {
    }

    private Regionsoperation(RegionsoperationBuilder builder) {
        super(builder);
        this.bezeichnung = builder.bezeichnung;
        this.bezeichnung2 = builder.bezeichnung2;
        this.prioritaet = builder.prioritaet;
        this.radiusInKm = builder.radiusInKm;
        this.regionskriterium = builder.regionskriterium;
        this.regionsoperator = builder.regionsoperator;
        this.wertBis = builder.wertBis;
        this.wertVon = builder.wertVon;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * (auch IDs und PLZ möglich)
    */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
    * (auch IDs und PLZ möglich)
    */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
    * (TODO: bessere Benamung! geht vor allem um Postort: PLZ & Ort als Schnittmenge)
    */
    public String getBezeichnung2() {
        return bezeichnung2;
    }

    /**
    * (TODO: bessere Benamung! geht vor allem um Postort: PLZ & Ort als Schnittmenge)
    */
    public void setBezeichnung2(String bezeichnung2) {
        this.bezeichnung2 = bezeichnung2;
    }

    /**
    * Priorität dieser Regionsoperation. Theoretisch sind Listen in JSON sortiert, jedoch ist
    * eine solche Sortierung
    * eventuell implementierungsbedingt fehleranfällig. Daher nutzen wir dieses Feld.
    * angefangen bei 1 (höchste Priorität) und aufsteigend
    */
    public Long getPrioritaet() {
        return prioritaet;
    }

    /**
    * Priorität dieser Regionsoperation. Theoretisch sind Listen in JSON sortiert, jedoch ist
    * eine solche Sortierung
    * eventuell implementierungsbedingt fehleranfällig. Daher nutzen wir dieses Feld.
    * angefangen bei 1 (höchste Priorität) und aufsteigend
    */
    public void setPrioritaet(Long prioritaet) {
        this.prioritaet = prioritaet;
    }

    /**
    * (inklusiv)
    */
    public Double getRadiusInKm() {
        return radiusInKm;
    }

    /**
    * (inklusiv)
    */
    public void setRadiusInKm(Double radiusInKm) {
        this.radiusInKm = radiusInKm;
    }

    /**
    * (ehemals Regionskriteriumtyp)]
    */
    public Regionskriterium getRegionskriterium() {
        return regionskriterium;
    }

    /**
    * (ehemals Regionskriteriumtyp)]
    */
    public void setRegionskriterium(Regionskriterium regionskriterium) {
        this.regionskriterium = regionskriterium;
    }

    public Operator getRegionsoperator() {
        return regionsoperator;
    }

    public void setRegionsoperator(Operator regionsoperator) {
        this.regionsoperator = regionsoperator;
    }

    /**
    * (inklusiv)
    */
    public String getWertBis() {
        return wertBis;
    }

    /**
    * (inklusiv)
    */
    public void setWertBis(String wertBis) {
        this.wertBis = wertBis;
    }

    /**
    * (inklusiv)
    */
    public String getWertVon() {
        return wertVon;
    }

    /**
    * (inklusiv)
    */
    public void setWertVon(String wertVon) {
        this.wertVon = wertVon;
    }

    public static RegionsoperationBuilder builder() {
        return new RegionsoperationBuilder();
    }

    public static class RegionsoperationBuilder extends COMBuilder {
        private String bezeichnung;
        private String bezeichnung2;
        private Long prioritaet;
        private Double radiusInKm;
        private Regionskriterium regionskriterium;
        private Operator regionsoperator;
        private String wertBis;
        private String wertVon;

        private RegionsoperationBuilder() {
        }

        /**
        * (auch IDs und PLZ möglich)
        */
        public RegionsoperationBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * (TODO: bessere Benamung! geht vor allem um Postort: PLZ & Ort als Schnittmenge)
        */
        public RegionsoperationBuilder setBezeichnung2(String bezeichnung2) {
            this.bezeichnung2 = bezeichnung2;
            return this;
        }

        /**
        * Priorität dieser Regionsoperation. Theoretisch sind Listen in JSON sortiert, jedoch ist
        * eine solche Sortierung
        * eventuell implementierungsbedingt fehleranfällig. Daher nutzen wir dieses Feld.
        * angefangen bei 1 (höchste Priorität) und aufsteigend
        */
        public RegionsoperationBuilder setPrioritaet(Long prioritaet) {
            this.prioritaet = prioritaet;
            return this;
        }

        /**
        * (inklusiv)
        */
        public RegionsoperationBuilder setRadiusInKm(Double radiusInKm) {
            this.radiusInKm = radiusInKm;
            return this;
        }

        /**
        * (ehemals Regionskriteriumtyp)]
        */
        public RegionsoperationBuilder setRegionskriterium(Regionskriterium regionskriterium) {
            this.regionskriterium = regionskriterium;
            return this;
        }

        public RegionsoperationBuilder setRegionsoperator(Operator regionsoperator) {
            this.regionsoperator = regionsoperator;
            return this;
        }

        /**
        * (inklusiv)
        */
        public RegionsoperationBuilder setWertBis(String wertBis) {
            this.wertBis = wertBis;
            return this;
        }

        /**
        * (inklusiv)
        */
        public RegionsoperationBuilder setWertVon(String wertVon) {
            this.wertVon = wertVon;
            return this;
        }

        public RegionsoperationBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public RegionsoperationBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Regionsoperation build() {
            return new Regionsoperation(this);
        }
    }
}