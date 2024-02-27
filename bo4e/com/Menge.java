package bo4e.com;

import bo4e.enums.Mengeneinheit;

/**
 * Abbildung einer Menge mit Wert und Einheit.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Menge.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Menge JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.1.0-rc1/src/bo4e_schemas/com/Menge.json>`_
 */
public class Menge extends COM {
    private Mengeneinheit einheit;
    private Double wert;

    public Mengeneinheit getEinheit() { return einheit; }
    public void setEinheit(Mengeneinheit value) { this.einheit = value; }

    public Double getWert() { return wert; }
    public void setWert(Double value) { this.wert = value; }

}
