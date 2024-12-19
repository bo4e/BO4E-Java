package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.Preisgarantietyp;

import java.util.List;

/**
* Definition für eine Preisgarantie mit der Möglichkeit verschiedener Ausprägungen.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Preisgarantie.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Preisgarantie JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/com/Preisgarantie.json>`_
*/
public class Preisgarantie extends COM {
    private String beschreibung;
    private Preisgarantietyp preisgarantietyp;
    private Zeitraum zeitlicheGueltigkeit;

    public Preisgarantie() {
    }

    private Preisgarantie(PreisgarantieBuilder builder) {
        super(builder);
        this.beschreibung = builder.beschreibung;
        this.preisgarantietyp = builder.preisgarantietyp;
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

    public static PreisgarantieBuilder builder() {
        return new PreisgarantieBuilder();
    }

    public static class PreisgarantieBuilder extends COMBuilder {
        private String beschreibung;
        private Preisgarantietyp preisgarantietyp;
        private Zeitraum zeitlicheGueltigkeit;

        private PreisgarantieBuilder() {
        }

        /**
        * Freitext zur Beschreibung der Preisgarantie.
        */
        public PreisgarantieBuilder setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
            return this;
        }

        /**
        * Festlegung, auf welche Preisbestandteile die Garantie gewährt wird.
        */
        public PreisgarantieBuilder setPreisgarantietyp(Preisgarantietyp preisgarantietyp) {
            this.preisgarantietyp = preisgarantietyp;
            return this;
        }

        /**
        * Zeitraum, bis zu dem die Preisgarantie gilt, z.B. bis zu einem absolutem / fixem Datum
        * oder als Laufzeit in Monaten.
        */
        public PreisgarantieBuilder setZeitlicheGueltigkeit(Zeitraum zeitlicheGueltigkeit) {
            this.zeitlicheGueltigkeit = zeitlicheGueltigkeit;
            return this;
        }

        public PreisgarantieBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public PreisgarantieBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Preisgarantie build() {
            return new Preisgarantie(this);
        }
    }
}