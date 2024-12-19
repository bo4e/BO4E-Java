package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.AufAbschlagstyp;
import bo4e.enums.AufAbschlagsziel;
import bo4e.enums.Waehrungseinheit;

import java.util.List;

/**
* Mit dieser Komponente können Auf- und Abschläge verschiedener Typen im Zusammenhang mit
* regionalen Gültigkeiten
* abgebildet werden.
* Hier sind auch die Auswirkungen auf verschiedene Tarifparameter modelliert, die sich
* durch die Auswahl eines Auf-
* oder Abschlags ergeben.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/RegionalerAufAbschlag.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `RegionalerAufAbschlag JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/com/RegionalerAufAbschlag.json>`_
*/
public class RegionalerAufAbschlag extends COM {
    private AufAbschlagstyp aufAbschlagstyp;
    private AufAbschlagsziel aufAbschlagsziel;
    private String beschreibung;
    private String bezeichnung;
    private Waehrungseinheit einheit;
    private Tarifeinschraenkung einschraenkungsaenderung;
    private Energiemix energiemixaenderung;
    private Preisgarantie garantieaenderung;
    private Zeitraum gueltigkeitszeitraum;
    private List<RegionalePreisstaffel> staffeln;
    private String tarifnamensaenderungen;
    private Vertragskonditionen vertagskonditionsaenderung;
    private List<String> voraussetzungen;
    private String website;
    private List<String> zusatzprodukte;

    public RegionalerAufAbschlag() {
    }

    private RegionalerAufAbschlag(RegionalerAufAbschlagBuilder builder) {
        super(builder);
        this.aufAbschlagstyp = builder.aufAbschlagstyp;
        this.aufAbschlagsziel = builder.aufAbschlagsziel;
        this.beschreibung = builder.beschreibung;
        this.bezeichnung = builder.bezeichnung;
        this.einheit = builder.einheit;
        this.einschraenkungsaenderung = builder.einschraenkungsaenderung;
        this.energiemixaenderung = builder.energiemixaenderung;
        this.garantieaenderung = builder.garantieaenderung;
        this.gueltigkeitszeitraum = builder.gueltigkeitszeitraum;
        this.staffeln = builder.staffeln;
        this.tarifnamensaenderungen = builder.tarifnamensaenderungen;
        this.vertagskonditionsaenderung = builder.vertagskonditionsaenderung;
        this.voraussetzungen = builder.voraussetzungen;
        this.website = builder.website;
        this.zusatzprodukte = builder.zusatzprodukte;
    }

    /**
    * Typ des Aufabschlages (z.B. absolut oder prozentual)
    */
    public AufAbschlagstyp getAufAbschlagstyp() {
        return aufAbschlagstyp;
    }

    /**
    * Typ des Aufabschlages (z.B. absolut oder prozentual)
    */
    public void setAufAbschlagstyp(AufAbschlagstyp aufAbschlagstyp) {
        this.aufAbschlagstyp = aufAbschlagstyp;
    }

    /**
    * Diesem Preis oder den Kosten ist der Auf/Abschlag zugeordnet. Z.B. Arbeitspreis,
    * Gesamtpreis etc.
    */
    public AufAbschlagsziel getAufAbschlagsziel() {
        return aufAbschlagsziel;
    }

    /**
    * Diesem Preis oder den Kosten ist der Auf/Abschlag zugeordnet. Z.B. Arbeitspreis,
    * Gesamtpreis etc.
    */
    public void setAufAbschlagsziel(AufAbschlagsziel aufAbschlagsziel) {
        this.aufAbschlagsziel = aufAbschlagsziel;
    }

    /**
    * Beschreibung des Auf-/Abschlags
    */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
    * Beschreibung des Auf-/Abschlags
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
    * Gibt an in welcher Währungseinheit der Auf/Abschlag berechnet wird (nur im Falle
    * absoluter Aufschlagstypen).
    */
    public Waehrungseinheit getEinheit() {
        return einheit;
    }

    /**
    * Gibt an in welcher Währungseinheit der Auf/Abschlag berechnet wird (nur im Falle
    * absoluter Aufschlagstypen).
    */
    public void setEinheit(Waehrungseinheit einheit) {
        this.einheit = einheit;
    }

    /**
    * Änderungen in den Einschränkungen zum Tarif;
    * Falls in dieser Komponenten angegeben, werden die Tarifparameter hiermit überschrieben.
    */
    public Tarifeinschraenkung getEinschraenkungsaenderung() {
        return einschraenkungsaenderung;
    }

    /**
    * Änderungen in den Einschränkungen zum Tarif;
    * Falls in dieser Komponenten angegeben, werden die Tarifparameter hiermit überschrieben.
    */
    public void setEinschraenkungsaenderung(Tarifeinschraenkung einschraenkungsaenderung) {
        this.einschraenkungsaenderung = einschraenkungsaenderung;
    }

    /**
    * Der Energiemix kann sich durch einen AufAbschlag ändern (z.B. zwei Cent Aufschlag für
    * Ökostrom).
    * Sollte dies der Fall sein, wird hier die neue Zusammensetzung des Energiemix angegeben.
    */
    public Energiemix getEnergiemixaenderung() {
        return energiemixaenderung;
    }

