package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import bo4e.enums.Tarifregionskriterium;

import java.util.List;

/**
* Mit dieser Komponente können Kriterien und deren Werte definiert werden
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/KriteriumWert.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `KriteriumWert JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.1.0-rc1/src/bo4e_schemas/com/KriteriumWert.json>`_
*/
public class KriteriumWert extends COM {
    private final ComTyp _typ = ComTyp.KRITERIUMWERT;
    private Tarifregionskriterium kriterium;
    private String wert;

    public KriteriumWert() {
    }

    private KriteriumWert(KriteriumWertBuilder builder) {
        super(builder);
        this.kriterium = builder.kriterium;
        this.wert = builder.wert;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Hier steht, für welches Kriterium der Wert gilt. Z.B. Postleitzahlen
    */
    public Tarifregionskriterium getKriterium() {
        return kriterium;
    }

    /**
    * Hier steht, für welches Kriterium der Wert gilt. Z.B. Postleitzahlen
    */
    public void setKriterium(Tarifregionskriterium kriterium) {
        this.kriterium = kriterium;
    }

    /**
    * Ein Wert, passend zum Kriterium. Z.B. eine Postleitzahl.
    */
    public String getWert() {
        return wert;
    }

    /**
    * Ein Wert, passend zum Kriterium. Z.B. eine Postleitzahl.
    */
    public void setWert(String wert) {
        this.wert = wert;
    }

    public static KriteriumWertBuilder builder() {
        return new KriteriumWertBuilder();
    }

    public static class KriteriumWertBuilder extends COMBuilder {
        private Tarifregionskriterium kriterium;
        private String wert;

        private KriteriumWertBuilder() {
        }

        /**
        * Hier steht, für welches Kriterium der Wert gilt. Z.B. Postleitzahlen
        */
        public KriteriumWertBuilder setKriterium(Tarifregionskriterium kriterium) {
            this.kriterium = kriterium;
            return this;
        }

        /**
        * Ein Wert, passend zum Kriterium. Z.B. eine Postleitzahl.
        */
        public KriteriumWertBuilder setWert(String wert) {
            this.wert = wert;
            return this;
        }

        public KriteriumWertBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public KriteriumWertBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public KriteriumWert build() {
            return new KriteriumWert(this);
        }
    }
}