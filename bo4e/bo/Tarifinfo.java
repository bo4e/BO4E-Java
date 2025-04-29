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
* Das BO Tarifinfo liefert die Merkmale, die einen Endkundentarif identifizierbar machen.
* Dieses BO dient als Basis für weitere BOs mit erweiterten Anwendungsmöglichkeiten.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Tarifinfo.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Tarifinfo JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.7.0/src/bo4e_schemas/bo/Tarifinfo.json>`_
*/
public class Tarifinfo extends Geschaeftsobjekt {
    private final BoTyp _typ = BoTyp.TARIFINFO;
    private Marktteilnehmer anbieter;
    private String anbietername;
    private OffsetDateTime anwendungVon;
    private String bemerkung;
    private String bezeichnung;
    private Energiemix energiemix;
    private List<Kundentyp> kundentypen;
    private Registeranzahl registeranzahl;
    private Sparte sparte;
    private List<Tarifmerkmal> tarifmerkmale;
    private Tariftyp tariftyp;
    private Vertragskonditionen vertragskonditionen;
    private String website;
    private Zeitraum zeitlicheGueltigkeit;

    public Tarifinfo() {
    }

    private Tarifinfo(TarifinfoBuilder builder) {
        super(builder);
        this.anbieter = builder.anbieter;
        this.anbietername = builder.anbietername;
        this.anwendungVon = builder.anwendungVon;
        this.bemerkung = builder.bemerkung;
        this.bezeichnung = builder.bezeichnung;
        this.energiemix = builder.energiemix;
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

    public static TarifinfoBuilder builder() {
        return new TarifinfoBuilder();
    }

    public static class TarifinfoBuilder extends GeschaeftsobjektBuilder {
        private Marktteilnehmer anbieter;
        private String anbietername;
        private OffsetDateTime anwendungVon;
        private String bemerkung;
        private String bezeichnung;
        private Energiemix energiemix;
        private List<Kundentyp> kundentypen;
        private Registeranzahl registeranzahl;
        private Sparte sparte;
        private List<Tarifmerkmal> tarifmerkmale;
        private Tariftyp tariftyp;
        private Vertragskonditionen vertragskonditionen;
        private String website;
        private Zeitraum zeitlicheGueltigkeit;

        private TarifinfoBuilder() {
        }

        /**
        * Der Marktteilnehmer (Lieferant), der diesen Tarif anbietet
        */
        public TarifinfoBuilder setAnbieter(Marktteilnehmer anbieter) {
            this.anbieter = anbieter;
            return this;
        }

        /**
        * Der Name des Marktpartners, der den Tarif anbietet
        */
        public TarifinfoBuilder setAnbietername(String anbietername) {
            this.anbietername = anbietername;
            return this;
        }

        /**
        * Angabe des inklusiven Zeitpunkts, ab dem der Tarif bzw. der Preis angewendet und
        * abgerechnet wird,
        * z.B. "2021-07-20T18:31:48Z"
        */
        public TarifinfoBuilder setAnwendungVon(OffsetDateTime anwendungVon) {
            this.anwendungVon = anwendungVon;
            return this;
        }

        /**
        * Freitext
        */
        public TarifinfoBuilder setBemerkung(String bemerkung) {
            this.bemerkung = bemerkung;
            return this;
        }

        /**
        * Name des Tarifs
        */
        public TarifinfoBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * Der Energiemix, der für diesen Tarif gilt
        */
        public TarifinfoBuilder setEnergiemix(Energiemix energiemix) {
            this.energiemix = energiemix;
            return this;
        }

        /**
        * Kundentypen für den der Tarif gilt, z.B. Privatkunden
        */
        public TarifinfoBuilder setKundentypen(List<Kundentyp> kundentypen) {
            this.kundentypen = kundentypen;
            return this;
        }

        /**
        * Die Art des Tarifes, z.B. Eintarif oder Mehrtarif
        */
        public TarifinfoBuilder setRegisteranzahl(Registeranzahl registeranzahl) {
            this.registeranzahl = registeranzahl;
            return this;
        }

        /**
        * Strom oder Gas, etc.
        */
        public TarifinfoBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }

        /**
        * Weitere Merkmale des Tarifs, z.B. Festpreis oder Vorkasse
        */
        public TarifinfoBuilder setTarifmerkmale(List<Tarifmerkmal> tarifmerkmale) {
            this.tarifmerkmale = tarifmerkmale;
            return this;
        }

        /**
        * Hinweis auf den Tariftyp, z.B. Grundversorgung oder Sondertarif
        */
        public TarifinfoBuilder setTariftyp(Tariftyp tariftyp) {
            this.tariftyp = tariftyp;
            return this;
        }

        /**
        * Mindestlaufzeiten und Kündigungsfristen zusammengefasst
        */
        public TarifinfoBuilder setVertragskonditionen(Vertragskonditionen vertragskonditionen) {
            this.vertragskonditionen = vertragskonditionen;
            return this;
        }

        /**
        * Internetseite auf dem der Tarif zu finden ist
        */
        public TarifinfoBuilder setWebsite(String website) {
            this.website = website;
            return this;
        }

        /**
        * Angabe, in welchem Zeitraum der Tarif gültig ist
        */
        public TarifinfoBuilder setZeitlicheGueltigkeit(Zeitraum zeitlicheGueltigkeit) {
            this.zeitlicheGueltigkeit = zeitlicheGueltigkeit;
            return this;
        }

        public TarifinfoBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public TarifinfoBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Tarifinfo build() {
            return new Tarifinfo(this);
        }
    }
}