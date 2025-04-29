package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Energiemix;
import bo4e.com.Vertragskonditionen;
import bo4e.com.Zeitraum;
import bo4e.enums.BoTyp;
import bo4e.enums.Kundentyp;
import bo4e.enums.Registeranzahl;
import bo4e.enums.Sparte;
import bo4e.enums.Tarifmerkmal;
import bo4e.enums.Tariftyp;

import java.time.OffsetDateTime;
import java.util.List;

/**
* Objekt zur Kommunikation von Kosten, die im Rahmen der Tarifanwendung entstehen
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Tarifkosten.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Tarifkosten JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.7.0/src/bo4e_schemas/bo/Tarifkosten.json>`_
*/
public class Tarifkosten extends Geschaeftsobjekt {
    private final BoTyp _typ = BoTyp.TARIFKOSTEN;
    private Marktteilnehmer anbieter;
    private String anbietername;
    private OffsetDateTime anwendungVon;
    private String bemerkung;
    private String bezeichnung;
    private Energiemix energiemix;
    private Kosten kosten;
    private List<Kundentyp> kundentypen;
    private Registeranzahl registeranzahl;
    private Sparte sparte;
    private List<Tarifmerkmal> tarifmerkmale;
    private Tariftyp tariftyp;
    private Vertragskonditionen vertragskonditionen;
    private String website;
    private Zeitraum zeitlicheGueltigkeit;

    public Tarifkosten() {
    }

    private Tarifkosten(TarifkostenBuilder builder) {
        super(builder);
        this.anbieter = builder.anbieter;
        this.anbietername = builder.anbietername;
        this.anwendungVon = builder.anwendungVon;
        this.bemerkung = builder.bemerkung;
        this.bezeichnung = builder.bezeichnung;
        this.energiemix = builder.energiemix;
        this.kosten = builder.kosten;
        this.kundentypen = builder.kundentypen;
        this.registeranzahl = builder.registeranzahl;
        this.sparte = builder.sparte;
        this.tarifmerkmale = builder.tarifmerkmale;
        this.tariftyp = builder.tariftyp;
        this.vertragskonditionen = builder.vertragskonditionen;
        this.website = builder.website;
        this.zeitlicheGueltigkeit = builder.zeitlicheGueltigkeit;
    }

    public BoTyp get_typ() {
        return _typ;
    }

    /**
    * Der Marktteilnehmer (Lieferant), der diesen Tarif anbietet
    */
    public Marktteilnehmer getAnbieter() {
        return anbieter;
    }

    /**
    * Der Marktteilnehmer (Lieferant), der diesen Tarif anbietet
    */
    public void setAnbieter(Marktteilnehmer anbieter) {
        this.anbieter = anbieter;
    }

    /**
    * Der Name des Marktpartners, der den Tarif anbietet
    */
    public String getAnbietername() {
        return anbietername;
    }

    /**
    * Der Name des Marktpartners, der den Tarif anbietet
    */
    public void setAnbietername(String anbietername) {
        this.anbietername = anbietername;
    }

    /**
    * Angabe des inklusiven Zeitpunkts, ab dem der Tarif bzw. der Preis angewendet und
    * abgerechnet wird,
    * z.B. "2021-07-20T18:31:48Z"
    */
    public OffsetDateTime getAnwendungVon() {
        return anwendungVon;
    }

    /**
    * Angabe des inklusiven Zeitpunkts, ab dem der Tarif bzw. der Preis angewendet und
    * abgerechnet wird,
    * z.B. "2021-07-20T18:31:48Z"
    */
    public void setAnwendungVon(OffsetDateTime anwendungVon) {
        this.anwendungVon = anwendungVon;
    }

    /**
    * Freitext
    */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
    * Freitext
    */
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    /**
    * Name des Tarifs
    */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
    * Name des Tarifs
    */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
    * Der Energiemix, der für diesen Tarif gilt
    */
    public Energiemix getEnergiemix() {
        return energiemix;
    }

