package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.StandorteigenschaftenGas;
import bo4e.com.StandorteigenschaftenStrom;
import bo4e.enums.Typ;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Modelliert die regionalen und spartenspezifischen Eigenschaften einer gegebenen Adresse.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Standorteigenschaften.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Standorteigenschaften JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/bo/Standorteigenschaften.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Standorteigenschaften extends Geschaeftsobjekt {
    private final Typ _typ = Typ.STANDORTEIGENSCHAFTEN;
    private StandorteigenschaftenGas eigenschaftenGas;
    private List<StandorteigenschaftenStrom> eigenschaftenStrom;

    public Standorteigenschaften() {
    }

    private Standorteigenschaften(StandorteigenschaftenBuilder builder) {
        super(builder);
        this.eigenschaftenGas = builder.eigenschaftenGas;
        this.eigenschaftenStrom = builder.eigenschaftenStrom;
    }

    public Typ get_typ() {
        return _typ;
    }

    /**
    * Eigenschaften zur Sparte Gas
    */
    public StandorteigenschaftenGas getEigenschaftenGas() {
        return eigenschaftenGas;
    }

    /**
    * Eigenschaften zur Sparte Gas
    */
    public void setEigenschaftenGas(StandorteigenschaftenGas eigenschaftenGas) {
        this.eigenschaftenGas = eigenschaftenGas;
    }

    /**
    * Eigenschaften zur Sparte Strom
    */
    public List<StandorteigenschaftenStrom> getEigenschaftenStrom() {
        return eigenschaftenStrom;
    }

    /**
    * Eigenschaften zur Sparte Strom
    */
    public void setEigenschaftenStrom(List<StandorteigenschaftenStrom> eigenschaftenStrom) {
        this.eigenschaftenStrom = eigenschaftenStrom;
    }

    public static StandorteigenschaftenBuilder builder() {
        return new StandorteigenschaftenBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class StandorteigenschaftenBuilder extends GeschaeftsobjektBuilder {
        private StandorteigenschaftenGas eigenschaftenGas;
        private List<StandorteigenschaftenStrom> eigenschaftenStrom;

        private StandorteigenschaftenBuilder() {
        }

        /**
        * Eigenschaften zur Sparte Gas
        */
        public StandorteigenschaftenBuilder setEigenschaftenGas(StandorteigenschaftenGas eigenschaftenGas) {
            this.eigenschaftenGas = eigenschaftenGas;
            return this;
        }

        /**
        * Eigenschaften zur Sparte Strom
        */
        public StandorteigenschaftenBuilder setEigenschaftenStrom(List<StandorteigenschaftenStrom> eigenschaftenStrom) {
            this.eigenschaftenStrom = eigenschaftenStrom;
            return this;
        }

        public StandorteigenschaftenBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public StandorteigenschaftenBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Standorteigenschaften build() {
            return new Standorteigenschaften(this);
        }
    }
}