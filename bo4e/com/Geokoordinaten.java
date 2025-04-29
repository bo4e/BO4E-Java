package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* This component provides the geo-coordinates for a location.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Geokoordinaten.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Geokoordinaten JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.0.0/src/bo4e_schemas/com/Geokoordinaten.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Geokoordinaten extends COM {
    private final ComTyp _typ = ComTyp.GEOKOORDINATEN;
    private Double breitengrad;
    private Double laengengrad;

    public Geokoordinaten() {
    }

    private Geokoordinaten(GeokoordinatenBuilder builder) {
        super(builder);
        this.breitengrad = builder.breitengrad;
        this.laengengrad = builder.laengengrad;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    public Double getBreitengrad() {
        return breitengrad;
    }

    public void setBreitengrad(Double breitengrad) {
        this.breitengrad = breitengrad;
    }

    public Double getLaengengrad() {
        return laengengrad;
    }

    public void setLaengengrad(Double laengengrad) {
        this.laengengrad = laengengrad;
    }

    public static GeokoordinatenBuilder builder() {
        return new GeokoordinatenBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class GeokoordinatenBuilder extends COMBuilder {
        private Double breitengrad;
        private Double laengengrad;

        private GeokoordinatenBuilder() {
        }

        public GeokoordinatenBuilder setBreitengrad(Double breitengrad) {
            this.breitengrad = breitengrad;
            return this;
        }

        public GeokoordinatenBuilder setLaengengrad(Double laengengrad) {
            this.laengengrad = laengengrad;
            return this;
        }

        public GeokoordinatenBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public GeokoordinatenBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Geokoordinaten build() {
            return new Geokoordinaten(this);
        }
    }
}