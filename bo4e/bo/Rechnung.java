package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Betrag;
import bo4e.com.Rechnungsposition;
import bo4e.com.Steuerbetrag;
import bo4e.com.Zeitraum;
import bo4e.enums.BoTyp;
import bo4e.enums.NetznutzungRechnungsart;
import bo4e.enums.NetznutzungRechnungstyp;
import bo4e.enums.Rechnungsstatus;
import bo4e.enums.Rechnungstyp;
import bo4e.enums.Sparte;

import java.time.OffsetDateTime;
import java.util.List;

/**
* Modell für die Abbildung von Rechnungen und Netznutzungsrechnungen im Kontext der
* Energiewirtschaft;
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Rechnung.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Rechnung JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.0.0/src/bo4e_schemas/bo/Rechnung.json>`_
*/
public class Rechnung extends Geschaeftsobjekt {
    private final BoTyp _typ = BoTyp.RECHNUNG;
    private OffsetDateTime faelligkeitsdatum;
    private Betrag gesamtbrutto;
    private Betrag gesamtnetto;
    private Betrag gesamtsteuer;
    private Boolean istOriginal;
    private Boolean istSimuliert;
    private Boolean istStorno;
    private Marktlokation marktlokation;
    private Messlokation messlokation;
    private NetznutzungRechnungsart netznutzungrechnungsart;
    private NetznutzungRechnungstyp netznutzungrechnungstyp;
    private String originalRechnungsnummer;
    private Betrag rabattBrutto;
    private OffsetDateTime rechnungsdatum;
    private Geschaeftspartner rechnungsempfaenger;
    private Geschaeftspartner rechnungsersteller;
    private String rechnungsnummer;
    private Zeitraum rechnungsperiode;
    private List<Rechnungsposition> rechnungspositionen;
    private Rechnungsstatus rechnungsstatus;
    private String rechnungstitel;
    private Rechnungstyp rechnungstyp;
    private Sparte sparte;
    private List<Steuerbetrag> steuerbetraege;
    private Betrag vorausgezahlt;
    private Betrag zuZahlen;

    public Rechnung() {
    }

    private Rechnung(RechnungBuilder builder) {
        super(builder);
        this.faelligkeitsdatum = builder.faelligkeitsdatum;
        this.gesamtbrutto = builder.gesamtbrutto;
        this.gesamtnetto = builder.gesamtnetto;
        this.gesamtsteuer = builder.gesamtsteuer;
        this.istOriginal = builder.istOriginal;
        this.istSimuliert = builder.istSimuliert;
        this.istStorno = builder.istStorno;
        this.marktlokation = builder.marktlokation;
        this.messlokation = builder.messlokation;
        this.netznutzungrechnungsart = builder.netznutzungrechnungsart;
        this.netznutzungrechnungstyp = builder.netznutzungrechnungstyp;
        this.originalRechnungsnummer = builder.originalRechnungsnummer;
        this.rabattBrutto = builder.rabattBrutto;
        this.rechnungsdatum = builder.rechnungsdatum;
        this.rechnungsempfaenger = builder.rechnungsempfaenger;
        this.rechnungsersteller = builder.rechnungsersteller;
        this.rechnungsnummer = builder.rechnungsnummer;
        this.rechnungsperiode = builder.rechnungsperiode;
        this.rechnungspositionen = builder.rechnungspositionen;
        this.rechnungsstatus = builder.rechnungsstatus;
        this.rechnungstitel = builder.rechnungstitel;
        this.rechnungstyp = builder.rechnungstyp;
        this.sparte = builder.sparte;
        this.steuerbetraege = builder.steuerbetraege;
        this.vorausgezahlt = builder.vorausgezahlt;
        this.zuZahlen = builder.zuZahlen;
    }

    public BoTyp get_typ() {
        return _typ;
    }

    /**
    * Zu diesem Datum ist die Zahlung fällig
    */
    public OffsetDateTime getFaelligkeitsdatum() {
        return faelligkeitsdatum;
    }

