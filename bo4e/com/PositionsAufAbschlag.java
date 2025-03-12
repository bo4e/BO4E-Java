package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.AufAbschlagstyp;
import bo4e.enums.Waehrungseinheit;

import java.util.List;

/**
* Differenzierung der zu betrachtenden Produkte anhand der preiserhöhenden (Aufschlag)
* bzw. preisvermindernden (Abschlag) Zusatzvereinbarungen,
* die individuell zu einem neuen oder bestehenden Liefervertrag abgeschlossen werden
* können.
* Es können mehrere Auf-/Abschläge gleichzeitig ausgewählt werden.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/PositionsAufAbschlag.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `PositionsAufAbschlag JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.5.0/src/bo4e_schemas/com/PositionsAufAbschlag.json>`_
*/
public class PositionsAufAbschlag extends COM {
    private AufAbschlagstyp aufAbschlagstyp;
    private Waehrungseinheit aufAbschlagswaehrung;
    private Double aufAbschlagswert;
    private String beschreibung;
    private String bezeichnung;

    public PositionsAufAbschlag() {
    }

    private PositionsAufAbschlag(PositionsAufAbschlagBuilder builder) {
        super(builder);
        this.aufAbschlagstyp = builder.aufAbschlagstyp;
        this.aufAbschlagswaehrung = builder.aufAbschlagswaehrung;
        this.aufAbschlagswert = builder.aufAbschlagswert;
        this.beschreibung = builder.beschreibung;
        this.bezeichnung = builder.bezeichnung;
    }

    /**
    * Typ des AufAbschlages
    */
    public AufAbschlagstyp getAufAbschlagstyp() {
        return aufAbschlagstyp;
    }

    /**
    * Typ des AufAbschlages
    */
    public void setAufAbschlagstyp(AufAbschlagstyp aufAbschlagstyp) {
        this.aufAbschlagstyp = aufAbschlagstyp;
    }

    /**
    * Einheit, in der der Auf-/Abschlag angegeben ist (z.B. ct/kWh).
    */
    public Waehrungseinheit getAufAbschlagswaehrung() {
        return aufAbschlagswaehrung;
    }

    /**
    * Einheit, in der der Auf-/Abschlag angegeben ist (z.B. ct/kWh).
    */
    public void setAufAbschlagswaehrung(Waehrungseinheit aufAbschlagswaehrung) {
        this.aufAbschlagswaehrung = aufAbschlagswaehrung;
    }

    /**
    * Höhe des Auf-/Abschlages
    */
    public Double getAufAbschlagswert() {
        return aufAbschlagswert;
    }

    /**
    * Höhe des Auf-/Abschlages
    */
    public void setAufAbschlagswert(Double aufAbschlagswert) {
        this.aufAbschlagswert = aufAbschlagswert;
    }

    /**
    * Beschreibung zum Auf-/Abschlag
    */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
    * Beschreibung zum Auf-/Abschlag
    */
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
    * Bezeichnung des Auf-/Abschlags
    */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
    * Bezeichnung des Auf-/Abschlags
    */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public static PositionsAufAbschlagBuilder builder() {
        return new PositionsAufAbschlagBuilder();
    }

    public static class PositionsAufAbschlagBuilder extends COMBuilder {
        private AufAbschlagstyp aufAbschlagstyp;
        private Waehrungseinheit aufAbschlagswaehrung;
        private Double aufAbschlagswert;
        private String beschreibung;
        private String bezeichnung;

        private PositionsAufAbschlagBuilder() {
        }

        /**
        * Typ des AufAbschlages
        */
        public PositionsAufAbschlagBuilder setAufAbschlagstyp(AufAbschlagstyp aufAbschlagstyp) {
            this.aufAbschlagstyp = aufAbschlagstyp;
            return this;
        }

        /**
        * Einheit, in der der Auf-/Abschlag angegeben ist (z.B. ct/kWh).
        */
        public PositionsAufAbschlagBuilder setAufAbschlagswaehrung(Waehrungseinheit aufAbschlagswaehrung) {
            this.aufAbschlagswaehrung = aufAbschlagswaehrung;
            return this;
        }

        /**
        * Höhe des Auf-/Abschlages
        */
        public PositionsAufAbschlagBuilder setAufAbschlagswert(Double aufAbschlagswert) {
            this.aufAbschlagswert = aufAbschlagswert;
            return this;
        }

        /**
        * Beschreibung zum Auf-/Abschlag
        */
        public PositionsAufAbschlagBuilder setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
            return this;
        }

        /**
        * Bezeichnung des Auf-/Abschlags
        */
        public PositionsAufAbschlagBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        public PositionsAufAbschlagBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public PositionsAufAbschlagBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public PositionsAufAbschlag build() {
            return new PositionsAufAbschlag(this);
        }
    }
}