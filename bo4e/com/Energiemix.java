package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.Oekolabel;
import bo4e.enums.Oekozertifikat;
import bo4e.enums.Sparte;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * Zusammensetzung der gelieferten Energie aus den verschiedenen Primärenergieformen.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Energiemix.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Energiemix JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/com/Energiemix.json>`_
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Energiemix extends COM {
    private List<Energieherkunft> anteil;
    private Double atommuell;
    private String bemerkung;
    private String bezeichnung;
    private Double co2Emission;
    private Sparte energieart;
    private Long energiemixnummer;
    private Long gueltigkeitsjahr;
    private Boolean istInOekoTopTen;
    private List<Oekolabel> oekolabel;
    private List<Oekozertifikat> oekozertifikate;
    private String website;

    public Energiemix() {
    }

    private Energiemix(EnergiemixBuilder builder) {
        super(builder);
        this.anteil = builder.anteil;
        this.atommuell = builder.atommuell;
        this.bemerkung = builder.bemerkung;
        this.bezeichnung = builder.bezeichnung;
        this.co2Emission = builder.co2Emission;
        this.energieart = builder.energieart;
        this.energiemixnummer = builder.energiemixnummer;
        this.gueltigkeitsjahr = builder.gueltigkeitsjahr;
        this.istInOekoTopTen = builder.istInOekoTopTen;
        this.oekolabel = builder.oekolabel;
        this.oekozertifikate = builder.oekozertifikate;
        this.website = builder.website;
    }

    /**
     * Anteile der jeweiligen Erzeugungsart
     */
    public List<Energieherkunft> getAnteil() {
        return anteil;
    }

    /**
     * Anteile der jeweiligen Erzeugungsart
     */
    public void setAnteil(List<Energieherkunft> anteil) {
        this.anteil = anteil;
    }

    /**
     * Höhe des erzeugten Atommülls in g/kWh
     */
    public Double getAtommuell() {
        return atommuell;
    }

    /**
     * Höhe des erzeugten Atommülls in g/kWh
     */
    public void setAtommuell(Double atommuell) {
        this.atommuell = atommuell;
    }

    /**
     * Bemerkung zum Energiemix
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Bemerkung zum Energiemix
     */
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    /**
     * Bezeichnung des Energiemix
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Bezeichnung des Energiemix
     */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
     * Höhe des erzeugten CO2-Ausstosses in g/kWh
     */
    public Double getCo2Emission() {
        return co2Emission;
    }

    /**
     * Höhe des erzeugten CO2-Ausstosses in g/kWh
     */
    public void setCo2Emission(Double co2Emission) {
        this.co2Emission = co2Emission;
    }

    /**
     * Strom oder Gas etc.
     */
    public Sparte getEnergieart() {
        return energieart;
    }

    /**
     * Strom oder Gas etc.
     */
    public void setEnergieart(Sparte energieart) {
        this.energieart = energieart;
    }

    /**
     * Eindeutige Nummer zur Identifizierung des Energiemixes
     */
    public Long getEnergiemixnummer() {
        return energiemixnummer;
    }

    /**
     * Eindeutige Nummer zur Identifizierung des Energiemixes
     */
    public void setEnergiemixnummer(Long energiemixnummer) {
        this.energiemixnummer = energiemixnummer;
    }

    /**
     * Jahr, für das der Energiemix gilt
     */
    public Long getGueltigkeitsjahr() {
        return gueltigkeitsjahr;
    }

    /**
     * Jahr, für das der Energiemix gilt
     */
    public void setGueltigkeitsjahr(Long gueltigkeitsjahr) {
        this.gueltigkeitsjahr = gueltigkeitsjahr;
    }

    /**
     * Kennzeichen, ob der Versorger zu den Öko Top Ten gehört
     */
    public Boolean getIstInOekoTopTen() {
        return istInOekoTopTen;
    }

    /**
     * Kennzeichen, ob der Versorger zu den Öko Top Ten gehört
     */
    public void setIstInOekoTopTen(Boolean istInOekoTopTen) {
        this.istInOekoTopTen = istInOekoTopTen;
    }

    /**
     * Ökolabel für den Energiemix
     */
    public List<Oekolabel> getOekolabel() {
        return oekolabel;
    }

    /**
     * Ökolabel für den Energiemix
     */
    public void setOekolabel(List<Oekolabel> oekolabel) {
        this.oekolabel = oekolabel;
    }

    /**
     * Zertifikate für den Energiemix
     */
    public List<Oekozertifikat> getOekozertifikate() {
        return oekozertifikate;
    }

    /**
     * Zertifikate für den Energiemix
     */
    public void setOekozertifikate(List<Oekozertifikat> oekozertifikate) {
        this.oekozertifikate = oekozertifikate;
    }

    /**
     * Internetseite, auf der die Strommixdaten veröffentlicht sind
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Internetseite, auf der die Strommixdaten veröffentlicht sind
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    public static EnergiemixBuilder builder() {
        return new EnergiemixBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class EnergiemixBuilder extends COMBuilder {
        private List<Energieherkunft> anteil;
        private Double atommuell;
        private String bemerkung;
        private String bezeichnung;
        private Double co2Emission;
        private Sparte energieart;
        private Long energiemixnummer;
        private Long gueltigkeitsjahr;
        private Boolean istInOekoTopTen;
        private List<Oekolabel> oekolabel;
        private List<Oekozertifikat> oekozertifikate;
        private String website;

        private EnergiemixBuilder() {
        }

        /**
         * Anteile der jeweiligen Erzeugungsart
         */
        public List<Energieherkunft> getAnteil() {
            return anteil;
        }

        /**
         * Anteile der jeweiligen Erzeugungsart
         */
        public EnergiemixBuilder setAnteil(List<Energieherkunft> anteil) {
            this.anteil = anteil;
            return this;
        }

        /**
         * Höhe des erzeugten Atommülls in g/kWh
         */
        public Double getAtommuell() {
            return atommuell;
        }

        /**
         * Höhe des erzeugten Atommülls in g/kWh
         */
        public EnergiemixBuilder setAtommuell(Double atommuell) {
            this.atommuell = atommuell;
            return this;
        }

        /**
         * Bemerkung zum Energiemix
         */
        public String getBemerkung() {
            return bemerkung;
        }

        /**
         * Bemerkung zum Energiemix
         */
        public EnergiemixBuilder setBemerkung(String bemerkung) {
            this.bemerkung = bemerkung;
            return this;
        }

        /**
         * Bezeichnung des Energiemix
         */
        public String getBezeichnung() {
            return bezeichnung;
        }

        /**
         * Bezeichnung des Energiemix
         */
        public EnergiemixBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
         * Höhe des erzeugten CO2-Ausstosses in g/kWh
         */
        public Double getCo2Emission() {
            return co2Emission;
        }

        /**
         * Höhe des erzeugten CO2-Ausstosses in g/kWh
         */
        public EnergiemixBuilder setCo2Emission(Double co2Emission) {
            this.co2Emission = co2Emission;
            return this;
        }

        /**
         * Strom oder Gas etc.
         */
        public Sparte getEnergieart() {
            return energieart;
        }

        /**
         * Strom oder Gas etc.
         */
        public EnergiemixBuilder setEnergieart(Sparte energieart) {
            this.energieart = energieart;
            return this;
        }

        /**
         * Eindeutige Nummer zur Identifizierung des Energiemixes
         */
        public Long getEnergiemixnummer() {
            return energiemixnummer;
        }

        /**
         * Eindeutige Nummer zur Identifizierung des Energiemixes
         */
        public EnergiemixBuilder setEnergiemixnummer(Long energiemixnummer) {
            this.energiemixnummer = energiemixnummer;
            return this;
        }

        /**
         * Jahr, für das der Energiemix gilt
         */
        public Long getGueltigkeitsjahr() {
            return gueltigkeitsjahr;
        }

        /**
         * Jahr, für das der Energiemix gilt
         */
        public EnergiemixBuilder setGueltigkeitsjahr(Long gueltigkeitsjahr) {
            this.gueltigkeitsjahr = gueltigkeitsjahr;
            return this;
        }

        /**
         * Kennzeichen, ob der Versorger zu den Öko Top Ten gehört
         */
        public Boolean getIstInOekoTopTen() {
            return istInOekoTopTen;
        }

        /**
         * Kennzeichen, ob der Versorger zu den Öko Top Ten gehört
         */
        public EnergiemixBuilder setIstInOekoTopTen(Boolean istInOekoTopTen) {
            this.istInOekoTopTen = istInOekoTopTen;
            return this;
        }

        /**
         * Ökolabel für den Energiemix
         */
        public List<Oekolabel> getOekolabel() {
            return oekolabel;
        }

        /**
         * Ökolabel für den Energiemix
         */
        public EnergiemixBuilder setOekolabel(List<Oekolabel> oekolabel) {
            this.oekolabel = oekolabel;
            return this;
        }

        /**
         * Zertifikate für den Energiemix
         */
        public List<Oekozertifikat> getOekozertifikate() {
            return oekozertifikate;
        }

        /**
         * Zertifikate für den Energiemix
         */
        public EnergiemixBuilder setOekozertifikate(List<Oekozertifikat> oekozertifikate) {
            this.oekozertifikate = oekozertifikate;
            return this;
        }

        /**
         * Internetseite, auf der die Strommixdaten veröffentlicht sind
         */
        public String getWebsite() {
            return website;
        }

        /**
         * Internetseite, auf der die Strommixdaten veröffentlicht sind
         */
        public EnergiemixBuilder setWebsite(String website) {
            this.website = website;
            return this;
        }

        public EnergiemixBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public EnergiemixBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Energiemix build() {
            return new Energiemix(this);
        }
    }
}