    /**
    * Zu diesem Datum ist die Zahlung fällig
    */
    public void setFaelligkeitsdatum(OffsetDateTime faelligkeitsdatum) {
        this.faelligkeitsdatum = faelligkeitsdatum;
    }

    /**
    * Die Summe aus Netto- und Steuerbetrag
    */
    public Betrag getGesamtbrutto() {
        return gesamtbrutto;
    }

    /**
    * Die Summe aus Netto- und Steuerbetrag
    */
    public void setGesamtbrutto(Betrag gesamtbrutto) {
        this.gesamtbrutto = gesamtbrutto;
    }

    /**
    * Die Summe der Nettobeträge der Rechnungsteile
    */
    public Betrag getGesamtnetto() {
        return gesamtnetto;
    }

    /**
    * Die Summe der Nettobeträge der Rechnungsteile
    */
    public void setGesamtnetto(Betrag gesamtnetto) {
        this.gesamtnetto = gesamtnetto;
    }

    /**
    * Die Summe der Steuerbeträge der Rechnungsteile
    */
    public Betrag getGesamtsteuer() {
        return gesamtsteuer;
    }

    /**
    * Die Summe der Steuerbeträge der Rechnungsteile
    */
    public void setGesamtsteuer(Betrag gesamtsteuer) {
        this.gesamtsteuer = gesamtsteuer;
    }

    /**
    * Kennzeichen, ob es sich um ein Original (true) oder eine Kopie handelt (false)
    */
    public Boolean getIstOriginal() {
        return istOriginal;
    }

    /**
    * Kennzeichen, ob es sich um ein Original (true) oder eine Kopie handelt (false)
    */
    public void setIstOriginal(Boolean istOriginal) {
        this.istOriginal = istOriginal;
    }

    /**
    * Kennzeichen, ob es sich um eine simulierte Rechnung, z.B. zur Rechnungsprüfung handelt
    */
    public Boolean getIstSimuliert() {
        return istSimuliert;
    }

    /**
    * Kennzeichen, ob es sich um eine simulierte Rechnung, z.B. zur Rechnungsprüfung handelt
    */
    public void setIstSimuliert(Boolean istSimuliert) {
        this.istSimuliert = istSimuliert;
    }

    /**
    * Kennzeichnung, ob es sich um eine Stornorechnung handelt;
    * im Falle "true" findet sich im Attribut "originalrechnungsnummer" die Nummer der
    * Originalrechnung.
    */
    public Boolean getIstStorno() {
        return istStorno;
    }

    /**
    * Kennzeichnung, ob es sich um eine Stornorechnung handelt;
    * im Falle "true" findet sich im Attribut "originalrechnungsnummer" die Nummer der
    * Originalrechnung.
    */
    public void setIstStorno(Boolean istStorno) {
        this.istStorno = istStorno;
    }

    /**
    * Marktlokation, auf die sich die Rechnung bezieht
    */
    public Marktlokation getMarktlokation() {
        return marktlokation;
    }

    /**
    * Marktlokation, auf die sich die Rechnung bezieht
    */
    public void setMarktlokation(Marktlokation marktlokation) {
        this.marktlokation = marktlokation;
    }

    /**
    * Messlokation, auf die sich die Rechnung bezieht
    */
    public Messlokation getMesslokation() {
        return messlokation;
    }

    /**
    * Messlokation, auf die sich die Rechnung bezieht
    */
    public void setMesslokation(Messlokation messlokation) {
        this.messlokation = messlokation;
    }

    /**
    * Aus der INVOIC entnommen, befüllt wenn es sich um eine Netznutzungsrechnung handelt
    */
    public NetznutzungRechnungsart getNetznutzungrechnungsart() {
        return netznutzungrechnungsart;
    }

    /**
    * Aus der INVOIC entnommen, befüllt wenn es sich um eine Netznutzungsrechnung handelt
    */
    public void setNetznutzungrechnungsart(NetznutzungRechnungsart netznutzungrechnungsart) {
        this.netznutzungrechnungsart = netznutzungrechnungsart;
    }

