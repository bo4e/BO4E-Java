package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.AufAbschlagstyp;
import bo4e.enums.AufAbschlagsziel;
import bo4e.enums.Waehrungseinheit;

import java.util.List;

/**
* Mit dieser Komponente können Auf- und Abschläge verschiedener Typen
* im Zusammenhang mit regionalen Gültigkeiten abgebildet werden.
* Hier sind auch die Auswirkungen auf verschiedene Tarifparameter modelliert,
* die sich durch die Auswahl eines Auf- oder Abschlags ergeben.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/AufAbschlagRegional.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `AufAbschlagRegional JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.6.0/src/bo4e_schemas/com/AufAbschlagRegional.json>`_
*/
public class AufAbschlagRegional extends COM {
    private AufAbschlagstyp aufAbschlagstyp;
    private AufAbschlagsziel aufAbschlagsziel;
    private String beschreibung;
    private List<AufAbschlagProOrt> betraege;
    private String bezeichnung;
    private Waehrungseinheit einheit;
    private Tarifeinschraenkung einschraenkungsaenderung;
    private Energiemix energiemixaenderung;
    private Preisgarantie garantieaenderung;
    private Zeitraum gueltigkeitszeitraum;
    private String tarifnamensaenderungen;
    private Vertragskonditionen vertagskonditionsaenderung;
    private List<String> voraussetzungen;
    private String website;
    private List<String> zusatzprodukte;

    public AufAbschlagRegional() {
    }

    private AufAbschlagRegional(AufAbschlagRegionalBuilder builder) {
        super(builder);
        this.aufAbschlagstyp = builder.aufAbschlagstyp;
        this.aufAbschlagsziel = builder.aufAbschlagsziel;
        this.beschreibung = builder.beschreibung;
        this.betraege = builder.betraege;
        this.bezeichnung = builder.bezeichnung;
        this.einheit = builder.einheit;
        this.einschraenkungsaenderung = builder.einschraenkungsaenderung;
        this.energiemixaenderung = builder.energiemixaenderung;
        this.garantieaenderung = builder.garantieaenderung;
        this.gueltigkeitszeitraum = builder.gueltigkeitszeitraum;
        this.tarifnamensaenderungen = builder.tarifnamensaenderungen;
        this.vertagskonditionsaenderung = builder.vertagskonditionsaenderung;
        this.voraussetzungen = builder.voraussetzungen;
        this.website = builder.website;
        this.zusatzprodukte = builder.zusatzprodukte;
    }

    public AufAbschlagstyp getAufAbschlagstyp() {
        return aufAbschlagstyp;
    }

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
    * Werte für die gestaffelten Auf/Abschläge mit regionaler Eingrenzung
    */
    public List<AufAbschlagProOrt> getBetraege() {
        return betraege;
    }

