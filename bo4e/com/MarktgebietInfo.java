package bo4e.com;

import bo4e.ZusatzAttribut;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Informationen zum Marktgebiet im Gas.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/MarktgebietInfo.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `MarktgebietInfo JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.5.0/src/bo4e_schemas/com/MarktgebietInfo.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MarktgebietInfo extends COM {
    private String marktgebiet;
    private String marktgebietcode;

    public MarktgebietInfo() {
    }

    private MarktgebietInfo(MarktgebietInfoBuilder builder) {
        super(builder);
        this.marktgebiet = builder.marktgebiet;
        this.marktgebietcode = builder.marktgebietcode;
    }

    /**
    * Der Name des Marktgebietes
    */
    public String getMarktgebiet() {
        return marktgebiet;
    }

    /**
    * Der Name des Marktgebietes
    */
    public void setMarktgebiet(String marktgebiet) {
        this.marktgebiet = marktgebiet;
    }

    /**
    * Die standardisierte Codenummer des Marktgebietes
    */
    public String getMarktgebietcode() {
        return marktgebietcode;
    }

    /**
    * Die standardisierte Codenummer des Marktgebietes
    */
    public void setMarktgebietcode(String marktgebietcode) {
        this.marktgebietcode = marktgebietcode;
    }

    public static MarktgebietInfoBuilder builder() {
        return new MarktgebietInfoBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class MarktgebietInfoBuilder extends COMBuilder {
        private String marktgebiet;
        private String marktgebietcode;

        private MarktgebietInfoBuilder() {
        }

        /**
        * Der Name des Marktgebietes
        */
        public MarktgebietInfoBuilder setMarktgebiet(String marktgebiet) {
            this.marktgebiet = marktgebiet;
            return this;
        }

        /**
        * Die standardisierte Codenummer des Marktgebietes
        */
        public MarktgebietInfoBuilder setMarktgebietcode(String marktgebietcode) {
            this.marktgebietcode = marktgebietcode;
            return this;
        }

        public MarktgebietInfoBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public MarktgebietInfoBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public MarktgebietInfo build() {
            return new MarktgebietInfo(this);
        }
    }
}