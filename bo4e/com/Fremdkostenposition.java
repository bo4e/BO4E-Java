package bo4e.com;

import bo4e.ZusatzAttribut;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Eine Kostenposition im Bereich der Fremdkosten
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Fremdkostenposition.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Fremdkostenposition JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/com/Fremdkostenposition.json>`_
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Fremdkostenposition extends COM {
    private String artikelbezeichnung;
    private String artikeldetail;
    private Betrag betragKostenposition;
    private OffsetDateTime bis;
    private Preis einzelpreis;
    private String gebietcodeEic;
    private String linkPreisblatt;
    private String marktpartnercode;
    private String marktpartnername;
    private Menge menge;
    private String positionstitel;
    private OffsetDateTime von;
    private Menge zeitmenge;

    public Fremdkostenposition() {
    }

    private Fremdkostenposition(FremdkostenpositionBuilder builder) {
        super(builder);
        this.artikelbezeichnung = builder.artikelbezeichnung;
        this.artikeldetail = builder.artikeldetail;
        this.betragKostenposition = builder.betragKostenposition;
        this.bis = builder.bis;
        this.einzelpreis = builder.einzelpreis;
        this.gebietcodeEic = builder.gebietcodeEic;
        this.linkPreisblatt = builder.linkPreisblatt;
        this.marktpartnercode = builder.marktpartnercode;
        this.marktpartnername = builder.marktpartnername;
        this.menge = builder.menge;
        this.positionstitel = builder.positionstitel;
        this.von = builder.von;
        this.zeitmenge = builder.zeitmenge;
    }

    /**
     * Bezeichnung für den Artikel für den die Kosten ermittelt wurden. Beispiel: Arbeitspreis HT
     */
    public String getArtikelbezeichnung() {
        return artikelbezeichnung;
    }

    /**
     * Bezeichnung für den Artikel für den die Kosten ermittelt wurden. Beispiel: Arbeitspreis HT
     */
    public void setArtikelbezeichnung(String artikelbezeichnung) {
        this.artikelbezeichnung = artikelbezeichnung;
    }

    /**
     * Detaillierung des Artikels (optional). Beispiel: 'Drehstromzähler'
     */
    public String getArtikeldetail() {
        return artikeldetail;
    }

    /**
     * Detaillierung des Artikels (optional). Beispiel: 'Drehstromzähler'
     */
    public void setArtikeldetail(String artikeldetail) {
        this.artikeldetail = artikeldetail;
    }

    /**
     * Der errechnete Gesamtbetrag der Position als Ergebnis der Berechnung <Menge *
     * Einzelpreis> oder
     * <Einzelpreis / (Anzahl Tage Jahr) * zeitmenge>
     */
    public Betrag getBetragKostenposition() {
        return betragKostenposition;
    }

    /**
     * Der errechnete Gesamtbetrag der Position als Ergebnis der Berechnung <Menge *
     * Einzelpreis> oder
     * <Einzelpreis / (Anzahl Tage Jahr) * zeitmenge>
     */
    public void setBetragKostenposition(Betrag betragKostenposition) {
        this.betragKostenposition = betragKostenposition;
    }

    /**
     * exklusiver bis-Zeitpunkt der Kostenzeitscheibe
     */
    public OffsetDateTime getBis() {
        return bis;
    }

    /**
     * exklusiver bis-Zeitpunkt der Kostenzeitscheibe
     */
    public void setBis(OffsetDateTime bis) {
        this.bis = bis;
    }

    /**
     * Der Preis für eine Einheit. Beispiele: 5,8200 ct/kWh oder 55 €/Jahr.
     */
    public Preis getEinzelpreis() {
        return einzelpreis;
    }

    /**
     * Der Preis für eine Einheit. Beispiele: 5,8200 ct/kWh oder 55 €/Jahr.
     */
    public void setEinzelpreis(Preis einzelpreis) {
        this.einzelpreis = einzelpreis;
    }

    /**
     * EIC-Code des Regel- oder Marktgebietes eingetragen. Z.B. '10YDE-EON------1' für die
     * Regelzone TenneT
     */
    public String getGebietcodeEic() {
        return gebietcodeEic;
    }

    /**
     * EIC-Code des Regel- oder Marktgebietes eingetragen. Z.B. '10YDE-EON------1' für die
     * Regelzone TenneT
     */
    public void setGebietcodeEic(String gebietcodeEic) {
        this.gebietcodeEic = gebietcodeEic;
    }

    /**
     * Link zum veröffentlichten Preisblatt
     */
    public String getLinkPreisblatt() {
        return linkPreisblatt;
    }

    /**
     * Link zum veröffentlichten Preisblatt
     */
    public void setLinkPreisblatt(String linkPreisblatt) {
        this.linkPreisblatt = linkPreisblatt;
    }

    /**
     * Die Codenummer (z.B. BDEW-Codenummer) des Marktpartners, der die Preise festlegt / die
     * Kosten in Rechnung stellt
     */
    public String getMarktpartnercode() {
        return marktpartnercode;
    }

    /**
     * Die Codenummer (z.B. BDEW-Codenummer) des Marktpartners, der die Preise festlegt / die
     * Kosten in Rechnung stellt
     */
    public void setMarktpartnercode(String marktpartnercode) {
        this.marktpartnercode = marktpartnercode;
    }

    /**
     * Der Name des Marktpartners, der die Preise festlegt, bzw. die Kosten in Rechnung stellt
     */
    public String getMarktpartnername() {
        return marktpartnername;
    }

    /**
     * Der Name des Marktpartners, der die Preise festlegt, bzw. die Kosten in Rechnung stellt
     */
    public void setMarktpartnername(String marktpartnername) {
        this.marktpartnername = marktpartnername;
    }

    /**
     * Die Menge, die in die Kostenberechnung eingeflossen ist. Beispiel: 3.660 kWh
     */
    public Menge getMenge() {
        return menge;
    }

    /**
     * Die Menge, die in die Kostenberechnung eingeflossen ist. Beispiel: 3.660 kWh
     */
    public void setMenge(Menge menge) {
        this.menge = menge;
    }

    /**
     * Ein Titel für die Zeile. Hier kann z.B. der Netzbetreiber eingetragen werden, wenn es
     * sich um Netzkosten handelt.
     */
    public String getPositionstitel() {
        return positionstitel;
    }

    /**
     * Ein Titel für die Zeile. Hier kann z.B. der Netzbetreiber eingetragen werden, wenn es
     * sich um Netzkosten handelt.
     */
    public void setPositionstitel(String positionstitel) {
        this.positionstitel = positionstitel;
    }

    /**
     * inklusiver von-Zeitpunkt der Kostenzeitscheibe
     */
    public OffsetDateTime getVon() {
        return von;
    }

    /**
     * inklusiver von-Zeitpunkt der Kostenzeitscheibe
     */
    public void setVon(OffsetDateTime von) {
        this.von = von;
    }

    /**
     * Wenn es einen zeitbasierten Preis gibt (z.B. €/Jahr), dann ist hier die Menge angegeben
     * mit der die Kosten berechnet
     * wurden. Z.B. 138 Tage.
     */
    public Menge getZeitmenge() {
        return zeitmenge;
    }

    /**
     * Wenn es einen zeitbasierten Preis gibt (z.B. €/Jahr), dann ist hier die Menge angegeben
     * mit der die Kosten berechnet
     * wurden. Z.B. 138 Tage.
     */
    public void setZeitmenge(Menge zeitmenge) {
        this.zeitmenge = zeitmenge;
    }

    public static FremdkostenpositionBuilder builder() {
        return new FremdkostenpositionBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class FremdkostenpositionBuilder extends COMBuilder {
        private String artikelbezeichnung;
        private String artikeldetail;
        private Betrag betragKostenposition;
        private OffsetDateTime bis;
        private Preis einzelpreis;
        private String gebietcodeEic;
        private String linkPreisblatt;
        private String marktpartnercode;
        private String marktpartnername;
        private Menge menge;
        private String positionstitel;
        private OffsetDateTime von;
        private Menge zeitmenge;

        private FremdkostenpositionBuilder() {
        }

        /**
         * Bezeichnung für den Artikel für den die Kosten ermittelt wurden. Beispiel: Arbeitspreis HT
         */
        public String getArtikelbezeichnung() {
            return artikelbezeichnung;
        }

        /**
         * Bezeichnung für den Artikel für den die Kosten ermittelt wurden. Beispiel: Arbeitspreis HT
         */
        public FremdkostenpositionBuilder setArtikelbezeichnung(String artikelbezeichnung) {
            this.artikelbezeichnung = artikelbezeichnung;
            return this;
        }

        /**
         * Detaillierung des Artikels (optional). Beispiel: 'Drehstromzähler'
         */
        public String getArtikeldetail() {
            return artikeldetail;
        }

        /**
         * Detaillierung des Artikels (optional). Beispiel: 'Drehstromzähler'
         */
        public FremdkostenpositionBuilder setArtikeldetail(String artikeldetail) {
            this.artikeldetail = artikeldetail;
            return this;
        }

        /**
         * Der errechnete Gesamtbetrag der Position als Ergebnis der Berechnung <Menge *
         * Einzelpreis> oder
         * <Einzelpreis / (Anzahl Tage Jahr) * zeitmenge>
         */
        public Betrag getBetragKostenposition() {
            return betragKostenposition;
        }

        /**
         * Der errechnete Gesamtbetrag der Position als Ergebnis der Berechnung <Menge *
         * Einzelpreis> oder
         * <Einzelpreis / (Anzahl Tage Jahr) * zeitmenge>
         */
        public FremdkostenpositionBuilder setBetragKostenposition(Betrag betragKostenposition) {
            this.betragKostenposition = betragKostenposition;
            return this;
        }

        /**
         * exklusiver bis-Zeitpunkt der Kostenzeitscheibe
         */
        public OffsetDateTime getBis() {
            return bis;
        }

        /**
         * exklusiver bis-Zeitpunkt der Kostenzeitscheibe
         */
        public FremdkostenpositionBuilder setBis(OffsetDateTime bis) {
            this.bis = bis;
            return this;
        }

        /**
         * Der Preis für eine Einheit. Beispiele: 5,8200 ct/kWh oder 55 €/Jahr.
         */
        public Preis getEinzelpreis() {
            return einzelpreis;
        }

        /**
         * Der Preis für eine Einheit. Beispiele: 5,8200 ct/kWh oder 55 €/Jahr.
         */
        public FremdkostenpositionBuilder setEinzelpreis(Preis einzelpreis) {
            this.einzelpreis = einzelpreis;
            return this;
        }

        /**
         * EIC-Code des Regel- oder Marktgebietes eingetragen. Z.B. '10YDE-EON------1' für die
         * Regelzone TenneT
         */
        public String getGebietcodeEic() {
            return gebietcodeEic;
        }

        /**
         * EIC-Code des Regel- oder Marktgebietes eingetragen. Z.B. '10YDE-EON------1' für die
         * Regelzone TenneT
         */
        public FremdkostenpositionBuilder setGebietcodeEic(String gebietcodeEic) {
            this.gebietcodeEic = gebietcodeEic;
            return this;
        }

        /**
         * Link zum veröffentlichten Preisblatt
         */
        public String getLinkPreisblatt() {
            return linkPreisblatt;
        }

        /**
         * Link zum veröffentlichten Preisblatt
         */
        public FremdkostenpositionBuilder setLinkPreisblatt(String linkPreisblatt) {
            this.linkPreisblatt = linkPreisblatt;
            return this;
        }

        /**
         * Die Codenummer (z.B. BDEW-Codenummer) des Marktpartners, der die Preise festlegt / die
         * Kosten in Rechnung stellt
         */
        public String getMarktpartnercode() {
            return marktpartnercode;
        }

        /**
         * Die Codenummer (z.B. BDEW-Codenummer) des Marktpartners, der die Preise festlegt / die
         * Kosten in Rechnung stellt
         */
        public FremdkostenpositionBuilder setMarktpartnercode(String marktpartnercode) {
            this.marktpartnercode = marktpartnercode;
            return this;
        }

        /**
         * Der Name des Marktpartners, der die Preise festlegt, bzw. die Kosten in Rechnung stellt
         */
        public String getMarktpartnername() {
            return marktpartnername;
        }

        /**
         * Der Name des Marktpartners, der die Preise festlegt, bzw. die Kosten in Rechnung stellt
         */
        public FremdkostenpositionBuilder setMarktpartnername(String marktpartnername) {
            this.marktpartnername = marktpartnername;
            return this;
        }

        /**
         * Die Menge, die in die Kostenberechnung eingeflossen ist. Beispiel: 3.660 kWh
         */
        public Menge getMenge() {
            return menge;
        }

        /**
         * Die Menge, die in die Kostenberechnung eingeflossen ist. Beispiel: 3.660 kWh
         */
        public FremdkostenpositionBuilder setMenge(Menge menge) {
            this.menge = menge;
            return this;
        }

        /**
         * Ein Titel für die Zeile. Hier kann z.B. der Netzbetreiber eingetragen werden, wenn es
         * sich um Netzkosten handelt.
         */
        public String getPositionstitel() {
            return positionstitel;
        }

        /**
         * Ein Titel für die Zeile. Hier kann z.B. der Netzbetreiber eingetragen werden, wenn es
         * sich um Netzkosten handelt.
         */
        public FremdkostenpositionBuilder setPositionstitel(String positionstitel) {
            this.positionstitel = positionstitel;
            return this;
        }

        /**
         * inklusiver von-Zeitpunkt der Kostenzeitscheibe
         */
        public OffsetDateTime getVon() {
            return von;
        }

        /**
         * inklusiver von-Zeitpunkt der Kostenzeitscheibe
         */
        public FremdkostenpositionBuilder setVon(OffsetDateTime von) {
            this.von = von;
            return this;
        }

        /**
         * Wenn es einen zeitbasierten Preis gibt (z.B. €/Jahr), dann ist hier die Menge angegeben
         * mit der die Kosten berechnet
         * wurden. Z.B. 138 Tage.
         */
        public Menge getZeitmenge() {
            return zeitmenge;
        }

        /**
         * Wenn es einen zeitbasierten Preis gibt (z.B. €/Jahr), dann ist hier die Menge angegeben
         * mit der die Kosten berechnet
         * wurden. Z.B. 138 Tage.
         */
        public FremdkostenpositionBuilder setZeitmenge(Menge zeitmenge) {
            this.zeitmenge = zeitmenge;
            return this;
        }

        public FremdkostenpositionBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public FremdkostenpositionBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Fremdkostenposition build() {
            return new Fremdkostenposition(this);
        }
    }
}