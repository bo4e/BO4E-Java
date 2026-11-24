package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Mit dieser Komponente wird ein aus mehreren Positionen zusammengesetzter Preis
* regionsaufgelöst dargestellt.
* Zu jedem Zeitpunkt darf es nur eine gültige Region und einen gültigen Preis geben.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Regionspreis.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Regionspreis JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202607.1.0-rc2/src/bo4e_schemas/com/Regionspreis.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Regionspreis extends COM {
    private final ComTyp _typ = ComTyp.REGIONSPREIS;
    private List<Regionszeitscheibe> regionszeitscheiben;
    private List<Tarifpreiszeitscheibe> tarifpreiszeitscheiben;

    public Regionspreis() {
    }

    private Regionspreis(RegionspreisBuilder builder) {
        super(builder);
        this.regionszeitscheiben = builder.regionszeitscheiben;
        this.tarifpreiszeitscheiben = builder.tarifpreiszeitscheiben;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Eine Liste von mit Zeitscheiben versehenen Regionen.
    * Die Zeitscheiben sollten sich nicht überschneiden.
    */
    public List<Regionszeitscheibe> getRegionszeitscheiben() {
        return regionszeitscheiben;
    }

    /**
    * Eine Liste von mit Zeitscheiben versehenen Regionen.
    * Die Zeitscheiben sollten sich nicht überschneiden.
    */
    public void setRegionszeitscheiben(List<Regionszeitscheibe> regionszeitscheiben) {
        this.regionszeitscheiben = regionszeitscheiben;
    }

    /**
    * Eine Liste von mit Zeitscheiben versehenen Tarifpreisen.
    * Die Zeitscheiben sollten sich nicht überschneiden.
    * Die Tarifpreise sind aus mehreren Tarifpreispositionen zusammengesetzt.
    */
    public List<Tarifpreiszeitscheibe> getTarifpreiszeitscheiben() {
        return tarifpreiszeitscheiben;
    }

    /**
    * Eine Liste von mit Zeitscheiben versehenen Tarifpreisen.
    * Die Zeitscheiben sollten sich nicht überschneiden.
    * Die Tarifpreise sind aus mehreren Tarifpreispositionen zusammengesetzt.
    */
    public void setTarifpreiszeitscheiben(List<Tarifpreiszeitscheibe> tarifpreiszeitscheiben) {
        this.tarifpreiszeitscheiben = tarifpreiszeitscheiben;
    }

    public static RegionspreisBuilder builder() {
        return new RegionspreisBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class RegionspreisBuilder extends COMBuilder {
        private List<Regionszeitscheibe> regionszeitscheiben;
        private List<Tarifpreiszeitscheibe> tarifpreiszeitscheiben;

        private RegionspreisBuilder() {
        }

        /**
        * Eine Liste von mit Zeitscheiben versehenen Regionen.
        * Die Zeitscheiben sollten sich nicht überschneiden.
        */
        public RegionspreisBuilder setRegionszeitscheiben(List<Regionszeitscheibe> regionszeitscheiben) {
            this.regionszeitscheiben = regionszeitscheiben;
            return this;
        }

        /**
        * Eine Liste von mit Zeitscheiben versehenen Tarifpreisen.
        * Die Zeitscheiben sollten sich nicht überschneiden.
        * Die Tarifpreise sind aus mehreren Tarifpreispositionen zusammengesetzt.
        */
        public RegionspreisBuilder setTarifpreiszeitscheiben(List<Tarifpreiszeitscheibe> tarifpreiszeitscheiben) {
            this.tarifpreiszeitscheiben = tarifpreiszeitscheiben;
            return this;
        }

        public RegionspreisBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public RegionspreisBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Regionspreis build() {
            return new Regionspreis(this);
        }
    }
}