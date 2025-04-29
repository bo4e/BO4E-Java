package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import bo4e.enums.Gueltigkeitstyp;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Mit dieser Komponente können regionale Gültigkeiten, z.B. für Tarife, Zu- und Abschläge
* und Preise definiert werden.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/RegionaleGueltigkeit.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `RegionaleGueltigkeit JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.0.0/src/bo4e_schemas/com/RegionaleGueltigkeit.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegionaleGueltigkeit extends COM {
    private final ComTyp _typ = ComTyp.REGIONALEGUELTIGKEIT;
    private Gueltigkeitstyp gueltigkeitstyp;
    private List<KriteriumWert> kriteriumsWerte;

    public RegionaleGueltigkeit() {
    }

    private RegionaleGueltigkeit(RegionaleGueltigkeitBuilder builder) {
        super(builder);
        this.gueltigkeitstyp = builder.gueltigkeitstyp;
        this.kriteriumsWerte = builder.kriteriumsWerte;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Unterscheidung ob Positivliste oder Negativliste übertragen wird
    */
    public Gueltigkeitstyp getGueltigkeitstyp() {
        return gueltigkeitstyp;
    }

    /**
    * Unterscheidung ob Positivliste oder Negativliste übertragen wird
    */
    public void setGueltigkeitstyp(Gueltigkeitstyp gueltigkeitstyp) {
        this.gueltigkeitstyp = gueltigkeitstyp;
    }

    /**
    * Hier stehen die Kriterien, die die regionale Gültigkeit festlegen
    */
    public List<KriteriumWert> getKriteriumsWerte() {
        return kriteriumsWerte;
    }

    /**
    * Hier stehen die Kriterien, die die regionale Gültigkeit festlegen
    */
    public void setKriteriumsWerte(List<KriteriumWert> kriteriumsWerte) {
        this.kriteriumsWerte = kriteriumsWerte;
    }

    public static RegionaleGueltigkeitBuilder builder() {
        return new RegionaleGueltigkeitBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class RegionaleGueltigkeitBuilder extends COMBuilder {
        private Gueltigkeitstyp gueltigkeitstyp;
        private List<KriteriumWert> kriteriumsWerte;

        private RegionaleGueltigkeitBuilder() {
        }

        /**
        * Unterscheidung ob Positivliste oder Negativliste übertragen wird
        */
        public RegionaleGueltigkeitBuilder setGueltigkeitstyp(Gueltigkeitstyp gueltigkeitstyp) {
            this.gueltigkeitstyp = gueltigkeitstyp;
            return this;
        }

        /**
        * Hier stehen die Kriterien, die die regionale Gültigkeit festlegen
        */
        public RegionaleGueltigkeitBuilder setKriteriumsWerte(List<KriteriumWert> kriteriumsWerte) {
            this.kriteriumsWerte = kriteriumsWerte;
            return this;
        }

        public RegionaleGueltigkeitBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public RegionaleGueltigkeitBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public RegionaleGueltigkeit build() {
            return new RegionaleGueltigkeit(this);
        }
    }
}