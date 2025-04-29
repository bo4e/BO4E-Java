package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import bo4e.enums.Preismodell;
import bo4e.enums.Rechnungslegung;
import bo4e.enums.Sparte;
import bo4e.enums.Vertragsform;

import java.util.List;

/**
* Eine Komponente zur Abbildung einzelner Lose einer Ausschreibung
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Ausschreibungslos.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Ausschreibungslos JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.7.0/src/bo4e_schemas/com/Ausschreibungslos.json>`_
*/
public class Ausschreibungslos extends COM {
    private final ComTyp _typ = ComTyp.AUSSCHREIBUNGSLOS;
    private Long anzahlLieferstellen;
    private String bemerkung;
    private String betreutDurch;
    private String bezeichnung;
    private Sparte energieart;
    private Menge gesamtMenge;
    private List<Ausschreibungsdetail> lieferstellen;
    private Zeitraum lieferzeitraum;
    private String losnummer;
    private Preismodell preismodell;
    private Zeitraum wiederholungsintervall;
    private Zeitraum wunschKuendingungsfrist;
    private Menge wunschMaximalmenge;
    private Menge wunschMindestmenge;
    private Rechnungslegung wunschRechnungslegung;
    private Vertragsform wunschVertragsform;
    private Zeitraum wunschZahlungsziel;

    public Ausschreibungslos() {
    }

