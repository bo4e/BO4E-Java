package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.Preisgarantietyp;

import java.util.List;

/**
* Abbildung einer Preisgarantie mit regionaler Abgrenzung
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/RegionalePreisgarantie.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `RegionalePreisgarantie JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.5.0/src/bo4e_schemas/com/RegionalePreisgarantie.json>`_
*/
public class RegionalePreisgarantie extends COM {
    private String beschreibung;
    private Preisgarantietyp preisgarantietyp;
    private RegionaleGueltigkeit regionaleGueltigkeit;
    private Zeitraum zeitlicheGueltigkeit;

    public RegionalePreisgarantie() {
    }

    private RegionalePreisgarantie(RegionalePreisgarantieBuilder builder) {
        super(builder);
        this.beschreibung = builder.beschreibung;
        this.preisgarantietyp = builder.preisgarantietyp;
        this.regionaleGueltigkeit = builder.regionaleGueltigkeit;
        this.zeitlicheGueltigkeit = builder.zeitlicheGueltigkeit;
    }

    /**
    * Freitext zur Beschreibung der Preisgarantie.
    */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
    * Freitext zur Beschreibung der Preisgarantie.
    */
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
    * Festlegung, auf welche Preisbestandteile die Garantie gewährt wird.
    */
    public Preisgarantietyp getPreisgarantietyp() {
        return preisgarantietyp;
    }

    /**
    * Festlegung, auf welche Preisbestandteile die Garantie gewährt wird.
    */
    public void setPreisgarantietyp(Preisgarantietyp preisgarantietyp) {
        this.preisgarantietyp = preisgarantietyp;
    }

    /**
    * Regionale Eingrenzung der Preisgarantie.
    */
    public RegionaleGueltigkeit getRegionaleGueltigkeit() {
        return regionaleGueltigkeit;
    }

    /**
    * Regionale Eingrenzung der Preisgarantie.
    */
    public void setRegionaleGueltigkeit(RegionaleGueltigkeit regionaleGueltigkeit) {
        this.regionaleGueltigkeit = regionaleGueltigkeit;
    }

    /**
    * Zeitraum, bis zu dem die Preisgarantie gilt, z.B. bis zu einem absolutem / fixem Datum
    * oder als Laufzeit in Monaten.
    */
    public Zeitraum getZeitlicheGueltigkeit() {
        return zeitlicheGueltigkeit;
    }

    /**
    * Zeitraum, bis zu dem die Preisgarantie gilt, z.B. bis zu einem absolutem / fixem Datum
    * oder als Laufzeit in Monaten.
    */
    public void setZeitlicheGueltigkeit(Zeitraum zeitlicheGueltigkeit) {
        this.zeitlicheGueltigkeit = zeitlicheGueltigkeit;
    }

    public static RegionalePreisgarantieBuilder builder() {
        return new RegionalePreisgarantieBuilder();
    }

    public static class RegionalePreisgarantieBuilder extends COMBuilder {
        private String beschreibung;
        private Preisgarantietyp preisgarantietyp;
        private RegionaleGueltigkeit regionaleGueltigkeit;
        private Zeitraum zeitlicheGueltigkeit;

        private RegionalePreisgarantieBuilder() {
        }

        /**
        * Freitext zur Beschreibung der Preisgarantie.
        */
        public RegionalePreisgarantieBuilder setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
            return this;
        }

        /**
        * Festlegung, auf welche Preisbestandteile die Garantie gewährt wird.
        */
        public RegionalePreisgarantieBuilder setPreisgarantietyp(Preisgarantietyp preisgarantietyp) {
            this.preisgarantietyp = preisgarantietyp;
            return this;
        }

        /**
        * Regionale Eingrenzung der Preisgarantie.
        */
        public RegionalePreisgarantieBuilder setRegionaleGueltigkeit(RegionaleGueltigkeit regionaleGueltigkeit) {
            this.regionaleGueltigkeit = regionaleGueltigkeit;
            return this;
        }

        /**
        * Zeitraum, bis zu dem die Preisgarantie gilt, z.B. bis zu einem absolutem / fixem Datum
        * oder als Laufzeit in Monaten.
        */
        public RegionalePreisgarantieBuilder setZeitlicheGueltigkeit(Zeitraum zeitlicheGueltigkeit) {
            this.zeitlicheGueltigkeit = zeitlicheGueltigkeit;
            return this;
        }

        public RegionalePreisgarantieBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public RegionalePreisgarantieBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public RegionalePreisgarantie build() {
            return new RegionalePreisgarantie(this);
        }
    }
}