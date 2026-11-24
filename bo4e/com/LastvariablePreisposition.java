package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import bo4e.enums.Mengeneinheit;
import bo4e.enums.Preisreferenz;
import bo4e.enums.Tarifkalkulationsmethode;
import bo4e.enums.Waehrungseinheit;

import java.util.List;

/**
* Modelliert eine lastvariable Preisposition.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/LastvariablePreisposition.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `LastvariablePreisposition JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202601.0.0/src/bo4e_schemas/com/LastvariablePreisposition.json>`_
*/
public class LastvariablePreisposition extends COM {
    private final ComTyp _typ = ComTyp.LASTVARIABLEPREISPOSITION;
    private String bezeichnung;
    private Mengeneinheit preisBezugseinheit;
    private Preisreferenz preisreferenz;
    private List<Preisstaffel> preisstaffeln;
    private Waehrungseinheit preisWaehrungseinheit;
    private Mengeneinheit staffelgrenzeneinheit;
    private Tarifkalkulationsmethode tarifkalkulationsmethode;

    public LastvariablePreisposition() {
    }

    private LastvariablePreisposition(LastvariablePreispositionBuilder builder) {
        super(builder);
        this.bezeichnung = builder.bezeichnung;
        this.preisBezugseinheit = builder.preisBezugseinheit;
        this.preisreferenz = builder.preisreferenz;
        this.preisstaffeln = builder.preisstaffeln;
        this.preisWaehrungseinheit = builder.preisWaehrungseinheit;
        this.staffelgrenzeneinheit = builder.staffelgrenzeneinheit;
        this.tarifkalkulationsmethode = builder.tarifkalkulationsmethode;
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
    * Angabe, für welche Bezugsgröße die Preise in den Preisstaffeln gelten. Z.B. kWh.
    */
    public Mengeneinheit getPreisBezugseinheit() {
        return preisBezugseinheit;
    }

    /**
    * Angabe, für welche Bezugsgröße die Preise in den Preisstaffeln gelten. Z.B. kWh.
    */
    public void setPreisBezugseinheit(Mengeneinheit preisBezugseinheit) {
        this.preisBezugseinheit = preisBezugseinheit;
    }

    /**
    * Die Referenz worauf sich der Preis bezieht.
    * Die explizite Einheit wird durch das Feld `preis_bezugseinheit` angegeben.
    */
    public Preisreferenz getPreisreferenz() {
        return preisreferenz;
    }

    /**
    * Die Referenz worauf sich der Preis bezieht.
    * Die explizite Einheit wird durch das Feld `preis_bezugseinheit` angegeben.
    */
    public void setPreisreferenz(Preisreferenz preisreferenz) {
        this.preisreferenz = preisreferenz;
    }

    /**
    * Preisstaffeln, die zu dieser Preisposition gehören
    */
    public List<Preisstaffel> getPreisstaffeln() {
        return preisstaffeln;
    }

    /**
    * Preisstaffeln, die zu dieser Preisposition gehören
    */
    public void setPreisstaffeln(List<Preisstaffel> preisstaffeln) {
        this.preisstaffeln = preisstaffeln;
    }

    /**
    * Währungseinheit für die Preise in allen Preisstaffeln, z.B. Euro oder Ct.
    */
    public Waehrungseinheit getPreisWaehrungseinheit() {
        return preisWaehrungseinheit;
    }

    /**
    * Währungseinheit für die Preise in allen Preisstaffeln, z.B. Euro oder Ct.
    */
    public void setPreisWaehrungseinheit(Waehrungseinheit preisWaehrungseinheit) {
        this.preisWaehrungseinheit = preisWaehrungseinheit;
    }

    /**
    * Die Einheit, in denen die Staffelgrenzen in den Preisstaffeln angegeben sind.
    */
    public Mengeneinheit getStaffelgrenzeneinheit() {
        return staffelgrenzeneinheit;
    }

    /**
    * Die Einheit, in denen die Staffelgrenzen in den Preisstaffeln angegeben sind.
    */
    public void setStaffelgrenzeneinheit(Mengeneinheit staffelgrenzeneinheit) {
        this.staffelgrenzeneinheit = staffelgrenzeneinheit;
    }

    /**
    * Das Modell, das der Preisbildung zugrunde liegt
    */
    public Tarifkalkulationsmethode getTarifkalkulationsmethode() {
        return tarifkalkulationsmethode;
    }

    /**
    * Das Modell, das der Preisbildung zugrunde liegt
    */
    public void setTarifkalkulationsmethode(Tarifkalkulationsmethode tarifkalkulationsmethode) {
        this.tarifkalkulationsmethode = tarifkalkulationsmethode;
    }

    public static LastvariablePreispositionBuilder builder() {
        return new LastvariablePreispositionBuilder();
    }

    public static class LastvariablePreispositionBuilder extends COMBuilder {
        private String bezeichnung;
        private Mengeneinheit preisBezugseinheit;
        private Preisreferenz preisreferenz;
        private List<Preisstaffel> preisstaffeln;
        private Waehrungseinheit preisWaehrungseinheit;
        private Mengeneinheit staffelgrenzeneinheit;
        private Tarifkalkulationsmethode tarifkalkulationsmethode;

        private LastvariablePreispositionBuilder() {
        }

        /**
        * Eine (beliebige) Bezeichnung für die Preisposition.
        */
        public LastvariablePreispositionBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * Angabe, für welche Bezugsgröße die Preise in den Preisstaffeln gelten. Z.B. kWh.
        */
        public LastvariablePreispositionBuilder setPreisBezugseinheit(Mengeneinheit preisBezugseinheit) {
            this.preisBezugseinheit = preisBezugseinheit;
            return this;
        }

        /**
        * Die Referenz worauf sich der Preis bezieht.
        * Die explizite Einheit wird durch das Feld `preis_bezugseinheit` angegeben.
        */
        public LastvariablePreispositionBuilder setPreisreferenz(Preisreferenz preisreferenz) {
            this.preisreferenz = preisreferenz;
            return this;
        }

        /**
        * Preisstaffeln, die zu dieser Preisposition gehören
        */
        public LastvariablePreispositionBuilder setPreisstaffeln(List<Preisstaffel> preisstaffeln) {
            this.preisstaffeln = preisstaffeln;
            return this;
        }

        /**
        * Währungseinheit für die Preise in allen Preisstaffeln, z.B. Euro oder Ct.
        */
        public LastvariablePreispositionBuilder setPreisWaehrungseinheit(Waehrungseinheit preisWaehrungseinheit) {
            this.preisWaehrungseinheit = preisWaehrungseinheit;
            return this;
        }

        /**
        * Die Einheit, in denen die Staffelgrenzen in den Preisstaffeln angegeben sind.
        */
        public LastvariablePreispositionBuilder setStaffelgrenzeneinheit(Mengeneinheit staffelgrenzeneinheit) {
            this.staffelgrenzeneinheit = staffelgrenzeneinheit;
            return this;
        }

        /**
        * Das Modell, das der Preisbildung zugrunde liegt
        */
        public LastvariablePreispositionBuilder setTarifkalkulationsmethode(Tarifkalkulationsmethode tarifkalkulationsmethode) {
            this.tarifkalkulationsmethode = tarifkalkulationsmethode;
            return this;
        }

        public LastvariablePreispositionBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public LastvariablePreispositionBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public LastvariablePreisposition build() {
            return new LastvariablePreisposition(this);
        }
    }
}