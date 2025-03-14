package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Unterschrift;
import bo4e.com.Vertragskonditionen;
import bo4e.enums.Sparte;
import bo4e.enums.Typ;
import bo4e.enums.Vertragsart;
import bo4e.enums.Vertragsstatus;

import java.time.OffsetDateTime;
import java.util.List;

/**
* Abbildung eines Bündelvertrags.
* Es handelt sich hierbei um eine Liste von Einzelverträgen, die in einem Vertragsobjekt
* gebündelt sind.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Buendelvertrag.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Buendelvertrag JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.6.0/src/bo4e_schemas/bo/Buendelvertrag.json>`_
*/
public class Buendelvertrag extends Geschaeftsobjekt {
    private final Typ _typ = Typ.BUENDELVERTRAG;
    private String beschreibung;
    private List<Vertrag> einzelvertraege;
    private Sparte sparte;
    private List<Unterschrift> unterzeichnervp1;
    private List<Unterschrift> unterzeichnervp2;
    private Vertragsart vertragsart;
    private OffsetDateTime vertragsbeginn;
    private OffsetDateTime vertragsende;
    private List<Vertragskonditionen> vertragskonditionen;
    private String vertragsnummer;
    private Geschaeftspartner vertragspartner1;
    private Geschaeftspartner vertragspartner2;
    private Vertragsstatus vertragsstatus;

    public Buendelvertrag() {
    }

    private Buendelvertrag(BuendelvertragBuilder builder) {
        super(builder);
        this.beschreibung = builder.beschreibung;
        this.einzelvertraege = builder.einzelvertraege;
        this.sparte = builder.sparte;
        this.unterzeichnervp1 = builder.unterzeichnervp1;
        this.unterzeichnervp2 = builder.unterzeichnervp2;
        this.vertragsart = builder.vertragsart;
        this.vertragsbeginn = builder.vertragsbeginn;
        this.vertragsende = builder.vertragsende;
        this.vertragskonditionen = builder.vertragskonditionen;
        this.vertragsnummer = builder.vertragsnummer;
        this.vertragspartner1 = builder.vertragspartner1;
        this.vertragspartner2 = builder.vertragspartner2;
        this.vertragsstatus = builder.vertragsstatus;
    }

    public Typ get_typ() {
        return _typ;
    }

    /**
    * Beschreibung zum Vertrag
    */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
    * Beschreibung zum Vertrag
    */
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
    * Die Liste mit den Einzelverträgen zu den Abnahmestellen
    */
    public List<Vertrag> getEinzelvertraege() {
        return einzelvertraege;
    }

    /**
    * Die Liste mit den Einzelverträgen zu den Abnahmestellen
    */
    public void setEinzelvertraege(List<Vertrag> einzelvertraege) {
        this.einzelvertraege = einzelvertraege;
    }

    /**
    * Unterscheidungsmöglichkeiten für die Sparte
    */
    public Sparte getSparte() {
        return sparte;
    }

    /**
    * Unterscheidungsmöglichkeiten für die Sparte
    */
    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    /**
    * Unterzeichner des Vertragspartners1
    */
    public List<Unterschrift> getUnterzeichnervp1() {
        return unterzeichnervp1;
    }

    /**
    * Unterzeichner des Vertragspartners1
    */
    public void setUnterzeichnervp1(List<Unterschrift> unterzeichnervp1) {
        this.unterzeichnervp1 = unterzeichnervp1;
    }

    /**
    * Unterzeichner des Vertragspartners2
    */
    public List<Unterschrift> getUnterzeichnervp2() {
        return unterzeichnervp2;
    }

    /**
    * Unterzeichner des Vertragspartners2
    */
    public void setUnterzeichnervp2(List<Unterschrift> unterzeichnervp2) {
        this.unterzeichnervp2 = unterzeichnervp2;
    }

    /**
    * Hier ist festgelegt, um welche Art von Vertrag es sich handelt. Z.B. Netznutzungvertrag
    */
    public Vertragsart getVertragsart() {
        return vertragsart;
    }

