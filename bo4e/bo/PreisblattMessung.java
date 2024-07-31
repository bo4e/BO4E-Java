package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Preisposition;
import bo4e.com.Zeitraum;
import bo4e.enums.Bilanzierungsmethode;
import bo4e.enums.Dienstleistungstyp;
import bo4e.enums.Netzebene;
import bo4e.enums.Preisstatus;
import bo4e.enums.Sparte;
import bo4e.enums.Typ;

import java.util.List;

/**
 * Variante des Preisblattmodells zur Abbildung der Preise des Messstellenbetriebs und damit
 * verbundener Leistungen
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/PreisblattMessung.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `PreisblattMessung JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/bo/PreisblattMessung.json>`_
 */
public class PreisblattMessung extends Geschaeftsobjekt {
    private final Typ typ = Typ.PREISBLATTMESSUNG;
    private String bezeichnung;
    private Bilanzierungsmethode bilanzierungsmethode;
    private Zeitraum gueltigkeit;
    private Marktteilnehmer herausgeber;
    private List<Dienstleistungstyp> inklusiveDienstleistungen;
    private List<Geraet> inklusiveGeraete;
    private Netzebene messebene;
    private List<Preisposition> preispositionen;
    private Preisstatus preisstatus;
    private Sparte sparte;
    private Zaehler zaehler;

    public PreisblattMessung() {
    }

    private PreisblattMessung(PreisblattMessungBuilder builder) {
        super(builder);
        this.bezeichnung = builder.bezeichnung;
        this.bilanzierungsmethode = builder.bilanzierungsmethode;
        this.gueltigkeit = builder.gueltigkeit;
        this.herausgeber = builder.herausgeber;
        this.inklusiveDienstleistungen = builder.inklusiveDienstleistungen;
        this.inklusiveGeraete = builder.inklusiveGeraete;
        this.messebene = builder.messebene;
        this.preispositionen = builder.preispositionen;
        this.preisstatus = builder.preisstatus;
        this.sparte = builder.sparte;
        this.zaehler = builder.zaehler;
    }

    public Typ getTyp() {
        return typ;
    }

    /**
     * Eine Bezeichnung für das Preisblatt
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Eine Bezeichnung für das Preisblatt
     */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
     * Die Preise gelten für Marktlokationen der angebebenen Bilanzierungsmethode
     */
    public Bilanzierungsmethode getBilanzierungsmethode() {
        return bilanzierungsmethode;
    }

    /**
     * Die Preise gelten für Marktlokationen der angebebenen Bilanzierungsmethode
     */
    public void setBilanzierungsmethode(Bilanzierungsmethode bilanzierungsmethode) {
        this.bilanzierungsmethode = bilanzierungsmethode;
    }

    /**
     * Der Zeitraum für den der Preis festgelegt ist
     */
    public Zeitraum getGueltigkeit() {
        return gueltigkeit;
    }

    /**
     * Der Zeitraum für den der Preis festgelegt ist
     */
    public void setGueltigkeit(Zeitraum gueltigkeit) {
        this.gueltigkeit = gueltigkeit;
    }

    /**
     * Der Netzbetreiber, der die Preise veröffentlicht hat
     */
    public Marktteilnehmer getHerausgeber() {
        return herausgeber;
    }

    /**
     * Der Netzbetreiber, der die Preise veröffentlicht hat
     */
    public void setHerausgeber(Marktteilnehmer herausgeber) {
        this.herausgeber = herausgeber;
    }

    /**
     * Im Preis sind die hier angegebenen Dienstleistungen enthalten, z.B. Jährliche Ablesung
     */
    public List<Dienstleistungstyp> getInklusiveDienstleistungen() {
        return inklusiveDienstleistungen;
    }

    /**
     * Im Preis sind die hier angegebenen Dienstleistungen enthalten, z.B. Jährliche Ablesung
     */
    public void setInklusiveDienstleistungen(List<Dienstleistungstyp> inklusiveDienstleistungen) {
        this.inklusiveDienstleistungen = inklusiveDienstleistungen;
    }

