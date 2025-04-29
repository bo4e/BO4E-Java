package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Standorteigenschaften der Sparte Strom
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/StandorteigenschaftenStrom.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `StandorteigenschaftenStrom JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.0.0/src/bo4e_schemas/com/StandorteigenschaftenStrom.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StandorteigenschaftenStrom extends COM {
    private final ComTyp _typ = ComTyp.STANDORTEIGENSCHAFTENSTROM;
    private String bilanzierungsgebietEic;
    private String regelzone;
    private String regelzoneEic;

    public StandorteigenschaftenStrom() {
    }

    private StandorteigenschaftenStrom(StandorteigenschaftenStromBuilder builder) {
        super(builder);
        this.bilanzierungsgebietEic = builder.bilanzierungsgebietEic;
        this.regelzone = builder.regelzone;
        this.regelzoneEic = builder.regelzoneEic;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Die EIC-Nummer des Bilanzierungsgebietes
    */
    public String getBilanzierungsgebietEic() {
        return bilanzierungsgebietEic;
    }

    /**
    * Die EIC-Nummer des Bilanzierungsgebietes
    */
    public void setBilanzierungsgebietEic(String bilanzierungsgebietEic) {
        this.bilanzierungsgebietEic = bilanzierungsgebietEic;
    }

    /**
    * Der Name der Regelzone
    */
    public String getRegelzone() {
        return regelzone;
    }

    /**
    * Der Name der Regelzone
    */
    public void setRegelzone(String regelzone) {
        this.regelzone = regelzone;
    }

    /**
    * De EIC-Nummer der Regelzone
    */
    public String getRegelzoneEic() {
        return regelzoneEic;
    }

    /**
    * De EIC-Nummer der Regelzone
    */
    public void setRegelzoneEic(String regelzoneEic) {
        this.regelzoneEic = regelzoneEic;
    }

    public static StandorteigenschaftenStromBuilder builder() {
        return new StandorteigenschaftenStromBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class StandorteigenschaftenStromBuilder extends COMBuilder {
        private String bilanzierungsgebietEic;
        private String regelzone;
        private String regelzoneEic;

        private StandorteigenschaftenStromBuilder() {
        }

        /**
        * Die EIC-Nummer des Bilanzierungsgebietes
        */
        public StandorteigenschaftenStromBuilder setBilanzierungsgebietEic(String bilanzierungsgebietEic) {
            this.bilanzierungsgebietEic = bilanzierungsgebietEic;
            return this;
        }

        /**
        * Der Name der Regelzone
        */
        public StandorteigenschaftenStromBuilder setRegelzone(String regelzone) {
            this.regelzone = regelzone;
            return this;
        }

        /**
        * De EIC-Nummer der Regelzone
        */
        public StandorteigenschaftenStromBuilder setRegelzoneEic(String regelzoneEic) {
            this.regelzoneEic = regelzoneEic;
            return this;
        }

        public StandorteigenschaftenStromBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public StandorteigenschaftenStromBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public StandorteigenschaftenStrom build() {
            return new StandorteigenschaftenStrom(this);
        }
    }
}