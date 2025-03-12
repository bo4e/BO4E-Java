package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Preisposition;
import bo4e.com.Zeitraum;
import bo4e.enums.KundengruppeKA;
import bo4e.enums.Preisstatus;
import bo4e.enums.Sparte;
import bo4e.enums.Typ;

import java.util.List;

/**
* Die Variante des Preisblattmodells zur Abbildung von allgemeinen Abgaben
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/PreisblattKonzessionsabgabe.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `PreisblattKonzessionsabgabe JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.5.0/src/bo4e_schemas/bo/PreisblattKonzessionsabgabe.json>`_
*/
public class PreisblattKonzessionsabgabe extends Geschaeftsobjekt {
    private final Typ _typ = Typ.PREISBLATTKONZESSIONSABGABE;
    private String bezeichnung;
    private Zeitraum gueltigkeit;
    private Marktteilnehmer herausgeber;
    private KundengruppeKA kundengruppeKA;
    private List<Preisposition> preispositionen;
    private Preisstatus preisstatus;
    private Sparte sparte;

    public PreisblattKonzessionsabgabe() {
    }

    private PreisblattKonzessionsabgabe(PreisblattKonzessionsabgabeBuilder builder) {
        super(builder);
        this.bezeichnung = builder.bezeichnung;
        this.gueltigkeit = builder.gueltigkeit;
        this.herausgeber = builder.herausgeber;
        this.kundengruppeKA = builder.kundengruppeKA;
        this.preispositionen = builder.preispositionen;
        this.preisstatus = builder.preisstatus;
        this.sparte = builder.sparte;
    }

    public Typ get_typ() {
        return _typ;
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
    * Kundegruppe anhand derer die Höhe der Konzessionabgabe festgelegt ist
    */
    public KundengruppeKA getKundengruppeKA() {
        return kundengruppeKA;
    }

    /**
    * Kundegruppe anhand derer die Höhe der Konzessionabgabe festgelegt ist
    */
    public void setKundengruppeKA(KundengruppeKA kundengruppeKA) {
        this.kundengruppeKA = kundengruppeKA;
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

    public static PreisblattKonzessionsabgabeBuilder builder() {
        return new PreisblattKonzessionsabgabeBuilder();
    }

    public static class PreisblattKonzessionsabgabeBuilder extends GeschaeftsobjektBuilder {
        private String bezeichnung;
        private Zeitraum gueltigkeit;
        private Marktteilnehmer herausgeber;
        private KundengruppeKA kundengruppeKA;
        private List<Preisposition> preispositionen;
        private Preisstatus preisstatus;
        private Sparte sparte;

        private PreisblattKonzessionsabgabeBuilder() {
        }

        /**
        * Eine Bezeichnung für das Preisblatt
        */
        public PreisblattKonzessionsabgabeBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * Der Zeitraum für den der Preis festgelegt ist
        */
        public PreisblattKonzessionsabgabeBuilder setGueltigkeit(Zeitraum gueltigkeit) {
            this.gueltigkeit = gueltigkeit;
            return this;
        }

        /**
        * Der Netzbetreiber, der die Preise veröffentlicht hat
        */
        public PreisblattKonzessionsabgabeBuilder setHerausgeber(Marktteilnehmer herausgeber) {
            this.herausgeber = herausgeber;
            return this;
        }

        /**
        * Kundegruppe anhand derer die Höhe der Konzessionabgabe festgelegt ist
        */
        public PreisblattKonzessionsabgabeBuilder setKundengruppeKA(KundengruppeKA kundengruppeKA) {
            this.kundengruppeKA = kundengruppeKA;
            return this;
        }

        /**
        * Die einzelnen Positionen, die mit dem Preisblatt abgerechnet werden können. Z.B.
        * Arbeitspreis, Grundpreis etc
        */
        public PreisblattKonzessionsabgabeBuilder setPreispositionen(List<Preisposition> preispositionen) {
            this.preispositionen = preispositionen;
            return this;
        }

        /**
        * Merkmal, das anzeigt, ob es sich um vorläufige oder endgültige Preise handelt
        */
        public PreisblattKonzessionsabgabeBuilder setPreisstatus(Preisstatus preisstatus) {
            this.preisstatus = preisstatus;
            return this;
        }

        /**
        * Preisblatt gilt für angegebene Sparte
        */
        public PreisblattKonzessionsabgabeBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }

        public PreisblattKonzessionsabgabeBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public PreisblattKonzessionsabgabeBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public PreisblattKonzessionsabgabe build() {
            return new PreisblattKonzessionsabgabe(this);
        }
    }
}