    /**
    * Aus der INVOIC entnommen, befüllt wenn es sich um eine Netznutzungsrechnung handelt
    */
    public NetznutzungRechnungstyp getNetznutzungrechnungstyp() {
        return netznutzungrechnungstyp;
    }

    /**
    * Aus der INVOIC entnommen, befüllt wenn es sich um eine Netznutzungsrechnung handelt
    */
    public void setNetznutzungrechnungstyp(NetznutzungRechnungstyp netznutzungrechnungstyp) {
        this.netznutzungrechnungstyp = netznutzungrechnungstyp;
    }

    /**
    * Im Falle einer Stornorechnung (storno = true) steht hier die Rechnungsnummer der
    * stornierten Rechnung
    */
    public String getOriginalRechnungsnummer() {
        return originalRechnungsnummer;
    }

    /**
    * Im Falle einer Stornorechnung (storno = true) steht hier die Rechnungsnummer der
    * stornierten Rechnung
    */
    public void setOriginalRechnungsnummer(String originalRechnungsnummer) {
        this.originalRechnungsnummer = originalRechnungsnummer;
    }

    /**
    * Gesamtrabatt auf den Bruttobetrag
    */
    public Betrag getRabattBrutto() {
        return rabattBrutto;
    }

    /**
    * Gesamtrabatt auf den Bruttobetrag
    */
    public void setRabattBrutto(Betrag rabattBrutto) {
        this.rabattBrutto = rabattBrutto;
    }

    /**
    * Ausstellungsdatum der Rechnung
    */
    public OffsetDateTime getRechnungsdatum() {
        return rechnungsdatum;
    }

    /**
    * Ausstellungsdatum der Rechnung
    */
    public void setRechnungsdatum(OffsetDateTime rechnungsdatum) {
        this.rechnungsdatum = rechnungsdatum;
    }

    /**
    * Der Aussteller der Rechnung, die Rollencodenummer kennt man über den im Geschäftspartner
    * verlinkten Marktteilnehmer
    */
    public Geschaeftspartner getRechnungsempfaenger() {
        return rechnungsempfaenger;
    }

    /**
    * Der Aussteller der Rechnung, die Rollencodenummer kennt man über den im Geschäftspartner
    * verlinkten Marktteilnehmer
    */
    public void setRechnungsempfaenger(Geschaeftspartner rechnungsempfaenger) {
        this.rechnungsempfaenger = rechnungsempfaenger;
    }

    /**
    * Der Aussteller der Rechnung, die Rollencodenummer kennt man über den im Geschäftspartner
    * verlinkten Marktteilnehmer
    */
    public Geschaeftspartner getRechnungsersteller() {
        return rechnungsersteller;
    }

    /**
    * Der Aussteller der Rechnung, die Rollencodenummer kennt man über den im Geschäftspartner
    * verlinkten Marktteilnehmer
    */
    public void setRechnungsersteller(Geschaeftspartner rechnungsersteller) {
        this.rechnungsersteller = rechnungsersteller;
    }

    /**
    * Eine im Verwendungskontext eindeutige Nummer für die Rechnung
    */
    public String getRechnungsnummer() {
        return rechnungsnummer;
    }

    /**
    * Eine im Verwendungskontext eindeutige Nummer für die Rechnung
    */
    public void setRechnungsnummer(String rechnungsnummer) {
        this.rechnungsnummer = rechnungsnummer;
    }

    /**
    * Der Zeitraum der zugrunde liegenden Lieferung zur Rechnung
    */
    public Zeitraum getRechnungsperiode() {
        return rechnungsperiode;
    }

    /**
    * Der Zeitraum der zugrunde liegenden Lieferung zur Rechnung
    */
    public void setRechnungsperiode(Zeitraum rechnungsperiode) {
        this.rechnungsperiode = rechnungsperiode;
    }

