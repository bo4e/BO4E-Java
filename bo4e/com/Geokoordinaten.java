package bo4e.com;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.2-/src/bo4e_schemas/com/Geokoordinaten.json>`_
 */
public class Geokoordinaten extends COM {
    private Double breitengrad;
    private Double laengengrad;

    public Double getBreitengrad() { return breitengrad; }
    public void setBreitengrad(Double value) { this.breitengrad = value; }

    public Double getLaengengrad() { return laengengrad; }
    public void setLaengengrad(Double value) { this.laengengrad = value; }

}
