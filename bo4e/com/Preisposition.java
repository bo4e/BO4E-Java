package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.BDEWArtikelnummer;
import bo4e.enums.Bemessungsgroesse;
import bo4e.enums.Kalkulationsmethode;
import bo4e.enums.Leistungstyp;
import bo4e.enums.Mengeneinheit;
import bo4e.enums.Tarifzeit;
import bo4e.enums.Waehrungseinheit;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Preis für eine definierte Lieferung oder Leistung innerhalb eines Preisblattes
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Preisposition.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Preisposition JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.6.0/src/bo4e_schemas/com/Preisposition.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Preisposition extends COM {
    private BDEWArtikelnummer bdewArtikelnummer;
    private Kalkulationsmethode berechnungsmethode;
    private Mengeneinheit bezugsgroesse;
    private Double freimengeBlindarbeit;
    private Double freimengeLeistungsfaktor;
    private String gruppenartikelId;
    private String leistungsbezeichnung;
    private Leistungstyp leistungstyp;
    private Waehrungseinheit preiseinheit;
    private List<Preisstaffel> preisstaffeln;
    private Tarifzeit tarifzeit;
    private Mengeneinheit zeitbasis;
    private Bemessungsgroesse zonungsgroesse;

    public Preisposition() {
    }

    private Preisposition(PreispositionBuilder builder) {
        super(builder);
        this.bdewArtikelnummer = builder.bdewArtikelnummer;
        this.berechnungsmethode = builder.berechnungsmethode;
        this.bezugsgroesse = builder.bezugsgroesse;
        this.freimengeBlindarbeit = builder.freimengeBlindarbeit;
        this.freimengeLeistungsfaktor = builder.freimengeLeistungsfaktor;
        this.gruppenartikelId = builder.gruppenartikelId;
        this.leistungsbezeichnung = builder.leistungsbezeichnung;
        this.leistungstyp = builder.leistungstyp;
        this.preiseinheit = builder.preiseinheit;
        this.preisstaffeln = builder.preisstaffeln;
        this.tarifzeit = builder.tarifzeit;
        this.zeitbasis = builder.zeitbasis;
        this.zonungsgroesse = builder.zonungsgroesse;
    }

    /**
    * Eine vom BDEW standardisierte Bezeichnug für die abgerechnete Leistungserbringung;
    * Diese Artikelnummer wird auch im Rechnungsteil der INVOIC verwendet.
    */
    public BDEWArtikelnummer getBdewArtikelnummer() {
        return bdewArtikelnummer;
    }

    /**
    * Eine vom BDEW standardisierte Bezeichnug für die abgerechnete Leistungserbringung;
    * Diese Artikelnummer wird auch im Rechnungsteil der INVOIC verwendet.
    */
    public void setBdewArtikelnummer(BDEWArtikelnummer bdewArtikelnummer) {
        this.bdewArtikelnummer = bdewArtikelnummer;
    }

    /**
    * Das Modell, das der Preisbildung zugrunde liegt
    */
    public Kalkulationsmethode getBerechnungsmethode() {
        return berechnungsmethode;
    }

    /**
    * Das Modell, das der Preisbildung zugrunde liegt
    */
    public void setBerechnungsmethode(Kalkulationsmethode berechnungsmethode) {
        this.berechnungsmethode = berechnungsmethode;
    }

    /**
    * Hier wird festgelegt, auf welche Bezugsgrösse sich der Preis bezieht, z.B. kWh oder Stück
    */
    public Mengeneinheit getBezugsgroesse() {
        return bezugsgroesse;
    }

    /**
    * Hier wird festgelegt, auf welche Bezugsgrösse sich der Preis bezieht, z.B. kWh oder Stück
    */
    public void setBezugsgroesse(Mengeneinheit bezugsgroesse) {
        this.bezugsgroesse = bezugsgroesse;
    }

    /**
    * Der Anteil der Menge der Blindarbeit in Prozent von der Wirkarbeit, für die keine
    * Abrechnung erfolgt
    */
    public Double getFreimengeBlindarbeit() {
        return freimengeBlindarbeit;
    }

    /**
    * Der Anteil der Menge der Blindarbeit in Prozent von der Wirkarbeit, für die keine
    * Abrechnung erfolgt
    */
    public void setFreimengeBlindarbeit(Double freimengeBlindarbeit) {
        this.freimengeBlindarbeit = freimengeBlindarbeit;
    }

    /**
    * Der cos phi (Verhältnis Wirkleistung/Scheinleistung) aus dem die Freimenge für die
    * Blindarbeit berechnet wird als
    * tan phi (Verhältnis Blindleistung/Wirkleistung)
    */
    public Double getFreimengeLeistungsfaktor() {
        return freimengeLeistungsfaktor;
    }

    /**
    * Der cos phi (Verhältnis Wirkleistung/Scheinleistung) aus dem die Freimenge für die
    * Blindarbeit berechnet wird als
    * tan phi (Verhältnis Blindleistung/Wirkleistung)
    */
    public void setFreimengeLeistungsfaktor(Double freimengeLeistungsfaktor) {
        this.freimengeLeistungsfaktor = freimengeLeistungsfaktor;
    }

    /**
    * Übergeordnete Gruppen-ID, die sich ggf. auf die Artikel-ID in der Preisstaffel bezieht
    */
    public String getGruppenartikelId() {
        return gruppenartikelId;
    }

    /**
    * Übergeordnete Gruppen-ID, die sich ggf. auf die Artikel-ID in der Preisstaffel bezieht
    */
    public void setGruppenartikelId(String gruppenartikelId) {
        this.gruppenartikelId = gruppenartikelId;
    }

    /**
    * Bezeichnung für die in der Position abgebildete Leistungserbringung
    */
    public String getLeistungsbezeichnung() {
        return leistungsbezeichnung;
    }

    /**
    * Bezeichnung für die in der Position abgebildete Leistungserbringung
    */
    public void setLeistungsbezeichnung(String leistungsbezeichnung) {
        this.leistungsbezeichnung = leistungsbezeichnung;
    }

    /**
    * Standardisierte Bezeichnung für die abgerechnete Leistungserbringung
    */
    public Leistungstyp getLeistungstyp() {
        return leistungstyp;
    }

    /**
    * Standardisierte Bezeichnung für die abgerechnete Leistungserbringung
    */
    public void setLeistungstyp(Leistungstyp leistungstyp) {
        this.leistungstyp = leistungstyp;
    }

    /**
    * Festlegung, mit welcher Preiseinheit abgerechnet wird, z.B. Ct. oder €
    */
    public Waehrungseinheit getPreiseinheit() {
        return preiseinheit;
    }

    /**
    * Festlegung, mit welcher Preiseinheit abgerechnet wird, z.B. Ct. oder €
    */
    public void setPreiseinheit(Waehrungseinheit preiseinheit) {
        this.preiseinheit = preiseinheit;
    }

    /**
    * Preisstaffeln, die zu dieser Preisposition gehören
    */
    public List<Preisstaffel> getPreisstaffeln() {
        return preisstaffeln;
    }

    /**
    * Preisstaffeln, die zu dieser Preisposition gehören
    */
    public void setPreisstaffeln(List<Preisstaffel> preisstaffeln) {
        this.preisstaffeln = preisstaffeln;
    }

    /**
    * Festlegung, für welche Tarifzeit der Preis hier festgelegt ist
    */
    public Tarifzeit getTarifzeit() {
        return tarifzeit;
    }

    /**
    * Festlegung, für welche Tarifzeit der Preis hier festgelegt ist
    */
    public void setTarifzeit(Tarifzeit tarifzeit) {
        this.tarifzeit = tarifzeit;
    }

    /**
    * Die Zeit(dauer) auf die sich der Preis bezieht.
    * Z.B. ein Jahr für einen Leistungspreis der in €/kW/Jahr ausgegeben wird
    */
    public Mengeneinheit getZeitbasis() {
        return zeitbasis;
    }

    /**
    * Die Zeit(dauer) auf die sich der Preis bezieht.
    * Z.B. ein Jahr für einen Leistungspreis der in €/kW/Jahr ausgegeben wird
    */
    public void setZeitbasis(Mengeneinheit zeitbasis) {
        this.zeitbasis = zeitbasis;
    }

    /**
    * Mit der Menge der hier angegebenen Größe wird die Staffelung/Zonung durchgeführt. Z.B.
    * Vollbenutzungsstunden
    */
    public Bemessungsgroesse getZonungsgroesse() {
        return zonungsgroesse;
    }

    /**
    * Mit der Menge der hier angegebenen Größe wird die Staffelung/Zonung durchgeführt. Z.B.
    * Vollbenutzungsstunden
    */
    public void setZonungsgroesse(Bemessungsgroesse zonungsgroesse) {
        this.zonungsgroesse = zonungsgroesse;
    }

    public static PreispositionBuilder builder() {
        return new PreispositionBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class PreispositionBuilder extends COMBuilder {
        private BDEWArtikelnummer bdewArtikelnummer;
        private Kalkulationsmethode berechnungsmethode;
        private Mengeneinheit bezugsgroesse;
        private Double freimengeBlindarbeit;
        private Double freimengeLeistungsfaktor;
        private String gruppenartikelId;
        private String leistungsbezeichnung;
        private Leistungstyp leistungstyp;
        private Waehrungseinheit preiseinheit;
        private List<Preisstaffel> preisstaffeln;
        private Tarifzeit tarifzeit;
        private Mengeneinheit zeitbasis;
        private Bemessungsgroesse zonungsgroesse;

        private PreispositionBuilder() {
        }

        /**
        * Eine vom BDEW standardisierte Bezeichnug für die abgerechnete Leistungserbringung;
        * Diese Artikelnummer wird auch im Rechnungsteil der INVOIC verwendet.
        */
        public PreispositionBuilder setBdewArtikelnummer(BDEWArtikelnummer bdewArtikelnummer) {
            this.bdewArtikelnummer = bdewArtikelnummer;
            return this;
        }

        /**
        * Das Modell, das der Preisbildung zugrunde liegt
        */
        public PreispositionBuilder setBerechnungsmethode(Kalkulationsmethode berechnungsmethode) {
            this.berechnungsmethode = berechnungsmethode;
            return this;
        }

        /**
        * Hier wird festgelegt, auf welche Bezugsgrösse sich der Preis bezieht, z.B. kWh oder Stück
        */
        public PreispositionBuilder setBezugsgroesse(Mengeneinheit bezugsgroesse) {
            this.bezugsgroesse = bezugsgroesse;
            return this;
        }

        /**
        * Der Anteil der Menge der Blindarbeit in Prozent von der Wirkarbeit, für die keine
        * Abrechnung erfolgt
        */
        public PreispositionBuilder setFreimengeBlindarbeit(Double freimengeBlindarbeit) {
            this.freimengeBlindarbeit = freimengeBlindarbeit;
            return this;
        }

        /**
        * Der cos phi (Verhältnis Wirkleistung/Scheinleistung) aus dem die Freimenge für die
        * Blindarbeit berechnet wird als
        * tan phi (Verhältnis Blindleistung/Wirkleistung)
        */
        public PreispositionBuilder setFreimengeLeistungsfaktor(Double freimengeLeistungsfaktor) {
            this.freimengeLeistungsfaktor = freimengeLeistungsfaktor;
            return this;
        }

        /**
        * Übergeordnete Gruppen-ID, die sich ggf. auf die Artikel-ID in der Preisstaffel bezieht
        */
        public PreispositionBuilder setGruppenartikelId(String gruppenartikelId) {
            this.gruppenartikelId = gruppenartikelId;
            return this;
        }

        /**
        * Bezeichnung für die in der Position abgebildete Leistungserbringung
        */
        public PreispositionBuilder setLeistungsbezeichnung(String leistungsbezeichnung) {
            this.leistungsbezeichnung = leistungsbezeichnung;
            return this;
        }

        /**
        * Standardisierte Bezeichnung für die abgerechnete Leistungserbringung
        */
        public PreispositionBuilder setLeistungstyp(Leistungstyp leistungstyp) {
            this.leistungstyp = leistungstyp;
            return this;
        }

        /**
        * Festlegung, mit welcher Preiseinheit abgerechnet wird, z.B. Ct. oder €
        */
        public PreispositionBuilder setPreiseinheit(Waehrungseinheit preiseinheit) {
            this.preiseinheit = preiseinheit;
            return this;
        }

        /**
        * Preisstaffeln, die zu dieser Preisposition gehören
        */
        public PreispositionBuilder setPreisstaffeln(List<Preisstaffel> preisstaffeln) {
            this.preisstaffeln = preisstaffeln;
            return this;
        }

        /**
        * Festlegung, für welche Tarifzeit der Preis hier festgelegt ist
        */
        public PreispositionBuilder setTarifzeit(Tarifzeit tarifzeit) {
            this.tarifzeit = tarifzeit;
            return this;
        }

        /**
        * Die Zeit(dauer) auf die sich der Preis bezieht.
        * Z.B. ein Jahr für einen Leistungspreis der in €/kW/Jahr ausgegeben wird
        */
        public PreispositionBuilder setZeitbasis(Mengeneinheit zeitbasis) {
            this.zeitbasis = zeitbasis;
            return this;
        }

        /**
        * Mit der Menge der hier angegebenen Größe wird die Staffelung/Zonung durchgeführt. Z.B.
        * Vollbenutzungsstunden
        */
        public PreispositionBuilder setZonungsgroesse(Bemessungsgroesse zonungsgroesse) {
            this.zonungsgroesse = zonungsgroesse;
            return this;
        }

        public PreispositionBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public PreispositionBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Preisposition build() {
            return new Preisposition(this);
        }
    }
}