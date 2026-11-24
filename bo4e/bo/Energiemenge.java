package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Menge;
import bo4e.com.Zeitraum;
import bo4e.enums.BoTyp;

import java.util.List;

/**
* Abbildung von Mengen, die Lokationen zugeordnet sind
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Energiemenge.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Energiemenge JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202601.0.0/src/bo4e_schemas/bo/Energiemenge.json>`_
*/
public class Energiemenge extends Geschaeftsobjekt {
    private final BoTyp _typ = BoTyp.ENERGIEMENGE;
    private String beschreibung;
    private Menge menge;
    private String obisKennzahl;
    private Zeitraum zeitraum;

    public Energiemenge() {
    }

    private Energiemenge(EnergiemengeBuilder builder) {
        super(builder);
        this.beschreibung = builder.beschreibung;
        this.menge = builder.menge;
        this.obisKennzahl = builder.obisKennzahl;
        this.zeitraum = builder.zeitraum;
    }

    public BoTyp get_typ() {
        return _typ;
    }

    /**
    * Ergänzende Beschreibung zur Energiemenge
    */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
    * Ergänzende Beschreibung zur Energiemenge
    */
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
    * Die angefallene/gemessene Menge
    */
    public Menge getMenge() {
        return menge;
    }

    /**
    * Die angefallene/gemessene Menge
    */
    public void setMenge(Menge menge) {
        this.menge = menge;
    }

    /**
    * Die OBIS-Kennzahl der Energiemenge
    */
    public String getObisKennzahl() {
        return obisKennzahl;
    }

    /**
    * Die OBIS-Kennzahl der Energiemenge
    */
    public void setObisKennzahl(String obisKennzahl) {
        this.obisKennzahl = obisKennzahl;
    }

    /**
    * Zeitraum, in dem die Energiemenge angefallen ist/gemessen wurde
    */
    public Zeitraum getZeitraum() {
        return zeitraum;
    }

    /**
    * Zeitraum, in dem die Energiemenge angefallen ist/gemessen wurde
    */
    public void setZeitraum(Zeitraum zeitraum) {
        this.zeitraum = zeitraum;
    }

    public static EnergiemengeBuilder builder() {
        return new EnergiemengeBuilder();
    }

    public static class EnergiemengeBuilder extends GeschaeftsobjektBuilder {
        private String beschreibung;
        private Menge menge;
        private String obisKennzahl;
        private Zeitraum zeitraum;

        private EnergiemengeBuilder() {
        }

        /**
        * Ergänzende Beschreibung zur Energiemenge
        */
        public EnergiemengeBuilder setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
            return this;
        }

        /**
        * Die angefallene/gemessene Menge
        */
        public EnergiemengeBuilder setMenge(Menge menge) {
            this.menge = menge;
            return this;
        }

        /**
        * Die OBIS-Kennzahl der Energiemenge
        */
        public EnergiemengeBuilder setObisKennzahl(String obisKennzahl) {
            this.obisKennzahl = obisKennzahl;
            return this;
        }

        /**
        * Zeitraum, in dem die Energiemenge angefallen ist/gemessen wurde
        */
        public EnergiemengeBuilder setZeitraum(Zeitraum zeitraum) {
            this.zeitraum = zeitraum;
            return this;
        }

        public EnergiemengeBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public EnergiemengeBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Energiemenge build() {
            return new Energiemenge(this);
        }
    }
}