    /**
    * Hier ist festgelegt, um welche Art von Vertrag es sich handelt. Z.B. Netznutzungvertrag
    */
    public void setVertragsart(Vertragsart vertragsart) {
        this.vertragsart = vertragsart;
    }

    /**
    * Gibt an, wann der Vertrag beginnt (inklusiv)
    */
    public OffsetDateTime getVertragsbeginn() {
        return vertragsbeginn;
    }

    /**
    * Gibt an, wann der Vertrag beginnt (inklusiv)
    */
    public void setVertragsbeginn(OffsetDateTime vertragsbeginn) {
        this.vertragsbeginn = vertragsbeginn;
    }

    /**
    * Gibt an, wann der Vertrag (voraussichtlich) endet oder beendet wurde (exklusiv)
    */
    public OffsetDateTime getVertragsende() {
        return vertragsende;
    }

    /**
    * Gibt an, wann der Vertrag (voraussichtlich) endet oder beendet wurde (exklusiv)
    */
    public void setVertragsende(OffsetDateTime vertragsende) {
        this.vertragsende = vertragsende;
    }

    /**
    * Festlegungen zu Laufzeiten und Kündigungsfristen
    */
    public List<Vertragskonditionen> getVertragskonditionen() {
        return vertragskonditionen;
    }

    /**
    * Festlegungen zu Laufzeiten und Kündigungsfristen
    */
    public void setVertragskonditionen(List<Vertragskonditionen> vertragskonditionen) {
        this.vertragskonditionen = vertragskonditionen;
    }

    /**
    * Eine im Verwendungskontext eindeutige Nummer für den Vertrag
    */
    public String getVertragsnummer() {
        return vertragsnummer;
    }

    /**
    * Eine im Verwendungskontext eindeutige Nummer für den Vertrag
    */
    public void setVertragsnummer(String vertragsnummer) {
        this.vertragsnummer = vertragsnummer;
    }

    /**
    * Der "erstgenannte" Vertragspartner. In der Regel der Aussteller des Vertrags.
    * Beispiel: "Vertrag zwischen Vertagspartner 1 ..."
    */
    public Geschaeftspartner getVertragspartner1() {
        return vertragspartner1;
    }

    /**
    * Der "erstgenannte" Vertragspartner. In der Regel der Aussteller des Vertrags.
    * Beispiel: "Vertrag zwischen Vertagspartner 1 ..."
    */
    public void setVertragspartner1(Geschaeftspartner vertragspartner1) {
        this.vertragspartner1 = vertragspartner1;
    }

    /**
    * Der "zweitgenannte" Vertragspartner. In der Regel der Empfänger des Vertrags.
    * Beispiel "Vertrag zwischen Vertagspartner 1 und Vertragspartner 2"
    */
    public Geschaeftspartner getVertragspartner2() {
        return vertragspartner2;
    }

    /**
    * Der "zweitgenannte" Vertragspartner. In der Regel der Empfänger des Vertrags.
    * Beispiel "Vertrag zwischen Vertagspartner 1 und Vertragspartner 2"
    */
    public void setVertragspartner2(Geschaeftspartner vertragspartner2) {
        this.vertragspartner2 = vertragspartner2;
    }

    /**
    * Gibt den Status des Vertrages an
    */
    public Vertragsstatus getVertragsstatus() {
        return vertragsstatus;
    }

    /**
    * Gibt den Status des Vertrages an
    */
    public void setVertragsstatus(Vertragsstatus vertragsstatus) {
        this.vertragsstatus = vertragsstatus;
    }

    public static BuendelvertragBuilder builder() {
        return new BuendelvertragBuilder();
    }

