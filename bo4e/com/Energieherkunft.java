package bo4e.com;

import bo4e.enums.Erzeugungsart;

/**
 * Abbildung einer Energieherkunft
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Energieherkunft.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Energieherkunft JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.2-/src/bo4e_schemas/com/Energieherkunft.json>`_
 */
public class Energieherkunft extends COM {
    private Double anteilProzent;
    private Erzeugungsart erzeugungsart;

    public Double getAnteilProzent() { return anteilProzent; }
    public void setAnteilProzent(Double value) { this.anteilProzent = value; }

    public Erzeugungsart getErzeugungsart() { return erzeugungsart; }
    public void setErzeugungsart(Erzeugungsart value) { this.erzeugungsart = value; }

}
