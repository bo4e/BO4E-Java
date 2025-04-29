package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Preisposition;
import bo4e.com.Zeitraum;
import bo4e.enums.Bilanzierungsmethode;
import bo4e.enums.BoTyp;
import bo4e.enums.Dienstleistungstyp;
import bo4e.enums.Netzebene;
import bo4e.enums.Preisstatus;
import bo4e.enums.Sparte;

import java.util.List;

/**
* Variante des Preisblattmodells zur Abbildung der Preise für zusätzliche Hardware
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/PreisblattHardware.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `PreisblattHardware JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.7.0/src/bo4e_schemas/bo/PreisblattHardware.json>`_
*/
public class PreisblattHardware extends Geschaeftsobjekt {
    private final BoTyp _typ = BoTyp.PREISBLATTHARDWARE;
    private Geraet basisgeraet;
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

    public PreisblattHardware() {
    }

    private PreisblattHardware(PreisblattHardwareBuilder builder) {
        super(builder);
        this.basisgeraet = builder.basisgeraet;
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
    }

    public BoTyp get_typ() {
        return _typ;
    }

    /**
    * Der Preis betriftt das hier angegebene Gerät, z.B. ein Tarifschaltgerät
    */
    public Geraet getBasisgeraet() {
        return basisgeraet;
    }

    /**
    * Der Preis betriftt das hier angegebene Gerät, z.B. ein Tarifschaltgerät
    */
    public void setBasisgeraet(Geraet basisgeraet) {
        this.basisgeraet = basisgeraet;
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

    public static PreisblattHardwareBuilder builder() {
        return new PreisblattHardwareBuilder();
    }

    public static class PreisblattHardwareBuilder extends GeschaeftsobjektBuilder {
        private Geraet basisgeraet;
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

        private PreisblattHardwareBuilder() {
        }

        /**
        * Der Preis betriftt das hier angegebene Gerät, z.B. ein Tarifschaltgerät
        */
        public PreisblattHardwareBuilder setBasisgeraet(Geraet basisgeraet) {
            this.basisgeraet = basisgeraet;
            return this;
        }

        /**
        * Eine Bezeichnung für das Preisblatt
        */
        public PreisblattHardwareBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * Die Preise gelten für Marktlokationen der angebebenen Bilanzierungsmethode
        */
        public PreisblattHardwareBuilder setBilanzierungsmethode(Bilanzierungsmethode bilanzierungsmethode) {
            this.bilanzierungsmethode = bilanzierungsmethode;
            return this;
        }

        /**
        * Der Zeitraum für den der Preis festgelegt ist
        */
        public PreisblattHardwareBuilder setGueltigkeit(Zeitraum gueltigkeit) {
            this.gueltigkeit = gueltigkeit;
            return this;
        }

        /**
        * Der Netzbetreiber, der die Preise veröffentlicht hat
        */
        public PreisblattHardwareBuilder setHerausgeber(Marktteilnehmer herausgeber) {
            this.herausgeber = herausgeber;
            return this;
        }

        /**
        * Im Preis sind die hier angegebenen Dienstleistungen enthalten, z.B. Jährliche Ablesung
        */
        public PreisblattHardwareBuilder setInklusiveDienstleistungen(List<Dienstleistungstyp> inklusiveDienstleistungen) {
            this.inklusiveDienstleistungen = inklusiveDienstleistungen;
            return this;
        }

        /**
        * Im Preis sind die hier angegebenen Geräte mit enthalten, z.B. ein Wandler
        */
        public PreisblattHardwareBuilder setInklusiveGeraete(List<Geraet> inklusiveGeraete) {
            this.inklusiveGeraete = inklusiveGeraete;
            return this;
        }

        /**
        * Die Preise gelten für Messlokationen in der angebebenen Netzebene
        */
        public PreisblattHardwareBuilder setMessebene(Netzebene messebene) {
            this.messebene = messebene;
            return this;
        }

        /**
        * Die einzelnen Positionen, die mit dem Preisblatt abgerechnet werden können. Z.B.
        * Arbeitspreis, Grundpreis etc
        */
        public PreisblattHardwareBuilder setPreispositionen(List<Preisposition> preispositionen) {
            this.preispositionen = preispositionen;
            return this;
        }

        /**
        * Merkmal, das anzeigt, ob es sich um vorläufige oder endgültige Preise handelt
        */
        public PreisblattHardwareBuilder setPreisstatus(Preisstatus preisstatus) {
            this.preisstatus = preisstatus;
            return this;
        }

        /**
        * Preisblatt gilt für angegebene Sparte
        */
        public PreisblattHardwareBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }

        public PreisblattHardwareBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public PreisblattHardwareBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public PreisblattHardware build() {
            return new PreisblattHardware(this);
        }
    }
}