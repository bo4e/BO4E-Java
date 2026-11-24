package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.OffsetTime;
import java.util.List;

/**
* Modelliert eine Umschaltzeit, wann auf ein bestimmtes Register geschaltet werden soll.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Umschaltzeit.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Umschaltzeit JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202601.0.0/src/bo4e_schemas/com/Umschaltzeit.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Umschaltzeit extends COM {
    private final ComTyp _typ = ComTyp.UMSCHALTZEIT;
    private String registercode;
    private OffsetTime umschaltzeit;

    public Umschaltzeit() {
    }

    private Umschaltzeit(UmschaltzeitBuilder builder) {
        super(builder);
        this.registercode = builder.registercode;
        this.umschaltzeit = builder.umschaltzeit;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Ein Code, der ein Register spezifiziert. Typischerweise eine 3-stellige Zeichenkette.
    */
    public String getRegistercode() {
        return registercode;
    }

    /**
    * Ein Code, der ein Register spezifiziert. Typischerweise eine 3-stellige Zeichenkette.
    */
    public void setRegistercode(String registercode) {
        this.registercode = registercode;
    }

    /**
    * Definiert den Zeitpunkt ab dem auf das Register geschaltet wird, das im Feld
    * `registercode` spezifiziert ist.
    */
    public OffsetTime getUmschaltzeit() {
        return umschaltzeit;
    }

    /**
    * Definiert den Zeitpunkt ab dem auf das Register geschaltet wird, das im Feld
    * `registercode` spezifiziert ist.
    */
    public void setUmschaltzeit(OffsetTime umschaltzeit) {
        this.umschaltzeit = umschaltzeit;
    }

    public static UmschaltzeitBuilder builder() {
        return new UmschaltzeitBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class UmschaltzeitBuilder extends COMBuilder {
        private String registercode;
        private OffsetTime umschaltzeit;

        private UmschaltzeitBuilder() {
        }

        /**
        * Ein Code, der ein Register spezifiziert. Typischerweise eine 3-stellige Zeichenkette.
        */
        public UmschaltzeitBuilder setRegistercode(String registercode) {
            this.registercode = registercode;
            return this;
        }

        /**
        * Definiert den Zeitpunkt ab dem auf das Register geschaltet wird, das im Feld
        * `registercode` spezifiziert ist.
        */
        public UmschaltzeitBuilder setUmschaltzeit(OffsetTime umschaltzeit) {
            this.umschaltzeit = umschaltzeit;
            return this;
        }

        public UmschaltzeitBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public UmschaltzeitBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Umschaltzeit build() {
            return new Umschaltzeit(this);
        }
    }
}