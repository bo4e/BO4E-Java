package bo4e.com;

import bo4e.ZusatzAttribut;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Diese Komponente wird zur Übertagung der Details zu einer Kostenposition verwendet.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Kostenposition.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Kostenposition JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/com/Kostenposition.json>`_
 */
public class Kostenposition extends COM {
    private String artikelbezeichnung;
    private String artikeldetail;
    private Betrag betragKostenposition;
    private OffsetDateTime bis;
    private Preis einzelpreis;
    private Menge menge;
    private String positionstitel;
    private OffsetDateTime von;
    private Menge zeitmenge;

    public Kostenposition() {
    }

    private Kostenposition(KostenpositionBuilder builder) {
        super(builder);
        this.artikelbezeichnung = builder.artikelbezeichnung;
        this.artikeldetail = builder.artikeldetail;
        this.betragKostenposition = builder.betragKostenposition;
        this.bis = builder.bis;
        this.einzelpreis = builder.einzelpreis;
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

    public static KostenpositionBuilder builder() {
        return new KostenpositionBuilder();
    }

    public static class KostenpositionBuilder extends COMBuilder {
        private String artikelbezeichnung;
        private String artikeldetail;
        private Betrag betragKostenposition;
        private OffsetDateTime bis;
        private Preis einzelpreis;
        private Menge menge;
        private String positionstitel;
        private OffsetDateTime von;
        private Menge zeitmenge;

        private KostenpositionBuilder() {
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
        public KostenpositionBuilder setArtikelbezeichnung(String artikelbezeichnung) {
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
        public KostenpositionBuilder setArtikeldetail(String artikeldetail) {
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
        public KostenpositionBuilder setBetragKostenposition(Betrag betragKostenposition) {
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
        public KostenpositionBuilder setBis(OffsetDateTime bis) {
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
        public KostenpositionBuilder setEinzelpreis(Preis einzelpreis) {
            this.einzelpreis = einzelpreis;
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
        public KostenpositionBuilder setMenge(Menge menge) {
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
        public KostenpositionBuilder setPositionstitel(String positionstitel) {
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
        public KostenpositionBuilder setVon(OffsetDateTime von) {
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
        public KostenpositionBuilder setZeitmenge(Menge zeitmenge) {
            this.zeitmenge = zeitmenge;
            return this;
        }

        public KostenpositionBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public KostenpositionBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Kostenposition build() {
            return new Kostenposition(this);
        }
    }
}