    /**
    * Der Energiemix, der für diesen Tarif gilt
    */
    public void setEnergiemix(Energiemix energiemix) {
        this.energiemix = energiemix;
    }

    /**
    * Referenz (Link) zu einem Kostenobjekt, in dem die Kosten für die Anwendung
    * des Tarifs auf eine Abnahmesituation berechnet wurden
    */
    public Kosten getKosten() {
        return kosten;
    }

    /**
    * Referenz (Link) zu einem Kostenobjekt, in dem die Kosten für die Anwendung
    * des Tarifs auf eine Abnahmesituation berechnet wurden
    */
    public void setKosten(Kosten kosten) {
        this.kosten = kosten;
    }

    /**
    * Kundentypen für den der Tarif gilt, z.B. Privatkunden
    */
    public List<Kundentyp> getKundentypen() {
        return kundentypen;
    }

    /**
    * Kundentypen für den der Tarif gilt, z.B. Privatkunden
    */
    public void setKundentypen(List<Kundentyp> kundentypen) {
        this.kundentypen = kundentypen;
    }

    /**
    * Die Art des Tarifes, z.B. Eintarif oder Mehrtarif
    */
    public Registeranzahl getRegisteranzahl() {
        return registeranzahl;
    }

    /**
    * Die Art des Tarifes, z.B. Eintarif oder Mehrtarif
    */
    public void setRegisteranzahl(Registeranzahl registeranzahl) {
        this.registeranzahl = registeranzahl;
    }

    /**
    * Strom oder Gas, etc.
    */
    public Sparte getSparte() {
        return sparte;
    }

    /**
    * Strom oder Gas, etc.
    */
    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    /**
    * Weitere Merkmale des Tarifs, z.B. Festpreis oder Vorkasse
    */
    public List<Tarifmerkmal> getTarifmerkmale() {
        return tarifmerkmale;
    }

    /**
    * Weitere Merkmale des Tarifs, z.B. Festpreis oder Vorkasse
    */
    public void setTarifmerkmale(List<Tarifmerkmal> tarifmerkmale) {
        this.tarifmerkmale = tarifmerkmale;
    }

    /**
    * Hinweis auf den Tariftyp, z.B. Grundversorgung oder Sondertarif
    */
    public Tariftyp getTariftyp() {
        return tariftyp;
    }

    /**
    * Hinweis auf den Tariftyp, z.B. Grundversorgung oder Sondertarif
    */
    public void setTariftyp(Tariftyp tariftyp) {
        this.tariftyp = tariftyp;
    }

    /**
    * Mindestlaufzeiten und Kündigungsfristen zusammengefasst
    */
    public Vertragskonditionen getVertragskonditionen() {
        return vertragskonditionen;
    }

    /**
    * Mindestlaufzeiten und Kündigungsfristen zusammengefasst
    */
    public void setVertragskonditionen(Vertragskonditionen vertragskonditionen) {
        this.vertragskonditionen = vertragskonditionen;
    }

    /**
    * Internetseite auf dem der Tarif zu finden ist
    */
    public String getWebsite() {
        return website;
    }

    /**
    * Internetseite auf dem der Tarif zu finden ist
    */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
    * Angabe, in welchem Zeitraum der Tarif gültig ist
    */
    public Zeitraum getZeitlicheGueltigkeit() {
        return zeitlicheGueltigkeit;
    }

    /**
    * Angabe, in welchem Zeitraum der Tarif gültig ist
    */
    public void setZeitlicheGueltigkeit(Zeitraum zeitlicheGueltigkeit) {
        this.zeitlicheGueltigkeit = zeitlicheGueltigkeit;
    }

    public static TarifkostenBuilder builder() {
        return new TarifkostenBuilder();
    }

