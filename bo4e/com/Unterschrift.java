package bo4e.com;

import bo4e.ZusatzAttribut;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.OffsetDateTime;
import java.util.List;

/**
* Modellierung einer Unterschrift, z.B. für Verträge, Angebote etc.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Unterschrift.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Unterschrift JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.6.0/src/bo4e_schemas/com/Unterschrift.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Unterschrift extends COM {
    private OffsetDateTime datum;
    private String name;
    private String ort;

    public Unterschrift() {
    }

    private Unterschrift(UnterschriftBuilder builder) {
        super(builder);
        this.datum = builder.datum;
        this.name = builder.name;
        this.ort = builder.ort;
    }

    /**
    * Datum der Unterschrift
    */
    public OffsetDateTime getDatum() {
        return datum;
    }

    /**
    * Datum der Unterschrift
    */
    public void setDatum(OffsetDateTime datum) {
        this.datum = datum;
    }

    /**
    * Name des Unterschreibers
    */
    public String getName() {
        return name;
    }

    /**
    * Name des Unterschreibers
    */
    public void setName(String name) {
        this.name = name;
    }

    /**
    * Ort, an dem die Unterschrift geleistet wird
    */
    public String getOrt() {
        return ort;
    }

    /**
    * Ort, an dem die Unterschrift geleistet wird
    */
    public void setOrt(String ort) {
        this.ort = ort;
    }

    public static UnterschriftBuilder builder() {
        return new UnterschriftBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class UnterschriftBuilder extends COMBuilder {
        private OffsetDateTime datum;
        private String name;
        private String ort;

        private UnterschriftBuilder() {
        }

        /**
        * Datum der Unterschrift
        */
        public UnterschriftBuilder setDatum(OffsetDateTime datum) {
            this.datum = datum;
            return this;
        }

        /**
        * Name des Unterschreibers
        */
        public UnterschriftBuilder setName(String name) {
            this.name = name;
            return this;
        }

        /**
        * Ort, an dem die Unterschrift geleistet wird
        */
        public UnterschriftBuilder setOrt(String ort) {
            this.ort = ort;
            return this;
        }

        public UnterschriftBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public UnterschriftBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Unterschrift build() {
            return new Unterschrift(this);
        }
    }
}