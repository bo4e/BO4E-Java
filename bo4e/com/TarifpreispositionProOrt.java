package bo4e.com;

import bo4e.ZusatzAttribut;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Mit dieser Komponente können Tarifpreise verschiedener Typen abgebildet werden
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/TarifpreispositionProOrt.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `TarifpreispositionProOrt JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.6.0/src/bo4e_schemas/com/TarifpreispositionProOrt.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TarifpreispositionProOrt extends COM {
    private String netznr;
    private String ort;
    private String postleitzahl;
    private List<TarifpreisstaffelProOrt> preisstaffeln;

    public TarifpreispositionProOrt() {
    }

    private TarifpreispositionProOrt(TarifpreispositionProOrtBuilder builder) {
        super(builder);
        this.netznr = builder.netznr;
        this.ort = builder.ort;
        this.postleitzahl = builder.postleitzahl;
        this.preisstaffeln = builder.preisstaffeln;
    }

    /**
    * ene't-Netznummer des Netzes in dem der Preis gilt
    */
    public String getNetznr() {
        return netznr;
    }

    /**
    * ene't-Netznummer des Netzes in dem der Preis gilt
    */
    public void setNetznr(String netznr) {
        this.netznr = netznr;
    }

    /**
    * Ort für den der Preis gilt
    */
    public String getOrt() {
        return ort;
    }

    /**
    * Ort für den der Preis gilt
    */
    public void setOrt(String ort) {
        this.ort = ort;
    }

    /**
    * Postleitzahl des Ortes für den der Preis gilt
    */
    public String getPostleitzahl() {
        return postleitzahl;
    }

    /**
    * Postleitzahl des Ortes für den der Preis gilt
    */
    public void setPostleitzahl(String postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public List<TarifpreisstaffelProOrt> getPreisstaffeln() {
        return preisstaffeln;
    }

    public void setPreisstaffeln(List<TarifpreisstaffelProOrt> preisstaffeln) {
        this.preisstaffeln = preisstaffeln;
    }

    public static TarifpreispositionProOrtBuilder builder() {
        return new TarifpreispositionProOrtBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class TarifpreispositionProOrtBuilder extends COMBuilder {
        private String netznr;
        private String ort;
        private String postleitzahl;
        private List<TarifpreisstaffelProOrt> preisstaffeln;

        private TarifpreispositionProOrtBuilder() {
        }

        /**
        * ene't-Netznummer des Netzes in dem der Preis gilt
        */
        public TarifpreispositionProOrtBuilder setNetznr(String netznr) {
            this.netznr = netznr;
            return this;
        }

        /**
        * Ort für den der Preis gilt
        */
        public TarifpreispositionProOrtBuilder setOrt(String ort) {
            this.ort = ort;
            return this;
        }

        /**
        * Postleitzahl des Ortes für den der Preis gilt
        */
        public TarifpreispositionProOrtBuilder setPostleitzahl(String postleitzahl) {
            this.postleitzahl = postleitzahl;
            return this;
        }

        public TarifpreispositionProOrtBuilder setPreisstaffeln(List<TarifpreisstaffelProOrt> preisstaffeln) {
            this.preisstaffeln = preisstaffeln;
            return this;
        }

        public TarifpreispositionProOrtBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public TarifpreispositionProOrtBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public TarifpreispositionProOrt build() {
            return new TarifpreispositionProOrt(this);
        }
    }
}