    /**
    * Die Rechnungspositionen
    */
    public List<Rechnungsposition> getRechnungspositionen() {
        return rechnungspositionen;
    }

    /**
    * Die Rechnungspositionen
    */
    public void setRechnungspositionen(List<Rechnungsposition> rechnungspositionen) {
        this.rechnungspositionen = rechnungspositionen;
    }

    /**
    * Status der Rechnung zur Kennzeichnung des Bearbeitungsstandes
    */
    public Rechnungsstatus getRechnungsstatus() {
        return rechnungsstatus;
    }

    /**
    * Status der Rechnung zur Kennzeichnung des Bearbeitungsstandes
    */
    public void setRechnungsstatus(Rechnungsstatus rechnungsstatus) {
        this.rechnungsstatus = rechnungsstatus;
    }

    /**
    * Bezeichnung für die vorliegende Rechnung
    */
    public String getRechnungstitel() {
        return rechnungstitel;
    }

    /**
    * Bezeichnung für die vorliegende Rechnung
    */
    public void setRechnungstitel(String rechnungstitel) {
        this.rechnungstitel = rechnungstitel;
    }

    /**
    * Ein kontextbezogender Rechnungstyp, z.B. Netznutzungsrechnung
    */
    public Rechnungstyp getRechnungstyp() {
        return rechnungstyp;
    }

    /**
    * Ein kontextbezogender Rechnungstyp, z.B. Netznutzungsrechnung
    */
    public void setRechnungstyp(Rechnungstyp rechnungstyp) {
        this.rechnungstyp = rechnungstyp;
    }

    /**
    * Sparte (Strom, Gas ...) für die die Rechnung ausgestellt ist
    */
    public Sparte getSparte() {
        return sparte;
    }

    /**
    * Sparte (Strom, Gas ...) für die die Rechnung ausgestellt ist
    */
    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    /**
    * Eine Liste mit Steuerbeträgen pro Steuerkennzeichen/Steuersatz;
    * die Summe dieser Beträge ergibt den Wert für gesamtsteuer.
    */
    public List<Steuerbetrag> getSteuerbetraege() {
        return steuerbetraege;
    }

    /**
    * Eine Liste mit Steuerbeträgen pro Steuerkennzeichen/Steuersatz;
    * die Summe dieser Beträge ergibt den Wert für gesamtsteuer.
    */
    public void setSteuerbetraege(List<Steuerbetrag> steuerbetraege) {
        this.steuerbetraege = steuerbetraege;
    }

    /**
    * Die Summe evtl. vorausgezahlter Beträge, z.B. Abschläge. Angabe als Bruttowert
    */
    public Betrag getVorausgezahlt() {
        return vorausgezahlt;
    }

    /**
    * Die Summe evtl. vorausgezahlter Beträge, z.B. Abschläge. Angabe als Bruttowert
    */
    public void setVorausgezahlt(Betrag vorausgezahlt) {
        this.vorausgezahlt = vorausgezahlt;
    }

    /**
    * Der zu zahlende Betrag, der sich aus (gesamtbrutto - vorausbezahlt - rabattBrutto) ergibt
    */
    public Betrag getZuZahlen() {
        return zuZahlen;
    }

    /**
    * Der zu zahlende Betrag, der sich aus (gesamtbrutto - vorausbezahlt - rabattBrutto) ergibt
    */
    public void setZuZahlen(Betrag zuZahlen) {
        this.zuZahlen = zuZahlen;
    }

    public static RechnungBuilder builder() {
        return new RechnungBuilder();
    }