    /**
    * Werte für die gestaffelten Auf/Abschläge mit regionaler Eingrenzung
    */
    public void setBetraege(List<AufAbschlagProOrt> betraege) {
        this.betraege = betraege;
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
    * Gibt an in welcher Währungseinheit der Auf/Abschlag berechnet wird. Euro oder Ct.
    */
    public Waehrungseinheit getEinheit() {
        return einheit;
    }

    /**
    * Gibt an in welcher Währungseinheit der Auf/Abschlag berechnet wird. Euro oder Ct.
    */
    public void setEinheit(Waehrungseinheit einheit) {
        this.einheit = einheit;
    }

    /**
    * Änderungen in den Einschränkungen zum Tarif. Falls in dieser Komponenten angegeben,
    * werden die Tarifparameter hiermit überschrieben.
    */
    public Tarifeinschraenkung getEinschraenkungsaenderung() {
        return einschraenkungsaenderung;
    }

    /**
    * Änderungen in den Einschränkungen zum Tarif. Falls in dieser Komponenten angegeben,
    * werden die Tarifparameter hiermit überschrieben.
    */
    public void setEinschraenkungsaenderung(Tarifeinschraenkung einschraenkungsaenderung) {
        this.einschraenkungsaenderung = einschraenkungsaenderung;
    }

    /**
    * Der Energiemix kann sich durch einen AufAbschlag ändern (z.B. zwei Cent Aufschlag für
    * Ökostrom:
    * Sollte dies der Fall sein, wird hier die neue Zusammensetzung des Energiemix angegeben.
    */
    public Energiemix getEnergiemixaenderung() {
        return energiemixaenderung;
    }

    /**
    * Der Energiemix kann sich durch einen AufAbschlag ändern (z.B. zwei Cent Aufschlag für
    * Ökostrom:
    * Sollte dies der Fall sein, wird hier die neue Zusammensetzung des Energiemix angegeben.
    */
    public void setEnergiemixaenderung(Energiemix energiemixaenderung) {
        this.energiemixaenderung = energiemixaenderung;
    }

    /**
    * Änderungen in den Garantievereinbarungen. Falls in dieser Komponenten angegeben,
    * werden die Tarifparameter hiermit überschrieben.
    */
    public Preisgarantie getGarantieaenderung() {
        return garantieaenderung;
    }

    /**
    * Änderungen in den Garantievereinbarungen. Falls in dieser Komponenten angegeben,
    * werden die Tarifparameter hiermit überschrieben.
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
    * Durch die Anwendung des Auf/Abschlags kann eine Änderung des Tarifnamens auftreten.
    */
    public String getTarifnamensaenderungen() {
        return tarifnamensaenderungen;
    }

    /**
    * Durch die Anwendung des Auf/Abschlags kann eine Änderung des Tarifnamens auftreten.
    */
    public void setTarifnamensaenderungen(String tarifnamensaenderungen) {
        this.tarifnamensaenderungen = tarifnamensaenderungen;
    }

    /**
    * Änderungen in den Vertragskonditionen. Falls in dieser Komponenten angegeben,
    * werden die Tarifparameter hiermit überschrieben.
    */
    public Vertragskonditionen getVertagskonditionsaenderung() {
        return vertagskonditionsaenderung;
    }

    /**
    * Änderungen in den Vertragskonditionen. Falls in dieser Komponenten angegeben,
    * werden die Tarifparameter hiermit überschrieben.
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

    public static AufAbschlagRegionalBuilder builder() {
        return new AufAbschlagRegionalBuilder();
    }

    public static class AufAbschlagRegionalBuilder extends COMBuilder {
        private AufAbschlagstyp aufAbschlagstyp;
        private AufAbschlagsziel aufAbschlagsziel;
        private String beschreibung;
        private List<AufAbschlagProOrt> betraege;
        private String bezeichnung;
        private Waehrungseinheit einheit;
        private Tarifeinschraenkung einschraenkungsaenderung;
        private Energiemix energiemixaenderung;
        private Preisgarantie garantieaenderung;
        private Zeitraum gueltigkeitszeitraum;
        private String tarifnamensaenderungen;
        private Vertragskonditionen vertagskonditionsaenderung;
        private List<String> voraussetzungen;
        private String website;
        private List<String> zusatzprodukte;

        private AufAbschlagRegionalBuilder() {
        }

        public AufAbschlagRegionalBuilder setAufAbschlagstyp(AufAbschlagstyp aufAbschlagstyp) {
            this.aufAbschlagstyp = aufAbschlagstyp;
            return this;
        }

        /**
        * Diesem Preis oder den Kosten ist der Auf/Abschlag zugeordnet. Z.B. Arbeitspreis,
        * Gesamtpreis etc.
        */
        public AufAbschlagRegionalBuilder setAufAbschlagsziel(AufAbschlagsziel aufAbschlagsziel) {
            this.aufAbschlagsziel = aufAbschlagsziel;
            return this;
        }

        /**
        * Beschreibung zum Auf-/Abschlag
        */
        public AufAbschlagRegionalBuilder setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
            return this;
        }

