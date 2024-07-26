package bo4e.com;

import bo4e.ZusatzAttribut;

import java.util.List;

/**
 * Standorteigenschaften der Sparte Gas
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/StandorteigenschaftenGas.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `StandorteigenschaftenGas JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.3.2/src/bo4e_schemas/com/StandorteigenschaftenGas.json>`_
 */
public class StandorteigenschaftenGas extends COM {
    private List<MarktgebietInfo> marktgebiete;
    private List<String> netzkontonummern;

    public StandorteigenschaftenGas() {
    }

    private StandorteigenschaftenGas(StandorteigenschaftenGasBuilder builder) {
        super(builder);
        this.marktgebiete = builder.marktgebiete;
        this.netzkontonummern = builder.netzkontonummern;
    }

    /**
     * Netzkontonummern der Gasnetze
     */
    public List<MarktgebietInfo> getMarktgebiete() {
        return marktgebiete;
    }

    /**
     * Netzkontonummern der Gasnetze
     */
    public void setMarktgebiete(List<MarktgebietInfo> marktgebiete) {
        this.marktgebiete = marktgebiete;
    }

    /**
     * Netzkontonummern der Gasnetze
     */
    public List<String> getNetzkontonummern() {
        return netzkontonummern;
    }

    /**
     * Netzkontonummern der Gasnetze
     */
    public void setNetzkontonummern(List<String> netzkontonummern) {
        this.netzkontonummern = netzkontonummern;
    }

    public static StandorteigenschaftenGasBuilder builder() {
        return new StandorteigenschaftenGasBuilder();
    }

    public static class StandorteigenschaftenGasBuilder extends COMBuilder {
        private List<MarktgebietInfo> marktgebiete;
        private List<String> netzkontonummern;

        private StandorteigenschaftenGasBuilder() {
        }

        /**
         * Netzkontonummern der Gasnetze
         */
        public List<MarktgebietInfo> getMarktgebiete() {
            return marktgebiete;
        }

        /**
         * Netzkontonummern der Gasnetze
         */
        public StandorteigenschaftenGasBuilder setMarktgebiete(List<MarktgebietInfo> marktgebiete) {
            this.marktgebiete = marktgebiete;
            return this;
        }

        /**
         * Netzkontonummern der Gasnetze
         */
        public List<String> getNetzkontonummern() {
            return netzkontonummern;
        }

        /**
         * Netzkontonummern der Gasnetze
         */
        public StandorteigenschaftenGasBuilder setNetzkontonummern(List<String> netzkontonummern) {
            this.netzkontonummern = netzkontonummern;
            return this;
        }

        public StandorteigenschaftenGasBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public StandorteigenschaftenGasBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public StandorteigenschaftenGas build() {
            return new StandorteigenschaftenGas(this);
        }
    }
}