package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import bo4e.enums.Gueltigkeitstyp;
import bo4e.enums.Regionskriteriumtyp;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Komponente zur Abbildung eines Regionskriteriums
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Regionskriterium.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Regionskriterium JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.0.0/src/bo4e_schemas/com/Regionskriterium.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Regionskriterium extends COM {
    private final ComTyp _typ = ComTyp.REGIONSKRITERIUM;
    private Gueltigkeitstyp gueltigkeitstyp;
    private Regionskriteriumtyp regionskriteriumtyp;
    private String wert;

    public Regionskriterium() {
    }

    private Regionskriterium(RegionskriteriumBuilder builder) {
        super(builder);
        this.gueltigkeitstyp = builder.gueltigkeitstyp;
        this.regionskriteriumtyp = builder.regionskriteriumtyp;
        this.wert = builder.wert;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Hier wird festgelegt, ob es sich um ein einschließendes oder ausschließendes Kriterium
    * handelt.
    */
    public Gueltigkeitstyp getGueltigkeitstyp() {
        return gueltigkeitstyp;
    }

    /**
    * Hier wird festgelegt, ob es sich um ein einschließendes oder ausschließendes Kriterium
    * handelt.
    */
    public void setGueltigkeitstyp(Gueltigkeitstyp gueltigkeitstyp) {
        this.gueltigkeitstyp = gueltigkeitstyp;
    }

    /**
    * Hier wird das Kriterium selbst angegeben, z.B. Bundesland.
    */
    public Regionskriteriumtyp getRegionskriteriumtyp() {
        return regionskriteriumtyp;
    }

    /**
    * Hier wird das Kriterium selbst angegeben, z.B. Bundesland.
    */
    public void setRegionskriteriumtyp(Regionskriteriumtyp regionskriteriumtyp) {
        this.regionskriteriumtyp = regionskriteriumtyp;
    }

    /**
    * Der Wert, den das Kriterium annehmen kann, z.B. NRW.
    * Im Falle des Regionskriteriumstyp BUNDESWEIT spielt dieser Wert keine Rolle.
    */
    public String getWert() {
        return wert;
    }

    /**
    * Der Wert, den das Kriterium annehmen kann, z.B. NRW.
    * Im Falle des Regionskriteriumstyp BUNDESWEIT spielt dieser Wert keine Rolle.
    */
    public void setWert(String wert) {
        this.wert = wert;
    }

    public static RegionskriteriumBuilder builder() {
        return new RegionskriteriumBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class RegionskriteriumBuilder extends COMBuilder {
        private Gueltigkeitstyp gueltigkeitstyp;
        private Regionskriteriumtyp regionskriteriumtyp;
        private String wert;

        private RegionskriteriumBuilder() {
        }

        /**
        * Hier wird festgelegt, ob es sich um ein einschließendes oder ausschließendes Kriterium
        * handelt.
        */
        public RegionskriteriumBuilder setGueltigkeitstyp(Gueltigkeitstyp gueltigkeitstyp) {
            this.gueltigkeitstyp = gueltigkeitstyp;
            return this;
        }

        /**
        * Hier wird das Kriterium selbst angegeben, z.B. Bundesland.
        */
        public RegionskriteriumBuilder setRegionskriteriumtyp(Regionskriteriumtyp regionskriteriumtyp) {
            this.regionskriteriumtyp = regionskriteriumtyp;
            return this;
        }

        /**
        * Der Wert, den das Kriterium annehmen kann, z.B. NRW.
        * Im Falle des Regionskriteriumstyp BUNDESWEIT spielt dieser Wert keine Rolle.
        */
        public RegionskriteriumBuilder setWert(String wert) {
            this.wert = wert;
            return this;
        }

        public RegionskriteriumBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public RegionskriteriumBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Regionskriterium build() {
            return new Regionskriterium(this);
        }
    }
}