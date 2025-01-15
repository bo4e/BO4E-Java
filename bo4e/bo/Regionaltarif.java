package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Energiemix;
import bo4e.com.RegionalePreisgarantie;
import bo4e.com.RegionaleTarifpreisposition;
import bo4e.com.RegionalerAufAbschlag;
import bo4e.com.Tarifberechnungsparameter;
import bo4e.com.Tarifeinschraenkung;
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
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Regionaltarif.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Regionaltarif JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/{__gh_version__}/src/bo4e_schemas/bo/Regionaltarif.json>`_
    */
    public class Regionaltarif extends Geschaeftsobjekt {
        private final Typ _typ = Typ.REGIONALTARIF;
        private Marktteilnehmer anbieter;
        private String anbietername;
        private OffsetDateTime anwendungVon;
        private String bemerkung;
        private Tarifberechnungsparameter berechnungsparameter;
        private String bezeichnung;
        private Energiemix energiemix;
        private List<Kundentyp> kundentypen;
        private List<RegionalePreisgarantie> preisgarantien;
        private OffsetDateTime preisstand;
        private Registeranzahl registeranzahl;
        private Sparte sparte;
        private List<RegionalerAufAbschlag> tarifAufAbschlaege;
        private Tarifeinschraenkung tarifeinschraenkung;
        private List<Tarifmerkmal> tarifmerkmale;
        private List<RegionaleTarifpreisposition> tarifpreise;
        private Tariftyp tariftyp;
        private Vertragskonditionen vertragskonditionen;
        private String website;
        private Zeitraum zeitlicheGueltigkeit;

        public Regionaltarif() {
        }

        private Regionaltarif(RegionaltarifBuilder builder) {
            super(builder);
            this.anbieter = builder.anbieter;
            this.anbietername = builder.anbietername;
            this.anwendungVon = builder.anwendungVon;
            this.bemerkung = builder.bemerkung;
            this.berechnungsparameter = builder.berechnungsparameter;
            this.bezeichnung = builder.bezeichnung;
            this.energiemix = builder.energiemix;
            this.kundentypen = builder.kundentypen;
            this.preisgarantien = builder.preisgarantien;
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

        public Typ get_typ() {
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

        public Tarifberechnungsparameter getBerechnungsparameter() {
            return berechnungsparameter;
        }

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

        public List<RegionalePreisgarantie> getPreisgarantien() {
            return preisgarantien;
        }

        public void setPreisgarantien(List<RegionalePreisgarantie> preisgarantien) {
            this.preisgarantien = preisgarantien;
        }

        public OffsetDateTime getPreisstand() {
            return preisstand;
        }

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

        public List<RegionalerAufAbschlag> getTarifAufAbschlaege() {
            return tarifAufAbschlaege;
        }

        public void setTarifAufAbschlaege(List<RegionalerAufAbschlag> tarifAufAbschlaege) {
            this.tarifAufAbschlaege = tarifAufAbschlaege;
        }

        public Tarifeinschraenkung getTarifeinschraenkung() {
            return tarifeinschraenkung;
        }

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

        public List<RegionaleTarifpreisposition> getTarifpreise() {
            return tarifpreise;
        }

        public void setTarifpreise(List<RegionaleTarifpreisposition> tarifpreise) {
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

        public static RegionaltarifBuilder builder() {
            return new RegionaltarifBuilder();
        }

        public static class RegionaltarifBuilder extends GeschaeftsobjektBuilder {
            private Marktteilnehmer anbieter;
            private String anbietername;
            private OffsetDateTime anwendungVon;
            private String bemerkung;
            private Tarifberechnungsparameter berechnungsparameter;
            private String bezeichnung;
            private Energiemix energiemix;
            private List<Kundentyp> kundentypen;
            private List<RegionalePreisgarantie> preisgarantien;
            private OffsetDateTime preisstand;
            private Registeranzahl registeranzahl;
            private Sparte sparte;
            private List<RegionalerAufAbschlag> tarifAufAbschlaege;
            private Tarifeinschraenkung tarifeinschraenkung;
            private List<Tarifmerkmal> tarifmerkmale;
            private List<RegionaleTarifpreisposition> tarifpreise;
            private Tariftyp tariftyp;
            private Vertragskonditionen vertragskonditionen;
            private String website;
            private Zeitraum zeitlicheGueltigkeit;

            private RegionaltarifBuilder() {
            }

            /**
            * Der Marktteilnehmer (Lieferant), der diesen Tarif anbietet
            */
            public RegionaltarifBuilder setAnbieter(Marktteilnehmer anbieter) {
                this.anbieter = anbieter;
                return this;
            }

            /**
            * Der Name des Marktpartners, der den Tarif anbietet
            */
            public RegionaltarifBuilder setAnbietername(String anbietername) {
                this.anbietername = anbietername;
                return this;
            }

            public RegionaltarifBuilder setAnwendungVon(OffsetDateTime anwendungVon) {
                this.anwendungVon = anwendungVon;
                return this;
            }

            /**
            * Freitext
            */
            public RegionaltarifBuilder setBemerkung(String bemerkung) {
                this.bemerkung = bemerkung;
                return this;
            }

            public RegionaltarifBuilder setBerechnungsparameter(Tarifberechnungsparameter berechnungsparameter) {
                this.berechnungsparameter = berechnungsparameter;
                return this;
            }

            /**
            * Name des Tarifs
            */
            public RegionaltarifBuilder setBezeichnung(String bezeichnung) {
                this.bezeichnung = bezeichnung;
                return this;
            }

            /**
            * Der Energiemix, der für diesen Tarif gilt
            */
            public RegionaltarifBuilder setEnergiemix(Energiemix energiemix) {
                this.energiemix = energiemix;
                return this;
            }

            /**
            * Kundentypen für den der Tarif gilt, z.B. Privatkunden
            */
            public RegionaltarifBuilder setKundentypen(List<Kundentyp> kundentypen) {
                this.kundentypen = kundentypen;
                return this;
            }

            public RegionaltarifBuilder setPreisgarantien(List<RegionalePreisgarantie> preisgarantien) {
                this.preisgarantien = preisgarantien;
                return this;
            }

            public RegionaltarifBuilder setPreisstand(OffsetDateTime preisstand) {
                this.preisstand = preisstand;
                return this;
            }

            /**
            * Die Art des Tarifes, z.B. Eintarif oder Mehrtarif
            */
            public RegionaltarifBuilder setRegisteranzahl(Registeranzahl registeranzahl) {
                this.registeranzahl = registeranzahl;
                return this;
            }

            /**
            * Strom oder Gas, etc.
            */
            public RegionaltarifBuilder setSparte(Sparte sparte) {
                this.sparte = sparte;
                return this;
            }

            public RegionaltarifBuilder setTarifAufAbschlaege(List<RegionalerAufAbschlag> tarifAufAbschlaege) {
                this.tarifAufAbschlaege = tarifAufAbschlaege;
                return this;
            }

            public RegionaltarifBuilder setTarifeinschraenkung(Tarifeinschraenkung tarifeinschraenkung) {
                this.tarifeinschraenkung = tarifeinschraenkung;
                return this;
            }

            /**
            * Weitere Merkmale des Tarifs, z.B. Festpreis oder Vorkasse
            */
            public RegionaltarifBuilder setTarifmerkmale(List<Tarifmerkmal> tarifmerkmale) {
                this.tarifmerkmale = tarifmerkmale;
                return this;
            }

            public RegionaltarifBuilder setTarifpreise(List<RegionaleTarifpreisposition> tarifpreise) {
                this.tarifpreise = tarifpreise;
                return this;
            }

            /**
            * Hinweis auf den Tariftyp, z.B. Grundversorgung oder Sondertarif
            */
            public RegionaltarifBuilder setTariftyp(Tariftyp tariftyp) {
                this.tariftyp = tariftyp;
                return this;
            }

            /**
            * Mindestlaufzeiten und Kündigungsfristen zusammengefasst
            */
            public RegionaltarifBuilder setVertragskonditionen(Vertragskonditionen vertragskonditionen) {
                this.vertragskonditionen = vertragskonditionen;
                return this;
            }

            /**
            * Internetseite auf dem der Tarif zu finden ist
            */
            public RegionaltarifBuilder setWebsite(String website) {
                this.website = website;
                return this;
            }

            /**
            * Angabe, in welchem Zeitraum der Tarif gültig ist
            */
            public RegionaltarifBuilder setZeitlicheGueltigkeit(Zeitraum zeitlicheGueltigkeit) {
                this.zeitlicheGueltigkeit = zeitlicheGueltigkeit;
                return this;
            }

            public RegionaltarifBuilder setId(String id) {
                super.setId(id);
                return this;
            }

            public RegionaltarifBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
                super.setZusatzAttribute(zusatzAttribute);
                return this;
            }

            public Regionaltarif build() {
                return new Regionaltarif(this);
            }
        }
    }