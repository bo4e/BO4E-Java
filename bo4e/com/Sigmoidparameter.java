package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;

import java.util.List;

/**
* Die Sigmoid-Funktion, beispielsweise zur Berechnung eines Leistungspreises hat die Form:
* LP=A/(1+(P/B)^C)+D
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Sigmoidparameter.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Sigmoidparameter JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.7.0/src/bo4e_schemas/com/Sigmoidparameter.json>`_
*/
public class Sigmoidparameter extends COM {
    private final ComTyp _typ = ComTyp.SIGMOIDPARAMETER;
    private Double a;
    private Double b;
    private Double c;
    private Double d;

    public Sigmoidparameter() {
    }

    private Sigmoidparameter(SigmoidparameterBuilder builder) {
        super(builder);
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Briefmarke Ortsverteilnetz (EUR/kWh)
    */
    public Double getA() {
        return a;
    }

    /**
    * Briefmarke Ortsverteilnetz (EUR/kWh)
    */
    public void setA(Double a) {
        this.a = a;
    }

    /**
    * Wendepunkt für die bepreiste Menge (kW)
    */
    public Double getB() {
        return b;
    }

    /**
    * Wendepunkt für die bepreiste Menge (kW)
    */
    public void setB(Double b) {
        this.b = b;
    }

    /**
    * Exponent (einheitenlos)
    */
    public Double getC() {
        return c;
    }

    /**
    * Exponent (einheitenlos)
    */
    public void setC(Double c) {
        this.c = c;
    }

    /**
    * Briefmarke Transportnetz (EUR/kWh)
    */
    public Double getD() {
        return d;
    }

    /**
    * Briefmarke Transportnetz (EUR/kWh)
    */
    public void setD(Double d) {
        this.d = d;
    }

    public static SigmoidparameterBuilder builder() {
        return new SigmoidparameterBuilder();
    }

    public static class SigmoidparameterBuilder extends COMBuilder {
        private Double a;
        private Double b;
        private Double c;
        private Double d;

        private SigmoidparameterBuilder() {
        }

        /**
        * Briefmarke Ortsverteilnetz (EUR/kWh)
        */
        public SigmoidparameterBuilder setA(Double a) {
            this.a = a;
            return this;
        }

        /**
        * Wendepunkt für die bepreiste Menge (kW)
        */
        public SigmoidparameterBuilder setB(Double b) {
            this.b = b;
            return this;
        }

        /**
        * Exponent (einheitenlos)
        */
        public SigmoidparameterBuilder setC(Double c) {
            this.c = c;
            return this;
        }

        /**
        * Briefmarke Transportnetz (EUR/kWh)
        */
        public SigmoidparameterBuilder setD(Double d) {
            this.d = d;
            return this;
        }

        public SigmoidparameterBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public SigmoidparameterBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Sigmoidparameter build() {
            return new Sigmoidparameter(this);
        }
    }
}