    private Ausschreibungslos(AusschreibungslosBuilder builder) {
        super(builder);
        this.anzahlLieferstellen = builder.anzahlLieferstellen;
        this.bemerkung = builder.bemerkung;
        this.betreutDurch = builder.betreutDurch;
        this.bezeichnung = builder.bezeichnung;
        this.energieart = builder.energieart;
        this.gesamtMenge = builder.gesamtMenge;
        this.lieferstellen = builder.lieferstellen;
        this.lieferzeitraum = builder.lieferzeitraum;
        this.losnummer = builder.losnummer;
        this.preismodell = builder.preismodell;
        this.wiederholungsintervall = builder.wiederholungsintervall;
        this.wunschKuendingungsfrist = builder.wunschKuendingungsfrist;
        this.wunschMaximalmenge = builder.wunschMaximalmenge;
        this.wunschMindestmenge = builder.wunschMindestmenge;
        this.wunschRechnungslegung = builder.wunschRechnungslegung;
        this.wunschVertragsform = builder.wunschVertragsform;
        this.wunschZahlungsziel = builder.wunschZahlungsziel;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Anzahl der Lieferstellen in dieser Ausschreibung
    */
    public Long getAnzahlLieferstellen() {
        return anzahlLieferstellen;
    }

    /**
    * Anzahl der Lieferstellen in dieser Ausschreibung
    */
    public void setAnzahlLieferstellen(Long anzahlLieferstellen) {
        this.anzahlLieferstellen = anzahlLieferstellen;
    }

    /**
    * Bemerkung des Kunden zum Los
    */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
    * Bemerkung des Kunden zum Los
    */
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    /**
    * Name des Lizenzpartners
    */
    public String getBetreutDurch() {
        return betreutDurch;
    }

    /**
    * Name des Lizenzpartners
    */
    public void setBetreutDurch(String betreutDurch) {
        this.betreutDurch = betreutDurch;
    }

    /**
    * Bezeichnung der Ausschreibung
    */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
    * Bezeichnung der Ausschreibung
    */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
    * Unterscheidungsmöglichkeiten für die Sparte
    */
    public Sparte getEnergieart() {
        return energieart;
    }

    /**
    * Unterscheidungsmöglichkeiten für die Sparte
    */
    public void setEnergieart(Sparte energieart) {
        this.energieart = energieart;
    }

    /**
    * Gibt den Gesamtjahresverbrauch (z.B. in kWh) aller in diesem Los enthaltenen
    * Lieferstellen an
    */
    public Menge getGesamtMenge() {
        return gesamtMenge;
    }

    /**
    * Gibt den Gesamtjahresverbrauch (z.B. in kWh) aller in diesem Los enthaltenen
    * Lieferstellen an
    */
    public void setGesamtMenge(Menge gesamtMenge) {
        this.gesamtMenge = gesamtMenge;
    }

    /**
    * Die ausgeschriebenen Lieferstellen
    */
    public List<Ausschreibungsdetail> getLieferstellen() {
        return lieferstellen;
    }

    /**
    * Die ausgeschriebenen Lieferstellen
    */
    public void setLieferstellen(List<Ausschreibungsdetail> lieferstellen) {
        this.lieferstellen = lieferstellen;
    }

    /**
    * Zeitraum, für den die in diesem Los enthaltenen Lieferstellen beliefert werden sollen
    */
    public Zeitraum getLieferzeitraum() {
        return lieferzeitraum;
    }

    /**
    * Zeitraum, für den die in diesem Los enthaltenen Lieferstellen beliefert werden sollen
    */
    public void setLieferzeitraum(Zeitraum lieferzeitraum) {
        this.lieferzeitraum = lieferzeitraum;
    }

    /**
    * Laufende Nummer des Loses
    */
    public String getLosnummer() {
        return losnummer;
    }

    /**
    * Laufende Nummer des Loses
    */
    public void setLosnummer(String losnummer) {
        this.losnummer = losnummer;
    }

    /**
    * Bezeichnung der Preismodelle in Ausschreibungen für die Energielieferung
    */
    public Preismodell getPreismodell() {
        return preismodell;
    }

    /**
    * Bezeichnung der Preismodelle in Ausschreibungen für die Energielieferung
    */
    public void setPreismodell(Preismodell preismodell) {
        this.preismodell = preismodell;
    }

    /**
    * In welchem Intervall die Angebotsabgabe wiederholt werden darf.
    * Angabe nur gesetzt für die 2. Phase bei öffentlich-rechtlichen Ausschreibungen
    */
    public Zeitraum getWiederholungsintervall() {
        return wiederholungsintervall;
    }

    /**
    * In welchem Intervall die Angebotsabgabe wiederholt werden darf.
    * Angabe nur gesetzt für die 2. Phase bei öffentlich-rechtlichen Ausschreibungen
    */
    public void setWiederholungsintervall(Zeitraum wiederholungsintervall) {
        this.wiederholungsintervall = wiederholungsintervall;
    }

    /**
    * Kundenwunsch zur Kündigungsfrist in der Ausschreibung
    */
    public Zeitraum getWunschKuendingungsfrist() {
        return wunschKuendingungsfrist;
    }

    /**
    * Kundenwunsch zur Kündigungsfrist in der Ausschreibung
    */
    public void setWunschKuendingungsfrist(Zeitraum wunschKuendingungsfrist) {
        this.wunschKuendingungsfrist = wunschKuendingungsfrist;
    }

    /**
    * Maximalmenge Toleranzband (kWh, %)
    */
    public Menge getWunschMaximalmenge() {
        return wunschMaximalmenge;
    }

    /**
    * Maximalmenge Toleranzband (kWh, %)
    */
    public void setWunschMaximalmenge(Menge wunschMaximalmenge) {
        this.wunschMaximalmenge = wunschMaximalmenge;
    }

    /**
    * Mindesmenge Toleranzband (kWh, %)
    */
    public Menge getWunschMindestmenge() {
        return wunschMindestmenge;
    }

    /**
    * Mindesmenge Toleranzband (kWh, %)
    */
    public void setWunschMindestmenge(Menge wunschMindestmenge) {
        this.wunschMindestmenge = wunschMindestmenge;
    }

    /**
    * Aufzählung der Möglichkeiten zur Rechnungslegung in Ausschreibungen
    */
    public Rechnungslegung getWunschRechnungslegung() {
        return wunschRechnungslegung;
    }

    /**
    * Aufzählung der Möglichkeiten zur Rechnungslegung in Ausschreibungen
    */
    public void setWunschRechnungslegung(Rechnungslegung wunschRechnungslegung) {
        this.wunschRechnungslegung = wunschRechnungslegung;
    }

    /**
    * Aufzählung der Möglichkeiten zu Vertragsformen in Ausschreibungen
    */
    public Vertragsform getWunschVertragsform() {
        return wunschVertragsform;
    }

    /**
    * Aufzählung der Möglichkeiten zu Vertragsformen in Ausschreibungen
    */
    public void setWunschVertragsform(Vertragsform wunschVertragsform) {
        this.wunschVertragsform = wunschVertragsform;
    }

    /**
    * Kundenwunsch zum Zahlungsziel in der Ausschreibung
    */
    public Zeitraum getWunschZahlungsziel() {
        return wunschZahlungsziel;
    }

    /**
    * Kundenwunsch zum Zahlungsziel in der Ausschreibung
    */
    public void setWunschZahlungsziel(Zeitraum wunschZahlungsziel) {
        this.wunschZahlungsziel = wunschZahlungsziel;
    }

    public static AusschreibungslosBuilder builder() {
        return new AusschreibungslosBuilder();
    }

    public static class AusschreibungslosBuilder extends COMBuilder {
        private Long anzahlLieferstellen;
        private String bemerkung;
        private String betreutDurch;
        private String bezeichnung;
        private Sparte energieart;
        private Menge gesamtMenge;
        private List<Ausschreibungsdetail> lieferstellen;
        private Zeitraum lieferzeitraum;
        private String losnummer;
        private Preismodell preismodell;
        private Zeitraum wiederholungsintervall;
        private Zeitraum wunschKuendingungsfrist;
        private Menge wunschMaximalmenge;
        private Menge wunschMindestmenge;
        private Rechnungslegung wunschRechnungslegung;
        private Vertragsform wunschVertragsform;
        private Zeitraum wunschZahlungsziel;

        private AusschreibungslosBuilder() {
        }

        /**
        * Anzahl der Lieferstellen in dieser Ausschreibung
        */
        public AusschreibungslosBuilder setAnzahlLieferstellen(Long anzahlLieferstellen) {
            this.anzahlLieferstellen = anzahlLieferstellen;
            return this;
        }

        /**
        * Bemerkung des Kunden zum Los
        */
        public AusschreibungslosBuilder setBemerkung(String bemerkung) {
            this.bemerkung = bemerkung;
            return this;
        }

        /**
        * Name des Lizenzpartners
        */
        public AusschreibungslosBuilder setBetreutDurch(String betreutDurch) {
            this.betreutDurch = betreutDurch;
            return this;
        }

        /**
        * Bezeichnung der Ausschreibung
        */
        public AusschreibungslosBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * Unterscheidungsmöglichkeiten für die Sparte
        */
        public AusschreibungslosBuilder setEnergieart(Sparte energieart) {
            this.energieart = energieart;
            return this;
        }

        /**
        * Gibt den Gesamtjahresverbrauch (z.B. in kWh) aller in diesem Los enthaltenen
        * Lieferstellen an
        */
        public AusschreibungslosBuilder setGesamtMenge(Menge gesamtMenge) {
            this.gesamtMenge = gesamtMenge;
            return this;
        }

        /**
        * Die ausgeschriebenen Lieferstellen
        */
        public AusschreibungslosBuilder setLieferstellen(List<Ausschreibungsdetail> lieferstellen) {
            this.lieferstellen = lieferstellen;
            return this;
        }

        /**
        * Zeitraum, für den die in diesem Los enthaltenen Lieferstellen beliefert werden sollen
        */
        public AusschreibungslosBuilder setLieferzeitraum(Zeitraum lieferzeitraum) {
            this.lieferzeitraum = lieferzeitraum;
            return this;
        }

        /**
        * Laufende Nummer des Loses
        */
        public AusschreibungslosBuilder setLosnummer(String losnummer) {
            this.losnummer = losnummer;
            return this;
        }

        /**
        * Bezeichnung der Preismodelle in Ausschreibungen für die Energielieferung
        */
        public AusschreibungslosBuilder setPreismodell(Preismodell preismodell) {
            this.preismodell = preismodell;
            return this;
        }

        /**
        * In welchem Intervall die Angebotsabgabe wiederholt werden darf.
        * Angabe nur gesetzt für die 2. Phase bei öffentlich-rechtlichen Ausschreibungen
        */
        public AusschreibungslosBuilder setWiederholungsintervall(Zeitraum wiederholungsintervall) {
            this.wiederholungsintervall = wiederholungsintervall;
            return this;
        }

        /**
        * Kundenwunsch zur Kündigungsfrist in der Ausschreibung
        */
        public AusschreibungslosBuilder setWunschKuendingungsfrist(Zeitraum wunschKuendingungsfrist) {
            this.wunschKuendingungsfrist = wunschKuendingungsfrist;
            return this;
        }

        /**
        * Maximalmenge Toleranzband (kWh, %)
        */
        public AusschreibungslosBuilder setWunschMaximalmenge(Menge wunschMaximalmenge) {
            this.wunschMaximalmenge = wunschMaximalmenge;
            return this;
        }

        /**
        * Mindesmenge Toleranzband (kWh, %)
        */
        public AusschreibungslosBuilder setWunschMindestmenge(Menge wunschMindestmenge) {
            this.wunschMindestmenge = wunschMindestmenge;
            return this;
        }

        /**
        * Aufzählung der Möglichkeiten zur Rechnungslegung in Ausschreibungen
        */
        public AusschreibungslosBuilder setWunschRechnungslegung(Rechnungslegung wunschRechnungslegung) {
            this.wunschRechnungslegung = wunschRechnungslegung;
            return this;
        }

        /**
        * Aufzählung der Möglichkeiten zu Vertragsformen in Ausschreibungen
        */
        public AusschreibungslosBuilder setWunschVertragsform(Vertragsform wunschVertragsform) {
            this.wunschVertragsform = wunschVertragsform;
            return this;
        }

        /**
        * Kundenwunsch zum Zahlungsziel in der Ausschreibung
        */
        public AusschreibungslosBuilder setWunschZahlungsziel(Zeitraum wunschZahlungsziel) {
            this.wunschZahlungsziel = wunschZahlungsziel;
            return this;
        }

        public AusschreibungslosBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public AusschreibungslosBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Ausschreibungslos build() {
            return new Ausschreibungslos(this);
        }
    }
}