    /**
    * Der Energiemix kann sich durch einen AufAbschlag ändern (z.B. zwei Cent Aufschlag für
    * Ökostrom).
    * Sollte dies der Fall sein, wird hier die neue Zusammensetzung des Energiemix angegeben.
    */
    public void setEnergiemixaenderung(Energiemix energiemixaenderung) {
        this.energiemixaenderung = energiemixaenderung;
    }

    /**
    * Änderungen in den Garantievereinbarungen;
    * Falls in dieser Komponenten angegeben, werden die Tarifparameter hiermit überschrieben.
    */
    public Preisgarantie getGarantieaenderung() {
        return garantieaenderung;
    }

    /**
    * Änderungen in den Garantievereinbarungen;
    * Falls in dieser Komponenten angegeben, werden die Tarifparameter hiermit überschrieben.
    */
    public void setGarantieaenderung(Preisgarantie garantieaenderung) {
        this.garantieaenderung = garantieaenderung;
    }

    /**
    * Zeitraum, in dem der Abschlag zur Anwendung kommen kann
    */
    public Zeitraum getGueltigkeitszeitraum() {
        return gueltigkeitszeitraum;
    }

    /**
    * Zeitraum, in dem der Abschlag zur Anwendung kommen kann
    */
    public void setGueltigkeitszeitraum(Zeitraum gueltigkeitszeitraum) {
        this.gueltigkeitszeitraum = gueltigkeitszeitraum;
    }

    /**
    * Werte für die gestaffelten Auf/Abschläge mit regionaler Eingrenzung
    */
    public List<RegionalePreisstaffel> getStaffeln() {
        return staffeln;
    }

    /**
    * Werte für die gestaffelten Auf/Abschläge mit regionaler Eingrenzung
    */
    public void setStaffeln(List<RegionalePreisstaffel> staffeln) {
        this.staffeln = staffeln;
    }

    /**
    * Durch die Anwendung des Auf/Abschlags kann eine Änderung des Tarifnamens auftreten
    */
    public String getTarifnamensaenderungen() {
        return tarifnamensaenderungen;
    }

    /**
    * Durch die Anwendung des Auf/Abschlags kann eine Änderung des Tarifnamens auftreten
    */
    public void setTarifnamensaenderungen(String tarifnamensaenderungen) {
        this.tarifnamensaenderungen = tarifnamensaenderungen;
    }

    /**
    * Änderungen in den Vertragskonditionen;
    * Falls in dieser Komponenten angegeben, werden die Tarifparameter hiermit überschrieben.
    */
    public Vertragskonditionen getVertagskonditionsaenderung() {
        return vertagskonditionsaenderung;
    }

    /**
    * Änderungen in den Vertragskonditionen;
    * Falls in dieser Komponenten angegeben, werden die Tarifparameter hiermit überschrieben.
    */
    public void setVertagskonditionsaenderung(Vertragskonditionen vertagskonditionsaenderung) {
        this.vertagskonditionsaenderung = vertagskonditionsaenderung;
    }

    /**
    * Voraussetzungen, die erfüllt sein müssen, damit dieser AufAbschlag zur Anwendung kommen
    * kann
    */
    public List<String> getVoraussetzungen() {
        return voraussetzungen;
    }

    /**
    * Voraussetzungen, die erfüllt sein müssen, damit dieser AufAbschlag zur Anwendung kommen
    * kann
    */
    public void setVoraussetzungen(List<String> voraussetzungen) {
        this.voraussetzungen = voraussetzungen;
    }

    /**
    * Internetseite, auf der die Informationen zum Auf-/Abschlag veröffentlicht sind
    */
    public String getWebsite() {
        return website;
    }

    /**
    * Internetseite, auf der die Informationen zum Auf-/Abschlag veröffentlicht sind
    */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
    * Zusatzprodukte, die nur in Kombination mit diesem AufAbschlag erhältlich sind
    */
    public List<String> getZusatzprodukte() {
        return zusatzprodukte;
    }

    /**
    * Zusatzprodukte, die nur in Kombination mit diesem AufAbschlag erhältlich sind
    */
    public void setZusatzprodukte(List<String> zusatzprodukte) {
        this.zusatzprodukte = zusatzprodukte;
    }

    public static RegionalerAufAbschlagBuilder builder() {
        return new RegionalerAufAbschlagBuilder();
    }

    public static class RegionalerAufAbschlagBuilder extends COMBuilder {
        private AufAbschlagstyp aufAbschlagstyp;
        private AufAbschlagsziel aufAbschlagsziel;
        private String beschreibung;
        private String bezeichnung;
        private Waehrungseinheit einheit;
        private Tarifeinschraenkung einschraenkungsaenderung;
        private Energiemix energiemixaenderung;
        private Preisgarantie garantieaenderung;
        private Zeitraum gueltigkeitszeitraum;
        private List<RegionalePreisstaffel> staffeln;
        private String tarifnamensaenderungen;
        private Vertragskonditionen vertagskonditionsaenderung;
        private List<String> voraussetzungen;
        private String website;
        private List<String> zusatzprodukte;