    /**
     * Im Preis sind die hier angegebenen Geräte mit enthalten, z.B. ein Wandler
     */
    public List<Geraet> getInklusiveGeraete() {
        return inklusiveGeraete;
    }

    /**
     * Im Preis sind die hier angegebenen Geräte mit enthalten, z.B. ein Wandler
     */
    public void setInklusiveGeraete(List<Geraet> inklusiveGeraete) {
        this.inklusiveGeraete = inklusiveGeraete;
    }

    /**
     * Die Preise gelten für Messlokationen in der angebebenen Netzebene
     */
    public Netzebene getMessebene() {
        return messebene;
    }

    /**
     * Die Preise gelten für Messlokationen in der angebebenen Netzebene
     */
    public void setMessebene(Netzebene messebene) {
        this.messebene = messebene;
    }

    /**
     * Die einzelnen Positionen, die mit dem Preisblatt abgerechnet werden können. Z.B.
     * Arbeitspreis, Grundpreis etc
     */
    public List<Preisposition> getPreispositionen() {
        return preispositionen;
    }

    /**
     * Die einzelnen Positionen, die mit dem Preisblatt abgerechnet werden können. Z.B.
     * Arbeitspreis, Grundpreis etc
     */
    public void setPreispositionen(List<Preisposition> preispositionen) {
        this.preispositionen = preispositionen;
    }

    /**
     * Merkmal, das anzeigt, ob es sich um vorläufige oder endgültige Preise handelt
     */
    public Preisstatus getPreisstatus() {
        return preisstatus;
    }

    /**
     * Merkmal, das anzeigt, ob es sich um vorläufige oder endgültige Preise handelt
     */
    public void setPreisstatus(Preisstatus preisstatus) {
        this.preisstatus = preisstatus;
    }

    /**
     * Preisblatt gilt für angegebene Sparte
     */
    public Sparte getSparte() {
        return sparte;
    }

    /**
     * Preisblatt gilt für angegebene Sparte
     */
    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    /**
     * Der Preis betrifft den hier angegebenen Zähler, z.B. einen Drehstromzähler
     */
    public Zaehler getZaehler() {
        return zaehler;
    }

    /**
     * Der Preis betrifft den hier angegebenen Zähler, z.B. einen Drehstromzähler
     */
    public void setZaehler(Zaehler zaehler) {
        this.zaehler = zaehler;
    }

    public static PreisblattMessungBuilder builder() {
        return new PreisblattMessungBuilder();
    }

    public static class PreisblattMessungBuilder extends GeschaeftsobjektBuilder {
        private String bezeichnung;
        private Bilanzierungsmethode bilanzierungsmethode;
        private Zeitraum gueltigkeit;
        private Marktteilnehmer herausgeber;
        private List<Dienstleistungstyp> inklusiveDienstleistungen;
        private List<Geraet> inklusiveGeraete;
        private Netzebene messebene;
        private List<Preisposition> preispositionen;
        private Preisstatus preisstatus;
        private Sparte sparte;
        private Zaehler zaehler;

        private PreisblattMessungBuilder() {
        }

        /**
         * Eine Bezeichnung für das Preisblatt
         */
        public String getBezeichnung() {
            return bezeichnung;
        }

        /**
         * Eine Bezeichnung für das Preisblatt
         */
        public PreisblattMessungBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
         * Die Preise gelten für Marktlokationen der angebebenen Bilanzierungsmethode
         */
        public Bilanzierungsmethode getBilanzierungsmethode() {
            return bilanzierungsmethode;
        }

        /**
         * Die Preise gelten für Marktlokationen der angebebenen Bilanzierungsmethode
         */
        public PreisblattMessungBuilder setBilanzierungsmethode(Bilanzierungsmethode bilanzierungsmethode) {
            this.bilanzierungsmethode = bilanzierungsmethode;
            return this;
        }

        /**
         * Der Zeitraum für den der Preis festgelegt ist
         */
        public Zeitraum getGueltigkeit() {
            return gueltigkeit;
        }

