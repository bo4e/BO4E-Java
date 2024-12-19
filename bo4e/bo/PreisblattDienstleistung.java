package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Preisposition;
import bo4e.com.Zeitraum;
import bo4e.enums.Bilanzierungsmethode;
import bo4e.enums.Dienstleistungstyp;
import bo4e.enums.Preisstatus;
import bo4e.enums.Sparte;
import bo4e.enums.Typ;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Variante des Preisblattmodells zur Abbildung der Preise für wahlfreie Dienstleistungen
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/PreisblattDienstleistung.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `PreisblattDienstleistung JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/bo/PreisblattDienstleistung.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PreisblattDienstleistung extends Geschaeftsobjekt {
    private final Typ typ = Typ.PREISBLATTDIENSTLEISTUNG;
    private Dienstleistungstyp basisdienstleistung;
    private String bezeichnung;
    private Bilanzierungsmethode bilanzierungsmethode;
    private Geraet geraetedetails;
    private Zeitraum gueltigkeit;
    private Marktteilnehmer herausgeber;
    private List<Dienstleistungstyp> inklusiveDienstleistungen;
    private List<Preisposition> preispositionen;
    private Preisstatus preisstatus;
    private Sparte sparte;

    public PreisblattDienstleistung() {
    }

    private PreisblattDienstleistung(PreisblattDienstleistungBuilder builder) {
        super(builder);
        this.basisdienstleistung = builder.basisdienstleistung;
        this.bezeichnung = builder.bezeichnung;
        this.bilanzierungsmethode = builder.bilanzierungsmethode;
        this.geraetedetails = builder.geraetedetails;
        this.gueltigkeit = builder.gueltigkeit;
        this.herausgeber = builder.herausgeber;
        this.inklusiveDienstleistungen = builder.inklusiveDienstleistungen;
        this.preispositionen = builder.preispositionen;
        this.preisstatus = builder.preisstatus;
        this.sparte = builder.sparte;
    }

    public Typ getTyp() {
        return typ;
    }

    /**
    * Dienstleistung, für die der Preis abgebildet wird, z.B. Sperrung/Entsperrung
    */
    public Dienstleistungstyp getBasisdienstleistung() {
        return basisdienstleistung;
    }

    /**
    * Dienstleistung, für die der Preis abgebildet wird, z.B. Sperrung/Entsperrung
    */
    public void setBasisdienstleistung(Dienstleistungstyp basisdienstleistung) {
        this.basisdienstleistung = basisdienstleistung;
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
    * Hier kann der Preis auf bestimmte Geräte eingegrenzt werden. Z.B. auf die Zählergröße
    */
    public Geraet getGeraetedetails() {
        return geraetedetails;
    }

    /**
    * Hier kann der Preis auf bestimmte Geräte eingegrenzt werden. Z.B. auf die Zählergröße
    */
    public void setGeraetedetails(Geraet geraetedetails) {
        this.geraetedetails = geraetedetails;
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
    * Weitere Dienstleistungen, die im Preis enthalten sind
    */
    public List<Dienstleistungstyp> getInklusiveDienstleistungen() {
        return inklusiveDienstleistungen;
    }

    /**
    * Weitere Dienstleistungen, die im Preis enthalten sind
    */
    public void setInklusiveDienstleistungen(List<Dienstleistungstyp> inklusiveDienstleistungen) {
        this.inklusiveDienstleistungen = inklusiveDienstleistungen;
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

    public static PreisblattDienstleistungBuilder builder() {
        return new PreisblattDienstleistungBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class PreisblattDienstleistungBuilder extends GeschaeftsobjektBuilder {
        private Dienstleistungstyp basisdienstleistung;
        private String bezeichnung;
        private Bilanzierungsmethode bilanzierungsmethode;
        private Geraet geraetedetails;
        private Zeitraum gueltigkeit;
        private Marktteilnehmer herausgeber;
        private List<Dienstleistungstyp> inklusiveDienstleistungen;
        private List<Preisposition> preispositionen;
        private Preisstatus preisstatus;
        private Sparte sparte;

        private PreisblattDienstleistungBuilder() {
        }

        /**
        * Dienstleistung, für die der Preis abgebildet wird, z.B. Sperrung/Entsperrung
        */
        public PreisblattDienstleistungBuilder setBasisdienstleistung(Dienstleistungstyp basisdienstleistung) {
            this.basisdienstleistung = basisdienstleistung;
            return this;
        }

        /**
        * Eine Bezeichnung für das Preisblatt
        */
        public PreisblattDienstleistungBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * Die Preise gelten für Marktlokationen der angebebenen Bilanzierungsmethode
        */
        public PreisblattDienstleistungBuilder setBilanzierungsmethode(Bilanzierungsmethode bilanzierungsmethode) {
            this.bilanzierungsmethode = bilanzierungsmethode;
            return this;
        }

        /**
        * Hier kann der Preis auf bestimmte Geräte eingegrenzt werden. Z.B. auf die Zählergröße
        */
        public PreisblattDienstleistungBuilder setGeraetedetails(Geraet geraetedetails) {
            this.geraetedetails = geraetedetails;
            return this;
        }

        /**
        * Der Zeitraum für den der Preis festgelegt ist
        */
        public PreisblattDienstleistungBuilder setGueltigkeit(Zeitraum gueltigkeit) {
            this.gueltigkeit = gueltigkeit;
            return this;
        }

        /**
        * Der Netzbetreiber, der die Preise veröffentlicht hat
        */
        public PreisblattDienstleistungBuilder setHerausgeber(Marktteilnehmer herausgeber) {
            this.herausgeber = herausgeber;
            return this;
        }

        /**
        * Weitere Dienstleistungen, die im Preis enthalten sind
        */
        public PreisblattDienstleistungBuilder setInklusiveDienstleistungen(List<Dienstleistungstyp> inklusiveDienstleistungen) {
            this.inklusiveDienstleistungen = inklusiveDienstleistungen;
            return this;
        }

        /**
        * Die einzelnen Positionen, die mit dem Preisblatt abgerechnet werden können. Z.B.
        * Arbeitspreis, Grundpreis etc
        */
        public PreisblattDienstleistungBuilder setPreispositionen(List<Preisposition> preispositionen) {
            this.preispositionen = preispositionen;
            return this;
        }

        /**
        * Merkmal, das anzeigt, ob es sich um vorläufige oder endgültige Preise handelt
        */
        public PreisblattDienstleistungBuilder setPreisstatus(Preisstatus preisstatus) {
            this.preisstatus = preisstatus;
            return this;
        }

        /**
        * Preisblatt gilt für angegebene Sparte
        */
        public PreisblattDienstleistungBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }

        public PreisblattDienstleistungBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public PreisblattDienstleistungBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public PreisblattDienstleistung build() {
            return new PreisblattDienstleistung(this);
        }
    }
}