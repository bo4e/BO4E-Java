package bo4e.com;

import bo4e.enums.Messwertstatus;
import bo4e.enums.Messwertstatuszusatz;

/**
 * Abbildung eines Zeitreihenwertes bestehend aus Zeitraum, Wert und Statusinformationen.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Zeitreihenwert.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Zeitreihenwert JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.1.0-rc1/src/bo4e_schemas/com/Zeitreihenwert.json>`_
 */
public class Zeitreihenwert extends COM {
    private Messwertstatus status;
    private Messwertstatuszusatz statuszusatz;
    private Double wert;
    private Zeitspanne zeitspanne;

    public Messwertstatus getStatus() { return status; }
    public void setStatus(Messwertstatus value) { this.status = value; }

    public Messwertstatuszusatz getStatuszusatz() { return statuszusatz; }
    public void setStatuszusatz(Messwertstatuszusatz value) { this.statuszusatz = value; }

    public Double getWert() { return wert; }
    public void setWert(Double value) { this.wert = value; }

    public Zeitspanne getZeitspanne() { return zeitspanne; }
    public void setZeitspanne(Zeitspanne value) { this.zeitspanne = value; }

}
