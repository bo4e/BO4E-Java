package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.AufAbschlagstyp;
import bo4e.enums.AufAbschlagsziel;
import bo4e.enums.Waehrungseinheit;

import java.util.List;

/**
* Modell für die preiserhöhenden (Aufschlag) bzw. preisvermindernden (Abschlag)
* Zusatzvereinbarungen,
* die individuell zu einem neuen oder bestehenden Liefervertrag abgeschlossen wurden.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/AufAbschlag.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `AufAbschlag JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/com/AufAbschlag.json>`_
*/
public class AufAbschlag extends COM {
    private AufAbschlagstyp aufAbschlagstyp;
    private AufAbschlagsziel aufAbschlagsziel;
    private String beschreibung;
    private String bezeichnung;
    private Waehrungseinheit einheit;
    private Zeitraum gueltigkeitszeitraum;
    private List<Preisstaffel> staffeln;
    private String website;

    public AufAbschlag() {
    }

    private AufAbschlag(AufAbschlagBuilder builder) {
        super(builder);
        this.aufAbschlagstyp = builder.aufAbschlagstyp;
        this.aufAbschlagsziel = builder.aufAbschlagsziel;
        this.beschreibung = builder.beschreibung;
        this.bezeichnung = builder.bezeichnung;
        this.einheit = builder.einheit;
        this.gueltigkeitszeitraum = builder.gueltigkeitszeitraum;
        this.staffeln = builder.staffeln;
        this.website = builder.website;
    }

    /**
    * Typ des Aufabschlages (z.B. absolut oder prozentual).
    */
    public AufAbschlagstyp getAufAbschlagstyp() {
        return aufAbschlagstyp;
    }

    /**
    * Typ des Aufabschlages (z.B. absolut oder prozentual).
    */
    public void setAufAbschlagstyp(AufAbschlagstyp aufAbschlagstyp) {
        this.aufAbschlagstyp = aufAbschlagstyp;
    }

    /**
    * Diesem Preis oder den Kosten ist der Auf/Abschlag zugeordnet. Z.B. Arbeitspreis,
    * Gesamtpreis etc..
    */
    public AufAbschlagsziel getAufAbschlagsziel() {
        return aufAbschlagsziel;
    }

    /**
    * Diesem Preis oder den Kosten ist der Auf/Abschlag zugeordnet. Z.B. Arbeitspreis,
    * Gesamtpreis etc..
    */
    public void setAufAbschlagsziel(AufAbschlagsziel aufAbschlagsziel) {
        this.aufAbschlagsziel = aufAbschlagsziel;
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

    /**
    * Gibt an in welcher Währungseinheit der Auf/Abschlag berechnet wird. Euro oder Ct..
    * (Nur im Falle absoluter Aufschlagstypen).
    */
    public Waehrungseinheit getEinheit() {
        return einheit;
    }

    /**
    * Gibt an in welcher Währungseinheit der Auf/Abschlag berechnet wird. Euro oder Ct..
    * (Nur im Falle absoluter Aufschlagstypen).
    */
    public void setEinheit(Waehrungseinheit einheit) {
        this.einheit = einheit;
    }

    /**
    * Internetseite, auf der die Informationen zum Auf-/Abschlag veröffentlicht sind.
    */
    public Zeitraum getGueltigkeitszeitraum() {
        return gueltigkeitszeitraum;
    }

    /**
    * Internetseite, auf der die Informationen zum Auf-/Abschlag veröffentlicht sind.
    */
    public void setGueltigkeitszeitraum(Zeitraum gueltigkeitszeitraum) {
        this.gueltigkeitszeitraum = gueltigkeitszeitraum;
    }

    /**
    * Werte für die gestaffelten Auf/Abschläge.
    */
    public List<Preisstaffel> getStaffeln() {
        return staffeln;
    }

    /**
    * Werte für die gestaffelten Auf/Abschläge.
    */
    public void setStaffeln(List<Preisstaffel> staffeln) {
        this.staffeln = staffeln;
    }

    /**
    * Internetseite, auf der die Informationen zum Auf-/Abschlag veröffentlicht sind.
    */
    public String getWebsite() {
        return website;
    }

    /**
    * Internetseite, auf der die Informationen zum Auf-/Abschlag veröffentlicht sind.
    */
    public void setWebsite(String website) {
        this.website = website;
    }

    public static AufAbschlagBuilder builder() {
        return new AufAbschlagBuilder();
    }

    public static class AufAbschlagBuilder extends COMBuilder {
        private AufAbschlagstyp aufAbschlagstyp;
        private AufAbschlagsziel aufAbschlagsziel;
        private String beschreibung;
        private String bezeichnung;
        private Waehrungseinheit einheit;
        private Zeitraum gueltigkeitszeitraum;
        private List<Preisstaffel> staffeln;
        private String website;

        private AufAbschlagBuilder() {
        }

        /**
        * Typ des Aufabschlages (z.B. absolut oder prozentual).
        */
        public AufAbschlagBuilder setAufAbschlagstyp(AufAbschlagstyp aufAbschlagstyp) {
            this.aufAbschlagstyp = aufAbschlagstyp;
            return this;
        }

        /**
        * Diesem Preis oder den Kosten ist der Auf/Abschlag zugeordnet. Z.B. Arbeitspreis,
        * Gesamtpreis etc..
        */
        public AufAbschlagBuilder setAufAbschlagsziel(AufAbschlagsziel aufAbschlagsziel) {
            this.aufAbschlagsziel = aufAbschlagsziel;
            return this;
        }

        /**
        * Beschreibung zum Auf-/Abschlag
        */
        public AufAbschlagBuilder setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
            return this;
        }

        /**
        * Bezeichnung des Auf-/Abschlags
        */
        public AufAbschlagBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * Gibt an in welcher Währungseinheit der Auf/Abschlag berechnet wird. Euro oder Ct..
        * (Nur im Falle absoluter Aufschlagstypen).
        */
        public AufAbschlagBuilder setEinheit(Waehrungseinheit einheit) {
            this.einheit = einheit;
            return this;
        }

        /**
        * Internetseite, auf der die Informationen zum Auf-/Abschlag veröffentlicht sind.
        */
        public AufAbschlagBuilder setGueltigkeitszeitraum(Zeitraum gueltigkeitszeitraum) {
            this.gueltigkeitszeitraum = gueltigkeitszeitraum;
            return this;
        }

        /**
        * Werte für die gestaffelten Auf/Abschläge.
        */
        public AufAbschlagBuilder setStaffeln(List<Preisstaffel> staffeln) {
            this.staffeln = staffeln;
            return this;
        }

        /**
        * Internetseite, auf der die Informationen zum Auf-/Abschlag veröffentlicht sind.
        */
        public AufAbschlagBuilder setWebsite(String website) {
            this.website = website;
            return this;
        }

        public AufAbschlagBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public AufAbschlagBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public AufAbschlag build() {
            return new AufAbschlag(this);
        }
    }
}