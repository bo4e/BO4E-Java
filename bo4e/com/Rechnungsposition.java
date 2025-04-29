package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.BDEWArtikelnummer;
import bo4e.enums.ComTyp;
import bo4e.enums.Mengeneinheit;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.OffsetDateTime;
import java.util.List;

/**
* Über Rechnungspositionen werden Rechnungen strukturiert.
* In einem Rechnungsteil wird jeweils eine in sich geschlossene Leistung abgerechnet.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Rechnungsposition.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Rechnungsposition JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.0.0/src/bo4e_schemas/com/Rechnungsposition.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Rechnungsposition extends COM {
    private final ComTyp _typ = ComTyp.RECHNUNGSPOSITION;
    private String artikelId;
    private BDEWArtikelnummer artikelnummer;
    private Preis einzelpreis;
    private OffsetDateTime lieferungBis;
    private OffsetDateTime lieferungVon;
    private String lokationsId;
    private Menge positionsMenge;
    private Long positionsnummer;
    private String positionstext;
    private Betrag teilrabattNetto;
    private Betrag teilsummeNetto;
    private Steuerbetrag teilsummeSteuer;
    private Menge zeitbezogeneMenge;
    private Mengeneinheit zeiteinheit;

    public Rechnungsposition() {
    }

    private Rechnungsposition(RechnungspositionBuilder builder) {
        super(builder);
        this.artikelId = builder.artikelId;
        this.artikelnummer = builder.artikelnummer;
        this.einzelpreis = builder.einzelpreis;
        this.lieferungBis = builder.lieferungBis;
        this.lieferungVon = builder.lieferungVon;
        this.lokationsId = builder.lokationsId;
        this.positionsMenge = builder.positionsMenge;
        this.positionsnummer = builder.positionsnummer;
        this.positionstext = builder.positionstext;
        this.teilrabattNetto = builder.teilrabattNetto;
        this.teilsummeNetto = builder.teilsummeNetto;
        this.teilsummeSteuer = builder.teilsummeSteuer;
        this.zeitbezogeneMenge = builder.zeitbezogeneMenge;
        this.zeiteinheit = builder.zeiteinheit;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Standardisierte vom BDEW herausgegebene Liste, welche im Strommarkt die
    * BDEW-Artikelnummer ablöst
    */
    public String getArtikelId() {
        return artikelId;
    }

    /**
    * Standardisierte vom BDEW herausgegebene Liste, welche im Strommarkt die
    * BDEW-Artikelnummer ablöst
    */
    public void setArtikelId(String artikelId) {
        this.artikelId = artikelId;
    }

    /**
    * Kennzeichnung der Rechnungsposition mit der Standard-Artikelnummer des BDEW
    */
    public BDEWArtikelnummer getArtikelnummer() {
        return artikelnummer;
    }

    /**
    * Kennzeichnung der Rechnungsposition mit der Standard-Artikelnummer des BDEW
    */
    public void setArtikelnummer(BDEWArtikelnummer artikelnummer) {
        this.artikelnummer = artikelnummer;
    }

    /**
    * Der Preis für eine Einheit der energetischen Menge
    */
    public Preis getEinzelpreis() {
        return einzelpreis;
    }

    /**
    * Der Preis für eine Einheit der energetischen Menge
    */
    public void setEinzelpreis(Preis einzelpreis) {
        this.einzelpreis = einzelpreis;
    }

    /**
    * Ende der Lieferung für die abgerechnete Leistung (exklusiv)
    */
    public OffsetDateTime getLieferungBis() {
        return lieferungBis;
    }

    /**
    * Ende der Lieferung für die abgerechnete Leistung (exklusiv)
    */
    public void setLieferungBis(OffsetDateTime lieferungBis) {
        this.lieferungBis = lieferungBis;
    }

    /**
    * Start der Lieferung für die abgerechnete Leistung (inklusiv)
    */
    public OffsetDateTime getLieferungVon() {
        return lieferungVon;
    }

    /**
    * Start der Lieferung für die abgerechnete Leistung (inklusiv)
    */
    public void setLieferungVon(OffsetDateTime lieferungVon) {
        this.lieferungVon = lieferungVon;
    }

    /**
    * Marktlokation, die zu dieser Position gehört
    */
    public String getLokationsId() {
        return lokationsId;
    }

    /**
    * Marktlokation, die zu dieser Position gehört
    */
    public void setLokationsId(String lokationsId) {
        this.lokationsId = lokationsId;
    }

    /**
    * Die abgerechnete Menge mit Einheit
    */
    public Menge getPositionsMenge() {
        return positionsMenge;
    }

    /**
    * Die abgerechnete Menge mit Einheit
    */
    public void setPositionsMenge(Menge positionsMenge) {
        this.positionsMenge = positionsMenge;
    }

    /**
    * Fortlaufende Nummer für die Rechnungsposition
    */
    public Long getPositionsnummer() {
        return positionsnummer;
    }

    /**
    * Fortlaufende Nummer für die Rechnungsposition
    */
    public void setPositionsnummer(Long positionsnummer) {
        this.positionsnummer = positionsnummer;
    }

    /**
    * Bezeichung für die abgerechnete Position
    */
    public String getPositionstext() {
        return positionstext;
    }

    /**
    * Bezeichung für die abgerechnete Position
    */
    public void setPositionstext(String positionstext) {
        this.positionstext = positionstext;
    }

    /**
    * Nettobetrag für den Rabatt dieser Position
    */
    public Betrag getTeilrabattNetto() {
        return teilrabattNetto;
    }

    /**
    * Nettobetrag für den Rabatt dieser Position
    */
    public void setTeilrabattNetto(Betrag teilrabattNetto) {
        this.teilrabattNetto = teilrabattNetto;
    }

    /**
    * Das Ergebnis der Multiplikation aus einzelpreis * positionsMenge * (Faktor aus
    * zeitbezogeneMenge).
    * Z.B. 12,60€ * 120 kW * 3/12 (für 3 Monate).
    */
    public Betrag getTeilsummeNetto() {
        return teilsummeNetto;
    }

    /**
    * Das Ergebnis der Multiplikation aus einzelpreis * positionsMenge * (Faktor aus
    * zeitbezogeneMenge).
    * Z.B. 12,60€ * 120 kW * 3/12 (für 3 Monate).
    */
    public void setTeilsummeNetto(Betrag teilsummeNetto) {
        this.teilsummeNetto = teilsummeNetto;
    }

    /**
    * Auf die Position entfallende Steuer, bestehend aus Steuersatz und Betrag
    */
    public Steuerbetrag getTeilsummeSteuer() {
        return teilsummeSteuer;
    }

    /**
    * Auf die Position entfallende Steuer, bestehend aus Steuersatz und Betrag
    */
    public void setTeilsummeSteuer(Steuerbetrag teilsummeSteuer) {
        this.teilsummeSteuer = teilsummeSteuer;
    }

    /**
    * Eine auf die Zeiteinheit bezogene Untermenge.
    * Z.B. bei einem Jahrespreis, 3 Monate oder 146 Tage.
    * Basierend darauf wird der Preis aufgeteilt.
    */
    public Menge getZeitbezogeneMenge() {
        return zeitbezogeneMenge;
    }

    /**
    * Eine auf die Zeiteinheit bezogene Untermenge.
    * Z.B. bei einem Jahrespreis, 3 Monate oder 146 Tage.
    * Basierend darauf wird der Preis aufgeteilt.
    */
    public void setZeitbezogeneMenge(Menge zeitbezogeneMenge) {
        this.zeitbezogeneMenge = zeitbezogeneMenge;
    }

    /**
    * Falls sich der Preis auf eine Zeit bezieht, steht hier die Einheit
    */
    public Mengeneinheit getZeiteinheit() {
        return zeiteinheit;
    }

    /**
    * Falls sich der Preis auf eine Zeit bezieht, steht hier die Einheit
    */
    public void setZeiteinheit(Mengeneinheit zeiteinheit) {
        this.zeiteinheit = zeiteinheit;
    }

    public static RechnungspositionBuilder builder() {
        return new RechnungspositionBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class RechnungspositionBuilder extends COMBuilder {
        private String artikelId;
        private BDEWArtikelnummer artikelnummer;
        private Preis einzelpreis;
        private OffsetDateTime lieferungBis;
        private OffsetDateTime lieferungVon;
        private String lokationsId;
        private Menge positionsMenge;
        private Long positionsnummer;
        private String positionstext;
        private Betrag teilrabattNetto;
        private Betrag teilsummeNetto;
        private Steuerbetrag teilsummeSteuer;
        private Menge zeitbezogeneMenge;
        private Mengeneinheit zeiteinheit;

        private RechnungspositionBuilder() {
        }

        /**
        * Standardisierte vom BDEW herausgegebene Liste, welche im Strommarkt die
        * BDEW-Artikelnummer ablöst
        */
        public RechnungspositionBuilder setArtikelId(String artikelId) {
            this.artikelId = artikelId;
            return this;
        }

        /**
        * Kennzeichnung der Rechnungsposition mit der Standard-Artikelnummer des BDEW
        */
        public RechnungspositionBuilder setArtikelnummer(BDEWArtikelnummer artikelnummer) {
            this.artikelnummer = artikelnummer;
            return this;
        }

        /**
        * Der Preis für eine Einheit der energetischen Menge
        */
        public RechnungspositionBuilder setEinzelpreis(Preis einzelpreis) {
            this.einzelpreis = einzelpreis;
            return this;
        }

        /**
        * Ende der Lieferung für die abgerechnete Leistung (exklusiv)
        */
        public RechnungspositionBuilder setLieferungBis(OffsetDateTime lieferungBis) {
            this.lieferungBis = lieferungBis;
            return this;
        }

        /**
        * Start der Lieferung für die abgerechnete Leistung (inklusiv)
        */
        public RechnungspositionBuilder setLieferungVon(OffsetDateTime lieferungVon) {
            this.lieferungVon = lieferungVon;
            return this;
        }

        /**
        * Marktlokation, die zu dieser Position gehört
        */
        public RechnungspositionBuilder setLokationsId(String lokationsId) {
            this.lokationsId = lokationsId;
            return this;
        }

        /**
        * Die abgerechnete Menge mit Einheit
        */
        public RechnungspositionBuilder setPositionsMenge(Menge positionsMenge) {
            this.positionsMenge = positionsMenge;
            return this;
        }

        /**
        * Fortlaufende Nummer für die Rechnungsposition
        */
        public RechnungspositionBuilder setPositionsnummer(Long positionsnummer) {
            this.positionsnummer = positionsnummer;
            return this;
        }

        /**
        * Bezeichung für die abgerechnete Position
        */
        public RechnungspositionBuilder setPositionstext(String positionstext) {
            this.positionstext = positionstext;
            return this;
        }

        /**
        * Nettobetrag für den Rabatt dieser Position
        */
        public RechnungspositionBuilder setTeilrabattNetto(Betrag teilrabattNetto) {
            this.teilrabattNetto = teilrabattNetto;
            return this;
        }

        /**
        * Das Ergebnis der Multiplikation aus einzelpreis * positionsMenge * (Faktor aus
        * zeitbezogeneMenge).
        * Z.B. 12,60€ * 120 kW * 3/12 (für 3 Monate).
        */
        public RechnungspositionBuilder setTeilsummeNetto(Betrag teilsummeNetto) {
            this.teilsummeNetto = teilsummeNetto;
            return this;
        }

        /**
        * Auf die Position entfallende Steuer, bestehend aus Steuersatz und Betrag
        */
        public RechnungspositionBuilder setTeilsummeSteuer(Steuerbetrag teilsummeSteuer) {
            this.teilsummeSteuer = teilsummeSteuer;
            return this;
        }

        /**
        * Eine auf die Zeiteinheit bezogene Untermenge.
        * Z.B. bei einem Jahrespreis, 3 Monate oder 146 Tage.
        * Basierend darauf wird der Preis aufgeteilt.
        */
        public RechnungspositionBuilder setZeitbezogeneMenge(Menge zeitbezogeneMenge) {
            this.zeitbezogeneMenge = zeitbezogeneMenge;
            return this;
        }

        /**
        * Falls sich der Preis auf eine Zeit bezieht, steht hier die Einheit
        */
        public RechnungspositionBuilder setZeiteinheit(Mengeneinheit zeiteinheit) {
            this.zeiteinheit = zeiteinheit;
            return this;
        }

        public RechnungspositionBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public RechnungspositionBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Rechnungsposition build() {
            return new Rechnungsposition(this);
        }
    }
}