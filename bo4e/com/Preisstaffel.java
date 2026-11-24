package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;

import java.util.List;

/**
* Gibt die Staffelgrenzen der jeweiligen Preise an
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Preisstaffel.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Preisstaffel JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202607.0.0/src/bo4e_schemas/com/Preisstaffel.json>`_
*/
public class Preisstaffel extends COM {
    private final ComTyp _typ = ComTyp.PREISSTAFFEL;
    private String artikelId;
    private String bezeichnung;
    private Double preis;
    private Sigmoidparameter sigmoidparameter;
    private Double staffelgrenzeBis;
    private Double staffelgrenzeVon;

    public Preisstaffel() {
    }

    private Preisstaffel(PreisstaffelBuilder builder) {
        super(builder);
        this.artikelId = builder.artikelId;
        this.bezeichnung = builder.bezeichnung;
        this.preis = builder.preis;
        this.sigmoidparameter = builder.sigmoidparameter;
        this.staffelgrenzeBis = builder.staffelgrenzeBis;
        this.staffelgrenzeVon = builder.staffelgrenzeVon;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Standardisierte vom BDEW herausgegebene Liste, welche im Strommarkt die
    * BDEW-Artikelnummer ablöst.
    */
    public String getArtikelId() {
        return artikelId;
    }

    /**
    * Standardisierte vom BDEW herausgegebene Liste, welche im Strommarkt die
    * BDEW-Artikelnummer ablöst.
    */
    public void setArtikelId(String artikelId) {
        this.artikelId = artikelId;
    }

    /**
    * Eine (beliebige) Bezeichnung für die Preisstaffel.
    */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
    * Eine (beliebige) Bezeichnung für die Preisstaffel.
    */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
    * Preis pro abgerechneter Mengeneinheit. Die Mengeneinheit wird durch das übergeordnete
    * Objekt angegeben.
    */
    public Double getPreis() {
        return preis;
    }

    /**
    * Preis pro abgerechneter Mengeneinheit. Die Mengeneinheit wird durch das übergeordnete
    * Objekt angegeben.
    */
    public void setPreis(Double preis) {
        this.preis = preis;
    }

    /**
    * Parameter zur Berechnung des Preises anhand der Jahresmenge und weiterer netzbezogener
    * Parameter
    */
    public Sigmoidparameter getSigmoidparameter() {
        return sigmoidparameter;
    }

    /**
    * Parameter zur Berechnung des Preises anhand der Jahresmenge und weiterer netzbezogener
    * Parameter
    */
    public void setSigmoidparameter(Sigmoidparameter sigmoidparameter) {
        this.sigmoidparameter = sigmoidparameter;
    }

    /**
    * Exklusiver oberer Wert, bis zu dem die Staffel gilt (inklusiv).
    * Grenzen werden bspw. wie folgt angegeben: `0 - 1000, 1001 - 2000, etc.`
    * Werte zwischen den Grenzen (z.B. `1000,6`) rutschen in die obere Zone / Staffel.
    */
    public Double getStaffelgrenzeBis() {
        return staffelgrenzeBis;
    }

    /**
    * Exklusiver oberer Wert, bis zu dem die Staffel gilt (inklusiv).
    * Grenzen werden bspw. wie folgt angegeben: `0 - 1000, 1001 - 2000, etc.`
    * Werte zwischen den Grenzen (z.B. `1000,6`) rutschen in die obere Zone / Staffel.
    */
    public void setStaffelgrenzeBis(Double staffelgrenzeBis) {
        this.staffelgrenzeBis = staffelgrenzeBis;
    }

    /**
    * Inklusiver unterer Wert, ab dem die Staffel gilt (inklusiv).
    * Grenzen werden bspw. wie folgt angegeben: `0 - 1000, 1001 - 2000, etc.`
    * Werte zwischen den Grenzen (z.B. `1000,6`) rutschen in die obere Zone / Staffel.
    */
    public Double getStaffelgrenzeVon() {
        return staffelgrenzeVon;
    }

    /**
    * Inklusiver unterer Wert, ab dem die Staffel gilt (inklusiv).
    * Grenzen werden bspw. wie folgt angegeben: `0 - 1000, 1001 - 2000, etc.`
    * Werte zwischen den Grenzen (z.B. `1000,6`) rutschen in die obere Zone / Staffel.
    */
    public void setStaffelgrenzeVon(Double staffelgrenzeVon) {
        this.staffelgrenzeVon = staffelgrenzeVon;
    }

    public static PreisstaffelBuilder builder() {
        return new PreisstaffelBuilder();
    }

    public static class PreisstaffelBuilder extends COMBuilder {
        private String artikelId;
        private String bezeichnung;
        private Double preis;
        private Sigmoidparameter sigmoidparameter;
        private Double staffelgrenzeBis;
        private Double staffelgrenzeVon;

        private PreisstaffelBuilder() {
        }

        /**
        * Standardisierte vom BDEW herausgegebene Liste, welche im Strommarkt die
        * BDEW-Artikelnummer ablöst.
        */
        public PreisstaffelBuilder setArtikelId(String artikelId) {
            this.artikelId = artikelId;
            return this;
        }

        /**
        * Eine (beliebige) Bezeichnung für die Preisstaffel.
        */
        public PreisstaffelBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * Preis pro abgerechneter Mengeneinheit. Die Mengeneinheit wird durch das übergeordnete
        * Objekt angegeben.
        */
        public PreisstaffelBuilder setPreis(Double preis) {
            this.preis = preis;
            return this;
        }

        /**
        * Parameter zur Berechnung des Preises anhand der Jahresmenge und weiterer netzbezogener
        * Parameter
        */
        public PreisstaffelBuilder setSigmoidparameter(Sigmoidparameter sigmoidparameter) {
            this.sigmoidparameter = sigmoidparameter;
            return this;
        }

        /**
        * Exklusiver oberer Wert, bis zu dem die Staffel gilt (inklusiv).
        * Grenzen werden bspw. wie folgt angegeben: `0 - 1000, 1001 - 2000, etc.`
        * Werte zwischen den Grenzen (z.B. `1000,6`) rutschen in die obere Zone / Staffel.
        */
        public PreisstaffelBuilder setStaffelgrenzeBis(Double staffelgrenzeBis) {
            this.staffelgrenzeBis = staffelgrenzeBis;
            return this;
        }

        /**
        * Inklusiver unterer Wert, ab dem die Staffel gilt (inklusiv).
        * Grenzen werden bspw. wie folgt angegeben: `0 - 1000, 1001 - 2000, etc.`
        * Werte zwischen den Grenzen (z.B. `1000,6`) rutschen in die obere Zone / Staffel.
        */
        public PreisstaffelBuilder setStaffelgrenzeVon(Double staffelgrenzeVon) {
            this.staffelgrenzeVon = staffelgrenzeVon;
            return this;
        }

        public PreisstaffelBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public PreisstaffelBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Preisstaffel build() {
            return new Preisstaffel(this);
        }
    }
}