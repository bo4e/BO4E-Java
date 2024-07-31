package bo4e.com;

import bo4e.ZusatzAttribut;

import java.util.List;

/**
 * Mit dieser Komponente können Auf- und Abschläge verschiedener Typen im Zusammenhang
 * mit örtlichen Gültigkeiten abgebildet werden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/AufAbschlagProOrt.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `AufAbschlagProOrt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/com/AufAbschlagProOrt.json>`_
 */
public class AufAbschlagProOrt extends COM {
    private String netznr;
    private String ort;
    private String postleitzahl;
    private List<AufAbschlagstaffelProOrt> staffeln;

    public AufAbschlagProOrt() {
    }

    private AufAbschlagProOrt(AufAbschlagProOrtBuilder builder) {
        super(builder);
        this.netznr = builder.netznr;
        this.ort = builder.ort;
        this.postleitzahl = builder.postleitzahl;
        this.staffeln = builder.staffeln;
    }

    /**
     * Die ene't-Netznummer des Netzes in dem der Aufschlag gilt.
     */
    public String getNetznr() {
        return netznr;
    }

    /**
     * Die ene't-Netznummer des Netzes in dem der Aufschlag gilt.
     */
    public void setNetznr(String netznr) {
        this.netznr = netznr;
    }

    /**
     * Der Ort für den der Aufschlag gilt.
     */
    public String getOrt() {
        return ort;
    }

    /**
     * Der Ort für den der Aufschlag gilt.
     */
    public void setOrt(String ort) {
        this.ort = ort;
    }

    /**
     * Die Postleitzahl des Ortes für den der Aufschlag gilt.
     */
    public String getPostleitzahl() {
        return postleitzahl;
    }

    /**
     * Die Postleitzahl des Ortes für den der Aufschlag gilt.
     */
    public void setPostleitzahl(String postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    /**
     * Werte für die gestaffelten Auf/Abschläge mit regionaler Eingrenzung.
     */
    public List<AufAbschlagstaffelProOrt> getStaffeln() {
        return staffeln;
    }

    /**
     * Werte für die gestaffelten Auf/Abschläge mit regionaler Eingrenzung.
     */
    public void setStaffeln(List<AufAbschlagstaffelProOrt> staffeln) {
        this.staffeln = staffeln;
    }

    public static AufAbschlagProOrtBuilder builder() {
        return new AufAbschlagProOrtBuilder();
    }

    public static class AufAbschlagProOrtBuilder extends COMBuilder {
        private String netznr;
        private String ort;
        private String postleitzahl;
        private List<AufAbschlagstaffelProOrt> staffeln;

        private AufAbschlagProOrtBuilder() {
        }

        /**
         * Die ene't-Netznummer des Netzes in dem der Aufschlag gilt.
         */
        public String getNetznr() {
            return netznr;
        }

        /**
         * Die ene't-Netznummer des Netzes in dem der Aufschlag gilt.
         */
        public AufAbschlagProOrtBuilder setNetznr(String netznr) {
            this.netznr = netznr;
            return this;
        }

        /**
         * Der Ort für den der Aufschlag gilt.
         */
        public String getOrt() {
            return ort;
        }

        /**
         * Der Ort für den der Aufschlag gilt.
         */
        public AufAbschlagProOrtBuilder setOrt(String ort) {
            this.ort = ort;
            return this;
        }

        /**
         * Die Postleitzahl des Ortes für den der Aufschlag gilt.
         */
        public String getPostleitzahl() {
            return postleitzahl;
        }

        /**
         * Die Postleitzahl des Ortes für den der Aufschlag gilt.
         */
        public AufAbschlagProOrtBuilder setPostleitzahl(String postleitzahl) {
            this.postleitzahl = postleitzahl;
            return this;
        }

        /**
         * Werte für die gestaffelten Auf/Abschläge mit regionaler Eingrenzung.
         */
        public List<AufAbschlagstaffelProOrt> getStaffeln() {
            return staffeln;
        }

        /**
         * Werte für die gestaffelten Auf/Abschläge mit regionaler Eingrenzung.
         */
        public AufAbschlagProOrtBuilder setStaffeln(List<AufAbschlagstaffelProOrt> staffeln) {
            this.staffeln = staffeln;
            return this;
        }

        public AufAbschlagProOrtBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public AufAbschlagProOrtBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public AufAbschlagProOrt build() {
            return new AufAbschlagProOrt(this);
        }
    }
}