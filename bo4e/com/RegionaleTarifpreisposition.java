package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.Mengeneinheit;
import bo4e.enums.Preistyp;
import bo4e.enums.Waehrungseinheit;

import java.util.List;

/**
* Mit dieser Komponente können Tarifpreise verschiedener Typen im Zusammenhang mit
* regionalen Gültigkeiten abgebildet
* werden.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/RegionaleTarifpreisposition.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `RegionaleTarifpreisposition JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.5.0/src/bo4e_schemas/com/RegionaleTarifpreisposition.json>`_
*/
public class RegionaleTarifpreisposition extends COM {
    private Mengeneinheit bezugseinheit;
    private Waehrungseinheit einheit;
    private Mengeneinheit mengeneinheitstaffel;
    private List<RegionalePreisstaffel> preisstaffeln;
    private Preistyp preistyp;

    public RegionaleTarifpreisposition() {
    }

    private RegionaleTarifpreisposition(RegionaleTarifpreispositionBuilder builder) {
        super(builder);
        this.bezugseinheit = builder.bezugseinheit;
        this.einheit = builder.einheit;
        this.mengeneinheitstaffel = builder.mengeneinheitstaffel;
        this.preisstaffeln = builder.preisstaffeln;
        this.preistyp = builder.preistyp;
    }

    /**
    * Größe, auf die sich die Einheit bezieht, beispielsweise kWh, Jahr
    */
    public Mengeneinheit getBezugseinheit() {
        return bezugseinheit;
    }

    /**
    * Größe, auf die sich die Einheit bezieht, beispielsweise kWh, Jahr
    */
    public void setBezugseinheit(Mengeneinheit bezugseinheit) {
        this.bezugseinheit = bezugseinheit;
    }

    /**
    * Einheit des Preises (z.B. EURO)
    */
    public Waehrungseinheit getEinheit() {
        return einheit;
    }

    /**
    * Einheit des Preises (z.B. EURO)
    */
    public void setEinheit(Waehrungseinheit einheit) {
        this.einheit = einheit;
    }

    /**
    * Gibt an, nach welcher Menge die vorgenannte Einschränkung erfolgt (z.B.
    * Jahresstromverbrauch in kWh)
    */
    public Mengeneinheit getMengeneinheitstaffel() {
        return mengeneinheitstaffel;
    }

    /**
    * Gibt an, nach welcher Menge die vorgenannte Einschränkung erfolgt (z.B.
    * Jahresstromverbrauch in kWh)
    */
    public void setMengeneinheitstaffel(Mengeneinheit mengeneinheitstaffel) {
        this.mengeneinheitstaffel = mengeneinheitstaffel;
    }

    /**
    * Hier sind die Staffeln mit ihren Preisangaben und regionalen Gültigkeiten definiert
    */
    public List<RegionalePreisstaffel> getPreisstaffeln() {
        return preisstaffeln;
    }

    /**
    * Hier sind die Staffeln mit ihren Preisangaben und regionalen Gültigkeiten definiert
    */
    public void setPreisstaffeln(List<RegionalePreisstaffel> preisstaffeln) {
        this.preisstaffeln = preisstaffeln;
    }

    /**
    * Angabe des Preistypes (z.B. Grundpreis)
    */
    public Preistyp getPreistyp() {
        return preistyp;
    }

    /**
    * Angabe des Preistypes (z.B. Grundpreis)
    */
    public void setPreistyp(Preistyp preistyp) {
        this.preistyp = preistyp;
    }

    public static RegionaleTarifpreispositionBuilder builder() {
        return new RegionaleTarifpreispositionBuilder();
    }

    public static class RegionaleTarifpreispositionBuilder extends COMBuilder {
        private Mengeneinheit bezugseinheit;
        private Waehrungseinheit einheit;
        private Mengeneinheit mengeneinheitstaffel;
        private List<RegionalePreisstaffel> preisstaffeln;
        private Preistyp preistyp;

        private RegionaleTarifpreispositionBuilder() {
        }

        /**
        * Größe, auf die sich die Einheit bezieht, beispielsweise kWh, Jahr
        */
        public RegionaleTarifpreispositionBuilder setBezugseinheit(Mengeneinheit bezugseinheit) {
            this.bezugseinheit = bezugseinheit;
            return this;
        }

        /**
        * Einheit des Preises (z.B. EURO)
        */
        public RegionaleTarifpreispositionBuilder setEinheit(Waehrungseinheit einheit) {
            this.einheit = einheit;
            return this;
        }

        /**
        * Gibt an, nach welcher Menge die vorgenannte Einschränkung erfolgt (z.B.
        * Jahresstromverbrauch in kWh)
        */
        public RegionaleTarifpreispositionBuilder setMengeneinheitstaffel(Mengeneinheit mengeneinheitstaffel) {
            this.mengeneinheitstaffel = mengeneinheitstaffel;
            return this;
        }

        /**
        * Hier sind die Staffeln mit ihren Preisangaben und regionalen Gültigkeiten definiert
        */
        public RegionaleTarifpreispositionBuilder setPreisstaffeln(List<RegionalePreisstaffel> preisstaffeln) {
            this.preisstaffeln = preisstaffeln;
            return this;
        }

        /**
        * Angabe des Preistypes (z.B. Grundpreis)
        */
        public RegionaleTarifpreispositionBuilder setPreistyp(Preistyp preistyp) {
            this.preistyp = preistyp;
            return this;
        }

        public RegionaleTarifpreispositionBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public RegionaleTarifpreispositionBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public RegionaleTarifpreisposition build() {
            return new RegionaleTarifpreisposition(this);
        }
    }
}