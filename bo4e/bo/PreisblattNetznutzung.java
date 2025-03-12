package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Preisposition;
import bo4e.com.Zeitraum;
import bo4e.enums.Bilanzierungsmethode;
import bo4e.enums.Kundengruppe;
import bo4e.enums.Netzebene;
import bo4e.enums.Preisstatus;
import bo4e.enums.Sparte;
import bo4e.enums.Typ;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Die Variante des Preisblattmodells zur Abbildung der Netznutzungspreise
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/PreisblattNetznutzung.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `PreisblattNetznutzung JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.5.0/src/bo4e_schemas/bo/PreisblattNetznutzung.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PreisblattNetznutzung extends Geschaeftsobjekt {
    private final Typ _typ = Typ.PREISBLATTNETZNUTZUNG;
    private String bezeichnung;
    private Bilanzierungsmethode bilanzierungsmethode;
    private Zeitraum gueltigkeit;
    private Marktteilnehmer herausgeber;
    private Kundengruppe kundengruppe;
    private Netzebene netzebene;
    private List<Preisposition> preispositionen;
    private Preisstatus preisstatus;
    private Sparte sparte;

    public PreisblattNetznutzung() {
    }

    private PreisblattNetznutzung(PreisblattNetznutzungBuilder builder) {
        super(builder);
        this.bezeichnung = builder.bezeichnung;
        this.bilanzierungsmethode = builder.bilanzierungsmethode;
        this.gueltigkeit = builder.gueltigkeit;
        this.herausgeber = builder.herausgeber;
        this.kundengruppe = builder.kundengruppe;
        this.netzebene = builder.netzebene;
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

    public Kundengruppe getKundengruppe() {
        return kundengruppe;
    }

    public void setKundengruppe(Kundengruppe kundengruppe) {
        this.kundengruppe = kundengruppe;
    }

    /**
    * Die Preise gelten für Marktlokationen in der angebebenen Netzebene
    */
    public Netzebene getNetzebene() {
        return netzebene;
    }

    /**
    * Die Preise gelten für Marktlokationen in der angebebenen Netzebene
    */
    public void setNetzebene(Netzebene netzebene) {
        this.netzebene = netzebene;
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

    public static PreisblattNetznutzungBuilder builder() {
        return new PreisblattNetznutzungBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class PreisblattNetznutzungBuilder extends GeschaeftsobjektBuilder {
        private String bezeichnung;
        private Bilanzierungsmethode bilanzierungsmethode;
        private Zeitraum gueltigkeit;
        private Marktteilnehmer herausgeber;
        private Kundengruppe kundengruppe;
        private Netzebene netzebene;
        private List<Preisposition> preispositionen;
        private Preisstatus preisstatus;
        private Sparte sparte;

        private PreisblattNetznutzungBuilder() {
        }

        /**
        * Eine Bezeichnung für das Preisblatt
        */
        public PreisblattNetznutzungBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * Die Preise gelten für Marktlokationen der angebebenen Bilanzierungsmethode
        */
        public PreisblattNetznutzungBuilder setBilanzierungsmethode(Bilanzierungsmethode bilanzierungsmethode) {
            this.bilanzierungsmethode = bilanzierungsmethode;
            return this;
        }

        /**
        * Der Zeitraum für den der Preis festgelegt ist
        */
        public PreisblattNetznutzungBuilder setGueltigkeit(Zeitraum gueltigkeit) {
            this.gueltigkeit = gueltigkeit;
            return this;
        }

        /**
        * Der Netzbetreiber, der die Preise veröffentlicht hat
        */
        public PreisblattNetznutzungBuilder setHerausgeber(Marktteilnehmer herausgeber) {
            this.herausgeber = herausgeber;
            return this;
        }

        public PreisblattNetznutzungBuilder setKundengruppe(Kundengruppe kundengruppe) {
            this.kundengruppe = kundengruppe;
            return this;
        }

        /**
        * Die Preise gelten für Marktlokationen in der angebebenen Netzebene
        */
        public PreisblattNetznutzungBuilder setNetzebene(Netzebene netzebene) {
            this.netzebene = netzebene;
            return this;
        }

        /**
        * Die einzelnen Positionen, die mit dem Preisblatt abgerechnet werden können. Z.B.
        * Arbeitspreis, Grundpreis etc
        */
        public PreisblattNetznutzungBuilder setPreispositionen(List<Preisposition> preispositionen) {
            this.preispositionen = preispositionen;
            return this;
        }

        /**
        * Merkmal, das anzeigt, ob es sich um vorläufige oder endgültige Preise handelt
        */
        public PreisblattNetznutzungBuilder setPreisstatus(Preisstatus preisstatus) {
            this.preisstatus = preisstatus;
            return this;
        }

        /**
        * Preisblatt gilt für angegebene Sparte
        */
        public PreisblattNetznutzungBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }

        public PreisblattNetznutzungBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public PreisblattNetznutzungBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public PreisblattNetznutzung build() {
            return new PreisblattNetznutzung(this);
        }
    }
}