package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.bo.Region;
import bo4e.enums.ComTyp;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Komponente zur Abbildung einer Region mit einer Zeitscheibe.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Regionszeitscheibe.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Regionszeitscheibe JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202607.1.0/src/bo4e_schemas/com/Regionszeitscheibe.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Regionszeitscheibe extends COM {
    private final ComTyp _typ = ComTyp.REGIONSZEITSCHEIBE;
    private Region region;
    private Zeitraum zeitscheibengueltigkeit;

    public Regionszeitscheibe() {
    }

    private Regionszeitscheibe(RegionszeitscheibeBuilder builder) {
        super(builder);
        this.region = builder.region;
        this.zeitscheibengueltigkeit = builder.zeitscheibengueltigkeit;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Die Region wird durch das Feld `zeitscheibengueltigkeit` mit einer Zeitscheibe versehen.
    */
    public Region getRegion() {
        return region;
    }

    /**
    * Die Region wird durch das Feld `zeitscheibengueltigkeit` mit einer Zeitscheibe versehen.
    */
    public void setRegion(Region region) {
        this.region = region;
    }

    /**
    * Versieht die Region mit einer Zeitscheibe. Der Start- und Endzeitpunkt sollte durch das
    * Objekt ermittelbar sein.
    */
    public Zeitraum getZeitscheibengueltigkeit() {
        return zeitscheibengueltigkeit;
    }

    /**
    * Versieht die Region mit einer Zeitscheibe. Der Start- und Endzeitpunkt sollte durch das
    * Objekt ermittelbar sein.
    */
    public void setZeitscheibengueltigkeit(Zeitraum zeitscheibengueltigkeit) {
        this.zeitscheibengueltigkeit = zeitscheibengueltigkeit;
    }

    public static RegionszeitscheibeBuilder builder() {
        return new RegionszeitscheibeBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class RegionszeitscheibeBuilder extends COMBuilder {
        private Region region;
        private Zeitraum zeitscheibengueltigkeit;

        private RegionszeitscheibeBuilder() {
        }

        /**
        * Die Region wird durch das Feld `zeitscheibengueltigkeit` mit einer Zeitscheibe versehen.
        */
        public RegionszeitscheibeBuilder setRegion(Region region) {
            this.region = region;
            return this;
        }

        /**
        * Versieht die Region mit einer Zeitscheibe. Der Start- und Endzeitpunkt sollte durch das
        * Objekt ermittelbar sein.
        */
        public RegionszeitscheibeBuilder setZeitscheibengueltigkeit(Zeitraum zeitscheibengueltigkeit) {
            this.zeitscheibengueltigkeit = zeitscheibengueltigkeit;
            return this;
        }

        public RegionszeitscheibeBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public RegionszeitscheibeBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Regionszeitscheibe build() {
            return new Regionszeitscheibe(this);
        }
    }
}