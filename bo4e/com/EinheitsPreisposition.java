package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import bo4e.enums.Preisreferenz;

import java.util.List;

/**
* Die Einheits-Preisposition modelliert Preispositionen ohne Variabilität
* (bis auf die übergeordnete Variabilität durch eine Zeitscheibe und einer Region).
*
* Dies kann z.B. ein Arbeitspreis sein. Der Bezug wird dabei durch die Preisreferenz
* angegeben.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/EinheitsPreisposition.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `EinheitsPreisposition JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202607.0.0/src/bo4e_schemas/com/EinheitsPreisposition.json>`_
*/
public class EinheitsPreisposition extends COM {
    private final ComTyp _typ = ComTyp.EINHEITSPREISPOSITION;
    private String bezeichnung;
    private Preis preis;
    private Preisreferenz preisreferenz;

    public EinheitsPreisposition() {
    }

    private EinheitsPreisposition(EinheitsPreispositionBuilder builder) {
        super(builder);
        this.bezeichnung = builder.bezeichnung;
        this.preis = builder.preis;
        this.preisreferenz = builder.preisreferenz;
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

    public static EinheitsPreispositionBuilder builder() {
        return new EinheitsPreispositionBuilder();
    }

    public static class EinheitsPreispositionBuilder extends COMBuilder {
        private String bezeichnung;
        private Preis preis;
        private Preisreferenz preisreferenz;

        private EinheitsPreispositionBuilder() {
        }

        /**
        * Eine (beliebige) Bezeichnung für die Preisposition.
        */
        public EinheitsPreispositionBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * Der Preis für diese Position.
        */
        public EinheitsPreispositionBuilder setPreis(Preis preis) {
            this.preis = preis;
            return this;
        }

        /**
        * Die Referenz worauf sich der Preis bezieht.
        * Die explizite Einheit wird durch das Feld `bezugswert` im `COM Preis` angegeben.
        */
        public EinheitsPreispositionBuilder setPreisreferenz(Preisreferenz preisreferenz) {
            this.preisreferenz = preisreferenz;
            return this;
        }

        public EinheitsPreispositionBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public EinheitsPreispositionBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public EinheitsPreisposition build() {
            return new EinheitsPreisposition(this);
        }
    }
}