    public static class RechnungBuilder extends GeschaeftsobjektBuilder {
        private OffsetDateTime faelligkeitsdatum;
        private Betrag gesamtbrutto;
        private Betrag gesamtnetto;
        private Betrag gesamtsteuer;
        private Boolean istOriginal;
        private Boolean istSimuliert;
        private Boolean istStorno;
        private Marktlokation marktlokation;
        private Messlokation messlokation;
        private NetznutzungRechnungsart netznutzungrechnungsart;
        private NetznutzungRechnungstyp netznutzungrechnungstyp;
        private String originalRechnungsnummer;
        private Betrag rabattBrutto;
        private OffsetDateTime rechnungsdatum;
        private Geschaeftspartner rechnungsempfaenger;
        private Geschaeftspartner rechnungsersteller;
        private String rechnungsnummer;
        private Zeitraum rechnungsperiode;
        private List<Rechnungsposition> rechnungspositionen;
        private Rechnungsstatus rechnungsstatus;
        private String rechnungstitel;
        private Rechnungstyp rechnungstyp;
        private Sparte sparte;
        private List<Steuerbetrag> steuerbetraege;
        private Betrag vorausgezahlt;
        private Betrag zuZahlen;

        private RechnungBuilder() {
        }

        /**
        * Zu diesem Datum ist die Zahlung fällig
        */
        public RechnungBuilder setFaelligkeitsdatum(OffsetDateTime faelligkeitsdatum) {
            this.faelligkeitsdatum = faelligkeitsdatum;
            return this;
        }

        /**
        * Die Summe aus Netto- und Steuerbetrag
        */
        public RechnungBuilder setGesamtbrutto(Betrag gesamtbrutto) {
            this.gesamtbrutto = gesamtbrutto;
            return this;
        }

        /**
        * Die Summe der Nettobeträge der Rechnungsteile
        */
        public RechnungBuilder setGesamtnetto(Betrag gesamtnetto) {
            this.gesamtnetto = gesamtnetto;
            return this;
        }

        /**
        * Die Summe der Steuerbeträge der Rechnungsteile
        */
        public RechnungBuilder setGesamtsteuer(Betrag gesamtsteuer) {
            this.gesamtsteuer = gesamtsteuer;
            return this;
        }

        /**
        * Kennzeichen, ob es sich um ein Original (true) oder eine Kopie handelt (false)
        */
        public RechnungBuilder setIstOriginal(Boolean istOriginal) {
            this.istOriginal = istOriginal;
            return this;
        }

        /**
        * Kennzeichen, ob es sich um eine simulierte Rechnung, z.B. zur Rechnungsprüfung handelt
        */
        public RechnungBuilder setIstSimuliert(Boolean istSimuliert) {
            this.istSimuliert = istSimuliert;
            return this;
        }

        /**
        * Kennzeichnung, ob es sich um eine Stornorechnung handelt;
        * im Falle "true" findet sich im Attribut "originalrechnungsnummer" die Nummer der
        * Originalrechnung.
        */
        public RechnungBuilder setIstStorno(Boolean istStorno) {
            this.istStorno = istStorno;
            return this;
        }

        /**
        * Marktlokation, auf die sich die Rechnung bezieht
        */
        public RechnungBuilder setMarktlokation(Marktlokation marktlokation) {
            this.marktlokation = marktlokation;
            return this;
        }

        /**
        * Messlokation, auf die sich die Rechnung bezieht
        */
        public RechnungBuilder setMesslokation(Messlokation messlokation) {
            this.messlokation = messlokation;
            return this;
        }

        /**
        * Aus der INVOIC entnommen, befüllt wenn es sich um eine Netznutzungsrechnung handelt
        */
        public RechnungBuilder setNetznutzungrechnungsart(NetznutzungRechnungsart netznutzungrechnungsart) {
            this.netznutzungrechnungsart = netznutzungrechnungsart;
            return this;
        }

        /**
        * Aus der INVOIC entnommen, befüllt wenn es sich um eine Netznutzungsrechnung handelt
        */
        public RechnungBuilder setNetznutzungrechnungstyp(NetznutzungRechnungstyp netznutzungrechnungstyp) {
            this.netznutzungrechnungstyp = netznutzungrechnungstyp;
            return this;
        }

        /**
        * Im Falle einer Stornorechnung (storno = true) steht hier die Rechnungsnummer der
        * stornierten Rechnung
        */
        public RechnungBuilder setOriginalRechnungsnummer(String originalRechnungsnummer) {
            this.originalRechnungsnummer = originalRechnungsnummer;
            return this;
        }

