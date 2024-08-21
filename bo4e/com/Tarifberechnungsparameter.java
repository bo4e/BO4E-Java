package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.Messpreistyp;
import bo4e.enums.Tarifkalkulationsmethode;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * In dieser Komponente sind die Berechnungsparameter für die Ermittlung der Tarifkosten
 * zusammengefasst.
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Tarifberechnungsparameter.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Tarifberechnungsparameter JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/com/Tarifberechnungsparameter.json>`_
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Tarifberechnungsparameter extends COM {
    private Tarifkalkulationsmethode berechnungsmethode;
    private Preis hoechstpreisHT;
    private Preis hoechstpreisNT;
    private Boolean istMesspreisInGrundpreisEnthalten;
    private Boolean istMesspreisZuBeruecksichtigen;
    private Double kwInklusive;
    private Double kwWeitereMengen;
    private Messpreistyp messpreistyp;
    private Preis mindestpreis;
    private List<Tarifpreis> zusatzpreise;

    public Tarifberechnungsparameter() {
    }

    private Tarifberechnungsparameter(TarifberechnungsparameterBuilder builder) {
        super(builder);
        this.berechnungsmethode = builder.berechnungsmethode;
        this.hoechstpreisHT = builder.hoechstpreisHT;
        this.hoechstpreisNT = builder.hoechstpreisNT;
        this.istMesspreisInGrundpreisEnthalten = builder.istMesspreisInGrundpreisEnthalten;
        this.istMesspreisZuBeruecksichtigen = builder.istMesspreisZuBeruecksichtigen;
        this.kwInklusive = builder.kwInklusive;
        this.kwWeitereMengen = builder.kwWeitereMengen;
        this.messpreistyp = builder.messpreistyp;
        this.mindestpreis = builder.mindestpreis;
        this.zusatzpreise = builder.zusatzpreise;
    }

    /**
     * Gibt an, wie die Einzelpreise des Tarifes zu verarbeiten sind
     */
    public Tarifkalkulationsmethode getBerechnungsmethode() {
        return berechnungsmethode;
    }

    /**
     * Gibt an, wie die Einzelpreise des Tarifes zu verarbeiten sind
     */
    public void setBerechnungsmethode(Tarifkalkulationsmethode berechnungsmethode) {
        this.berechnungsmethode = berechnungsmethode;
    }

    /**
     * Höchstpreis für den Durchschnitts-Arbeitspreis HT
     */
    public Preis getHoechstpreisHT() {
        return hoechstpreisHT;
    }

    /**
     * Höchstpreis für den Durchschnitts-Arbeitspreis HT
     */
    public void setHoechstpreisHT(Preis hoechstpreisHT) {
        this.hoechstpreisHT = hoechstpreisHT;
    }

    /**
     * Höchstpreis für den Durchschnitts-Arbeitspreis NT
     */
    public Preis getHoechstpreisNT() {
        return hoechstpreisNT;
    }

    /**
     * Höchstpreis für den Durchschnitts-Arbeitspreis NT
     */
    public void setHoechstpreisNT(Preis hoechstpreisNT) {
        this.hoechstpreisNT = hoechstpreisNT;
    }

    /**
     * True, falls der Messpreis im Grundpreis (GP) enthalten ist
     */
    public Boolean getIstMesspreisInGrundpreisEnthalten() {
        return istMesspreisInGrundpreisEnthalten;
    }

    /**
     * True, falls der Messpreis im Grundpreis (GP) enthalten ist
     */
    public void setIstMesspreisInGrundpreisEnthalten(Boolean istMesspreisInGrundpreisEnthalten) {
        this.istMesspreisInGrundpreisEnthalten = istMesspreisInGrundpreisEnthalten;
    }

    /**
     * True, falls bei der Bildung des Durchschnittspreises für die Höchst- und
     * Mindestpreisbetrachtung der Messpreis mit
     * berücksichtigt wird
     */
    public Boolean getIstMesspreisZuBeruecksichtigen() {
        return istMesspreisZuBeruecksichtigen;
    }

    /**
     * True, falls bei der Bildung des Durchschnittspreises für die Höchst- und
     * Mindestpreisbetrachtung der Messpreis mit
     * berücksichtigt wird
     */
    public void setIstMesspreisZuBeruecksichtigen(Boolean istMesspreisZuBeruecksichtigen) {
        this.istMesspreisZuBeruecksichtigen = istMesspreisZuBeruecksichtigen;
    }

    /**
     * Im Preis bereits eingeschlossene Leistung (für Gas)
     */
    public Double getKwInklusive() {
        return kwInklusive;
    }

    /**
     * Im Preis bereits eingeschlossene Leistung (für Gas)
     */
    public void setKwInklusive(Double kwInklusive) {
        this.kwInklusive = kwInklusive;
    }

    /**
     * Intervall, indem die über "kwInklusive" hinaus abgenommene Leistung kostenpflichtig wird
     * (z.B. je 5 kW 20 EURO)
     */
    public Double getKwWeitereMengen() {
        return kwWeitereMengen;
    }

    /**
     * Intervall, indem die über "kwInklusive" hinaus abgenommene Leistung kostenpflichtig wird
     * (z.B. je 5 kW 20 EURO)
     */
    public void setKwWeitereMengen(Double kwWeitereMengen) {
        this.kwWeitereMengen = kwWeitereMengen;
    }

    /**
     * Typ des Messpreises
     */
    public Messpreistyp getMesspreistyp() {
        return messpreistyp;
    }

    /**
     * Typ des Messpreises
     */
    public void setMesspreistyp(Messpreistyp messpreistyp) {
        this.messpreistyp = messpreistyp;
    }

    /**
     * Mindestpreis für den Durchschnitts-Arbeitspreis
     */
    public Preis getMindestpreis() {
        return mindestpreis;
    }

    /**
     * Mindestpreis für den Durchschnitts-Arbeitspreis
     */
    public void setMindestpreis(Preis mindestpreis) {
        this.mindestpreis = mindestpreis;
    }

    /**
     * Liste mit zusätzlichen Preisen, beispielsweise Messpreise und/oder Leistungspreise
     */
    public List<Tarifpreis> getZusatzpreise() {
        return zusatzpreise;
    }

    /**
     * Liste mit zusätzlichen Preisen, beispielsweise Messpreise und/oder Leistungspreise
     */
    public void setZusatzpreise(List<Tarifpreis> zusatzpreise) {
        this.zusatzpreise = zusatzpreise;
    }

    public static TarifberechnungsparameterBuilder builder() {
        return new TarifberechnungsparameterBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class TarifberechnungsparameterBuilder extends COMBuilder {
        private Tarifkalkulationsmethode berechnungsmethode;
        private Preis hoechstpreisHT;
        private Preis hoechstpreisNT;
        private Boolean istMesspreisInGrundpreisEnthalten;
        private Boolean istMesspreisZuBeruecksichtigen;
        private Double kwInklusive;
        private Double kwWeitereMengen;
        private Messpreistyp messpreistyp;
        private Preis mindestpreis;
        private List<Tarifpreis> zusatzpreise;

        private TarifberechnungsparameterBuilder() {
        }

        /**
         * Gibt an, wie die Einzelpreise des Tarifes zu verarbeiten sind
         */
        public Tarifkalkulationsmethode getBerechnungsmethode() {
            return berechnungsmethode;
        }

        /**
         * Gibt an, wie die Einzelpreise des Tarifes zu verarbeiten sind
         */
        public TarifberechnungsparameterBuilder setBerechnungsmethode(Tarifkalkulationsmethode berechnungsmethode) {
            this.berechnungsmethode = berechnungsmethode;
            return this;
        }

        /**
         * Höchstpreis für den Durchschnitts-Arbeitspreis HT
         */
        public Preis getHoechstpreisHT() {
            return hoechstpreisHT;
        }

        /**
         * Höchstpreis für den Durchschnitts-Arbeitspreis HT
         */
        public TarifberechnungsparameterBuilder setHoechstpreisHT(Preis hoechstpreisHT) {
            this.hoechstpreisHT = hoechstpreisHT;
            return this;
        }

        /**
         * Höchstpreis für den Durchschnitts-Arbeitspreis NT
         */
        public Preis getHoechstpreisNT() {
            return hoechstpreisNT;
        }

        /**
         * Höchstpreis für den Durchschnitts-Arbeitspreis NT
         */
        public TarifberechnungsparameterBuilder setHoechstpreisNT(Preis hoechstpreisNT) {
            this.hoechstpreisNT = hoechstpreisNT;
            return this;
        }

        /**
         * True, falls der Messpreis im Grundpreis (GP) enthalten ist
         */
        public Boolean getIstMesspreisInGrundpreisEnthalten() {
            return istMesspreisInGrundpreisEnthalten;
        }

        /**
         * True, falls der Messpreis im Grundpreis (GP) enthalten ist
         */
        public TarifberechnungsparameterBuilder setIstMesspreisInGrundpreisEnthalten(Boolean istMesspreisInGrundpreisEnthalten) {
            this.istMesspreisInGrundpreisEnthalten = istMesspreisInGrundpreisEnthalten;
            return this;
        }

        /**
         * True, falls bei der Bildung des Durchschnittspreises für die Höchst- und
         * Mindestpreisbetrachtung der Messpreis mit
         * berücksichtigt wird
         */
        public Boolean getIstMesspreisZuBeruecksichtigen() {
            return istMesspreisZuBeruecksichtigen;
        }

        /**
         * True, falls bei der Bildung des Durchschnittspreises für die Höchst- und
         * Mindestpreisbetrachtung der Messpreis mit
         * berücksichtigt wird
         */
        public TarifberechnungsparameterBuilder setIstMesspreisZuBeruecksichtigen(Boolean istMesspreisZuBeruecksichtigen) {
            this.istMesspreisZuBeruecksichtigen = istMesspreisZuBeruecksichtigen;
            return this;
        }

        /**
         * Im Preis bereits eingeschlossene Leistung (für Gas)
         */
        public Double getKwInklusive() {
            return kwInklusive;
        }

        /**
         * Im Preis bereits eingeschlossene Leistung (für Gas)
         */
        public TarifberechnungsparameterBuilder setKwInklusive(Double kwInklusive) {
            this.kwInklusive = kwInklusive;
            return this;
        }

        /**
         * Intervall, indem die über "kwInklusive" hinaus abgenommene Leistung kostenpflichtig wird
         * (z.B. je 5 kW 20 EURO)
         */
        public Double getKwWeitereMengen() {
            return kwWeitereMengen;
        }

        /**
         * Intervall, indem die über "kwInklusive" hinaus abgenommene Leistung kostenpflichtig wird
         * (z.B. je 5 kW 20 EURO)
         */
        public TarifberechnungsparameterBuilder setKwWeitereMengen(Double kwWeitereMengen) {
            this.kwWeitereMengen = kwWeitereMengen;
            return this;
        }

        /**
         * Typ des Messpreises
         */
        public Messpreistyp getMesspreistyp() {
            return messpreistyp;
        }

        /**
         * Typ des Messpreises
         */
        public TarifberechnungsparameterBuilder setMesspreistyp(Messpreistyp messpreistyp) {
            this.messpreistyp = messpreistyp;
            return this;
        }

        /**
         * Mindestpreis für den Durchschnitts-Arbeitspreis
         */
        public Preis getMindestpreis() {
            return mindestpreis;
        }

        /**
         * Mindestpreis für den Durchschnitts-Arbeitspreis
         */
        public TarifberechnungsparameterBuilder setMindestpreis(Preis mindestpreis) {
            this.mindestpreis = mindestpreis;
            return this;
        }

        /**
         * Liste mit zusätzlichen Preisen, beispielsweise Messpreise und/oder Leistungspreise
         */
        public List<Tarifpreis> getZusatzpreise() {
            return zusatzpreise;
        }

        /**
         * Liste mit zusätzlichen Preisen, beispielsweise Messpreise und/oder Leistungspreise
         */
        public TarifberechnungsparameterBuilder setZusatzpreise(List<Tarifpreis> zusatzpreise) {
            this.zusatzpreise = zusatzpreise;
            return this;
        }

        public TarifberechnungsparameterBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public TarifberechnungsparameterBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Tarifberechnungsparameter build() {
            return new Tarifberechnungsparameter(this);
        }
    }
}