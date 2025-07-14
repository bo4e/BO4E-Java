package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;

import java.util.List;

/**
* Mit dieser Komponente werden Zählzeitregister modelliert. Ein Zählzeitregister beschreibt
* eine erweiterte Definition der Zählzeit
* in Bezug auf ein Register. Dabei werden alle Codes dazu vom Netzbetreiber vergeben.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Zaehlzeitregister.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Zaehlzeitregister JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.1.0-rc1/src/bo4e_schemas/com/Zaehlzeitregister.json>`_
*/
public class Zaehlzeitregister extends COM {
    private final ComTyp _typ = ComTyp.ZAEHLZEITREGISTER;
    private Boolean istSchwachlastfaehig;
    private String zaehlzeitDefinition;
    private String zaehlzeitRegister;

    public Zaehlzeitregister() {
    }

    private Zaehlzeitregister(ZaehlzeitregisterBuilder builder) {
        super(builder);
        this.istSchwachlastfaehig = builder.istSchwachlastfaehig;
        this.zaehlzeitDefinition = builder.zaehlzeitDefinition;
        this.zaehlzeitRegister = builder.zaehlzeitRegister;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Schwachlastfaehigkeit
    */
    public Boolean getIstSchwachlastfaehig() {
        return istSchwachlastfaehig;
    }

    /**
    * Schwachlastfaehigkeit
    */
    public void setIstSchwachlastfaehig(Boolean istSchwachlastfaehig) {
        this.istSchwachlastfaehig = istSchwachlastfaehig;
    }

    /**
    * Zählzeitdefinition
    */
    public String getZaehlzeitDefinition() {
        return zaehlzeitDefinition;
    }

    /**
    * Zählzeitdefinition
    */
    public void setZaehlzeitDefinition(String zaehlzeitDefinition) {
        this.zaehlzeitDefinition = zaehlzeitDefinition;
    }

    /**
    * Zählzeitregister
    */
    public String getZaehlzeitRegister() {
        return zaehlzeitRegister;
    }

    /**
    * Zählzeitregister
    */
    public void setZaehlzeitRegister(String zaehlzeitRegister) {
        this.zaehlzeitRegister = zaehlzeitRegister;
    }

    public static ZaehlzeitregisterBuilder builder() {
        return new ZaehlzeitregisterBuilder();
    }

    public static class ZaehlzeitregisterBuilder extends COMBuilder {
        private Boolean istSchwachlastfaehig;
        private String zaehlzeitDefinition;
        private String zaehlzeitRegister;

        private ZaehlzeitregisterBuilder() {
        }

        /**
        * Schwachlastfaehigkeit
        */
        public ZaehlzeitregisterBuilder setIstSchwachlastfaehig(Boolean istSchwachlastfaehig) {
            this.istSchwachlastfaehig = istSchwachlastfaehig;
            return this;
        }

        /**
        * Zählzeitdefinition
        */
        public ZaehlzeitregisterBuilder setZaehlzeitDefinition(String zaehlzeitDefinition) {
            this.zaehlzeitDefinition = zaehlzeitDefinition;
            return this;
        }

        /**
        * Zählzeitregister
        */
        public ZaehlzeitregisterBuilder setZaehlzeitRegister(String zaehlzeitRegister) {
            this.zaehlzeitRegister = zaehlzeitRegister;
            return this;
        }

        public ZaehlzeitregisterBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public ZaehlzeitregisterBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Zaehlzeitregister build() {
            return new Zaehlzeitregister(this);
        }
    }
}