package bo4e.com;

import bo4e.enums.Steuerkennzeichen;
import bo4e.enums.Waehrungscode;

/**
 * Abbildung eines Steuerbetrages.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Steuerbetrag.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Steuerbetrag JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.1.0-rc1/src/bo4e_schemas/com/Steuerbetrag.json>`_
 */
public class Steuerbetrag extends COM {
    private Double basiswert;
    private Steuerkennzeichen steuerkennzeichen;
    private Double steuerwert;
    private Waehrungscode waehrung;

    public Double getBasiswert() { return basiswert; }
    public void setBasiswert(Double value) { this.basiswert = value; }

    public Steuerkennzeichen getSteuerkennzeichen() { return steuerkennzeichen; }
    public void setSteuerkennzeichen(Steuerkennzeichen value) { this.steuerkennzeichen = value; }

    public Double getSteuerwert() { return steuerwert; }
    public void setSteuerwert(Double value) { this.steuerwert = value; }

    public Waehrungscode getWaehrung() { return waehrung; }
    public void setWaehrung(Waehrungscode value) { this.waehrung = value; }

}
