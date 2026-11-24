package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.bo.Zaehlzeitdefinition;
import bo4e.enums.ComTyp;
import bo4e.enums.Preisreferenz;

import java.util.List;

/**
* Modelliert eine zeitvariable Preisposition.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/ZeitvariablePreisposition.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `ZeitvariablePreisposition JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202607.0.0/src/bo4e_schemas/com/ZeitvariablePreisposition.json>`_
*/
public class ZeitvariablePreisposition extends COM {
    private final ComTyp _typ = ComTyp.ZEITVARIABLEPREISPOSITION;
    private String bezeichnung;
    private Preis preis;
    private Preisreferenz preisreferenz;
    private Zaehlzeitdefinition zaehlzeitdefinition;
    private String zaehlzeitregister;

    public ZeitvariablePreisposition() {
    }

    private ZeitvariablePreisposition(ZeitvariablePreispositionBuilder builder) {
        super(builder);
        this.bezeichnung = builder.bezeichnung;
        this.preis = builder.preis;
        this.preisreferenz = builder.preisreferenz;
        this.zaehlzeitdefinition = builder.zaehlzeitdefinition;
        this.zaehlzeitregister = builder.zaehlzeitregister;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Eine (beliebige) Bezeichnung für die Preisposition.
    */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
    * Eine (beliebige) Bezeichnung für die Preisposition.
    */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
    * Der Preis für diese Position.
    */
    public Preis getPreis() {
        return preis;
    }

    /**
    * Der Preis für diese Position.
    */
    public void setPreis(Preis preis) {
        this.preis = preis;
    }

    /**
    * Die Referenz worauf sich der Preis bezieht.
    * Die explizite Einheit wird durch das Feld `bezugswert` im `COM Preis` angegeben.
    */
    public Preisreferenz getPreisreferenz() {
        return preisreferenz;
    }

    /**
    * Die Referenz worauf sich der Preis bezieht.
    * Die explizite Einheit wird durch das Feld `bezugswert` im `COM Preis` angegeben.
    */
    public void setPreisreferenz(Preisreferenz preisreferenz) {
        this.preisreferenz = preisreferenz;
    }

    /**
    * Die Zählzeitdefinition, deren Schaltschema bestimmt, wann diese Preisposition gilt.
    */
    public Zaehlzeitdefinition getZaehlzeitdefinition() {
        return zaehlzeitdefinition;
    }

    /**
    * Die Zählzeitdefinition, deren Schaltschema bestimmt, wann diese Preisposition gilt.
    */
    public void setZaehlzeitdefinition(Zaehlzeitdefinition zaehlzeitdefinition) {
        this.zaehlzeitdefinition = zaehlzeitdefinition;
    }

    /**
    * Der freie Register-Code (z.B. "HT", "NT", "ST", "SuperHT") innerhalb der referenzierten
    * `zaehlzeitdefinition`, auf den sich diese Preisposition bezieht. Der Code sollte als
    * `registercode` in mindestens einer `Umschaltzeit` der referenzierten Zählzeitdefinition
    * vorkommen.
    */
    public String getZaehlzeitregister() {
        return zaehlzeitregister;
    }

    /**
    * Der freie Register-Code (z.B. "HT", "NT", "ST", "SuperHT") innerhalb der referenzierten
    * `zaehlzeitdefinition`, auf den sich diese Preisposition bezieht. Der Code sollte als
    * `registercode` in mindestens einer `Umschaltzeit` der referenzierten Zählzeitdefinition
    * vorkommen.
    */
    public void setZaehlzeitregister(String zaehlzeitregister) {
        this.zaehlzeitregister = zaehlzeitregister;
    }

    public static ZeitvariablePreispositionBuilder builder() {
        return new ZeitvariablePreispositionBuilder();
    }

    public static class ZeitvariablePreispositionBuilder extends COMBuilder {
        private String bezeichnung;
        private Preis preis;
        private Preisreferenz preisreferenz;
        private Zaehlzeitdefinition zaehlzeitdefinition;
        private String zaehlzeitregister;

        private ZeitvariablePreispositionBuilder() {
        }

        /**
        * Eine (beliebige) Bezeichnung für die Preisposition.
        */
        public ZeitvariablePreispositionBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * Der Preis für diese Position.
        */
        public ZeitvariablePreispositionBuilder setPreis(Preis preis) {
            this.preis = preis;
            return this;
        }

        /**
        * Die Referenz worauf sich der Preis bezieht.
        * Die explizite Einheit wird durch das Feld `bezugswert` im `COM Preis` angegeben.
        */
        public ZeitvariablePreispositionBuilder setPreisreferenz(Preisreferenz preisreferenz) {
            this.preisreferenz = preisreferenz;
            return this;
        }

        /**
        * Die Zählzeitdefinition, deren Schaltschema bestimmt, wann diese Preisposition gilt.
        */
        public ZeitvariablePreispositionBuilder setZaehlzeitdefinition(Zaehlzeitdefinition zaehlzeitdefinition) {
            this.zaehlzeitdefinition = zaehlzeitdefinition;
            return this;
        }

        /**
        * Der freie Register-Code (z.B. "HT", "NT", "ST", "SuperHT") innerhalb der referenzierten
        * `zaehlzeitdefinition`, auf den sich diese Preisposition bezieht. Der Code sollte als
        * `registercode` in mindestens einer `Umschaltzeit` der referenzierten Zählzeitdefinition
        * vorkommen.
        */
        public ZeitvariablePreispositionBuilder setZaehlzeitregister(String zaehlzeitregister) {
            this.zaehlzeitregister = zaehlzeitregister;
            return this;
        }

        public ZeitvariablePreispositionBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public ZeitvariablePreispositionBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public ZeitvariablePreisposition build() {
            return new ZeitvariablePreisposition(this);
        }
    }
}