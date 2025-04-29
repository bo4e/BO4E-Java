package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Preisposition;
import bo4e.com.Zeitraum;
import bo4e.enums.BoTyp;
import bo4e.enums.Preisstatus;
import bo4e.enums.Sparte;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Das allgemeine Modell zur Abbildung von Preisen;
* Davon abgeleitet können, über die Zuordnung identifizierender Merkmale, spezielle
* Preisblatt-Varianten modelliert
* werden.
*
* Die jeweiligen Sätze von Merkmalen sind in der Grafik ergänzt worden und stellen jeweils
* eine Ausprägung für die
* verschiedenen Anwendungsfälle der Preisblätter dar.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Preisblatt.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Preisblatt JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.7.0/src/bo4e_schemas/bo/Preisblatt.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Preisblatt extends Geschaeftsobjekt {
    private final BoTyp _typ = BoTyp.PREISBLATT;
    private String bezeichnung;
    private Zeitraum gueltigkeit;
    private Marktteilnehmer herausgeber;
    private List<Preisposition> preispositionen;
    private Preisstatus preisstatus;
    private Sparte sparte;

    public Preisblatt() {
    }

    private Preisblatt(PreisblattBuilder builder) {
        super(builder);
        this.bezeichnung = builder.bezeichnung;
        this.gueltigkeit = builder.gueltigkeit;
        this.herausgeber = builder.herausgeber;
        this.preispositionen = builder.preispositionen;
        this.preisstatus = builder.preisstatus;
        this.sparte = builder.sparte;
    }

    public BoTyp get_typ() {
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

    public static PreisblattBuilder builder() {
        return new PreisblattBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class PreisblattBuilder extends GeschaeftsobjektBuilder {
        private String bezeichnung;
        private Zeitraum gueltigkeit;
        private Marktteilnehmer herausgeber;
        private List<Preisposition> preispositionen;
        private Preisstatus preisstatus;
        private Sparte sparte;

        private PreisblattBuilder() {
        }

        /**
        * Eine Bezeichnung für das Preisblatt
        */
        public PreisblattBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * Der Zeitraum für den der Preis festgelegt ist
        */
        public PreisblattBuilder setGueltigkeit(Zeitraum gueltigkeit) {
            this.gueltigkeit = gueltigkeit;
            return this;
        }

        /**
        * Der Netzbetreiber, der die Preise veröffentlicht hat
        */
        public PreisblattBuilder setHerausgeber(Marktteilnehmer herausgeber) {
            this.herausgeber = herausgeber;
            return this;
        }

        /**
        * Die einzelnen Positionen, die mit dem Preisblatt abgerechnet werden können. Z.B.
        * Arbeitspreis, Grundpreis etc
        */
        public PreisblattBuilder setPreispositionen(List<Preisposition> preispositionen) {
            this.preispositionen = preispositionen;
            return this;
        }

        /**
        * Merkmal, das anzeigt, ob es sich um vorläufige oder endgültige Preise handelt
        */
        public PreisblattBuilder setPreisstatus(Preisstatus preisstatus) {
            this.preisstatus = preisstatus;
            return this;
        }

        /**
        * Preisblatt gilt für angegebene Sparte
        */
        public PreisblattBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }

        public PreisblattBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public PreisblattBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Preisblatt build() {
            return new Preisblatt(this);
        }
    }
}