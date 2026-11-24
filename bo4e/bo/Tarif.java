package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Energiemix;
import bo4e.com.Preisgarantie;
import bo4e.com.Regionspreis;
import bo4e.com.Tarifberechnungsparameter;
import bo4e.com.Tarifeinschraenkung;
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
* Abbildung eines Tarifs.
*
* Der Tarifpreis kann regionsaufgelöst und unter Angabe von Zeitscheiben angegeben werden.
* So kann bspw. derselbe
* Tarif je nach Region andere Preise aufweisen. Es können auch Tarifpreise abgebildet
* werden, die sich ab einem
* bestimmten Zeitpunkt auf andere Regionen ausweiten, da die Regionen ebenfalls mit
* Zeitscheiben versehen sind.
*
* Ein Tarifpreis setzt sich dabei aus mehreren Preispositionen zusammen. So können z.B.
* auch mit
* `COM RelativePreisposition` prozentuale Auf- und Abschläge auf andere Preispositionen
* definiert werden.
* Alle Preispositionen hängen unter `COM Tarifpreiszeitscheibe` mit einer Ausnahme.
*
* Möchten Sie einen dynamischen Tarif modellieren, so gibt es das `COM
* DynamischePreisposition`. Da diese
* Preisposition weder orts- noch zeitabhängig ist, hängt diese direkt unter dem `BO Tarif`.
* Eine zeitabhängige
* Änderung einer dynamischen Tarifpreisposition ist unsinnig, da es sich (unserer Ansicht
* nach) dann um einen
* völlig neuen Tarif handelt. Davon unabhängig können (und müssen) natürlich weiterhin
* zusätzlich alle anderen
* Preispositionen orts- und zeitabhängig angegeben werden.
*
* > Hinweis: Das Vorhandensein einer `COM DynamischePreisposition` dient gleichzeitig auch
* als "Flag" dafür, ob
* > es sich bei diesem Tarif um einen dynamischen handelt.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Tarif.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Tarif JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202607.1.0/src/bo4e_schemas/bo/Tarif.json>`_
*/
public class Tarif extends Geschaeftsobjekt {
    private final BoTyp _typ = BoTyp.TARIF;
    private Marktteilnehmer anbieter;
    private String anbietername;
    private OffsetDateTime anwendungVon;
    private String bemerkung;
    private Tarifberechnungsparameter berechnungsparameter;
    private String beschreibung;
    private String bezeichnung;
    private String dynamischePreispositionQuelle;
    private List<Energiemix> energiemix;
    private List<Kundentyp> kundentypen;
    private Preisgarantie preisgarantie;
    private List<Regionspreis> regionspreise;
    private Registeranzahl registeranzahl;
    private Sparte sparte;
    private Tarifeinschraenkung tarifeinschraenkung;
    private List<Tarifmerkmal> tarifmerkmale;
    private Tariftyp tariftyp;
    private Vertragskonditionen vertragskonditionen;
    private String website;
    private Zeitraum zeitlicheGueltigkeit;
    private Zeitraum zeitraumBelieferbarkeit;
    private Zeitraum zeitraumVermarktung;

    public Tarif() {
    }

    private Tarif(TarifBuilder builder) {
        super(builder);
        this.anbieter = builder.anbieter;
        this.anbietername = builder.anbietername;
        this.anwendungVon = builder.anwendungVon;
        this.bemerkung = builder.bemerkung;
        this.berechnungsparameter = builder.berechnungsparameter;
        this.beschreibung = builder.beschreibung;
        this.bezeichnung = builder.bezeichnung;
        this.dynamischePreispositionQuelle = builder.dynamischePreispositionQuelle;
        this.energiemix = builder.energiemix;
        this.kundentypen = builder.kundentypen;
        this.preisgarantie = builder.preisgarantie;
        this.regionspreise = builder.regionspreise;
        this.registeranzahl = builder.registeranzahl;
        this.sparte = builder.sparte;
        this.tarifeinschraenkung = builder.tarifeinschraenkung;
        this.tarifmerkmale = builder.tarifmerkmale;
        this.tariftyp = builder.tariftyp;
        this.vertragskonditionen = builder.vertragskonditionen;
        this.website = builder.website;
        this.zeitlicheGueltigkeit = builder.zeitlicheGueltigkeit;
        this.zeitraumBelieferbarkeit = builder.zeitraumBelieferbarkeit;
        this.zeitraumVermarktung = builder.zeitraumVermarktung;
    }

    public BoTyp get_typ() {
        return _typ;
    }

    /**
    * Der Marktteilnehmer, der diesen Tarif anbietet, angeboten hat oder anbieten wird.
    */
    public Marktteilnehmer getAnbieter() {
        return anbieter;
    }

    /**
    * Der Marktteilnehmer, der diesen Tarif anbietet, angeboten hat oder anbieten wird.
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
    * Eine (beliebige) Beschreibung für den Tarif.
    */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
    * Eine (beliebige) Beschreibung für den Tarif.
    */
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
    * Eine (beliebige) Bezeichnung für den Tarif.
    */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
    * Eine (beliebige) Bezeichnung für den Tarif.
    */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
    * Gibt die Bezugsquelle (z.B. Börsenindex) für den dynamischen Tarif an.
    * Dieses Feld muss genau dann gesetzt werden, wenn es sich bei diesem Tarif um einen
    * dynamischen Tarif handelt.
    */
    public String getDynamischePreispositionQuelle() {
        return dynamischePreispositionQuelle;
    }

    /**
    * Gibt die Bezugsquelle (z.B. Börsenindex) für den dynamischen Tarif an.
    * Dieses Feld muss genau dann gesetzt werden, wenn es sich bei diesem Tarif um einen
    * dynamischen Tarif handelt.
    */
    public void setDynamischePreispositionQuelle(String dynamischePreispositionQuelle) {
        this.dynamischePreispositionQuelle = dynamischePreispositionQuelle;
    }

    /**
    * Der Energiemix mit einem Eintrag pro Gültigkeitsjahr (siehe
    * `Energiemix.gueltigkeitsjahr`).
    */
    public List<Energiemix> getEnergiemix() {
        return energiemix;
    }

    /**
    * Der Energiemix mit einem Eintrag pro Gültigkeitsjahr (siehe
    * `Energiemix.gueltigkeitsjahr`).
    */
    public void setEnergiemix(List<Energiemix> energiemix) {
        this.energiemix = energiemix;
    }

    /**
    * Eine Liste an Kundentypen, für die dieser Tarif vorgesehen ist.
    */
    public List<Kundentyp> getKundentypen() {
        return kundentypen;
    }

    /**
    * Eine Liste an Kundentypen, für die dieser Tarif vorgesehen ist.
    */
    public void setKundentypen(List<Kundentyp> kundentypen) {
        this.kundentypen = kundentypen;
    }

    /**
    * Preisgarantie für diesen Tarif
    */
    public Preisgarantie getPreisgarantie() {
        return preisgarantie;
    }

    /**
    * Preisgarantie für diesen Tarif
    */
    public void setPreisgarantie(Preisgarantie preisgarantie) {
        this.preisgarantie = preisgarantie;
    }

    /**
    * Enthält alle regions- und zeitaufgelösten Tarifpreise.
    * Ausschließlich die `COM DynamischePreisposition` wird unter einem anderen Feld namens
    * `dynamischePreisposition`
    * angegeben.
    */
    public List<Regionspreis> getRegionspreise() {
        return regionspreise;
    }

    /**
    * Enthält alle regions- und zeitaufgelösten Tarifpreise.
    * Ausschließlich die `COM DynamischePreisposition` wird unter einem anderen Feld namens
    * `dynamischePreisposition`
    * angegeben.
    */
    public void setRegionspreise(List<Regionspreis> regionspreise) {
        this.regionspreise = regionspreise;
    }

    /**
    * Hinweis zu den Registern bzw. Zählwerken.
    * Bspw. benötigt ein HT-/NT-Tarif auch eine entsprechende Registeranzahl.
    */
    public Registeranzahl getRegisteranzahl() {
        return registeranzahl;
    }

    /**
    * Hinweis zu den Registern bzw. Zählwerken.
    * Bspw. benötigt ein HT-/NT-Tarif auch eine entsprechende Registeranzahl.
    */
    public void setRegisteranzahl(Registeranzahl registeranzahl) {
        this.registeranzahl = registeranzahl;
    }

    /**
    * Strom / Gas
    */
    public Sparte getSparte() {
        return sparte;
    }

    /**
    * Strom / Gas
    */
    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
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
    * Eine Liste von Produktmerkmalen im Zusammenhang mit diesem Tarif.
    */
    public List<Tarifmerkmal> getTarifmerkmale() {
        return tarifmerkmale;
    }

    /**
    * Eine Liste von Produktmerkmalen im Zusammenhang mit diesem Tarif.
    */
    public void setTarifmerkmale(List<Tarifmerkmal> tarifmerkmale) {
        this.tarifmerkmale = tarifmerkmale;
    }

    /**
    * Der Tariftyp. Bsp.: Grundversorgung, Ersatzversorgung, etc.
    */
    public Tariftyp getTariftyp() {
        return tariftyp;
    }

    /**
    * Der Tariftyp. Bsp.: Grundversorgung, Ersatzversorgung, etc.
    */
    public void setTariftyp(Tariftyp tariftyp) {
        this.tariftyp = tariftyp;
    }

    /**
    * Vertragskonditionen für diesen Tarif.
    */
    public Vertragskonditionen getVertragskonditionen() {
        return vertragskonditionen;
    }

    /**
    * Vertragskonditionen für diesen Tarif.
    */
    public void setVertragskonditionen(Vertragskonditionen vertragskonditionen) {
        this.vertragskonditionen = vertragskonditionen;
    }

    /**
    * Internetseite, auf der der Tarif veröffentlicht ist.
    */
    public String getWebsite() {
        return website;
    }

    /**
    * Internetseite, auf der der Tarif veröffentlicht ist.
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

    /**
    * Der Zeitraum, in dem eine Belieferung (für diesen Tarif) möglich ist.
    */
    public Zeitraum getZeitraumBelieferbarkeit() {
        return zeitraumBelieferbarkeit;
    }

    /**
    * Der Zeitraum, in dem eine Belieferung (für diesen Tarif) möglich ist.
    */
    public void setZeitraumBelieferbarkeit(Zeitraum zeitraumBelieferbarkeit) {
        this.zeitraumBelieferbarkeit = zeitraumBelieferbarkeit;
    }

    /**
    * Der Zeitraum, in dem der Tarif beim Anbieter vertraglich abschließbar ist.
    */
    public Zeitraum getZeitraumVermarktung() {
        return zeitraumVermarktung;
    }

    /**
    * Der Zeitraum, in dem der Tarif beim Anbieter vertraglich abschließbar ist.
    */
    public void setZeitraumVermarktung(Zeitraum zeitraumVermarktung) {
        this.zeitraumVermarktung = zeitraumVermarktung;
    }

    public static TarifBuilder builder() {
        return new TarifBuilder();
    }

    public static class TarifBuilder extends GeschaeftsobjektBuilder {
        private Marktteilnehmer anbieter;
        private String anbietername;
        private OffsetDateTime anwendungVon;
        private String bemerkung;
        private Tarifberechnungsparameter berechnungsparameter;
        private String beschreibung;
        private String bezeichnung;
        private String dynamischePreispositionQuelle;
        private List<Energiemix> energiemix;
        private List<Kundentyp> kundentypen;
        private Preisgarantie preisgarantie;
        private List<Regionspreis> regionspreise;
        private Registeranzahl registeranzahl;
        private Sparte sparte;
        private Tarifeinschraenkung tarifeinschraenkung;
        private List<Tarifmerkmal> tarifmerkmale;
        private Tariftyp tariftyp;
        private Vertragskonditionen vertragskonditionen;
        private String website;
        private Zeitraum zeitlicheGueltigkeit;
        private Zeitraum zeitraumBelieferbarkeit;
        private Zeitraum zeitraumVermarktung;

        private TarifBuilder() {
        }

        /**
        * Der Marktteilnehmer, der diesen Tarif anbietet, angeboten hat oder anbieten wird.
        */
        public TarifBuilder setAnbieter(Marktteilnehmer anbieter) {
            this.anbieter = anbieter;
            return this;
        }

        /**
        * Der Name des Marktpartners, der den Tarif anbietet
        */
        public TarifBuilder setAnbietername(String anbietername) {
            this.anbietername = anbietername;
            return this;
        }

        /**
        * Angabe des inklusiven Zeitpunkts, ab dem der Tarif bzw. der Preis angewendet und
        * abgerechnet wird,
        * z.B. "2021-07-20T18:31:48Z"
        */
        public TarifBuilder setAnwendungVon(OffsetDateTime anwendungVon) {
            this.anwendungVon = anwendungVon;
            return this;
        }

        /**
        * Freitext
        */
        public TarifBuilder setBemerkung(String bemerkung) {
            this.bemerkung = bemerkung;
            return this;
        }

        /**
        * Für die Berechnung der Kosten sind die hier abgebildeten Parameter heranzuziehen
        */
        public TarifBuilder setBerechnungsparameter(Tarifberechnungsparameter berechnungsparameter) {
            this.berechnungsparameter = berechnungsparameter;
            return this;
        }

        /**
        * Eine (beliebige) Beschreibung für den Tarif.
        */
        public TarifBuilder setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
            return this;
        }

        /**
        * Eine (beliebige) Bezeichnung für den Tarif.
        */
        public TarifBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * Gibt die Bezugsquelle (z.B. Börsenindex) für den dynamischen Tarif an.
        * Dieses Feld muss genau dann gesetzt werden, wenn es sich bei diesem Tarif um einen
        * dynamischen Tarif handelt.
        */
        public TarifBuilder setDynamischePreispositionQuelle(String dynamischePreispositionQuelle) {
            this.dynamischePreispositionQuelle = dynamischePreispositionQuelle;
            return this;
        }

        /**
        * Der Energiemix mit einem Eintrag pro Gültigkeitsjahr (siehe
        * `Energiemix.gueltigkeitsjahr`).
        */
        public TarifBuilder setEnergiemix(List<Energiemix> energiemix) {
            this.energiemix = energiemix;
            return this;
        }

        /**
        * Eine Liste an Kundentypen, für die dieser Tarif vorgesehen ist.
        */
        public TarifBuilder setKundentypen(List<Kundentyp> kundentypen) {
            this.kundentypen = kundentypen;
            return this;
        }

        /**
        * Preisgarantie für diesen Tarif
        */
        public TarifBuilder setPreisgarantie(Preisgarantie preisgarantie) {
            this.preisgarantie = preisgarantie;
            return this;
        }

        /**
        * Enthält alle regions- und zeitaufgelösten Tarifpreise.
        * Ausschließlich die `COM DynamischePreisposition` wird unter einem anderen Feld namens
        * `dynamischePreisposition`
        * angegeben.
        */
        public TarifBuilder setRegionspreise(List<Regionspreis> regionspreise) {
            this.regionspreise = regionspreise;
            return this;
        }

        /**
        * Hinweis zu den Registern bzw. Zählwerken.
        * Bspw. benötigt ein HT-/NT-Tarif auch eine entsprechende Registeranzahl.
        */
        public TarifBuilder setRegisteranzahl(Registeranzahl registeranzahl) {
            this.registeranzahl = registeranzahl;
            return this;
        }

        /**
        * Strom / Gas
        */
        public TarifBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }

        /**
        * Die Bedingungen und Einschränkungen unter denen ein Tarif angewendet werden kann
        */
        public TarifBuilder setTarifeinschraenkung(Tarifeinschraenkung tarifeinschraenkung) {
            this.tarifeinschraenkung = tarifeinschraenkung;
            return this;
        }

        /**
        * Eine Liste von Produktmerkmalen im Zusammenhang mit diesem Tarif.
        */
        public TarifBuilder setTarifmerkmale(List<Tarifmerkmal> tarifmerkmale) {
            this.tarifmerkmale = tarifmerkmale;
            return this;
        }

        /**
        * Der Tariftyp. Bsp.: Grundversorgung, Ersatzversorgung, etc.
        */
        public TarifBuilder setTariftyp(Tariftyp tariftyp) {
            this.tariftyp = tariftyp;
            return this;
        }

        /**
        * Vertragskonditionen für diesen Tarif.
        */
        public TarifBuilder setVertragskonditionen(Vertragskonditionen vertragskonditionen) {
            this.vertragskonditionen = vertragskonditionen;
            return this;
        }

        /**
        * Internetseite, auf der der Tarif veröffentlicht ist.
        */
        public TarifBuilder setWebsite(String website) {
            this.website = website;
            return this;
        }

        /**
        * Angabe, in welchem Zeitraum der Tarif gültig ist
        */
        public TarifBuilder setZeitlicheGueltigkeit(Zeitraum zeitlicheGueltigkeit) {
            this.zeitlicheGueltigkeit = zeitlicheGueltigkeit;
            return this;
        }

        /**
        * Der Zeitraum, in dem eine Belieferung (für diesen Tarif) möglich ist.
        */
        public TarifBuilder setZeitraumBelieferbarkeit(Zeitraum zeitraumBelieferbarkeit) {
            this.zeitraumBelieferbarkeit = zeitraumBelieferbarkeit;
            return this;
        }

        /**
        * Der Zeitraum, in dem der Tarif beim Anbieter vertraglich abschließbar ist.
        */
        public TarifBuilder setZeitraumVermarktung(Zeitraum zeitraumVermarktung) {
            this.zeitraumVermarktung = zeitraumVermarktung;
            return this;
        }

        public TarifBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public TarifBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Tarif build() {
            return new Tarif(this);
        }
    }
}