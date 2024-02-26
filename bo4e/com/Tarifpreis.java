package bo4e.com;

import bo4e.enums.Mengeneinheit;
import bo4e.enums.Waehrungseinheit;
import bo4e.enums.Preistyp;
import bo4e.enums.Preisstatus;

/**
 * Abbildung eines Tarifpreises mit Preistyp und Beschreibung abgeleitet von COM Preis.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Tarifpreis.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Tarifpreis JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.1-/src/bo4e_schemas/com/Tarifpreis.json>`_
 */
public class Tarifpreis extends COM {
    private String beschreibung;
    private Mengeneinheit bezugswert;
    private Waehrungseinheit einheit;
    private Preistyp preistyp;
    private Preisstatus status;
    private String wert;

    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String value) { this.beschreibung = value; }

    public Mengeneinheit getBezugswert() { return bezugswert; }
    public void setBezugswert(Mengeneinheit value) { this.bezugswert = value; }

    public Waehrungseinheit getEinheit() { return einheit; }
    public void setEinheit(Waehrungseinheit value) { this.einheit = value; }

    public Preistyp getPreistyp() { return preistyp; }
    public void setPreistyp(Preistyp value) { this.preistyp = value; }

    public Preisstatus getStatus() { return status; }
    public void setStatus(Preisstatus value) { this.status = value; }

    public String getWert() { return wert; }
    public void setWert(String value) { this.wert = value; }

}
