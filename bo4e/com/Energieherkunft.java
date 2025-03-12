package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.Erzeugungsart;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Abbildung einer Energieherkunft
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Energieherkunft.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Energieherkunft JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.5.0/src/bo4e_schemas/com/Energieherkunft.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Energieherkunft extends COM {
    private Double anteilProzent;
    private Erzeugungsart erzeugungsart;

    public Energieherkunft() {
    }

    private Energieherkunft(EnergieherkunftBuilder builder) {
        super(builder);
        this.anteilProzent = builder.anteilProzent;
        this.erzeugungsart = builder.erzeugungsart;
    }

    /**
    * Prozentualer Anteil der jeweiligen Erzeugungsart.
    */
    public Double getAnteilProzent() {
        return anteilProzent;
    }

    /**
    * Prozentualer Anteil der jeweiligen Erzeugungsart.
    */
    public void setAnteilProzent(Double anteilProzent) {
        this.anteilProzent = anteilProzent;
    }

    /**
    * Art der Erzeugung der Energie.
    */
    public Erzeugungsart getErzeugungsart() {
        return erzeugungsart;
    }

    /**
    * Art der Erzeugung der Energie.
    */
    public void setErzeugungsart(Erzeugungsart erzeugungsart) {
        this.erzeugungsart = erzeugungsart;
    }

    public static EnergieherkunftBuilder builder() {
        return new EnergieherkunftBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class EnergieherkunftBuilder extends COMBuilder {
        private Double anteilProzent;
        private Erzeugungsart erzeugungsart;

        private EnergieherkunftBuilder() {
        }

        /**
        * Prozentualer Anteil der jeweiligen Erzeugungsart.
        */
        public EnergieherkunftBuilder setAnteilProzent(Double anteilProzent) {
            this.anteilProzent = anteilProzent;
            return this;
        }

        /**
        * Art der Erzeugung der Energie.
        */
        public EnergieherkunftBuilder setErzeugungsart(Erzeugungsart erzeugungsart) {
            this.erzeugungsart = erzeugungsart;
            return this;
        }

        public EnergieherkunftBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public EnergieherkunftBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Energieherkunft build() {
            return new Energieherkunft(this);
        }
    }
}