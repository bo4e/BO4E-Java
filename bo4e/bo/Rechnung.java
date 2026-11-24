package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Betrag;
import bo4e.com.Rechnungsposition;
import bo4e.com.Steuerbetrag;
import bo4e.com.Vorauszahlung;
import bo4e.com.Zahlungsinformation;
import bo4e.com.Zeitraum;
import bo4e.enums.BoTyp;
import bo4e.enums.NetznutzungRechnungsart;
import bo4e.enums.NetznutzungRechnungstyp;
import bo4e.enums.Rechnungsstatus;
import bo4e.enums.Rechnungstyp;
import bo4e.enums.Sparte;
import com.fasterxml.jackson.annotation.JsonInclude;

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
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.1.0-rc2/src/bo4e_schemas/bo/Rechnung.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Rechnung extends Geschaeftsobjekt {
    private final BoTyp _typ = BoTyp.RECHNUNG;
    private Energiemenge aktuellerVerbrauch;
    private Energiemenge anfangszaehlerstand;
    private Energiemenge endzaehlerstand;
    private OffsetDateTime faelligkeitsdatum;
    private Fremdkosten fremdkosten;
    private Betrag gesamtbrutto;
    private Betrag gesamtnetto;
    private Betrag gesamtsteuer;
    private Boolean istOriginal;
    private Boolean istSimuliert;
    private Boolean istStorno;
    private Energiemenge jahresverbrauch;
    private String kaeuferreferenz;
    private Marktlokation marktlokation;
    private Messlokation messlokation;
    private Marktteilnehmer messstellenbetreiber;
    private Marktteilnehmer netzbetreiber;
    private NetznutzungRechnungsart netznutzungrechnungsart;
    private NetznutzungRechnungstyp netznutzungrechnungstyp;
    private String originalRechnungsnummer;
    private Betrag rabattNetto;
    private OffsetDateTime rechnungsdatum;
    private Geschaeftspartner rechnungsempfaenger;
    private Geschaeftspartner rechnungsersteller;
    private String rechnungsnummer;
    private Zeitraum rechnungsperiode;
    private List<Rechnungsposition> rechnungspositionen;
    private Rechnungsstatus rechnungsstatus;
    private String rechnungstitel;
    private Rechnungstyp rechnungstyp;
    private List<Energiemenge> referenzverbraeuche;
    private Sparte sparte;
    private List<Steuerbetrag> steuerbetraege;
    private List<Rechnung> teilrechnungen;
    private Vertrag vertrag;
    private List<Vorauszahlung> vorauszahlungen;
    private Energiemenge vorjahresverbrauch;
    private List<Zaehler> zaehler;
    private List<Zahlungsinformation> zahlungsinformationen;
    private Betrag zukuenftigerAbschlag;
    private Betrag zuZahlen;

    public Rechnung() {
    }

    private Rechnung(RechnungBuilder builder) {
        super(builder);
        this.aktuellerVerbrauch = builder.aktuellerVerbrauch;
        this.anfangszaehlerstand = builder.anfangszaehlerstand;
        this.endzaehlerstand = builder.endzaehlerstand;
        this.faelligkeitsdatum = builder.faelligkeitsdatum;
        this.fremdkosten = builder.fremdkosten;
        this.gesamtbrutto = builder.gesamtbrutto;
        this.gesamtnetto = builder.gesamtnetto;
        this.gesamtsteuer = builder.gesamtsteuer;
        this.istOriginal = builder.istOriginal;
        this.istSimuliert = builder.istSimuliert;
        this.istStorno = builder.istStorno;
        this.jahresverbrauch = builder.jahresverbrauch;
        this.kaeuferreferenz = builder.kaeuferreferenz;
        this.marktlokation = builder.marktlokation;
        this.messlokation = builder.messlokation;
        this.messstellenbetreiber = builder.messstellenbetreiber;
        this.netzbetreiber = builder.netzbetreiber;
        this.netznutzungrechnungsart = builder.netznutzungrechnungsart;
        this.netznutzungrechnungstyp = builder.netznutzungrechnungstyp;
        this.originalRechnungsnummer = builder.originalRechnungsnummer;
        this.rabattNetto = builder.rabattNetto;
        this.rechnungsdatum = builder.rechnungsdatum;
        this.rechnungsempfaenger = builder.rechnungsempfaenger;
        this.rechnungsersteller = builder.rechnungsersteller;
        this.rechnungsnummer = builder.rechnungsnummer;
        this.rechnungsperiode = builder.rechnungsperiode;
        this.rechnungspositionen = builder.rechnungspositionen;
        this.rechnungsstatus = builder.rechnungsstatus;
        this.rechnungstitel = builder.rechnungstitel;
        this.rechnungstyp = builder.rechnungstyp;
        this.referenzverbraeuche = builder.referenzverbraeuche;
        this.sparte = builder.sparte;
        this.steuerbetraege = builder.steuerbetraege;
        this.teilrechnungen = builder.teilrechnungen;
        this.vertrag = builder.vertrag;
        this.vorauszahlungen = builder.vorauszahlungen;
        this.vorjahresverbrauch = builder.vorjahresverbrauch;
        this.zaehler = builder.zaehler;
        this.zahlungsinformationen = builder.zahlungsinformationen;
        this.zukuenftigerAbschlag = builder.zukuenftigerAbschlag;
        this.zuZahlen = builder.zuZahlen;
    }

    public BoTyp get_typ() {
        return _typ;
    }

    /**
    * Verbrauch des abgerechneten Zeitraums, Pflicht für Rechnungen gemäß EnWG § 40
    */
    public Energiemenge getAktuellerVerbrauch() {
        return aktuellerVerbrauch;
    }

    /**
    * Verbrauch des abgerechneten Zeitraums, Pflicht für Rechnungen gemäß EnWG § 40
    */
    public void setAktuellerVerbrauch(Energiemenge aktuellerVerbrauch) {
        this.aktuellerVerbrauch = aktuellerVerbrauch;
    }

    /**
    * Für Verbrauchsbasierte Rechnungen der Zählerstand zur Beginn des abgerechneten Zeitraums,
    * Pflicht für Rechnungen gemäß EnWG § 40
    */
    public Energiemenge getAnfangszaehlerstand() {
        return anfangszaehlerstand;
    }

    /**
    * Für Verbrauchsbasierte Rechnungen der Zählerstand zur Beginn des abgerechneten Zeitraums,
    * Pflicht für Rechnungen gemäß EnWG § 40
    */
    public void setAnfangszaehlerstand(Energiemenge anfangszaehlerstand) {
        this.anfangszaehlerstand = anfangszaehlerstand;
    }

    /**
    * Für Verbrauchsbasierte Rechnungen der Zählerstand zum Ende des abgerechneten Zeitraums,
    * Pflicht für Rechnungen gemäß EnWG § 40
    */
    public Energiemenge getEndzaehlerstand() {
        return endzaehlerstand;
    }

    /**
    * Für Verbrauchsbasierte Rechnungen der Zählerstand zum Ende des abgerechneten Zeitraums,
    * Pflicht für Rechnungen gemäß EnWG § 40
    */
    public void setEndzaehlerstand(Energiemenge endzaehlerstand) {
        this.endzaehlerstand = endzaehlerstand;
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
    * Zur Ausweisung der in die Kalkulation eingeflossenen Preise gemäß EnWG § 40
    */
    public Fremdkosten getFremdkosten() {
        return fremdkosten;
    }

    /**
    * Zur Ausweisung der in die Kalkulation eingeflossenen Preise gemäß EnWG § 40
    */
    public void setFremdkosten(Fremdkosten fremdkosten) {
        this.fremdkosten = fremdkosten;
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
    * ggf. auf einen Vergleichszeitraum hochgerechneter Verbrauch des abgerechneten Zeitraums
    * zu Vergleichszwecken mit dem Vorjahr, gemäß EnWG § 40
    */
    public Energiemenge getJahresverbrauch() {
        return jahresverbrauch;
    }

    /**
    * ggf. auf einen Vergleichszeitraum hochgerechneter Verbrauch des abgerechneten Zeitraums
    * zu Vergleichszwecken mit dem Vorjahr, gemäß EnWG § 40
    */
    public void setJahresverbrauch(Energiemenge jahresverbrauch) {
        this.jahresverbrauch = jahresverbrauch;
    }

    public String getKaeuferreferenz() {
        return kaeuferreferenz;
    }

    public void setKaeuferreferenz(String kaeuferreferenz) {
        this.kaeuferreferenz = kaeuferreferenz;
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
    * der Messtellenbetreiber an der Lieferstelle, relevant für Rechnungen gemäß EnWG § 40
    */
    public Marktteilnehmer getMessstellenbetreiber() {
        return messstellenbetreiber;
    }

    /**
    * der Messtellenbetreiber an der Lieferstelle, relevant für Rechnungen gemäß EnWG § 40
    */
    public void setMessstellenbetreiber(Marktteilnehmer messstellenbetreiber) {
        this.messstellenbetreiber = messstellenbetreiber;
    }

    /**
    * der Netzbetreiber an der Lieferstelle, relevant für Rechnungen gemäß EnWG § 40
    */
    public Marktteilnehmer getNetzbetreiber() {
        return netzbetreiber;
    }

    /**
    * der Netzbetreiber an der Lieferstelle, relevant für Rechnungen gemäß EnWG § 40
    */
    public void setNetzbetreiber(Marktteilnehmer netzbetreiber) {
        this.netzbetreiber = netzbetreiber;
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
    * Gesamtrabatt auf den Nettobetrag
    */
    public Betrag getRabattNetto() {
        return rabattNetto;
    }

    /**
    * Gesamtrabatt auf den Nettobetrag
    */
    public void setRabattNetto(Betrag rabattNetto) {
        this.rabattNetto = rabattNetto;
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
    * Der Aussteller der Rechnung. Die Rollencodenummer kennt man über den im Geschäftspartner
    * verlinkten Marktteilnehmer.
    */
    public Geschaeftspartner getRechnungsempfaenger() {
        return rechnungsempfaenger;
    }

    /**
    * Der Aussteller der Rechnung. Die Rollencodenummer kennt man über den im Geschäftspartner
    * verlinkten Marktteilnehmer.
    */
    public void setRechnungsempfaenger(Geschaeftspartner rechnungsempfaenger) {
        this.rechnungsempfaenger = rechnungsempfaenger;
    }

    /**
    * Der Aussteller der Rechnung. Die Rollencodenummer kennt man über den im Geschäftspartner
    * verlinkten Marktteilnehmer.
    */
    public Geschaeftspartner getRechnungsersteller() {
        return rechnungsersteller;
    }

    /**
    * Der Aussteller der Rechnung. Die Rollencodenummer kennt man über den im Geschäftspartner
    * verlinkten Marktteilnehmer.
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
    * Verbräuche von Referenzkundengruppen gemäß EnWG § 40
    */
    public List<Energiemenge> getReferenzverbraeuche() {
        return referenzverbraeuche;
    }

    /**
    * Verbräuche von Referenzkundengruppen gemäß EnWG § 40
    */
    public void setReferenzverbraeuche(List<Energiemenge> referenzverbraeuche) {
        this.referenzverbraeuche = referenzverbraeuche;
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
    * Rechnungen, die durch diese Rechnung zusammengefasst werden
    */
    public List<Rechnung> getTeilrechnungen() {
        return teilrechnungen;
    }

    /**
    * Rechnungen, die durch diese Rechnung zusammengefasst werden
    */
    public void setTeilrechnungen(List<Rechnung> teilrechnungen) {
        this.teilrechnungen = teilrechnungen;
    }

    /**
    * enthält Informationen über den der Rechnung zugrundeliegenden Vertrag für Rechnungen nach
    * EnWG § 40
    */
    public Vertrag getVertrag() {
        return vertrag;
    }

    /**
    * enthält Informationen über den der Rechnung zugrundeliegenden Vertrag für Rechnungen nach
    * EnWG § 40
    */
    public void setVertrag(Vertrag vertrag) {
        this.vertrag = vertrag;
    }

    /**
    * Die Summe evtl. vorausgezahlter Beträge, z.B. Abschläge. Angabe als Bruttowert
    */
    public List<Vorauszahlung> getVorauszahlungen() {
        return vorauszahlungen;
    }

    /**
    * Die Summe evtl. vorausgezahlter Beträge, z.B. Abschläge. Angabe als Bruttowert
    */
    public void setVorauszahlungen(List<Vorauszahlung> vorauszahlungen) {
        this.vorauszahlungen = vorauszahlungen;
    }

    /**
    * ggf. auf einen Vergleichszeitraum hochgerechneter Verbrauch des vorherigen Jahres zu
    * Vergleichszwecken mit dem aktuellen Jahr, gemäß EnWG § 40
    */
    public Energiemenge getVorjahresverbrauch() {
        return vorjahresverbrauch;
    }

    /**
    * ggf. auf einen Vergleichszeitraum hochgerechneter Verbrauch des vorherigen Jahres zu
    * Vergleichszwecken mit dem aktuellen Jahr, gemäß EnWG § 40
    */
    public void setVorjahresverbrauch(Energiemenge vorjahresverbrauch) {
        this.vorjahresverbrauch = vorjahresverbrauch;
    }

    public List<Zaehler> getZaehler() {
        return zaehler;
    }

    public void setZaehler(List<Zaehler> zaehler) {
        this.zaehler = zaehler;
    }

    /**
    * Informationen wie eine Rechnung bezahlt werden soll
    */
    public List<Zahlungsinformation> getZahlungsinformationen() {
        return zahlungsinformationen;
    }

    /**
    * Informationen wie eine Rechnung bezahlt werden soll
    */
    public void setZahlungsinformationen(List<Zahlungsinformation> zahlungsinformationen) {
        this.zahlungsinformationen = zahlungsinformationen;
    }

    public Betrag getZukuenftigerAbschlag() {
        return zukuenftigerAbschlag;
    }

    public void setZukuenftigerAbschlag(Betrag zukuenftigerAbschlag) {
        this.zukuenftigerAbschlag = zukuenftigerAbschlag;
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class RechnungBuilder extends GeschaeftsobjektBuilder {
        private Energiemenge aktuellerVerbrauch;
        private Energiemenge anfangszaehlerstand;
        private Energiemenge endzaehlerstand;
        private OffsetDateTime faelligkeitsdatum;
        private Fremdkosten fremdkosten;
        private Betrag gesamtbrutto;
        private Betrag gesamtnetto;
        private Betrag gesamtsteuer;
        private Boolean istOriginal;
        private Boolean istSimuliert;
        private Boolean istStorno;
        private Energiemenge jahresverbrauch;
        private String kaeuferreferenz;
        private Marktlokation marktlokation;
        private Messlokation messlokation;
        private Marktteilnehmer messstellenbetreiber;
        private Marktteilnehmer netzbetreiber;
        private NetznutzungRechnungsart netznutzungrechnungsart;
        private NetznutzungRechnungstyp netznutzungrechnungstyp;
        private String originalRechnungsnummer;
        private Betrag rabattNetto;
        private OffsetDateTime rechnungsdatum;
        private Geschaeftspartner rechnungsempfaenger;
        private Geschaeftspartner rechnungsersteller;
        private String rechnungsnummer;
        private Zeitraum rechnungsperiode;
        private List<Rechnungsposition> rechnungspositionen;
        private Rechnungsstatus rechnungsstatus;
        private String rechnungstitel;
        private Rechnungstyp rechnungstyp;
        private List<Energiemenge> referenzverbraeuche;
        private Sparte sparte;
        private List<Steuerbetrag> steuerbetraege;
        private List<Rechnung> teilrechnungen;
        private Vertrag vertrag;
        private List<Vorauszahlung> vorauszahlungen;
        private Energiemenge vorjahresverbrauch;
        private List<Zaehler> zaehler;
        private List<Zahlungsinformation> zahlungsinformationen;
        private Betrag zukuenftigerAbschlag;
        private Betrag zuZahlen;

        private RechnungBuilder() {
        }

        /**
        * Verbrauch des abgerechneten Zeitraums, Pflicht für Rechnungen gemäß EnWG § 40
        */
        public RechnungBuilder setAktuellerVerbrauch(Energiemenge aktuellerVerbrauch) {
            this.aktuellerVerbrauch = aktuellerVerbrauch;
            return this;
        }

        /**
        * Für Verbrauchsbasierte Rechnungen der Zählerstand zur Beginn des abgerechneten Zeitraums,
        * Pflicht für Rechnungen gemäß EnWG § 40
        */
        public RechnungBuilder setAnfangszaehlerstand(Energiemenge anfangszaehlerstand) {
            this.anfangszaehlerstand = anfangszaehlerstand;
            return this;
        }

        /**
        * Für Verbrauchsbasierte Rechnungen der Zählerstand zum Ende des abgerechneten Zeitraums,
        * Pflicht für Rechnungen gemäß EnWG § 40
        */
        public RechnungBuilder setEndzaehlerstand(Energiemenge endzaehlerstand) {
            this.endzaehlerstand = endzaehlerstand;
            return this;
        }

        /**
        * Zu diesem Datum ist die Zahlung fällig
        */
        public RechnungBuilder setFaelligkeitsdatum(OffsetDateTime faelligkeitsdatum) {
            this.faelligkeitsdatum = faelligkeitsdatum;
            return this;
        }

        /**
        * Zur Ausweisung der in die Kalkulation eingeflossenen Preise gemäß EnWG § 40
        */
        public RechnungBuilder setFremdkosten(Fremdkosten fremdkosten) {
            this.fremdkosten = fremdkosten;
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
        * ggf. auf einen Vergleichszeitraum hochgerechneter Verbrauch des abgerechneten Zeitraums
        * zu Vergleichszwecken mit dem Vorjahr, gemäß EnWG § 40
        */
        public RechnungBuilder setJahresverbrauch(Energiemenge jahresverbrauch) {
            this.jahresverbrauch = jahresverbrauch;
            return this;
        }

        public RechnungBuilder setKaeuferreferenz(String kaeuferreferenz) {
            this.kaeuferreferenz = kaeuferreferenz;
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
        * der Messtellenbetreiber an der Lieferstelle, relevant für Rechnungen gemäß EnWG § 40
        */
        public RechnungBuilder setMessstellenbetreiber(Marktteilnehmer messstellenbetreiber) {
            this.messstellenbetreiber = messstellenbetreiber;
            return this;
        }

        /**
        * der Netzbetreiber an der Lieferstelle, relevant für Rechnungen gemäß EnWG § 40
        */
        public RechnungBuilder setNetzbetreiber(Marktteilnehmer netzbetreiber) {
            this.netzbetreiber = netzbetreiber;
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
        * Gesamtrabatt auf den Nettobetrag
        */
        public RechnungBuilder setRabattNetto(Betrag rabattNetto) {
            this.rabattNetto = rabattNetto;
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
        * Der Aussteller der Rechnung. Die Rollencodenummer kennt man über den im Geschäftspartner
        * verlinkten Marktteilnehmer.
        */
        public RechnungBuilder setRechnungsempfaenger(Geschaeftspartner rechnungsempfaenger) {
            this.rechnungsempfaenger = rechnungsempfaenger;
            return this;
        }

        /**
        * Der Aussteller der Rechnung. Die Rollencodenummer kennt man über den im Geschäftspartner
        * verlinkten Marktteilnehmer.
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
        * Verbräuche von Referenzkundengruppen gemäß EnWG § 40
        */
        public RechnungBuilder setReferenzverbraeuche(List<Energiemenge> referenzverbraeuche) {
            this.referenzverbraeuche = referenzverbraeuche;
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
        * Rechnungen, die durch diese Rechnung zusammengefasst werden
        */
        public RechnungBuilder setTeilrechnungen(List<Rechnung> teilrechnungen) {
            this.teilrechnungen = teilrechnungen;
            return this;
        }

        /**
        * enthält Informationen über den der Rechnung zugrundeliegenden Vertrag für Rechnungen nach
        * EnWG § 40
        */
        public RechnungBuilder setVertrag(Vertrag vertrag) {
            this.vertrag = vertrag;
            return this;
        }

        /**
        * Die Summe evtl. vorausgezahlter Beträge, z.B. Abschläge. Angabe als Bruttowert
        */
        public RechnungBuilder setVorauszahlungen(List<Vorauszahlung> vorauszahlungen) {
            this.vorauszahlungen = vorauszahlungen;
            return this;
        }

        /**
        * ggf. auf einen Vergleichszeitraum hochgerechneter Verbrauch des vorherigen Jahres zu
        * Vergleichszwecken mit dem aktuellen Jahr, gemäß EnWG § 40
        */
        public RechnungBuilder setVorjahresverbrauch(Energiemenge vorjahresverbrauch) {
            this.vorjahresverbrauch = vorjahresverbrauch;
            return this;
        }

        public RechnungBuilder setZaehler(List<Zaehler> zaehler) {
            this.zaehler = zaehler;
            return this;
        }

        /**
        * Informationen wie eine Rechnung bezahlt werden soll
        */
        public RechnungBuilder setZahlungsinformationen(List<Zahlungsinformation> zahlungsinformationen) {
            this.zahlungsinformationen = zahlungsinformationen;
            return this;
        }

        public RechnungBuilder setZukuenftigerAbschlag(Betrag zukuenftigerAbschlag) {
            this.zukuenftigerAbschlag = zukuenftigerAbschlag;
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