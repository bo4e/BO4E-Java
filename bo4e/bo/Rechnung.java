package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Betrag;
import bo4e.enums.NetznutzungRechnungsart;
import bo4e.enums.NetznutzungRechnungstyp;
import bo4e.com.Zeitraum;
import bo4e.com.Rechnungsposition;
import bo4e.enums.Rechnungsstatus;
import bo4e.enums.Rechnungstyp;
import bo4e.enums.Sparte;
import bo4e.com.Steuerbetrag;
import java.time.OffsetDateTime;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/bo/Rechnung.json>`_
 */
public class Rechnung extends Geschaeftsobjekt {
    private final Typ _typ = Typ.RECHNUNG;
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
    private Rechnungsposition[] rechnungspositionen;
    private Rechnungsstatus rechnungsstatus;
    private String rechnungstitel;
    private Rechnungstyp rechnungstyp;
    private Sparte sparte;
    private Steuerbetrag[] steuerbetraege;
    private Betrag vorausgezahlt;
    private Betrag zuZahlen;

    public Typ getTyp() { return _typ; }

    public OffsetDateTime getFaelligkeitsdatum() { return faelligkeitsdatum; }
    public void setFaelligkeitsdatum(OffsetDateTime value) { this.faelligkeitsdatum = value; }

    public Betrag getGesamtbrutto() { return gesamtbrutto; }
    public void setGesamtbrutto(Betrag value) { this.gesamtbrutto = value; }

    public Betrag getGesamtnetto() { return gesamtnetto; }
    public void setGesamtnetto(Betrag value) { this.gesamtnetto = value; }

    public Betrag getGesamtsteuer() { return gesamtsteuer; }
    public void setGesamtsteuer(Betrag value) { this.gesamtsteuer = value; }

    public Boolean getIstOriginal() { return istOriginal; }
    public void setIstOriginal(Boolean value) { this.istOriginal = value; }

    public Boolean getIstSimuliert() { return istSimuliert; }
    public void setIstSimuliert(Boolean value) { this.istSimuliert = value; }

    public Boolean getIstStorno() { return istStorno; }
    public void setIstStorno(Boolean value) { this.istStorno = value; }

    public Marktlokation getMarktlokation() { return marktlokation; }
    public void setMarktlokation(Marktlokation value) { this.marktlokation = value; }

    public Messlokation getMesslokation() { return messlokation; }
    public void setMesslokation(Messlokation value) { this.messlokation = value; }

    public NetznutzungRechnungsart getNetznutzungrechnungsart() { return netznutzungrechnungsart; }
    public void setNetznutzungrechnungsart(NetznutzungRechnungsart value) { this.netznutzungrechnungsart = value; }

    public NetznutzungRechnungstyp getNetznutzungrechnungstyp() { return netznutzungrechnungstyp; }
    public void setNetznutzungrechnungstyp(NetznutzungRechnungstyp value) { this.netznutzungrechnungstyp = value; }

    public String getOriginalRechnungsnummer() { return originalRechnungsnummer; }
    public void setOriginalRechnungsnummer(String value) { this.originalRechnungsnummer = value; }

    public Betrag getRabattBrutto() { return rabattBrutto; }
    public void setRabattBrutto(Betrag value) { this.rabattBrutto = value; }

    public OffsetDateTime getRechnungsdatum() { return rechnungsdatum; }
    public void setRechnungsdatum(OffsetDateTime value) { this.rechnungsdatum = value; }

    public Geschaeftspartner getRechnungsempfaenger() { return rechnungsempfaenger; }
    public void setRechnungsempfaenger(Geschaeftspartner value) { this.rechnungsempfaenger = value; }

    public Geschaeftspartner getRechnungsersteller() { return rechnungsersteller; }
    public void setRechnungsersteller(Geschaeftspartner value) { this.rechnungsersteller = value; }

    public String getRechnungsnummer() { return rechnungsnummer; }
    public void setRechnungsnummer(String value) { this.rechnungsnummer = value; }

    public Zeitraum getRechnungsperiode() { return rechnungsperiode; }
    public void setRechnungsperiode(Zeitraum value) { this.rechnungsperiode = value; }

    public Rechnungsposition[] getRechnungspositionen() { return rechnungspositionen; }
    public void setRechnungspositionen(Rechnungsposition[] value) { this.rechnungspositionen = value; }

    public Rechnungsstatus getRechnungsstatus() { return rechnungsstatus; }
    public void setRechnungsstatus(Rechnungsstatus value) { this.rechnungsstatus = value; }

    public String getRechnungstitel() { return rechnungstitel; }
    public void setRechnungstitel(String value) { this.rechnungstitel = value; }

    public Rechnungstyp getRechnungstyp() { return rechnungstyp; }
    public void setRechnungstyp(Rechnungstyp value) { this.rechnungstyp = value; }

    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

    public Steuerbetrag[] getSteuerbetraege() { return steuerbetraege; }
    public void setSteuerbetraege(Steuerbetrag[] value) { this.steuerbetraege = value; }

    public Betrag getVorausgezahlt() { return vorausgezahlt; }
    public void setVorausgezahlt(Betrag value) { this.vorausgezahlt = value; }

    public Betrag getZuZahlen() { return zuZahlen; }
    public void setZuZahlen(Betrag value) { this.zuZahlen = value; }
}