    public static class BuendelvertragBuilder extends GeschaeftsobjektBuilder {
        private String beschreibung;
        private List<Vertrag> einzelvertraege;
        private Sparte sparte;
        private List<Unterschrift> unterzeichnervp1;
        private List<Unterschrift> unterzeichnervp2;
        private Vertragsart vertragsart;
        private OffsetDateTime vertragsbeginn;
        private OffsetDateTime vertragsende;
        private List<Vertragskonditionen> vertragskonditionen;
        private String vertragsnummer;
        private Geschaeftspartner vertragspartner1;
        private Geschaeftspartner vertragspartner2;
        private Vertragsstatus vertragsstatus;

        private BuendelvertragBuilder() {
        }

        /**
        * Beschreibung zum Vertrag
        */
        public BuendelvertragBuilder setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
            return this;
        }

        /**
        * Die Liste mit den Einzelverträgen zu den Abnahmestellen
        */
        public BuendelvertragBuilder setEinzelvertraege(List<Vertrag> einzelvertraege) {
            this.einzelvertraege = einzelvertraege;
            return this;
        }

        /**
        * Unterscheidungsmöglichkeiten für die Sparte
        */
        public BuendelvertragBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }

        /**
        * Unterzeichner des Vertragspartners1
        */
        public BuendelvertragBuilder setUnterzeichnervp1(List<Unterschrift> unterzeichnervp1) {
            this.unterzeichnervp1 = unterzeichnervp1;
            return this;
        }

        /**
        * Unterzeichner des Vertragspartners2
        */
        public BuendelvertragBuilder setUnterzeichnervp2(List<Unterschrift> unterzeichnervp2) {
            this.unterzeichnervp2 = unterzeichnervp2;
            return this;
        }

        /**
        * Hier ist festgelegt, um welche Art von Vertrag es sich handelt. Z.B. Netznutzungvertrag
        */
        public BuendelvertragBuilder setVertragsart(Vertragsart vertragsart) {
            this.vertragsart = vertragsart;
            return this;
        }

        /**
        * Gibt an, wann der Vertrag beginnt (inklusiv)
        */
        public BuendelvertragBuilder setVertragsbeginn(OffsetDateTime vertragsbeginn) {
            this.vertragsbeginn = vertragsbeginn;
            return this;
        }

        /**
        * Gibt an, wann der Vertrag (voraussichtlich) endet oder beendet wurde (exklusiv)
        */
        public BuendelvertragBuilder setVertragsende(OffsetDateTime vertragsende) {
            this.vertragsende = vertragsende;
            return this;
        }

        /**
        * Festlegungen zu Laufzeiten und Kündigungsfristen
        */
        public BuendelvertragBuilder setVertragskonditionen(List<Vertragskonditionen> vertragskonditionen) {
            this.vertragskonditionen = vertragskonditionen;
            return this;
        }

        /**
        * Eine im Verwendungskontext eindeutige Nummer für den Vertrag
        */
        public BuendelvertragBuilder setVertragsnummer(String vertragsnummer) {
            this.vertragsnummer = vertragsnummer;
            return this;
        }

        /**
        * Der "erstgenannte" Vertragspartner. In der Regel der Aussteller des Vertrags.
        * Beispiel: "Vertrag zwischen Vertagspartner 1 ..."
        */
        public BuendelvertragBuilder setVertragspartner1(Geschaeftspartner vertragspartner1) {
            this.vertragspartner1 = vertragspartner1;
            return this;
        }

        /**
        * Der "zweitgenannte" Vertragspartner. In der Regel der Empfänger des Vertrags.
        * Beispiel "Vertrag zwischen Vertagspartner 1 und Vertragspartner 2"
        */
        public BuendelvertragBuilder setVertragspartner2(Geschaeftspartner vertragspartner2) {
            this.vertragspartner2 = vertragspartner2;
            return this;
        }

        /**
        * Gibt den Status des Vertrages an
        */
        public BuendelvertragBuilder setVertragsstatus(Vertragsstatus vertragsstatus) {
            this.vertragsstatus = vertragsstatus;
            return this;
        }

        public BuendelvertragBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public BuendelvertragBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Buendelvertrag build() {
            return new Buendelvertrag(this);
        }
    }
}