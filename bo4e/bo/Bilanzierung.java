package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Lastprofil;
import bo4e.com.Menge;
import bo4e.enums.Abwicklungsmodell;
import bo4e.enums.Aggregationsverantwortung;
import bo4e.enums.BoTyp;
import bo4e.enums.Fallgruppenzuordnung;
import bo4e.enums.Profiltyp;
import bo4e.enums.Prognosegrundlage;
import bo4e.enums.WahlrechtPrognosegrundlage;
import bo4e.enums.Zeitreihentyp;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.OffsetDateTime;
import java.util.List;

/**
* Das BO Bilanzierung erfasst alle relevanten Informationen zur Bilanzierung.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Bilanzierung.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Lastprofil JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/{__gh_version__}/src/bo4e_schemas/bo/Bilanzierung.json>`_
    */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public class Bilanzierung extends Geschaeftsobjekt {
        private final BoTyp _typ = BoTyp.BILANZIERUNG;
        private Abwicklungsmodell abwicklungsmodell;
        private Aggregationsverantwortung aggregationsverantwortung;
        private OffsetDateTime bilanzierungsbeginn;
        private OffsetDateTime bilanzierungsende;
        private String bilanzkreis;
        private List<Profiltyp> detailsPrognosegrundlage;
        private Fallgruppenzuordnung fallgruppenzuordnung;
        private WahlrechtPrognosegrundlage grundWahlrechtPrognosegrundlage;
        private Menge jahresverbrauchsprognose;
        private Menge kundenwert;
        private List<Lastprofil> lastprofil;
        private String marktlokationsId;
        private Long prioritaet;
        private Prognosegrundlage prognosegrundlage;
        private Menge temperaturArbeit;
        private Double verbrauchsaufteilung;
        private WahlrechtPrognosegrundlage wahlrechtPrognosegrundlage;
        private Zeitreihentyp zeitreihentyp;

        public Bilanzierung() {
        }

        private Bilanzierung(BilanzierungBuilder builder) {
            super(builder);
            this.abwicklungsmodell = builder.abwicklungsmodell;
            this.aggregationsverantwortung = builder.aggregationsverantwortung;
            this.bilanzierungsbeginn = builder.bilanzierungsbeginn;
            this.bilanzierungsende = builder.bilanzierungsende;
            this.bilanzkreis = builder.bilanzkreis;
            this.detailsPrognosegrundlage = builder.detailsPrognosegrundlage;
            this.fallgruppenzuordnung = builder.fallgruppenzuordnung;
            this.grundWahlrechtPrognosegrundlage = builder.grundWahlrechtPrognosegrundlage;
            this.jahresverbrauchsprognose = builder.jahresverbrauchsprognose;
            this.kundenwert = builder.kundenwert;
            this.lastprofil = builder.lastprofil;
            this.marktlokationsId = builder.marktlokationsId;
            this.prioritaet = builder.prioritaet;
            this.prognosegrundlage = builder.prognosegrundlage;
            this.temperaturArbeit = builder.temperaturArbeit;
            this.verbrauchsaufteilung = builder.verbrauchsaufteilung;
            this.wahlrechtPrognosegrundlage = builder.wahlrechtPrognosegrundlage;
            this.zeitreihentyp = builder.zeitreihentyp;
        }

        public BoTyp get_typ() {
            return _typ;
        }

        public Abwicklungsmodell getAbwicklungsmodell() {
            return abwicklungsmodell;
        }

        public void setAbwicklungsmodell(Abwicklungsmodell abwicklungsmodell) {
            this.abwicklungsmodell = abwicklungsmodell;
        }

        public Aggregationsverantwortung getAggregationsverantwortung() {
            return aggregationsverantwortung;
        }

        public void setAggregationsverantwortung(Aggregationsverantwortung aggregationsverantwortung) {
            this.aggregationsverantwortung = aggregationsverantwortung;
        }

        public OffsetDateTime getBilanzierungsbeginn() {
            return bilanzierungsbeginn;
        }

        public void setBilanzierungsbeginn(OffsetDateTime bilanzierungsbeginn) {
            this.bilanzierungsbeginn = bilanzierungsbeginn;
        }

        public OffsetDateTime getBilanzierungsende() {
            return bilanzierungsende;
        }

        public void setBilanzierungsende(OffsetDateTime bilanzierungsende) {
            this.bilanzierungsende = bilanzierungsende;
        }

        public String getBilanzkreis() {
            return bilanzkreis;
        }

        public void setBilanzkreis(String bilanzkreis) {
            this.bilanzkreis = bilanzkreis;
        }

        /**
        * Prognosegrundlage.
        *
        * Besteht der Bedarf ein tagesparameteräbhängiges Lastprofil mit gemeinsamer Messung
        * anzugeben,
        * so ist dies über die 2 -malige Wiederholung des CAV Segments mit der Angabe der Codes E02
        * und E14 möglich.
        */
        public List<Profiltyp> getDetailsPrognosegrundlage() {
            return detailsPrognosegrundlage;
        }

        /**
        * Prognosegrundlage.
        *
        * Besteht der Bedarf ein tagesparameteräbhängiges Lastprofil mit gemeinsamer Messung
        * anzugeben,
        * so ist dies über die 2 -malige Wiederholung des CAV Segments mit der Angabe der Codes E02
        * und E14 möglich.
        */
        public void setDetailsPrognosegrundlage(List<Profiltyp> detailsPrognosegrundlage) {
            this.detailsPrognosegrundlage = detailsPrognosegrundlage;
        }

        public Fallgruppenzuordnung getFallgruppenzuordnung() {
            return fallgruppenzuordnung;
        }

        public void setFallgruppenzuordnung(Fallgruppenzuordnung fallgruppenzuordnung) {
            this.fallgruppenzuordnung = fallgruppenzuordnung;
        }

        /**
        * Grund Wahlrecht der Prognosegrundlage.
        *
        * true=Wahlrecht beim Lieferanten vorhanden
        */
        public WahlrechtPrognosegrundlage getGrundWahlrechtPrognosegrundlage() {
            return grundWahlrechtPrognosegrundlage;
        }

        /**
        * Grund Wahlrecht der Prognosegrundlage.
        *
        * true=Wahlrecht beim Lieferanten vorhanden
        */
        public void setGrundWahlrechtPrognosegrundlage(WahlrechtPrognosegrundlage grundWahlrechtPrognosegrundlage) {
            this.grundWahlrechtPrognosegrundlage = grundWahlrechtPrognosegrundlage;
        }

        public Menge getJahresverbrauchsprognose() {
            return jahresverbrauchsprognose;
        }

        public void setJahresverbrauchsprognose(Menge jahresverbrauchsprognose) {
            this.jahresverbrauchsprognose = jahresverbrauchsprognose;
        }

        public Menge getKundenwert() {
            return kundenwert;
        }

        public void setKundenwert(Menge kundenwert) {
            this.kundenwert = kundenwert;
        }

        public List<Lastprofil> getLastprofil() {
            return lastprofil;
        }

        public void setLastprofil(List<Lastprofil> lastprofil) {
            this.lastprofil = lastprofil;
        }

        public String getMarktlokationsId() {
            return marktlokationsId;
        }

        public void setMarktlokationsId(String marktlokationsId) {
            this.marktlokationsId = marktlokationsId;
        }

        public Long getPrioritaet() {
            return prioritaet;
        }

        public void setPrioritaet(Long prioritaet) {
            this.prioritaet = prioritaet;
        }

        public Prognosegrundlage getPrognosegrundlage() {
            return prognosegrundlage;
        }

        public void setPrognosegrundlage(Prognosegrundlage prognosegrundlage) {
            this.prognosegrundlage = prognosegrundlage;
        }

        public Menge getTemperaturArbeit() {
            return temperaturArbeit;
        }

        public void setTemperaturArbeit(Menge temperaturArbeit) {
            this.temperaturArbeit = temperaturArbeit;
        }

        /**
        * Verbrauchsaufteilung in % zwischen SLP und TLP-Profil.
        *
        * 1. [Gemessene Energiemenge der OBIS "nicht Schwachlast"] * [Verbrauchsaufteilung in % /
        * 100%]
        * = [zu verlagernde Energiemenge]
        * 2. [Gemessene Energiemenge der OBIS "Schwachlast"] - [zu verlagernde Energiemenge]
        * = [Ermittelte Energiemenge für Schwachlast]
        * 3. [Gemessene Energiemenge der OBIS "nicht Schwachlast"] + [zu verlagernde Energiemenge]
        * = [Ermittelte Energiemenge für nicht Schwachlast]
        */
        public Double getVerbrauchsaufteilung() {
            return verbrauchsaufteilung;
        }

        /**
        * Verbrauchsaufteilung in % zwischen SLP und TLP-Profil.
        *
        * 1. [Gemessene Energiemenge der OBIS "nicht Schwachlast"] * [Verbrauchsaufteilung in % /
        * 100%]
        * = [zu verlagernde Energiemenge]
        * 2. [Gemessene Energiemenge der OBIS "Schwachlast"] - [zu verlagernde Energiemenge]
        * = [Ermittelte Energiemenge für Schwachlast]
        * 3. [Gemessene Energiemenge der OBIS "nicht Schwachlast"] + [zu verlagernde Energiemenge]
        * = [Ermittelte Energiemenge für nicht Schwachlast]
        */
        public void setVerbrauchsaufteilung(Double verbrauchsaufteilung) {
            this.verbrauchsaufteilung = verbrauchsaufteilung;
        }

        /**
        * Wahlrecht der Prognosegrundlage.
        */
        public WahlrechtPrognosegrundlage getWahlrechtPrognosegrundlage() {
            return wahlrechtPrognosegrundlage;
        }

        /**
        * Wahlrecht der Prognosegrundlage.
        */
        public void setWahlrechtPrognosegrundlage(WahlrechtPrognosegrundlage wahlrechtPrognosegrundlage) {
            this.wahlrechtPrognosegrundlage = wahlrechtPrognosegrundlage;
        }

        public Zeitreihentyp getZeitreihentyp() {
            return zeitreihentyp;
        }

        public void setZeitreihentyp(Zeitreihentyp zeitreihentyp) {
            this.zeitreihentyp = zeitreihentyp;
        }

        public static BilanzierungBuilder builder() {
            return new BilanzierungBuilder();
        }

        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class BilanzierungBuilder extends GeschaeftsobjektBuilder {
            private Abwicklungsmodell abwicklungsmodell;
            private Aggregationsverantwortung aggregationsverantwortung;
            private OffsetDateTime bilanzierungsbeginn;
            private OffsetDateTime bilanzierungsende;
            private String bilanzkreis;
            private List<Profiltyp> detailsPrognosegrundlage;
            private Fallgruppenzuordnung fallgruppenzuordnung;
            private WahlrechtPrognosegrundlage grundWahlrechtPrognosegrundlage;
            private Menge jahresverbrauchsprognose;
            private Menge kundenwert;
            private List<Lastprofil> lastprofil;
            private String marktlokationsId;
            private Long prioritaet;
            private Prognosegrundlage prognosegrundlage;
            private Menge temperaturArbeit;
            private Double verbrauchsaufteilung;
            private WahlrechtPrognosegrundlage wahlrechtPrognosegrundlage;
            private Zeitreihentyp zeitreihentyp;

            private BilanzierungBuilder() {
            }

            public BilanzierungBuilder setAbwicklungsmodell(Abwicklungsmodell abwicklungsmodell) {
                this.abwicklungsmodell = abwicklungsmodell;
                return this;
            }

            public BilanzierungBuilder setAggregationsverantwortung(Aggregationsverantwortung aggregationsverantwortung) {
                this.aggregationsverantwortung = aggregationsverantwortung;
                return this;
            }

            public BilanzierungBuilder setBilanzierungsbeginn(OffsetDateTime bilanzierungsbeginn) {
                this.bilanzierungsbeginn = bilanzierungsbeginn;
                return this;
            }

            public BilanzierungBuilder setBilanzierungsende(OffsetDateTime bilanzierungsende) {
                this.bilanzierungsende = bilanzierungsende;
                return this;
            }

            public BilanzierungBuilder setBilanzkreis(String bilanzkreis) {
                this.bilanzkreis = bilanzkreis;
                return this;
            }

            /**
            * Prognosegrundlage.
            *
            * Besteht der Bedarf ein tagesparameteräbhängiges Lastprofil mit gemeinsamer Messung
            * anzugeben,
            * so ist dies über die 2 -malige Wiederholung des CAV Segments mit der Angabe der Codes E02
            * und E14 möglich.
            */
            public BilanzierungBuilder setDetailsPrognosegrundlage(List<Profiltyp> detailsPrognosegrundlage) {
                this.detailsPrognosegrundlage = detailsPrognosegrundlage;
                return this;
            }

            public BilanzierungBuilder setFallgruppenzuordnung(Fallgruppenzuordnung fallgruppenzuordnung) {
                this.fallgruppenzuordnung = fallgruppenzuordnung;
                return this;
            }

            /**
            * Grund Wahlrecht der Prognosegrundlage.
            *
            * true=Wahlrecht beim Lieferanten vorhanden
            */
            public BilanzierungBuilder setGrundWahlrechtPrognosegrundlage(WahlrechtPrognosegrundlage grundWahlrechtPrognosegrundlage) {
                this.grundWahlrechtPrognosegrundlage = grundWahlrechtPrognosegrundlage;
                return this;
            }

            public BilanzierungBuilder setJahresverbrauchsprognose(Menge jahresverbrauchsprognose) {
                this.jahresverbrauchsprognose = jahresverbrauchsprognose;
                return this;
            }

            public BilanzierungBuilder setKundenwert(Menge kundenwert) {
                this.kundenwert = kundenwert;
                return this;
            }

            public BilanzierungBuilder setLastprofil(List<Lastprofil> lastprofil) {
                this.lastprofil = lastprofil;
                return this;
            }

            public BilanzierungBuilder setMarktlokationsId(String marktlokationsId) {
                this.marktlokationsId = marktlokationsId;
                return this;
            }

            public BilanzierungBuilder setPrioritaet(Long prioritaet) {
                this.prioritaet = prioritaet;
                return this;
            }

            public BilanzierungBuilder setPrognosegrundlage(Prognosegrundlage prognosegrundlage) {
                this.prognosegrundlage = prognosegrundlage;
                return this;
            }

            public BilanzierungBuilder setTemperaturArbeit(Menge temperaturArbeit) {
                this.temperaturArbeit = temperaturArbeit;
                return this;
            }

            /**
            * Verbrauchsaufteilung in % zwischen SLP und TLP-Profil.
            *
            * 1. [Gemessene Energiemenge der OBIS "nicht Schwachlast"] * [Verbrauchsaufteilung in % /
            * 100%]
            * = [zu verlagernde Energiemenge]
            * 2. [Gemessene Energiemenge der OBIS "Schwachlast"] - [zu verlagernde Energiemenge]
            * = [Ermittelte Energiemenge für Schwachlast]
            * 3. [Gemessene Energiemenge der OBIS "nicht Schwachlast"] + [zu verlagernde Energiemenge]
            * = [Ermittelte Energiemenge für nicht Schwachlast]
            */
            public BilanzierungBuilder setVerbrauchsaufteilung(Double verbrauchsaufteilung) {
                this.verbrauchsaufteilung = verbrauchsaufteilung;
                return this;
            }

            /**
            * Wahlrecht der Prognosegrundlage.
            */
            public BilanzierungBuilder setWahlrechtPrognosegrundlage(WahlrechtPrognosegrundlage wahlrechtPrognosegrundlage) {
                this.wahlrechtPrognosegrundlage = wahlrechtPrognosegrundlage;
                return this;
            }

            public BilanzierungBuilder setZeitreihentyp(Zeitreihentyp zeitreihentyp) {
                this.zeitreihentyp = zeitreihentyp;
                return this;
            }

            public BilanzierungBuilder set_id(String _id) {
                super.set_id(_id);
                return this;
            }

            public BilanzierungBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
                super.setZusatzAttribute(zusatzAttribute);
                return this;
            }

            public Bilanzierung build() {
                return new Bilanzierung(this);
            }
        }
    }