        /**
        * Werte für die gestaffelten Auf/Abschläge mit regionaler Eingrenzung
        */
        public AufAbschlagRegionalBuilder setBetraege(List<AufAbschlagProOrt> betraege) {
            this.betraege = betraege;
            return this;
        }

        /**
        * Bezeichnung des Auf-/Abschlags
        */
        public AufAbschlagRegionalBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * Gibt an in welcher Währungseinheit der Auf/Abschlag berechnet wird. Euro oder Ct.
        */
        public AufAbschlagRegionalBuilder setEinheit(Waehrungseinheit einheit) {
            this.einheit = einheit;
            return this;
        }

        /**
        * Änderungen in den Einschränkungen zum Tarif. Falls in dieser Komponenten angegeben,
        * werden die Tarifparameter hiermit überschrieben.
        */
        public AufAbschlagRegionalBuilder setEinschraenkungsaenderung(Tarifeinschraenkung einschraenkungsaenderung) {
            this.einschraenkungsaenderung = einschraenkungsaenderung;
            return this;
        }

        /**
        * Der Energiemix kann sich durch einen AufAbschlag ändern (z.B. zwei Cent Aufschlag für
        * Ökostrom:
        * Sollte dies der Fall sein, wird hier die neue Zusammensetzung des Energiemix angegeben.
        */
        public AufAbschlagRegionalBuilder setEnergiemixaenderung(Energiemix energiemixaenderung) {
            this.energiemixaenderung = energiemixaenderung;
            return this;
        }

        /**
        * Änderungen in den Garantievereinbarungen. Falls in dieser Komponenten angegeben,
        * werden die Tarifparameter hiermit überschrieben.
        */
        public AufAbschlagRegionalBuilder setGarantieaenderung(Preisgarantie garantieaenderung) {
            this.garantieaenderung = garantieaenderung;
            return this;
        }

        /**
        * Zeitraum, in dem der Abschlag zur Anwendung kommen kann
        */
        public AufAbschlagRegionalBuilder setGueltigkeitszeitraum(Zeitraum gueltigkeitszeitraum) {
            this.gueltigkeitszeitraum = gueltigkeitszeitraum;
            return this;
        }

        /**
        * Durch die Anwendung des Auf/Abschlags kann eine Änderung des Tarifnamens auftreten.
        */
        public AufAbschlagRegionalBuilder setTarifnamensaenderungen(String tarifnamensaenderungen) {
            this.tarifnamensaenderungen = tarifnamensaenderungen;
            return this;
        }

        /**
        * Änderungen in den Vertragskonditionen. Falls in dieser Komponenten angegeben,
        * werden die Tarifparameter hiermit überschrieben.
        */
        public AufAbschlagRegionalBuilder setVertagskonditionsaenderung(Vertragskonditionen vertagskonditionsaenderung) {
            this.vertagskonditionsaenderung = vertagskonditionsaenderung;
            return this;
        }

        /**
        * Voraussetzungen, die erfüllt sein müssen, damit dieser AufAbschlag zur Anwendung kommen
        * kann
        */
        public AufAbschlagRegionalBuilder setVoraussetzungen(List<String> voraussetzungen) {
            this.voraussetzungen = voraussetzungen;
            return this;
        }

        /**
        * Internetseite, auf der die Informationen zum Auf-/Abschlag veröffentlicht sind
        */
        public AufAbschlagRegionalBuilder setWebsite(String website) {
            this.website = website;
            return this;
        }

        /**
        * Zusatzprodukte, die nur in Kombination mit diesem AufAbschlag erhältlich sind
        */
        public AufAbschlagRegionalBuilder setZusatzprodukte(List<String> zusatzprodukte) {
            this.zusatzprodukte = zusatzprodukte;
            return this;
        }

        public AufAbschlagRegionalBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public AufAbschlagRegionalBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public AufAbschlagRegional build() {
            return new AufAbschlagRegional(this);
        }
    }
}