    public static class TarifkostenBuilder extends GeschaeftsobjektBuilder {
        private Marktteilnehmer anbieter;
        private String anbietername;
        private OffsetDateTime anwendungVon;
        private String bemerkung;
        private String bezeichnung;
        private Energiemix energiemix;
        private Kosten kosten;
        private List<Kundentyp> kundentypen;
        private Registeranzahl registeranzahl;
        private Sparte sparte;
        private List<Tarifmerkmal> tarifmerkmale;
        private Tariftyp tariftyp;
        private Vertragskonditionen vertragskonditionen;
        private String website;
        private Zeitraum zeitlicheGueltigkeit;

        private TarifkostenBuilder() {
        }

        /**
        * Der Marktteilnehmer (Lieferant), der diesen Tarif anbietet
        */
        public TarifkostenBuilder setAnbieter(Marktteilnehmer anbieter) {
            this.anbieter = anbieter;
            return this;
        }

        /**
        * Der Name des Marktpartners, der den Tarif anbietet
        */
        public TarifkostenBuilder setAnbietername(String anbietername) {
            this.anbietername = anbietername;
            return this;
        }

        /**
        * Angabe des inklusiven Zeitpunkts, ab dem der Tarif bzw. der Preis angewendet und
        * abgerechnet wird,
        * z.B. "2021-07-20T18:31:48Z"
        */
        public TarifkostenBuilder setAnwendungVon(OffsetDateTime anwendungVon) {
            this.anwendungVon = anwendungVon;
            return this;
        }

        /**
        * Freitext
        */
        public TarifkostenBuilder setBemerkung(String bemerkung) {
            this.bemerkung = bemerkung;
            return this;
        }

        /**
        * Name des Tarifs
        */
        public TarifkostenBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * Der Energiemix, der für diesen Tarif gilt
        */
        public TarifkostenBuilder setEnergiemix(Energiemix energiemix) {
            this.energiemix = energiemix;
            return this;
        }

        /**
        * Referenz (Link) zu einem Kostenobjekt, in dem die Kosten für die Anwendung
        * des Tarifs auf eine Abnahmesituation berechnet wurden
        */
        public TarifkostenBuilder setKosten(Kosten kosten) {
            this.kosten = kosten;
            return this;
        }

        /**
        * Kundentypen für den der Tarif gilt, z.B. Privatkunden
        */
        public TarifkostenBuilder setKundentypen(List<Kundentyp> kundentypen) {
            this.kundentypen = kundentypen;
            return this;
        }

        /**
        * Die Art des Tarifes, z.B. Eintarif oder Mehrtarif
        */
        public TarifkostenBuilder setRegisteranzahl(Registeranzahl registeranzahl) {
            this.registeranzahl = registeranzahl;
            return this;
        }

        /**
        * Strom oder Gas, etc.
        */
        public TarifkostenBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }

        /**
        * Weitere Merkmale des Tarifs, z.B. Festpreis oder Vorkasse
        */
        public TarifkostenBuilder setTarifmerkmale(List<Tarifmerkmal> tarifmerkmale) {
            this.tarifmerkmale = tarifmerkmale;
            return this;
        }

        /**
        * Hinweis auf den Tariftyp, z.B. Grundversorgung oder Sondertarif
        */
        public TarifkostenBuilder setTariftyp(Tariftyp tariftyp) {
            this.tariftyp = tariftyp;
            return this;
        }

        /**
        * Mindestlaufzeiten und Kündigungsfristen zusammengefasst
        */
        public TarifkostenBuilder setVertragskonditionen(Vertragskonditionen vertragskonditionen) {
            this.vertragskonditionen = vertragskonditionen;
            return this;
        }

        /**
        * Internetseite auf dem der Tarif zu finden ist
        */
        public TarifkostenBuilder setWebsite(String website) {
            this.website = website;
            return this;
        }

        /**
        * Angabe, in welchem Zeitraum der Tarif gültig ist
        */
        public TarifkostenBuilder setZeitlicheGueltigkeit(Zeitraum zeitlicheGueltigkeit) {
            this.zeitlicheGueltigkeit = zeitlicheGueltigkeit;
            return this;
        }

        public TarifkostenBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public TarifkostenBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Tarifkosten build() {
            return new Tarifkosten(this);
        }
    }
}