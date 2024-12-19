package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.Themengebiet;

import java.util.List;

/**
* Enthält die zeitliche Zuordnung eines Ansprechpartners zu Abteilungen und
* Zuständigkeiten.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Zustaendigkeit.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Zustaendigkeit JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/com/Zustaendigkeit.json>`_
*/
public class Zustaendigkeit extends COM {
    private String abteilung;
    private String position;
    private Themengebiet themengebiet;

    public Zustaendigkeit() {
    }

    private Zustaendigkeit(ZustaendigkeitBuilder builder) {
        super(builder);
        this.abteilung = builder.abteilung;
        this.position = builder.position;
        this.themengebiet = builder.themengebiet;
    }

    /**
    * Berufliche Rolle des Ansprechpartners/ der Person
    */
    public String getAbteilung() {
        return abteilung;
    }

    /**
    * Berufliche Rolle des Ansprechpartners/ der Person
    */
    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    /**
    * Berufliche Rolle des Ansprechpartners/ der Person
    */
    public String getPosition() {
        return position;
    }

    /**
    * Berufliche Rolle des Ansprechpartners/ der Person
    */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
    * Hier kann eine thematische Zuordnung des Ansprechpartners bzw. der Person angegeben werden
    */
    public Themengebiet getThemengebiet() {
        return themengebiet;
    }

    /**
    * Hier kann eine thematische Zuordnung des Ansprechpartners bzw. der Person angegeben werden
    */
    public void setThemengebiet(Themengebiet themengebiet) {
        this.themengebiet = themengebiet;
    }

    public static ZustaendigkeitBuilder builder() {
        return new ZustaendigkeitBuilder();
    }

    public static class ZustaendigkeitBuilder extends COMBuilder {
        private String abteilung;
        private String position;
        private Themengebiet themengebiet;

        private ZustaendigkeitBuilder() {
        }

        /**
        * Berufliche Rolle des Ansprechpartners/ der Person
        */
        public ZustaendigkeitBuilder setAbteilung(String abteilung) {
            this.abteilung = abteilung;
            return this;
        }

        /**
        * Berufliche Rolle des Ansprechpartners/ der Person
        */
        public ZustaendigkeitBuilder setPosition(String position) {
            this.position = position;
            return this;
        }

        /**
        * Hier kann eine thematische Zuordnung des Ansprechpartners bzw. der Person angegeben werden
        */
        public ZustaendigkeitBuilder setThemengebiet(Themengebiet themengebiet) {
            this.themengebiet = themengebiet;
            return this;
        }

        public ZustaendigkeitBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public ZustaendigkeitBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Zustaendigkeit build() {
            return new Zustaendigkeit(this);
        }
    }
}