        private RegionalerAufAbschlagBuilder() {
        }

        /**
        * Typ des Aufabschlages (z.B. absolut oder prozentual)
        */
        public RegionalerAufAbschlagBuilder setAufAbschlagstyp(AufAbschlagstyp aufAbschlagstyp) {
            this.aufAbschlagstyp = aufAbschlagstyp;
            return this;
        }

        /**
        * Diesem Preis oder den Kosten ist der Auf/Abschlag zugeordnet. Z.B. Arbeitspreis,
        * Gesamtpreis etc.
        */
        public RegionalerAufAbschlagBuilder setAufAbschlagsziel(AufAbschlagsziel aufAbschlagsziel) {
            this.aufAbschlagsziel = aufAbschlagsziel;
            return this;
        }

        /**
        * Beschreibung des Auf-/Abschlags
        */
        public RegionalerAufAbschlagBuilder setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
            return this;
        }

        /**
        * Bezeichnung des Auf-/Abschlags
        */
        public RegionalerAufAbschlagBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * Gibt an in welcher Währungseinheit der Auf/Abschlag berechnet wird (nur im Falle
        * absoluter Aufschlagstypen).
        */
        public RegionalerAufAbschlagBuilder setEinheit(Waehrungseinheit einheit) {
            this.einheit = einheit;
            return this;
        }

        /**
        * Änderungen in den Einschränkungen zum Tarif;
        * Falls in dieser Komponenten angegeben, werden die Tarifparameter hiermit überschrieben.
        */
        public RegionalerAufAbschlagBuilder setEinschraenkungsaenderung(Tarifeinschraenkung einschraenkungsaenderung) {
            this.einschraenkungsaenderung = einschraenkungsaenderung;
            return this;
        }

        /**
        * Der Energiemix kann sich durch einen AufAbschlag ändern (z.B. zwei Cent Aufschlag für
        * Ökostrom).
        * Sollte dies der Fall sein, wird hier die neue Zusammensetzung des Energiemix angegeben.
        */
        public RegionalerAufAbschlagBuilder setEnergiemixaenderung(Energiemix energiemixaenderung) {
            this.energiemixaenderung = energiemixaenderung;
            return this;
        }

        /**
        * Änderungen in den Garantievereinbarungen;
        * Falls in dieser Komponenten angegeben, werden die Tarifparameter hiermit überschrieben.
        */
        public RegionalerAufAbschlagBuilder setGarantieaenderung(Preisgarantie garantieaenderung) {
            this.garantieaenderung = garantieaenderung;
            return this;
        }

        /**
        * Zeitraum, in dem der Abschlag zur Anwendung kommen kann
        */
        public RegionalerAufAbschlagBuilder setGueltigkeitszeitraum(Zeitraum gueltigkeitszeitraum) {
            this.gueltigkeitszeitraum = gueltigkeitszeitraum;
            return this;
        }

        /**
        * Werte für die gestaffelten Auf/Abschläge mit regionaler Eingrenzung
        */
        public RegionalerAufAbschlagBuilder setStaffeln(List<RegionalePreisstaffel> staffeln) {
            this.staffeln = staffeln;
            return this;
        }

        /**
        * Durch die Anwendung des Auf/Abschlags kann eine Änderung des Tarifnamens auftreten
        */
        public RegionalerAufAbschlagBuilder setTarifnamensaenderungen(String tarifnamensaenderungen) {
            this.tarifnamensaenderungen = tarifnamensaenderungen;
            return this;
        }

        /**
        * Änderungen in den Vertragskonditionen;
        * Falls in dieser Komponenten angegeben, werden die Tarifparameter hiermit überschrieben.
        */
        public RegionalerAufAbschlagBuilder setVertagskonditionsaenderung(Vertragskonditionen vertagskonditionsaenderung) {
            this.vertagskonditionsaenderung = vertagskonditionsaenderung;
            return this;
        }

        /**
        * Voraussetzungen, die erfüllt sein müssen, damit dieser AufAbschlag zur Anwendung kommen
        * kann
        */
        public RegionalerAufAbschlagBuilder setVoraussetzungen(List<String> voraussetzungen) {
            this.voraussetzungen = voraussetzungen;
            return this;
        }

        /**
        * Internetseite, auf der die Informationen zum Auf-/Abschlag veröffentlicht sind
        */
        public RegionalerAufAbschlagBuilder setWebsite(String website) {
            this.website = website;
            return this;
        }

        /**
        * Zusatzprodukte, die nur in Kombination mit diesem AufAbschlag erhältlich sind
        */
        public RegionalerAufAbschlagBuilder setZusatzprodukte(List<String> zusatzprodukte) {
            this.zusatzprodukte = zusatzprodukte;
            return this;
        }

        public RegionalerAufAbschlagBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public RegionalerAufAbschlagBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public RegionalerAufAbschlag build() {
            return new RegionalerAufAbschlag(this);
        }
    }
}