        /**
         * Der Zeitraum für den der Preis festgelegt ist
         */
        public PreisblattMessungBuilder setGueltigkeit(Zeitraum gueltigkeit) {
            this.gueltigkeit = gueltigkeit;
            return this;
        }

        /**
         * Der Netzbetreiber, der die Preise veröffentlicht hat
         */
        public Marktteilnehmer getHerausgeber() {
            return herausgeber;
        }

        /**
         * Der Netzbetreiber, der die Preise veröffentlicht hat
         */
        public PreisblattMessungBuilder setHerausgeber(Marktteilnehmer herausgeber) {
            this.herausgeber = herausgeber;
            return this;
        }

        /**
         * Im Preis sind die hier angegebenen Dienstleistungen enthalten, z.B. Jährliche Ablesung
         */
        public List<Dienstleistungstyp> getInklusiveDienstleistungen() {
            return inklusiveDienstleistungen;
        }

        /**
         * Im Preis sind die hier angegebenen Dienstleistungen enthalten, z.B. Jährliche Ablesung
         */
        public PreisblattMessungBuilder setInklusiveDienstleistungen(List<Dienstleistungstyp> inklusiveDienstleistungen) {
            this.inklusiveDienstleistungen = inklusiveDienstleistungen;
            return this;
        }

        /**
         * Im Preis sind die hier angegebenen Geräte mit enthalten, z.B. ein Wandler
         */
        public List<Geraet> getInklusiveGeraete() {
            return inklusiveGeraete;
        }

        /**
         * Im Preis sind die hier angegebenen Geräte mit enthalten, z.B. ein Wandler
         */
        public PreisblattMessungBuilder setInklusiveGeraete(List<Geraet> inklusiveGeraete) {
            this.inklusiveGeraete = inklusiveGeraete;
            return this;
        }

        /**
         * Die Preise gelten für Messlokationen in der angebebenen Netzebene
         */
        public Netzebene getMessebene() {
            return messebene;
        }

        /**
         * Die Preise gelten für Messlokationen in der angebebenen Netzebene
         */
        public PreisblattMessungBuilder setMessebene(Netzebene messebene) {
            this.messebene = messebene;
            return this;
        }

        /**
         * Die einzelnen Positionen, die mit dem Preisblatt abgerechnet werden können. Z.B.
         * Arbeitspreis, Grundpreis etc
         */
        public List<Preisposition> getPreispositionen() {
            return preispositionen;
        }

        /**
         * Die einzelnen Positionen, die mit dem Preisblatt abgerechnet werden können. Z.B.
         * Arbeitspreis, Grundpreis etc
         */
        public PreisblattMessungBuilder setPreispositionen(List<Preisposition> preispositionen) {
            this.preispositionen = preispositionen;
            return this;
        }

        /**
         * Merkmal, das anzeigt, ob es sich um vorläufige oder endgültige Preise handelt
         */
        public Preisstatus getPreisstatus() {
            return preisstatus;
        }

        /**
         * Merkmal, das anzeigt, ob es sich um vorläufige oder endgültige Preise handelt
         */
        public PreisblattMessungBuilder setPreisstatus(Preisstatus preisstatus) {
            this.preisstatus = preisstatus;
            return this;
        }

        /**
         * Preisblatt gilt für angegebene Sparte
         */
        public Sparte getSparte() {
            return sparte;
        }

        /**
         * Preisblatt gilt für angegebene Sparte
         */
        public PreisblattMessungBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }

        /**
         * Der Preis betrifft den hier angegebenen Zähler, z.B. einen Drehstromzähler
         */
        public Zaehler getZaehler() {
            return zaehler;
        }

        /**
         * Der Preis betrifft den hier angegebenen Zähler, z.B. einen Drehstromzähler
         */
        public PreisblattMessungBuilder setZaehler(Zaehler zaehler) {
            this.zaehler = zaehler;
            return this;
        }

        public PreisblattMessungBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public PreisblattMessungBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public PreisblattMessung build() {
            return new PreisblattMessung(this);
        }
    }
}