package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.AufAbschlag;
import bo4e.com.Energiemix;
import bo4e.com.Preisgarantie;
import bo4e.com.Tarifberechnungsparameter;
import bo4e.com.Tarifeinschraenkung;
import bo4e.com.Tarifpreisposition;
import bo4e.com.Vertragskonditionen;
import bo4e.com.Zeitraum;
import bo4e.enums.Kundentyp;
import bo4e.enums.Registeranzahl;
import bo4e.enums.Sparte;
import bo4e.enums.Tarifmerkmal;
import bo4e.enums.Tariftyp;
import bo4e.enums.Typ;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Tarifinformation mit Preisen, Aufschlägen und Berechnungssystematik
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Tarifpreisblatt.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Tarifpreisblatt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.3.2/src/bo4e_schemas/bo/Tarifpreisblatt.json>`_
 */
public class Tarifpreisblatt extends Geschaeftsobjekt {
    private final Typ typ = Typ.TARIFPREISBLATT;
    private Marktteilnehmer anbieter;
    private String anbietername;
    private OffsetDateTime anwendungVon;
    private String bemerkung;
    private Tarifberechnungsparameter berechnungsparameter;
    private String bezeichnung;
    private Energiemix energiemix;
    private List<Kundentyp> kundentypen;
    private Preisgarantie preisgarantie;
    private OffsetDateTime preisstand;
    private Registeranzahl registeranzahl;
    private Sparte sparte;
    private List<AufAbschlag> tarifAufAbschlaege;
    private Tarifeinschraenkung tarifeinschraenkung;
    private List<Tarifmerkmal> tarifmerkmale;
    private List<Tarifpreisposition> tarifpreise;
    private Tariftyp tariftyp;
    private Vertragskonditionen vertragskonditionen;
    private String website;
    private Zeitraum zeitlicheGueltigkeit;

    public Tarifpreisblatt() {
    }

    private Tarifpreisblatt(TarifpreisblattBuilder builder) {
        super(builder);
        this.anbieter = builder.anbieter;
        this.anbietername = builder.anbietername;
        this.anwendungVon = builder.anwendungVon;
        this.bemerkung = builder.bemerkung;
        this.berechnungsparameter = builder.berechnungsparameter;
        this.bezeichnung = builder.bezeichnung;
        this.energiemix = builder.energiemix;
        this.kundentypen = builder.kundentypen;
        this.preisgarantie = builder.preisgarantie;
        this.preisstand = builder.preisstand;
        this.registeranzahl = builder.registeranzahl;
        this.sparte = builder.sparte;
        this.tarifAufAbschlaege = builder.tarifAufAbschlaege;
        this.tarifeinschraenkung = builder.tarifeinschraenkung;
        this.tarifmerkmale = builder.tarifmerkmale;
        this.tarifpreise = builder.tarifpreise;
        this.tariftyp = builder.tariftyp;
        this.vertragskonditionen = builder.vertragskonditionen;
        this.website = builder.website;
        this.zeitlicheGueltigkeit = builder.zeitlicheGueltigkeit;
    }

    public Typ getTyp() {
        return typ;
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

    public OffsetDateTime getAnwendungVon() {
        return anwendungVon;
    }

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
     * Für die Berechnung der Kosten sind die hier abgebildeten Parameter heranzuziehen
     */
    public Tarifberechnungsparameter getBerechnungsparameter() {
        return berechnungsparameter;
    }

    /**
     * Für die Berechnung der Kosten sind die hier abgebildeten Parameter heranzuziehen
     */
    public void setBerechnungsparameter(Tarifberechnungsparameter berechnungsparameter) {
        this.berechnungsparameter = berechnungsparameter;
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
     * Festlegung von Garantien für bestimmte Preisanteile
     */
    public Preisgarantie getPreisgarantie() {
        return preisgarantie;
    }

    /**
     * Festlegung von Garantien für bestimmte Preisanteile
     */
    public void setPreisgarantie(Preisgarantie preisgarantie) {
        this.preisgarantie = preisgarantie;
    }

    /**
     * Gibt an, wann der Preis zuletzt angepasst wurde
     */
    public OffsetDateTime getPreisstand() {
        return preisstand;
    }

    /**
     * Gibt an, wann der Preis zuletzt angepasst wurde
     */
    public void setPreisstand(OffsetDateTime preisstand) {
        this.preisstand = preisstand;
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
     * Auf- und Abschläge auf die Preise oder Kosten
     */
    public List<AufAbschlag> getTarifAufAbschlaege() {
        return tarifAufAbschlaege;
    }

    /**
     * Auf- und Abschläge auf die Preise oder Kosten
     */
    public void setTarifAufAbschlaege(List<AufAbschlag> tarifAufAbschlaege) {
        this.tarifAufAbschlaege = tarifAufAbschlaege;
    }

    /**
     * Die Bedingungen und Einschränkungen unter denen ein Tarif angewendet werden kann
     */
    public Tarifeinschraenkung getTarifeinschraenkung() {
        return tarifeinschraenkung;
    }

    /**
     * Die Bedingungen und Einschränkungen unter denen ein Tarif angewendet werden kann
     */
    public void setTarifeinschraenkung(Tarifeinschraenkung tarifeinschraenkung) {
        this.tarifeinschraenkung = tarifeinschraenkung;
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
     * Die festgelegten Preise, z.B. für Arbeitspreis, Grundpreis etc.
     */
    public List<Tarifpreisposition> getTarifpreise() {
        return tarifpreise;
    }

    /**
     * Die festgelegten Preise, z.B. für Arbeitspreis, Grundpreis etc.
     */
    public void setTarifpreise(List<Tarifpreisposition> tarifpreise) {
        this.tarifpreise = tarifpreise;
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

    public static TarifpreisblattBuilder builder() {
        return new TarifpreisblattBuilder();
    }

    public static class TarifpreisblattBuilder extends GeschaeftsobjektBuilder {
        private Marktteilnehmer anbieter;
        private String anbietername;
        private OffsetDateTime anwendungVon;
        private String bemerkung;
        private Tarifberechnungsparameter berechnungsparameter;
        private String bezeichnung;
        private Energiemix energiemix;
        private List<Kundentyp> kundentypen;
        private Preisgarantie preisgarantie;
        private OffsetDateTime preisstand;
        private Registeranzahl registeranzahl;
        private Sparte sparte;
        private List<AufAbschlag> tarifAufAbschlaege;
        private Tarifeinschraenkung tarifeinschraenkung;
        private List<Tarifmerkmal> tarifmerkmale;
        private List<Tarifpreisposition> tarifpreise;
        private Tariftyp tariftyp;
        private Vertragskonditionen vertragskonditionen;
        private String website;
        private Zeitraum zeitlicheGueltigkeit;

        private TarifpreisblattBuilder() {
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
        public TarifpreisblattBuilder setAnbieter(Marktteilnehmer anbieter) {
            this.anbieter = anbieter;
            return this;
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
        public TarifpreisblattBuilder setAnbietername(String anbietername) {
            this.anbietername = anbietername;
            return this;
        }

        public OffsetDateTime getAnwendungVon() {
            return anwendungVon;
        }

        public TarifpreisblattBuilder setAnwendungVon(OffsetDateTime anwendungVon) {
            this.anwendungVon = anwendungVon;
            return this;
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
        public TarifpreisblattBuilder setBemerkung(String bemerkung) {
            this.bemerkung = bemerkung;
            return this;
        }

        /**
         * Für die Berechnung der Kosten sind die hier abgebildeten Parameter heranzuziehen
         */
        public Tarifberechnungsparameter getBerechnungsparameter() {
            return berechnungsparameter;
        }

        /**
         * Für die Berechnung der Kosten sind die hier abgebildeten Parameter heranzuziehen
         */
        public TarifpreisblattBuilder setBerechnungsparameter(Tarifberechnungsparameter berechnungsparameter) {
            this.berechnungsparameter = berechnungsparameter;
            return this;
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
        public TarifpreisblattBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
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
        public TarifpreisblattBuilder setEnergiemix(Energiemix energiemix) {
            this.energiemix = energiemix;
            return this;
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
        public TarifpreisblattBuilder setKundentypen(List<Kundentyp> kundentypen) {
            this.kundentypen = kundentypen;
            return this;
        }

        /**
         * Festlegung von Garantien für bestimmte Preisanteile
         */
        public Preisgarantie getPreisgarantie() {
            return preisgarantie;
        }

        /**
         * Festlegung von Garantien für bestimmte Preisanteile
         */
        public TarifpreisblattBuilder setPreisgarantie(Preisgarantie preisgarantie) {
            this.preisgarantie = preisgarantie;
            return this;
        }

        /**
         * Gibt an, wann der Preis zuletzt angepasst wurde
         */
        public OffsetDateTime getPreisstand() {
            return preisstand;
        }

        /**
         * Gibt an, wann der Preis zuletzt angepasst wurde
         */
        public TarifpreisblattBuilder setPreisstand(OffsetDateTime preisstand) {
            this.preisstand = preisstand;
            return this;
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
        public TarifpreisblattBuilder setRegisteranzahl(Registeranzahl registeranzahl) {
            this.registeranzahl = registeranzahl;
            return this;
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
        public TarifpreisblattBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }

        /**
         * Auf- und Abschläge auf die Preise oder Kosten
         */
        public List<AufAbschlag> getTarifAufAbschlaege() {
            return tarifAufAbschlaege;
        }

        /**
         * Auf- und Abschläge auf die Preise oder Kosten
         */
        public TarifpreisblattBuilder setTarifAufAbschlaege(List<AufAbschlag> tarifAufAbschlaege) {
            this.tarifAufAbschlaege = tarifAufAbschlaege;
            return this;
        }

        /**
         * Die Bedingungen und Einschränkungen unter denen ein Tarif angewendet werden kann
         */
        public Tarifeinschraenkung getTarifeinschraenkung() {
            return tarifeinschraenkung;
        }

        /**
         * Die Bedingungen und Einschränkungen unter denen ein Tarif angewendet werden kann
         */
        public TarifpreisblattBuilder setTarifeinschraenkung(Tarifeinschraenkung tarifeinschraenkung) {
            this.tarifeinschraenkung = tarifeinschraenkung;
            return this;
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
        public TarifpreisblattBuilder setTarifmerkmale(List<Tarifmerkmal> tarifmerkmale) {
            this.tarifmerkmale = tarifmerkmale;
            return this;
        }

        /**
         * Die festgelegten Preise, z.B. für Arbeitspreis, Grundpreis etc.
         */
        public List<Tarifpreisposition> getTarifpreise() {
            return tarifpreise;
        }

        /**
         * Die festgelegten Preise, z.B. für Arbeitspreis, Grundpreis etc.
         */
        public TarifpreisblattBuilder setTarifpreise(List<Tarifpreisposition> tarifpreise) {
            this.tarifpreise = tarifpreise;
            return this;
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
        public TarifpreisblattBuilder setTariftyp(Tariftyp tariftyp) {
            this.tariftyp = tariftyp;
            return this;
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
        public TarifpreisblattBuilder setVertragskonditionen(Vertragskonditionen vertragskonditionen) {
            this.vertragskonditionen = vertragskonditionen;
            return this;
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
        public TarifpreisblattBuilder setWebsite(String website) {
            this.website = website;
            return this;
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
        public TarifpreisblattBuilder setZeitlicheGueltigkeit(Zeitraum zeitlicheGueltigkeit) {
            this.zeitlicheGueltigkeit = zeitlicheGueltigkeit;
            return this;
        }

        public TarifpreisblattBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public TarifpreisblattBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Tarifpreisblatt build() {
            return new Tarifpreisblatt(this);
        }
    }
}