        /**
        * Gesamtrabatt auf den Bruttobetrag
        */
        public RechnungBuilder setRabattBrutto(Betrag rabattBrutto) {
            this.rabattBrutto = rabattBrutto;
            return this;
        }

        /**
        * Ausstellungsdatum der Rechnung
        */
        public RechnungBuilder setRechnungsdatum(OffsetDateTime rechnungsdatum) {
            this.rechnungsdatum = rechnungsdatum;
            return this;
        }

        /**
        * Der Aussteller der Rechnung, die Rollencodenummer kennt man über den im Geschäftspartner
        * verlinkten Marktteilnehmer
        */
        public RechnungBuilder setRechnungsempfaenger(Geschaeftspartner rechnungsempfaenger) {
            this.rechnungsempfaenger = rechnungsempfaenger;
            return this;
        }

        /**
        * Der Aussteller der Rechnung, die Rollencodenummer kennt man über den im Geschäftspartner
        * verlinkten Marktteilnehmer
        */
        public RechnungBuilder setRechnungsersteller(Geschaeftspartner rechnungsersteller) {
            this.rechnungsersteller = rechnungsersteller;
            return this;
        }

        /**
        * Eine im Verwendungskontext eindeutige Nummer für die Rechnung
        */
        public RechnungBuilder setRechnungsnummer(String rechnungsnummer) {
            this.rechnungsnummer = rechnungsnummer;
            return this;
        }

        /**
        * Der Zeitraum der zugrunde liegenden Lieferung zur Rechnung
        */
        public RechnungBuilder setRechnungsperiode(Zeitraum rechnungsperiode) {
            this.rechnungsperiode = rechnungsperiode;
            return this;
        }

        /**
        * Die Rechnungspositionen
        */
        public RechnungBuilder setRechnungspositionen(List<Rechnungsposition> rechnungspositionen) {
            this.rechnungspositionen = rechnungspositionen;
            return this;
        }

        /**
        * Status der Rechnung zur Kennzeichnung des Bearbeitungsstandes
        */
        public RechnungBuilder setRechnungsstatus(Rechnungsstatus rechnungsstatus) {
            this.rechnungsstatus = rechnungsstatus;
            return this;
        }

        /**
        * Bezeichnung für die vorliegende Rechnung
        */
        public RechnungBuilder setRechnungstitel(String rechnungstitel) {
            this.rechnungstitel = rechnungstitel;
            return this;
        }

        /**
        * Ein kontextbezogender Rechnungstyp, z.B. Netznutzungsrechnung
        */
        public RechnungBuilder setRechnungstyp(Rechnungstyp rechnungstyp) {
            this.rechnungstyp = rechnungstyp;
            return this;
        }

        /**
        * Sparte (Strom, Gas ...) für die die Rechnung ausgestellt ist
        */
        public RechnungBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }

        /**
        * Eine Liste mit Steuerbeträgen pro Steuerkennzeichen/Steuersatz;
        * die Summe dieser Beträge ergibt den Wert für gesamtsteuer.
        */
        public RechnungBuilder setSteuerbetraege(List<Steuerbetrag> steuerbetraege) {
            this.steuerbetraege = steuerbetraege;
            return this;
        }

        /**
        * Die Summe evtl. vorausgezahlter Beträge, z.B. Abschläge. Angabe als Bruttowert
        */
        public RechnungBuilder setVorausgezahlt(Betrag vorausgezahlt) {
            this.vorausgezahlt = vorausgezahlt;
            return this;
        }

        /**
        * Der zu zahlende Betrag, der sich aus (gesamtbrutto - vorausbezahlt - rabattBrutto) ergibt
        */
        public RechnungBuilder setZuZahlen(Betrag zuZahlen) {
            this.zuZahlen = zuZahlen;
            return this;
        }

        public RechnungBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public RechnungBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Rechnung build() {
            return new Rechnung(this);
        }
    }
}